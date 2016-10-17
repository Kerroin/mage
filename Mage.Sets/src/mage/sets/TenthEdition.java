/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class TenthEdition extends ExpansionSet {

    private static final TenthEdition fINSTANCE = new TenthEdition();

    public static TenthEdition getInstance() {
        return fINSTANCE;
    }

    private TenthEdition() {
        super("Tenth Edition", "10E", ExpansionSet.buildDate(2007, 6, 14), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abundance", 249, Rarity.RARE, mage.cards.a.Abundance.class));
        cards.add(new SetCardInfo("Academy Researchers", 63, Rarity.UNCOMMON, mage.cards.a.AcademyResearchers.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 347, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Afflict", 125, Rarity.COMMON, mage.cards.a.Afflict.class));
        cards.add(new SetCardInfo("Aggressive Urge", 250, Rarity.COMMON, mage.cards.a.AggressiveUrge.class));
        cards.add(new SetCardInfo("Agonizing Memories", 126, Rarity.UNCOMMON, mage.cards.a.AgonizingMemories.class));
        cards.add(new SetCardInfo("Air Elemental", 64, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Ambassador Laquatus", 65, Rarity.RARE, mage.cards.a.AmbassadorLaquatus.class));
        cards.add(new SetCardInfo("Anaba Bodyguard", 187, Rarity.COMMON, mage.cards.a.AnabaBodyguard.class));
        cards.add(new SetCardInfo("Ancestor's Chosen", 1, Rarity.UNCOMMON, mage.cards.a.AncestorsChosen.class));
        cards.add(new SetCardInfo("Angelic Blessing", 3, Rarity.COMMON, mage.cards.a.AngelicBlessing.class));
        cards.add(new SetCardInfo("Angelic Chorus", 4, Rarity.RARE, mage.cards.a.AngelicChorus.class));
        cards.add(new SetCardInfo("Angelic Wall", 5, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        cards.add(new SetCardInfo("Angel of Mercy", 2, Rarity.UNCOMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Angel's Feather", 311, Rarity.UNCOMMON, mage.cards.a.AngelsFeather.class));
        cards.add(new SetCardInfo("Arcane Teachings", 188, Rarity.UNCOMMON, mage.cards.a.ArcaneTeachings.class));
        cards.add(new SetCardInfo("Arcanis the Omnipotent", 66, Rarity.RARE, mage.cards.a.ArcanisTheOmnipotent.class));
        cards.add(new SetCardInfo("Ascendant Evincar", 127, Rarity.RARE, mage.cards.a.AscendantEvincar.class));
        cards.add(new SetCardInfo("Assassinate", 128, Rarity.COMMON, mage.cards.a.Assassinate.class));
        cards.add(new SetCardInfo("Aura Graft", 67, Rarity.UNCOMMON, mage.cards.a.AuraGraft.class));
        cards.add(new SetCardInfo("Aura of Silence", 6, Rarity.UNCOMMON, mage.cards.a.AuraOfSilence.class));
        cards.add(new SetCardInfo("Avatar of Might", 251, Rarity.RARE, mage.cards.a.AvatarOfMight.class));
        cards.add(new SetCardInfo("Aven Cloudchaser", 7, Rarity.COMMON, mage.cards.a.AvenCloudchaser.class));
        cards.add(new SetCardInfo("Aven Fisher", 68, Rarity.COMMON, mage.cards.a.AvenFisher.class));
        cards.add(new SetCardInfo("Aven Windreader", 69, Rarity.COMMON, mage.cards.a.AvenWindreader.class));
        cards.add(new SetCardInfo("Ballista Squad", 8, Rarity.UNCOMMON, mage.cards.b.BallistaSquad.class));
        cards.add(new SetCardInfo("Bandage", 9, Rarity.COMMON, mage.cards.b.Bandage.class));
        cards.add(new SetCardInfo("Battlefield Forge", 348, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beacon of Destruction", 189, Rarity.RARE, mage.cards.b.BeaconOfDestruction.class));
        cards.add(new SetCardInfo("Beacon of Immortality", 10, Rarity.RARE, mage.cards.b.BeaconOfImmortality.class));
        cards.add(new SetCardInfo("Beacon of Unrest", 129, Rarity.RARE, mage.cards.b.BeaconOfUnrest.class));
        cards.add(new SetCardInfo("Benalish Knight", 11, Rarity.COMMON, mage.cards.b.BenalishKnight.class));
        cards.add(new SetCardInfo("Birds of Paradise", 252, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 253, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blaze", 190, Rarity.UNCOMMON, mage.cards.b.Blaze.class));
        cards.add(new SetCardInfo("Bloodfire Colossus", 191, Rarity.RARE, mage.cards.b.BloodfireColossus.class));
        cards.add(new SetCardInfo("Bloodrock Cyclops", 192, Rarity.COMMON, mage.cards.b.BloodrockCyclops.class));
        cards.add(new SetCardInfo("Bogardan Firefiend", 193, Rarity.COMMON, mage.cards.b.BogardanFirefiend.class));
        cards.add(new SetCardInfo("Bog Wraith", 130, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Boomerang", 70, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Bottle Gnomes", 312, Rarity.UNCOMMON, mage.cards.b.BottleGnomes.class));
        cards.add(new SetCardInfo("Brushland", 349, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Cancel", 71, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Canopy Spider", 254, Rarity.COMMON, mage.cards.c.CanopySpider.class));
        cards.add(new SetCardInfo("Caves of Koilos", 350, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Cephalid Constable", 72, Rarity.RARE, mage.cards.c.CephalidConstable.class));
        cards.add(new SetCardInfo("Chimeric Staff", 313, Rarity.RARE, mage.cards.c.ChimericStaff.class));
        cards.add(new SetCardInfo("Cho-Manno, Revolutionary", 12, Rarity.RARE, mage.cards.c.ChoMannoRevolutionary.class));
        cards.add(new SetCardInfo("Chromatic Star", 314, Rarity.UNCOMMON, mage.cards.c.ChromaticStar.class));
        cards.add(new SetCardInfo("Citanul Flute", 315, Rarity.RARE, mage.cards.c.CitanulFlute.class));
        cards.add(new SetCardInfo("Civic Wayfinder", 255, Rarity.COMMON, mage.cards.c.CivicWayfinder.class));
        cards.add(new SetCardInfo("Clone", 73, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Cloud Elemental", 74, Rarity.COMMON, mage.cards.c.CloudElemental.class));
        cards.add(new SetCardInfo("Cloud Sprite", 75, Rarity.COMMON, mage.cards.c.CloudSprite.class));
        cards.add(new SetCardInfo("Coat of Arms", 316, Rarity.RARE, mage.cards.c.CoatOfArms.class));
        cards.add(new SetCardInfo("Colossus of Sardia", 317, Rarity.RARE, mage.cards.c.ColossusOfSardia.class));
        cards.add(new SetCardInfo("Commune with Nature", 256, Rarity.COMMON, mage.cards.c.CommuneWithNature.class));
        cards.add(new SetCardInfo("Composite Golem", 318, Rarity.UNCOMMON, mage.cards.c.CompositeGolem.class));
        cards.add(new SetCardInfo("Condemn", 13, Rarity.UNCOMMON, mage.cards.c.Condemn.class));
        cards.add(new SetCardInfo("Cone of Flame", 194, Rarity.UNCOMMON, mage.cards.c.ConeOfFlame.class));
        cards.add(new SetCardInfo("Consume Spirit", 131, Rarity.UNCOMMON, mage.cards.c.ConsumeSpirit.class));
        cards.add(new SetCardInfo("Contaminated Bond", 132, Rarity.COMMON, mage.cards.c.ContaminatedBond.class));
        cards.add(new SetCardInfo("Counsel of the Soratami", 76, Rarity.COMMON, mage.cards.c.CounselOfTheSoratami.class));
        cards.add(new SetCardInfo("Crafty Pathmage", 77, Rarity.COMMON, mage.cards.c.CraftyPathmage.class));
        cards.add(new SetCardInfo("Craw Wurm", 257, Rarity.COMMON, mage.cards.c.CrawWurm.class));
        cards.add(new SetCardInfo("Creeping Mold", 258, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crucible of Worlds", 319, Rarity.RARE, mage.cards.c.CrucibleOfWorlds.class));
        cards.add(new SetCardInfo("Cruel Edict", 133, Rarity.UNCOMMON, mage.cards.c.CruelEdict.class));
        cards.add(new SetCardInfo("Cryoclasm", 195, Rarity.UNCOMMON, mage.cards.c.Cryoclasm.class));
        cards.add(new SetCardInfo("Deathmark", 134, Rarity.UNCOMMON, mage.cards.d.Deathmark.class));
        cards.add(new SetCardInfo("Dehydration", 78, Rarity.COMMON, mage.cards.d.Dehydration.class));
        cards.add(new SetCardInfo("Deluge", 79, Rarity.UNCOMMON, mage.cards.d.Deluge.class));
        cards.add(new SetCardInfo("Demolish", 196, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demon's Horn", 320, Rarity.UNCOMMON, mage.cards.d.DemonsHorn.class));
        cards.add(new SetCardInfo("Demystify", 14, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Denizen of the Deep", 80, Rarity.RARE, mage.cards.d.DenizenOfTheDeep.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 135, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Discombobulate", 81, Rarity.UNCOMMON, mage.cards.d.Discombobulate.class));
        cards.add(new SetCardInfo("Distress", 136, Rarity.COMMON, mage.cards.d.Distress.class));
        cards.add(new SetCardInfo("Doomed Necromancer", 137, Rarity.RARE, mage.cards.d.DoomedNecromancer.class));
        cards.add(new SetCardInfo("Doubling Cube", 321, Rarity.RARE, mage.cards.d.DoublingCube.class));
        cards.add(new SetCardInfo("Dragon Roost", 197, Rarity.RARE, mage.cards.d.DragonRoost.class));
        cards.add(new SetCardInfo("Dragon's Claw", 322, Rarity.UNCOMMON, mage.cards.d.DragonsClaw.class));
        cards.add(new SetCardInfo("Dreamborn Muse", 82, Rarity.RARE, mage.cards.d.DreambornMuse.class));
        cards.add(new SetCardInfo("Dross Crocodile", 138, Rarity.COMMON, mage.cards.d.DrossCrocodile.class));
        cards.add(new SetCardInfo("Drudge Skeletons", 139, Rarity.UNCOMMON, mage.cards.d.DrudgeSkeletons.class));
        cards.add(new SetCardInfo("Duct Crawler", 198, Rarity.COMMON, mage.cards.d.DuctCrawler.class));
        cards.add(new SetCardInfo("Dusk Imp", 140, Rarity.COMMON, mage.cards.d.DuskImp.class));
        cards.add(new SetCardInfo("Earth Elemental", 199, Rarity.UNCOMMON, mage.cards.e.EarthElemental.class));
        cards.add(new SetCardInfo("Elven Riders", 259, Rarity.UNCOMMON, mage.cards.e.ElvenRiders.class));
        cards.add(new SetCardInfo("Elvish Berserker", 260, Rarity.COMMON, mage.cards.e.ElvishBerserker.class));
        cards.add(new SetCardInfo("Elvish Champion", 261, Rarity.RARE, mage.cards.e.ElvishChampion.class));
        cards.add(new SetCardInfo("Elvish Piper", 262, Rarity.RARE, mage.cards.e.ElvishPiper.class));
        cards.add(new SetCardInfo("Enormous Baloth", 263, Rarity.UNCOMMON, mage.cards.e.EnormousBaloth.class));
        cards.add(new SetCardInfo("Essence Drain", 141, Rarity.COMMON, mage.cards.e.EssenceDrain.class));
        cards.add(new SetCardInfo("Evacuation", 83, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Faerie Conclave", 351, Rarity.UNCOMMON, mage.cards.f.FaerieConclave.class));
        cards.add(new SetCardInfo("Fear", 142, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Femeref Archers", 264, Rarity.UNCOMMON, mage.cards.f.FemerefArchers.class));
        cards.add(new SetCardInfo("Festering Goblin", 143, Rarity.COMMON, mage.cards.f.FesteringGoblin.class));
        cards.add(new SetCardInfo("Field Marshal", 15, Rarity.RARE, mage.cards.f.FieldMarshal.class));
        cards.add(new SetCardInfo("Firebreathing", 200, Rarity.COMMON, mage.cards.f.Firebreathing.class));
        cards.add(new SetCardInfo("Fists of the Anvil", 201, Rarity.COMMON, mage.cards.f.FistsOfTheAnvil.class));
        cards.add(new SetCardInfo("Flamewave Invoker", 202, Rarity.UNCOMMON, mage.cards.f.FlamewaveInvoker.class));
        cards.add(new SetCardInfo("Flashfreeze", 84, Rarity.UNCOMMON, mage.cards.f.Flashfreeze.class));
        cards.add(new SetCardInfo("Flowstone Slide", 203, Rarity.RARE, mage.cards.f.FlowstoneSlide.class));
        cards.add(new SetCardInfo("Fog Elemental", 85, Rarity.UNCOMMON, mage.cards.f.FogElemental.class));
        cards.add(new SetCardInfo("Forbidding Watchtower", 352, Rarity.UNCOMMON, mage.cards.f.ForbiddingWatchtower.class));
        cards.add(new SetCardInfo("Forest", 380, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 381, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 382, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 383, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Fountain of Youth", 323, Rarity.UNCOMMON, mage.cards.f.FountainOfYouth.class));
        cards.add(new SetCardInfo("Fugitive Wizard", 86, Rarity.COMMON, mage.cards.f.FugitiveWizard.class));
        cards.add(new SetCardInfo("Furnace of Rath", 204, Rarity.RARE, mage.cards.f.FurnaceOfRath.class));
        cards.add(new SetCardInfo("Furnace Whelp", 205, Rarity.UNCOMMON, mage.cards.f.FurnaceWhelp.class));
        cards.add(new SetCardInfo("Gaea's Herald", 265, Rarity.RARE, mage.cards.g.GaeasHerald.class));
        cards.add(new SetCardInfo("Ghitu Encampment", 353, Rarity.UNCOMMON, mage.cards.g.GhituEncampment.class));
        cards.add(new SetCardInfo("Ghost Warden", 16, Rarity.COMMON, mage.cards.g.GhostWarden.class));
        cards.add(new SetCardInfo("Giant Growth", 266, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Spider", 267, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Glorious Anthem", 17, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Goblin Elite Infantry", 206, Rarity.COMMON, mage.cards.g.GoblinEliteInfantry.class));
        cards.add(new SetCardInfo("Goblin King", 207, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Goblin Lore", 208, Rarity.UNCOMMON, mage.cards.g.GoblinLore.class));
        cards.add(new SetCardInfo("Goblin Piker", 209, Rarity.COMMON, mage.cards.g.GoblinPiker.class));
        cards.add(new SetCardInfo("Goblin Sky Raider", 210, Rarity.COMMON, mage.cards.g.GoblinSkyRaider.class));
        cards.add(new SetCardInfo("Graveborn Muse", 145, Rarity.RARE, mage.cards.g.GravebornMuse.class));
        cards.add(new SetCardInfo("Gravedigger", 146, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grave Pact", 144, Rarity.RARE, mage.cards.g.GravePact.class));
        cards.add(new SetCardInfo("Grizzly Bears", 268, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Guerrilla Tactics", 211, Rarity.UNCOMMON, mage.cards.g.GuerrillaTactics.class));
        cards.add(new SetCardInfo("Hail of Arrows", 18, Rarity.UNCOMMON, mage.cards.h.HailOfArrows.class));
        cards.add(new SetCardInfo("Hate Weaver", 147, Rarity.UNCOMMON, mage.cards.h.HateWeaver.class));
        cards.add(new SetCardInfo("Head Games", 148, Rarity.RARE, mage.cards.h.HeadGames.class));
        cards.add(new SetCardInfo("Heart of Light", 19, Rarity.COMMON, mage.cards.h.HeartOfLight.class));
        cards.add(new SetCardInfo("Hidden Horror", 149, Rarity.UNCOMMON, mage.cards.h.HiddenHorror.class));
        cards.add(new SetCardInfo("High Ground", 20, Rarity.UNCOMMON, mage.cards.h.HighGround.class));
        cards.add(new SetCardInfo("Highway Robber", 150, Rarity.COMMON, mage.cards.h.HighwayRobber.class));
        cards.add(new SetCardInfo("Hill Giant", 212, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Holy Day", 21, Rarity.COMMON, mage.cards.h.HolyDay.class));
        cards.add(new SetCardInfo("Holy Strength", 22, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Honor Guard", 23, Rarity.COMMON, mage.cards.h.HonorGuard.class));
        cards.add(new SetCardInfo("Horseshoe Crab", 87, Rarity.COMMON, mage.cards.h.HorseshoeCrab.class));
        cards.add(new SetCardInfo("Howling Mine", 325, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Hunted Wumpus", 269, Rarity.UNCOMMON, mage.cards.h.HuntedWumpus.class));
        cards.add(new SetCardInfo("Hurkyl's Recall", 88, Rarity.RARE, mage.cards.h.HurkylsRecall.class));
        cards.add(new SetCardInfo("Hurricane", 270, Rarity.RARE, mage.cards.h.Hurricane.class));
        cards.add(new SetCardInfo("Hypnotic Specter", 151, Rarity.RARE, mage.cards.h.HypnoticSpecter.class));
        cards.add(new SetCardInfo("Icatian Priest", 24, Rarity.UNCOMMON, mage.cards.i.IcatianPriest.class));
        cards.add(new SetCardInfo("Icy Manipulator", 326, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("Incinerate", 213, Rarity.COMMON, mage.cards.i.Incinerate.class));
        cards.add(new SetCardInfo("Island", 368, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 369, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 370, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 371, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Jayemdae Tome", 327, Rarity.RARE, mage.cards.j.JayemdaeTome.class));
        cards.add(new SetCardInfo("Joiner Adept", 271, Rarity.RARE, mage.cards.j.JoinerAdept.class));
        cards.add(new SetCardInfo("Juggernaut", 328, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Kamahl, Pit Fighter", 214, Rarity.RARE, mage.cards.k.KamahlPitFighter.class));
        cards.add(new SetCardInfo("Karplusan Forest", 354, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Karplusan Strider", 272, Rarity.UNCOMMON, mage.cards.k.KarplusanStrider.class));
        cards.add(new SetCardInfo("Kavu Climber", 273, Rarity.COMMON, mage.cards.k.KavuClimber.class));
        cards.add(new SetCardInfo("Kjeldoran Royal Guard", 25, Rarity.RARE, mage.cards.k.KjeldoranRoyalGuard.class));
        cards.add(new SetCardInfo("Knight of Dusk", 152, Rarity.UNCOMMON, mage.cards.k.KnightOfDusk.class));
        cards.add(new SetCardInfo("Kraken's Eye", 329, Rarity.UNCOMMON, mage.cards.k.KrakensEye.class));
        cards.add(new SetCardInfo("Lava Axe", 215, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Lavaborn Muse", 216, Rarity.RARE, mage.cards.l.LavabornMuse.class));
        cards.add(new SetCardInfo("Legacy Weapon", 330, Rarity.RARE, mage.cards.l.LegacyWeapon.class));
        cards.add(new SetCardInfo("Leonin Scimitar", 331, Rarity.UNCOMMON, mage.cards.l.LeoninScimitar.class));
        cards.add(new SetCardInfo("Lightning Elemental", 217, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Llanowar Elves", 274, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Llanowar Sentinel", 275, Rarity.COMMON, mage.cards.l.LlanowarSentinel.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 355, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Looming Shade", 153, Rarity.COMMON, mage.cards.l.LoomingShade.class));
        cards.add(new SetCardInfo("Lord of the Pit", 154, Rarity.RARE, mage.cards.l.LordOfThePit.class));
        cards.add(new SetCardInfo("Lord of the Undead", 155, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Loxodon Mystic", 26, Rarity.COMMON, mage.cards.l.LoxodonMystic.class));
        cards.add(new SetCardInfo("Loxodon Warhammer", 332, Rarity.RARE, mage.cards.l.LoxodonWarhammer.class));
        cards.add(new SetCardInfo("Loyal Sentry", 27, Rarity.RARE, mage.cards.l.LoyalSentry.class));
        cards.add(new SetCardInfo("Lumengrid Warden", 89, Rarity.COMMON, mage.cards.l.LumengridWarden.class));
        cards.add(new SetCardInfo("Lure", 276, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 90, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Manabarbs", 218, Rarity.RARE, mage.cards.m.Manabarbs.class));
        cards.add(new SetCardInfo("Mantis Engine", 333, Rarity.UNCOMMON, mage.cards.m.MantisEngine.class));
        cards.add(new SetCardInfo("March of the Machines", 91, Rarity.RARE, mage.cards.m.MarchOfTheMachines.class));
        cards.add(new SetCardInfo("Mass of Ghouls", 156, Rarity.COMMON, mage.cards.m.MassOfGhouls.class));
        cards.add(new SetCardInfo("Megrim", 157, Rarity.UNCOMMON, mage.cards.m.Megrim.class));
        cards.add(new SetCardInfo("Merfolk Looter", 92, Rarity.COMMON, mage.cards.m.MerfolkLooter.class));
        cards.add(new SetCardInfo("Midnight Ritual", 158, Rarity.RARE, mage.cards.m.MidnightRitual.class));
        cards.add(new SetCardInfo("Might of Oaks", 277, Rarity.RARE, mage.cards.m.MightOfOaks.class));
        cards.add(new SetCardInfo("Might Weaver", 278, Rarity.UNCOMMON, mage.cards.m.MightWeaver.class));
        cards.add(new SetCardInfo("Millstone", 334, Rarity.RARE, mage.cards.m.Millstone.class));
        cards.add(new SetCardInfo("Mind Rot", 159, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mind Stone", 335, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mirri, Cat Warrior", 279, Rarity.RARE, mage.cards.m.MirriCatWarrior.class));
        cards.add(new SetCardInfo("Mobilization", 29, Rarity.RARE, mage.cards.m.Mobilization.class));
        cards.add(new SetCardInfo("Mogg Fanatic", 219, Rarity.UNCOMMON, mage.cards.m.MoggFanatic.class));
        cards.add(new SetCardInfo("Molimo, Maro-Sorcerer", 280, Rarity.RARE, mage.cards.m.MolimoMaroSorcerer.class));
        cards.add(new SetCardInfo("Mortal Combat", 160, Rarity.RARE, mage.cards.m.MortalCombat.class));
        cards.add(new SetCardInfo("Mortivore", 161, Rarity.RARE, mage.cards.m.Mortivore.class));
        cards.add(new SetCardInfo("Mountain", 376, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 377, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 378, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 379, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Nantuko Husk", 162, Rarity.UNCOMMON, mage.cards.n.NantukoHusk.class));
        cards.add(new SetCardInfo("Naturalize", 282, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Natural Spring", 281, Rarity.COMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Nekrataal", 163, Rarity.UNCOMMON, mage.cards.n.Nekrataal.class));
        cards.add(new SetCardInfo("Nightmare", 164, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Nomad Mythmaker", 30, Rarity.RARE, mage.cards.n.NomadMythmaker.class));
        cards.add(new SetCardInfo("No Rest for the Wicked", 165, Rarity.UNCOMMON, mage.cards.n.NoRestForTheWicked.class));
        cards.add(new SetCardInfo("Orcish Artillery", 220, Rarity.UNCOMMON, mage.cards.o.OrcishArtillery.class));
        cards.add(new SetCardInfo("Ornithopter", 336, Rarity.UNCOMMON, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Overgrowth", 283, Rarity.COMMON, mage.cards.o.Overgrowth.class));
        cards.add(new SetCardInfo("Overrun", 284, Rarity.UNCOMMON, mage.cards.o.Overrun.class));
        cards.add(new SetCardInfo("Pacifism", 31, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Paladin en-Vec", 32, Rarity.RARE, mage.cards.p.PaladinEnVec.class));
        cards.add(new SetCardInfo("Pariah", 33, Rarity.RARE, mage.cards.p.Pariah.class));
        cards.add(new SetCardInfo("Peek", 94, Rarity.COMMON, mage.cards.p.Peek.class));
        cards.add(new SetCardInfo("Persuasion", 95, Rarity.UNCOMMON, mage.cards.p.Persuasion.class));
        cards.add(new SetCardInfo("Phage the Untouchable", 166, Rarity.RARE, mage.cards.p.PhageTheUntouchable.class));
        cards.add(new SetCardInfo("Phantom Warrior", 96, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 167, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Vault", 337, Rarity.UNCOMMON, mage.cards.p.PhyrexianVault.class));
        cards.add(new SetCardInfo("Pincher Beetles", 285, Rarity.COMMON, mage.cards.p.PincherBeetles.class));
        cards.add(new SetCardInfo("Pithing Needle", 338, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Plagiarize", 97, Rarity.RARE, mage.cards.p.Plagiarize.class));
        cards.add(new SetCardInfo("Plague Beetle", 168, Rarity.COMMON, mage.cards.p.PlagueBeetle.class));
        cards.add(new SetCardInfo("Plague Wind", 169, Rarity.RARE, mage.cards.p.PlagueWind.class));
        cards.add(new SetCardInfo("Plains", 364, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 365, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 366, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 367, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Platinum Angel", 339, Rarity.RARE, mage.cards.p.PlatinumAngel.class));
        cards.add(new SetCardInfo("Primal Rage", 286, Rarity.UNCOMMON, mage.cards.p.PrimalRage.class));
        cards.add(new SetCardInfo("Prodigal Pyromancer", 221, Rarity.COMMON, mage.cards.p.ProdigalPyromancer.class));
        cards.add(new SetCardInfo("Puppeteer", 98, Rarity.UNCOMMON, mage.cards.p.Puppeteer.class));
        cards.add(new SetCardInfo("Pyroclasm", 222, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Quicksand", 356, Rarity.UNCOMMON, mage.cards.q.Quicksand.class));
        cards.add(new SetCardInfo("Quirion Dryad", 287, Rarity.RARE, mage.cards.q.QuirionDryad.class));
        cards.add(new SetCardInfo("Rage Weaver", 223, Rarity.UNCOMMON, mage.cards.r.RageWeaver.class));
        cards.add(new SetCardInfo("Raging Goblin", 224, Rarity.COMMON, mage.cards.r.RagingGoblin.class));
        cards.add(new SetCardInfo("Rain of Tears", 170, Rarity.UNCOMMON, mage.cards.r.RainOfTears.class));
        cards.add(new SetCardInfo("Rampant Growth", 288, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ravenous Rats", 171, Rarity.COMMON, mage.cards.r.RavenousRats.class));
        cards.add(new SetCardInfo("Razormane Masticore", 340, Rarity.RARE, mage.cards.r.RazormaneMasticore.class));
        cards.add(new SetCardInfo("Recollect", 289, Rarity.UNCOMMON, mage.cards.r.Recollect.class));
        cards.add(new SetCardInfo("Recover", 172, Rarity.COMMON, mage.cards.r.Recover.class));
        cards.add(new SetCardInfo("Regeneration", 290, Rarity.UNCOMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Relentless Assault", 225, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Relentless Rats", 173, Rarity.UNCOMMON, mage.cards.r.RelentlessRats.class));
        cards.add(new SetCardInfo("Reminisce", 99, Rarity.UNCOMMON, mage.cards.r.Reminisce.class));
        cards.add(new SetCardInfo("Remove Soul", 100, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Reviving Dose", 34, Rarity.COMMON, mage.cards.r.RevivingDose.class));
        cards.add(new SetCardInfo("Reya Dawnbringer", 35, Rarity.RARE, mage.cards.r.ReyaDawnbringer.class));
        cards.add(new SetCardInfo("Rhox", 291, Rarity.RARE, mage.cards.r.Rhox.class));
        cards.add(new SetCardInfo("Righteousness", 36, Rarity.RARE, mage.cards.r.Righteousness.class));
        cards.add(new SetCardInfo("Robe of Mirrors", 101, Rarity.COMMON, mage.cards.r.RobeOfMirrors.class));
        cards.add(new SetCardInfo("Rock Badger", 226, Rarity.COMMON, mage.cards.r.RockBadger.class));
        cards.add(new SetCardInfo("Rod of Ruin", 341, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Root Maze", 292, Rarity.RARE, mage.cards.r.RootMaze.class));
        cards.add(new SetCardInfo("Rootwalla", 293, Rarity.COMMON, mage.cards.r.Rootwalla.class));
        cards.add(new SetCardInfo("Rootwater Commando", 102, Rarity.COMMON, mage.cards.r.RootwaterCommando.class));
        cards.add(new SetCardInfo("Rootwater Matriarch", 103, Rarity.RARE, mage.cards.r.RootwaterMatriarch.class));
        cards.add(new SetCardInfo("Royal Assassin", 174, Rarity.RARE, mage.cards.r.RoyalAssassin.class));
        cards.add(new SetCardInfo("Rule of Law", 37, Rarity.UNCOMMON, mage.cards.r.RuleOfLaw.class));
        cards.add(new SetCardInfo("Rushwood Dryad", 294, Rarity.COMMON, mage.cards.r.RushwoodDryad.class));
        cards.add(new SetCardInfo("Sage Owl", 104, Rarity.COMMON, mage.cards.s.SageOwl.class));
        cards.add(new SetCardInfo("Samite Healer", 38, Rarity.COMMON, mage.cards.s.SamiteHealer.class));
        cards.add(new SetCardInfo("Scalpelexis", 105, Rarity.RARE, mage.cards.s.Scalpelexis.class));
        cards.add(new SetCardInfo("Scathe Zombies", 175, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Scion of the Wild", 295, Rarity.RARE, mage.cards.s.ScionOfTheWild.class));
        cards.add(new SetCardInfo("Scoria Wurm", 227, Rarity.RARE, mage.cards.s.ScoriaWurm.class));
        cards.add(new SetCardInfo("Sculpting Steel", 342, Rarity.RARE, mage.cards.s.SculptingSteel.class));
        cards.add(new SetCardInfo("Sea Monster", 106, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Seedborn Muse", 296, Rarity.RARE, mage.cards.s.SeedbornMuse.class));
        cards.add(new SetCardInfo("Seismic Assault", 228, Rarity.RARE, mage.cards.s.SeismicAssault.class));
        cards.add(new SetCardInfo("Sengir Vampire", 176, Rarity.RARE, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Serra Angel", 39, Rarity.RARE, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Serra's Embrace", 40, Rarity.UNCOMMON, mage.cards.s.SerrasEmbrace.class));
        cards.add(new SetCardInfo("Severed Legion", 177, Rarity.COMMON, mage.cards.s.SeveredLegion.class));
        cards.add(new SetCardInfo("Shatterstorm", 229, Rarity.UNCOMMON, mage.cards.s.Shatterstorm.class));
        cards.add(new SetCardInfo("Shimmering Wings", 107, Rarity.COMMON, mage.cards.s.ShimmeringWings.class));
        cards.add(new SetCardInfo("Shivan Dragon", 230, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shivan Hellkite", 231, Rarity.RARE, mage.cards.s.ShivanHellkite.class));
        cards.add(new SetCardInfo("Shivan Reef", 357, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shock", 232, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Shunt", 233, Rarity.RARE, mage.cards.s.Shunt.class));
        cards.add(new SetCardInfo("Siege-Gang Commander", 234, Rarity.RARE, mage.cards.s.SiegeGangCommander.class));
        cards.add(new SetCardInfo("Sift", 108, Rarity.COMMON, mage.cards.s.Sift.class));
        cards.add(new SetCardInfo("Skyhunter Patrol", 41, Rarity.COMMON, mage.cards.s.SkyhunterPatrol.class));
        cards.add(new SetCardInfo("Skyhunter Prowler", 42, Rarity.COMMON, mage.cards.s.SkyhunterProwler.class));
        cards.add(new SetCardInfo("Skyhunter Skirmisher", 43, Rarity.UNCOMMON, mage.cards.s.SkyhunterSkirmisher.class));
        cards.add(new SetCardInfo("Skyshroud Ranger", 297, Rarity.COMMON, mage.cards.s.SkyshroudRanger.class));
        cards.add(new SetCardInfo("Sky Weaver", 109, Rarity.UNCOMMON, mage.cards.s.SkyWeaver.class));
        cards.add(new SetCardInfo("Sleeper Agent", 178, Rarity.RARE, mage.cards.s.SleeperAgent.class));
        cards.add(new SetCardInfo("Smash", 235, Rarity.COMMON, mage.cards.s.Smash.class));
        cards.add(new SetCardInfo("Snapping Drake", 110, Rarity.COMMON, mage.cards.s.SnappingDrake.class));
        cards.add(new SetCardInfo("Soulblast", 236, Rarity.RARE, mage.cards.s.Soulblast.class));
        cards.add(new SetCardInfo("Soul Feast", 179, Rarity.UNCOMMON, mage.cards.s.SoulFeast.class));
        cards.add(new SetCardInfo("Soul Warden", 44, Rarity.UNCOMMON, mage.cards.s.SoulWarden.class));
        cards.add(new SetCardInfo("Spark Elemental", 237, Rarity.UNCOMMON, mage.cards.s.SparkElemental.class));
        cards.add(new SetCardInfo("Spawning Pool", 358, Rarity.UNCOMMON, mage.cards.s.SpawningPool.class));
        cards.add(new SetCardInfo("Spellbook", 343, Rarity.UNCOMMON, mage.cards.s.Spellbook.class));
        cards.add(new SetCardInfo("Spiketail Hatchling", 111, Rarity.UNCOMMON, mage.cards.s.SpiketailHatchling.class));
        cards.add(new SetCardInfo("Spined Wurm", 298, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spineless Thug", 180, Rarity.COMMON, mage.cards.s.SpinelessThug.class));
        cards.add(new SetCardInfo("Spirit Link", 45, Rarity.UNCOMMON, mage.cards.s.SpiritLink.class));
        cards.add(new SetCardInfo("Spirit Weaver", 46, Rarity.UNCOMMON, mage.cards.s.SpiritWeaver.class));
        cards.add(new SetCardInfo("Spitting Earth", 238, Rarity.COMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Squee, Goblin Nabob", 239, Rarity.RARE, mage.cards.s.SqueeGoblinNabob.class));
        cards.add(new SetCardInfo("Stalking Tiger", 299, Rarity.COMMON, mage.cards.s.StalkingTiger.class));
        cards.add(new SetCardInfo("Stampeding Wildebeests", 300, Rarity.UNCOMMON, mage.cards.s.StampedingWildebeests.class));
        cards.add(new SetCardInfo("Starlight Invoker", 47, Rarity.UNCOMMON, mage.cards.s.StarlightInvoker.class));
        cards.add(new SetCardInfo("Steadfast Guard", 48, Rarity.COMMON, mage.cards.s.SteadfastGuard.class));
        cards.add(new SetCardInfo("Steel Golem", 344, Rarity.UNCOMMON, mage.cards.s.SteelGolem.class));
        cards.add(new SetCardInfo("Story Circle", 49, Rarity.RARE, mage.cards.s.StoryCircle.class));
        cards.add(new SetCardInfo("Stronghold Discipline", 181, Rarity.UNCOMMON, mage.cards.s.StrongholdDiscipline.class));
        cards.add(new SetCardInfo("Stun", 240, Rarity.COMMON, mage.cards.s.Stun.class));
        cards.add(new SetCardInfo("Sudden Impact", 241, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 359, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Sunken Hope", 112, Rarity.RARE, mage.cards.s.SunkenHope.class));
        cards.add(new SetCardInfo("Suntail Hawk", 50, Rarity.COMMON, mage.cards.s.SuntailHawk.class));
        cards.add(new SetCardInfo("Swamp", 372, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 373, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 374, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 375, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Sylvan Basilisk", 301, Rarity.UNCOMMON, mage.cards.s.SylvanBasilisk.class));
        cards.add(new SetCardInfo("Sylvan Scrying", 302, Rarity.UNCOMMON, mage.cards.s.SylvanScrying.class));
        cards.add(new SetCardInfo("Tangle Spider", 303, Rarity.UNCOMMON, mage.cards.t.TangleSpider.class));
        cards.add(new SetCardInfo("Telepathy", 113, Rarity.UNCOMMON, mage.cards.t.Telepathy.class));
        cards.add(new SetCardInfo("Telling Time", 114, Rarity.UNCOMMON, mage.cards.t.TellingTime.class));
        cards.add(new SetCardInfo("Tempest of Light", 51, Rarity.UNCOMMON, mage.cards.t.TempestOfLight.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 360, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Terror", 182, Rarity.COMMON, mage.cards.t.Terror.class));
        cards.add(new SetCardInfo("The Hive", 324, Rarity.RARE, mage.cards.t.TheHive.class));
        cards.add(new SetCardInfo("Thieving Magpie", 115, Rarity.UNCOMMON, mage.cards.t.ThievingMagpie.class));
        cards.add(new SetCardInfo("Threaten", 242, Rarity.UNCOMMON, mage.cards.t.Threaten.class));
        cards.add(new SetCardInfo("Thrull Surgeon", 183, Rarity.UNCOMMON, mage.cards.t.ThrullSurgeon.class));
        cards.add(new SetCardInfo("Thundering Giant", 243, Rarity.UNCOMMON, mage.cards.t.ThunderingGiant.class));
        cards.add(new SetCardInfo("Tidings", 116, Rarity.UNCOMMON, mage.cards.t.Tidings.class));
        cards.add(new SetCardInfo("Time Stop", 117, Rarity.RARE, mage.cards.t.TimeStop.class));
        cards.add(new SetCardInfo("Time Stretch", 118, Rarity.RARE, mage.cards.t.TimeStretch.class));
        cards.add(new SetCardInfo("Traumatize", 119, Rarity.RARE, mage.cards.t.Traumatize.class));
        cards.add(new SetCardInfo("Treasure Hunter", 52, Rarity.UNCOMMON, mage.cards.t.TreasureHunter.class));
        cards.add(new SetCardInfo("Treetop Bracers", 304, Rarity.COMMON, mage.cards.t.TreetopBracers.class));
        cards.add(new SetCardInfo("Treetop Village", 361, Rarity.UNCOMMON, mage.cards.t.TreetopVillage.class));
        cards.add(new SetCardInfo("Troll Ascetic", 305, Rarity.RARE, mage.cards.t.TrollAscetic.class));
        cards.add(new SetCardInfo("True Believer", 53, Rarity.RARE, mage.cards.t.TrueBeliever.class));
        cards.add(new SetCardInfo("Tundra Wolves", 54, Rarity.COMMON, mage.cards.t.TundraWolves.class));
        cards.add(new SetCardInfo("Twincast", 120, Rarity.RARE, mage.cards.t.Twincast.class));
        cards.add(new SetCardInfo("Twitch", 121, Rarity.COMMON, mage.cards.t.Twitch.class));
        cards.add(new SetCardInfo("Uncontrollable Anger", 244, Rarity.COMMON, mage.cards.u.UncontrollableAnger.class));
        cards.add(new SetCardInfo("Underground River", 362, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Underworld Dreams", 184, Rarity.RARE, mage.cards.u.UnderworldDreams.class));
        cards.add(new SetCardInfo("Unholy Strength", 185, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Unsummon", 122, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Upwelling", 306, Rarity.RARE, mage.cards.u.Upwelling.class));
        cards.add(new SetCardInfo("Vampire Bats", 186, Rarity.COMMON, mage.cards.v.VampireBats.class));
        cards.add(new SetCardInfo("Vedalken Mastermind", 123, Rarity.UNCOMMON, mage.cards.v.VedalkenMastermind.class));
        cards.add(new SetCardInfo("Venerable Monk", 55, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Verdant Force", 307, Rarity.RARE, mage.cards.v.VerdantForce.class));
        cards.add(new SetCardInfo("Viashino Runner", 245, Rarity.COMMON, mage.cards.v.ViashinoRunner.class));
        cards.add(new SetCardInfo("Viashino Sandscout", 246, Rarity.COMMON, mage.cards.v.ViashinoSandscout.class));
        cards.add(new SetCardInfo("Viridian Shaman", 308, Rarity.UNCOMMON, mage.cards.v.ViridianShaman.class));
        cards.add(new SetCardInfo("Voice of All", 56, Rarity.RARE, mage.cards.v.VoiceOfAll.class));
        cards.add(new SetCardInfo("Wall of Air", 124, Rarity.UNCOMMON, mage.cards.w.WallOfAir.class));
        cards.add(new SetCardInfo("Wall of Fire", 247, Rarity.UNCOMMON, mage.cards.w.WallOfFire.class));
        cards.add(new SetCardInfo("Wall of Swords", 57, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Wall of Wood", 309, Rarity.COMMON, mage.cards.w.WallOfWood.class));
        cards.add(new SetCardInfo("Warp World", 248, Rarity.RARE, mage.cards.w.WarpWorld.class));
        cards.add(new SetCardInfo("Warrior's Honor", 58, Rarity.COMMON, mage.cards.w.WarriorsHonor.class));
        cards.add(new SetCardInfo("Whispersilk Cloak", 345, Rarity.UNCOMMON, mage.cards.w.WhispersilkCloak.class));
        cards.add(new SetCardInfo("Wild Griffin", 59, Rarity.COMMON, mage.cards.w.WildGriffin.class));
        cards.add(new SetCardInfo("Windborn Muse", 60, Rarity.RARE, mage.cards.w.WindbornMuse.class));
        cards.add(new SetCardInfo("Wrath of God", 61, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Wurm's Tooth", 346, Rarity.UNCOMMON, mage.cards.w.WurmsTooth.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 363, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", 310, Rarity.UNCOMMON, mage.cards.y.YavimayaEnchantress.class));
        cards.add(new SetCardInfo("Youthful Knight", 62, Rarity.COMMON, mage.cards.y.YouthfulKnight.class));
    }

}
