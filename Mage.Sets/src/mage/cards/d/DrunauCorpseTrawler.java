/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.permanent.token.ZombieToken;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author LevelX2
 */
public class DrunauCorpseTrawler extends CardImpl {

    public DrunauCorpseTrawler(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{U}");
        this.subtype.add("Zombie");
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // When Drunau Corpse Trawler enters the battlefield, create a 2/2 black Zombie creature token.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new CreateTokenEffect(new ZombieToken())));

        // {2}{B}: Target Zombie gains deathtouch until end of turn.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new GainAbilityTargetEffect(DeathtouchAbility.getInstance(), Duration.EndOfTurn), new ManaCostsImpl<>("{2}{B}"));
        ability.addTarget(new TargetCreaturePermanent(new FilterCreaturePermanent("Zombie", "Zombie")));
        this.addAbility(ability);

    }

    public DrunauCorpseTrawler(final DrunauCorpseTrawler card) {
        super(card);
    }

    @Override
    public DrunauCorpseTrawler copy() {
        return new DrunauCorpseTrawler(this);
    }
}
