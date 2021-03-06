package org.mage.test.cards.single.akh;

import mage.abilities.keyword.DeathtouchAbility;
import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.counters.CounterType;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 *
 * @author escplan9
 */
public class HapatraVizierOfPoisonsTest extends CardTestPlayerBase {
    
     /*
        Hapatra, Vizier of Poisons BG
        Legendary Creature - Human Cleric 2/2
        Whenever Hapatra, Vizier of Poisons deals combat damage to a player, you may put a -1/-1 counter on target creature.
        Whenever you put one or more -1/-1 counters on a creature, create a 1/1 green Snake creature token with deathtouch. 
        */
    private String hapatra = "Hapatra, Vizier of Poisons";

    @Test
    public void hapatraCombatDamageToPlayer() {
        
        String gBears = "Grizzly Bears";
        addCard(Zone.BATTLEFIELD, playerA, hapatra);
        addCard(Zone.BATTLEFIELD, playerB, gBears);
        
        attack(3, playerA, hapatra);
        setChoice(playerA, "Yes"); // opt to place -1/-1 counter on creature
        addTarget(playerA, gBears);
        
        setStopAt(3, PhaseStep.END_COMBAT);
        execute();
        
        assertLife(playerB, 18);
        assertCounterCount(playerB, gBears, CounterType.M1M1, 1);
        assertPowerToughness(playerB, gBears, 1, 1); // 2/2 with -1/1 counter
        assertPermanentCount(playerA, "Snake", 1);
        assertAbility(playerA, "Snake", DeathtouchAbility.getInstance(), true);
    }
    
    /*
    Test is failing due to bug: issue #3288. 
    Hapatra, Vizier of Poisons is not triggering off of Infect. Tested with Blight Mamba
    */
    @Test
    public void infectDamageTriggersHapatra() {
        
        String bMamba = "Blight Mamba"; // {1}{G} 1/1 Creature - Snake, Infect with {1}{G}:Regen        
        String wOmens = "Wall of Omens"; // {1}{W} 0/4 defender ETB: draw a card
        
        addCard(Zone.BATTLEFIELD, playerA, hapatra);
        addCard(Zone.BATTLEFIELD, playerA, bMamba);
        addCard(Zone.BATTLEFIELD, playerB, wOmens);
        
        attack(3, playerA, bMamba);
        block(3, playerB, wOmens, bMamba);
        
        setStopAt(3, PhaseStep.END_COMBAT);
        execute();
        
        assertLife(playerB, 20);
        assertCounterCount(playerB, CounterType.POISON, 0);
        assertCounterCount(playerB, wOmens, CounterType.M1M1, 1);
        assertPowerToughness(playerB, wOmens, -1, 3); // 0/4 with -1/-1 counter
        assertPermanentCount(playerA, "Snake", 1);
        assertAbility(playerA, "Snake", DeathtouchAbility.getInstance(), true);
    }
}
