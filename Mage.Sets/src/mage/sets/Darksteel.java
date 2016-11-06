package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.SetType;

import mage.constants.Rarity;

public class Darksteel extends ExpansionSet {

    private static final Darksteel fINSTANCE = new Darksteel();

    public static Darksteel getInstance() {
        return fINSTANCE;
    }

    public Darksteel() {
        super("Darksteel", "DST", ExpansionSet.buildDate(2004, 1, 6), SetType.EXPANSION);
        this.blockName = "Mirrodin";
        this.parentSet = Mirrodin.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aether Snap", 37, Rarity.RARE, mage.cards.a.AetherSnap.class));
        cards.add(new SetCardInfo("Aether Vial", 91, Rarity.UNCOMMON, mage.cards.a.AetherVial.class));
        cards.add(new SetCardInfo("Ageless Entity", 73, Rarity.RARE, mage.cards.a.AgelessEntity.class));
        cards.add(new SetCardInfo("Angel's Feather", 92, Rarity.UNCOMMON, mage.cards.a.AngelsFeather.class));
        cards.add(new SetCardInfo("Arcane Spyglass", 93, Rarity.COMMON, mage.cards.a.ArcaneSpyglass.class));
        cards.add(new SetCardInfo("Arcbound Bruiser", 94, Rarity.COMMON, mage.cards.a.ArcboundBruiser.class));
        cards.add(new SetCardInfo("Arcbound Crusher", 95, Rarity.UNCOMMON, mage.cards.a.ArcboundCrusher.class));
        cards.add(new SetCardInfo("Arcbound Hybrid", 97, Rarity.COMMON, mage.cards.a.ArcboundHybrid.class));
        cards.add(new SetCardInfo("Arcbound Lancer", 98, Rarity.UNCOMMON, mage.cards.a.ArcboundLancer.class));
        cards.add(new SetCardInfo("Arcbound Overseer", 99, Rarity.RARE, mage.cards.a.ArcboundOverseer.class));
        cards.add(new SetCardInfo("Arcbound Ravager", 100, Rarity.RARE, mage.cards.a.ArcboundRavager.class));
        cards.add(new SetCardInfo("Arcbound Reclaimer", 101, Rarity.RARE, mage.cards.a.ArcboundReclaimer.class));
        cards.add(new SetCardInfo("Arcbound Slith", 102, Rarity.UNCOMMON, mage.cards.a.ArcboundSlith.class));
        cards.add(new SetCardInfo("Arcbound Stinger", 103, Rarity.COMMON, mage.cards.a.ArcboundStinger.class));
        cards.add(new SetCardInfo("Arcbound Worker", 104, Rarity.COMMON, mage.cards.a.ArcboundWorker.class));
        cards.add(new SetCardInfo("Auriok Glaivemaster", 1, Rarity.COMMON, mage.cards.a.AuriokGlaivemaster.class));
        cards.add(new SetCardInfo("Auriok Siege Sled", 105, Rarity.UNCOMMON, mage.cards.a.AuriokSiegeSled.class));
        cards.add(new SetCardInfo("Barbed Lightning", 55, Rarity.COMMON, mage.cards.b.BarbedLightning.class));
        cards.add(new SetCardInfo("Blinkmoth Nexus", 163, Rarity.RARE, mage.cards.b.BlinkmothNexus.class));
        cards.add(new SetCardInfo("Burden of Greed", 38, Rarity.COMMON, mage.cards.b.BurdenOfGreed.class));
        cards.add(new SetCardInfo("Chittering Rats", 39, Rarity.COMMON, mage.cards.c.ChitteringRats.class));
        cards.add(new SetCardInfo("Chromescale Drake", 20, Rarity.RARE, mage.cards.c.ChromescaleDrake.class));
        cards.add(new SetCardInfo("Coretapper", 107, Rarity.UNCOMMON, mage.cards.c.Coretapper.class));
        cards.add(new SetCardInfo("Crazed Goblin", 56, Rarity.COMMON, mage.cards.c.CrazedGoblin.class));
        cards.add(new SetCardInfo("Darksteel Brute", 108, Rarity.UNCOMMON, mage.cards.d.DarksteelBrute.class));
        cards.add(new SetCardInfo("Darksteel Citadel", 164, Rarity.COMMON, mage.cards.d.DarksteelCitadel.class));
        cards.add(new SetCardInfo("Darksteel Colossus", 109, Rarity.RARE, mage.cards.d.DarksteelColossus.class));
        cards.add(new SetCardInfo("Darksteel Forge", 110, Rarity.RARE, mage.cards.d.DarksteelForge.class));
        cards.add(new SetCardInfo("Darksteel Gargoyle", 111, Rarity.UNCOMMON, mage.cards.d.DarksteelGargoyle.class));
        cards.add(new SetCardInfo("Darksteel Ingot", 112, Rarity.COMMON, mage.cards.d.DarksteelIngot.class));
        cards.add(new SetCardInfo("Darksteel Pendant", 113, Rarity.COMMON, mage.cards.d.DarksteelPendant.class));
        cards.add(new SetCardInfo("Darksteel Reactor", 114, Rarity.RARE, mage.cards.d.DarksteelReactor.class));
        cards.add(new SetCardInfo("Death Cloud", 40, Rarity.RARE, mage.cards.d.DeathCloud.class));
        cards.add(new SetCardInfo("Demon's Horn", 116, Rarity.UNCOMMON, mage.cards.d.DemonsHorn.class));
        cards.add(new SetCardInfo("Dragon's Claw", 117, Rarity.UNCOMMON, mage.cards.d.DragonsClaw.class));
        cards.add(new SetCardInfo("Drill-Skimmer", 118, Rarity.COMMON, mage.cards.d.DrillSkimmer.class));
        cards.add(new SetCardInfo("Drooling Ogre", 58, Rarity.COMMON, mage.cards.d.DroolingOgre.class));
        cards.add(new SetCardInfo("Dross Golem", 119, Rarity.COMMON, mage.cards.d.DrossGolem.class));
        cards.add(new SetCardInfo("Eater of Days", 120, Rarity.RARE, mage.cards.e.EaterOfDays.class));
        cards.add(new SetCardInfo("Echoing Calm", 2, Rarity.COMMON, mage.cards.e.EchoingCalm.class));
        cards.add(new SetCardInfo("Echoing Courage", 74, Rarity.COMMON, mage.cards.e.EchoingCourage.class));
        cards.add(new SetCardInfo("Echoing Decay", 41, Rarity.COMMON, mage.cards.e.EchoingDecay.class));
        cards.add(new SetCardInfo("Echoing Ruin", 59, Rarity.COMMON, mage.cards.e.EchoingRuin.class));
        cards.add(new SetCardInfo("Echoing Truth", 21, Rarity.COMMON, mage.cards.e.EchoingTruth.class));
        cards.add(new SetCardInfo("Emissary of Despair", 42, Rarity.UNCOMMON, mage.cards.e.EmissaryOfDespair.class));
        cards.add(new SetCardInfo("Emissary of Hope", 3, Rarity.UNCOMMON, mage.cards.e.EmissaryOfHope.class));
        cards.add(new SetCardInfo("Essence Drain", 43, Rarity.COMMON, mage.cards.e.EssenceDrain.class));
        cards.add(new SetCardInfo("Fangren Firstborn", 75, Rarity.RARE, mage.cards.f.FangrenFirstborn.class));
        cards.add(new SetCardInfo("Fireball", 60, Rarity.UNCOMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Flamebreak", 61, Rarity.RARE, mage.cards.f.Flamebreak.class));
        cards.add(new SetCardInfo("Furnace Dragon", 62, Rarity.RARE, mage.cards.f.FurnaceDragon.class));
        cards.add(new SetCardInfo("Genesis Chamber", 122, Rarity.UNCOMMON, mage.cards.g.GenesisChamber.class));
        cards.add(new SetCardInfo("Geth's Grimoire", 123, Rarity.UNCOMMON, mage.cards.g.GethsGrimoire.class));
        cards.add(new SetCardInfo("Goblin Archaeologist", 63, Rarity.UNCOMMON, mage.cards.g.GoblinArchaeologist.class));
        cards.add(new SetCardInfo("Greater Harvester", 44, Rarity.RARE, mage.cards.g.GreaterHarvester.class));
        cards.add(new SetCardInfo("Grimclaw Bats", 45, Rarity.COMMON, mage.cards.g.GrimclawBats.class));
        cards.add(new SetCardInfo("Hallow", 4, Rarity.COMMON, mage.cards.h.Hallow.class));
        cards.add(new SetCardInfo("Hoverguard Observer", 22, Rarity.UNCOMMON, mage.cards.h.HoverguardObserver.class));
        cards.add(new SetCardInfo("Hunger of the Nim", 46, Rarity.COMMON, mage.cards.h.HungerOfTheNim.class));
        cards.add(new SetCardInfo("Inflame", 64, Rarity.COMMON, mage.cards.i.Inflame.class));
        cards.add(new SetCardInfo("Juggernaut", 125, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Karstoderm", 77, Rarity.UNCOMMON, mage.cards.k.Karstoderm.class));
        cards.add(new SetCardInfo("Kraken's Eye", 126, Rarity.UNCOMMON, mage.cards.k.KrakensEye.class));
        cards.add(new SetCardInfo("Krark-Clan Stoker", 65, Rarity.COMMON, mage.cards.k.KrarkClanStoker.class));
        cards.add(new SetCardInfo("Last Word", 23, Rarity.RARE, mage.cards.l.LastWord.class));
        cards.add(new SetCardInfo("Leonin Battlemage", 5, Rarity.UNCOMMON, mage.cards.l.LeoninBattlemage.class));
        cards.add(new SetCardInfo("Leonin Bola", 127, Rarity.COMMON, mage.cards.l.LeoninBola.class));
        cards.add(new SetCardInfo("Leonin Shikari", 6, Rarity.RARE, mage.cards.l.LeoninShikari.class));
        cards.add(new SetCardInfo("Lich's Tomb", 128, Rarity.RARE, mage.cards.l.LichsTomb.class));
        cards.add(new SetCardInfo("Loxodon Mystic", 7, Rarity.COMMON, mage.cards.l.LoxodonMystic.class));
        cards.add(new SetCardInfo("Magnetic Flux", 25, Rarity.COMMON, mage.cards.m.MagneticFlux.class));
        cards.add(new SetCardInfo("Memnarch", 129, Rarity.RARE, mage.cards.m.Memnarch.class));
        cards.add(new SetCardInfo("Mephitic Ooze", 47, Rarity.RARE, mage.cards.m.MephiticOoze.class));
        cards.add(new SetCardInfo("Metal Fatigue", 8, Rarity.COMMON, mage.cards.m.MetalFatigue.class));
        cards.add(new SetCardInfo("Mirrodin's Core", 165, Rarity.UNCOMMON, mage.cards.m.MirrodinsCore.class));
        cards.add(new SetCardInfo("Murderous Spoils", 48, Rarity.UNCOMMON, mage.cards.m.MurderousSpoils.class));
        cards.add(new SetCardInfo("Mycosynth Lattice", 130, Rarity.RARE, mage.cards.m.MycosynthLattice.class));
        cards.add(new SetCardInfo("Myr Landshaper", 131, Rarity.COMMON, mage.cards.m.MyrLandshaper.class));
        cards.add(new SetCardInfo("Myr Matrix", 132, Rarity.RARE, mage.cards.m.MyrMatrix.class));
        cards.add(new SetCardInfo("Myr Moonvessel", 133, Rarity.COMMON, mage.cards.m.MyrMoonvessel.class));
        cards.add(new SetCardInfo("Nemesis Mask", 134, Rarity.UNCOMMON, mage.cards.n.NemesisMask.class));
        cards.add(new SetCardInfo("Neurok Prodigy", 26, Rarity.COMMON, mage.cards.n.NeurokProdigy.class));
        cards.add(new SetCardInfo("Nim Abomination", 49, Rarity.UNCOMMON, mage.cards.n.NimAbomination.class));
        cards.add(new SetCardInfo("Nourish", 78, Rarity.COMMON, mage.cards.n.Nourish.class));
        cards.add(new SetCardInfo("Oxidda Golem", 135, Rarity.COMMON, mage.cards.o.OxiddaGolem.class));
        cards.add(new SetCardInfo("Oxidize", 79, Rarity.UNCOMMON, mage.cards.o.Oxidize.class));
        cards.add(new SetCardInfo("Panoptic Mirror", 136, Rarity.RARE, mage.cards.p.PanopticMirror.class));
        cards.add(new SetCardInfo("Pristine Angel", 9, Rarity.RARE, mage.cards.p.PristineAngel.class));
        cards.add(new SetCardInfo("Psychic Overload", 28, Rarity.UNCOMMON, mage.cards.p.PsychicOverload.class));
        cards.add(new SetCardInfo("Pteron Ghost", 10, Rarity.COMMON, mage.cards.p.PteronGhost.class));
        cards.add(new SetCardInfo("Pulse of the Fields", 11, Rarity.RARE, mage.cards.p.PulseOfTheFields.class));
        cards.add(new SetCardInfo("Pulse of the Forge", 66, Rarity.RARE, mage.cards.p.PulseOfTheForge.class));
        cards.add(new SetCardInfo("Pulse of the Grid", 29, Rarity.RARE, mage.cards.p.PulseOfTheGrid.class));
        cards.add(new SetCardInfo("Pulse of the Tangle", 80, Rarity.RARE, mage.cards.p.PulseOfTheTangle.class));
        cards.add(new SetCardInfo("Purge", 12, Rarity.UNCOMMON, mage.cards.p.Purge.class));
        cards.add(new SetCardInfo("Quicksilver Behemoth", 30, Rarity.COMMON, mage.cards.q.QuicksilverBehemoth.class));
        cards.add(new SetCardInfo("Razor Golem", 137, Rarity.COMMON, mage.cards.r.RazorGolem.class));
        cards.add(new SetCardInfo("Reap and Sow", 81, Rarity.COMMON, mage.cards.r.ReapAndSow.class));
        cards.add(new SetCardInfo("Rebuking Ceremony", 82, Rarity.RARE, mage.cards.r.RebukingCeremony.class));
        cards.add(new SetCardInfo("Reshape", 31, Rarity.RARE, mage.cards.r.Reshape.class));
        cards.add(new SetCardInfo("Retract", 32, Rarity.RARE, mage.cards.r.Retract.class));
        cards.add(new SetCardInfo("Ritual of Restoration", 13, Rarity.COMMON, mage.cards.r.RitualOfRestoration.class));
        cards.add(new SetCardInfo("Roaring Slagwurm", 83, Rarity.RARE, mage.cards.r.RoaringSlagwurm.class));
        cards.add(new SetCardInfo("Savage Beating", 67, Rarity.RARE, mage.cards.s.SavageBeating.class));
        cards.add(new SetCardInfo("Scavenging Scarab", 51, Rarity.COMMON, mage.cards.s.ScavengingScarab.class));
        cards.add(new SetCardInfo("Screams from Within", 52, Rarity.UNCOMMON, mage.cards.s.ScreamsFromWithin.class));
        cards.add(new SetCardInfo("Serum Powder", 138, Rarity.RARE, mage.cards.s.SerumPowder.class));
        cards.add(new SetCardInfo("Shield of Kaldra", 139, Rarity.RARE, mage.cards.s.ShieldOfKaldra.class));
        cards.add(new SetCardInfo("Shunt", 68, Rarity.RARE, mage.cards.s.Shunt.class));
        cards.add(new SetCardInfo("Skullclamp", 140, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Slobad, Goblin Tinkerer", 69, Rarity.RARE, mage.cards.s.SlobadGoblinTinkerer.class));
        cards.add(new SetCardInfo("Soulscour", 14, Rarity.RARE, mage.cards.s.Soulscour.class));
        cards.add(new SetCardInfo("Spawning Pit", 141, Rarity.UNCOMMON, mage.cards.s.SpawningPit.class));
        cards.add(new SetCardInfo("Spellbinder", 143, Rarity.RARE, mage.cards.s.Spellbinder.class));
        cards.add(new SetCardInfo("Spincrusher", 144, Rarity.UNCOMMON, mage.cards.s.Spincrusher.class));
        cards.add(new SetCardInfo("Spire Golem", 145, Rarity.COMMON, mage.cards.s.SpireGolem.class));
        cards.add(new SetCardInfo("Stand Together", 84, Rarity.UNCOMMON, mage.cards.s.StandTogether.class));
        cards.add(new SetCardInfo("Steelshaper Apprentice", 15, Rarity.RARE, mage.cards.s.SteelshaperApprentice.class));
        cards.add(new SetCardInfo("Stir the Pride", 16, Rarity.UNCOMMON, mage.cards.s.StirThePride.class));
        cards.add(new SetCardInfo("Sundering Titan", 146, Rarity.RARE, mage.cards.s.SunderingTitan.class));
        cards.add(new SetCardInfo("Surestrike Trident", 147, Rarity.UNCOMMON, mage.cards.s.SurestrikeTrident.class));
        cards.add(new SetCardInfo("Sword of Fire and Ice", 148, Rarity.RARE, mage.cards.s.SwordOfFireAndIce.class));
        cards.add(new SetCardInfo("Sword of Light and Shadow", 149, Rarity.RARE, mage.cards.s.SwordOfLightAndShadow.class));
        cards.add(new SetCardInfo("Synod Artificer", 34, Rarity.RARE, mage.cards.s.SynodArtificer.class));
        cards.add(new SetCardInfo("Tangle Golem", 151, Rarity.COMMON, mage.cards.t.TangleGolem.class));
        cards.add(new SetCardInfo("Tangle Spider", 85, Rarity.COMMON, mage.cards.t.TangleSpider.class));
        cards.add(new SetCardInfo("Tanglewalker", 86, Rarity.UNCOMMON, mage.cards.t.Tanglewalker.class));
        cards.add(new SetCardInfo("Tears of Rage", 70, Rarity.UNCOMMON, mage.cards.t.TearsOfRage.class));
        cards.add(new SetCardInfo("Tel-Jilad Outrider", 87, Rarity.COMMON, mage.cards.t.TelJiladOutrider.class));
        cards.add(new SetCardInfo("Tel-Jilad Wolf", 88, Rarity.COMMON, mage.cards.t.TelJiladWolf.class));
        cards.add(new SetCardInfo("Test of Faith", 17, Rarity.UNCOMMON, mage.cards.t.TestOfFaith.class));
        cards.add(new SetCardInfo("Thunderstaff", 153, Rarity.UNCOMMON, mage.cards.t.Thunderstaff.class));
        cards.add(new SetCardInfo("Trinisphere", 154, Rarity.RARE, mage.cards.t.Trinisphere.class));
	cards.add(new SetCardInfo("Turn the Tables", 18, Rarity.RARE, mage.cards.t.TurnTheTables.class));
        cards.add(new SetCardInfo("Unforge", 71, Rarity.COMMON, mage.cards.u.Unforge.class));
        cards.add(new SetCardInfo("Ur-Golem's Eye", 155, Rarity.COMMON, mage.cards.u.UrGolemsEye.class));
        cards.add(new SetCardInfo("Vedalken Engineer", 35, Rarity.COMMON, mage.cards.v.VedalkenEngineer.class));
        cards.add(new SetCardInfo("Vex", 36, Rarity.COMMON, mage.cards.v.Vex.class));
        cards.add(new SetCardInfo("Viridian Acolyte", 89, Rarity.COMMON, mage.cards.v.ViridianAcolyte.class));
        cards.add(new SetCardInfo("Viridian Zealot", 90, Rarity.RARE, mage.cards.v.ViridianZealot.class));
        cards.add(new SetCardInfo("Voltaic Construct", 156, Rarity.UNCOMMON, mage.cards.v.VoltaicConstruct.class));
        cards.add(new SetCardInfo("Vulshok Morningstar", 157, Rarity.COMMON, mage.cards.v.VulshokMorningstar.class));
        cards.add(new SetCardInfo("Vulshok War Boar", 72, Rarity.UNCOMMON, mage.cards.v.VulshokWarBoar.class));
        cards.add(new SetCardInfo("Wand of the Elements", 158, Rarity.RARE, mage.cards.w.WandOfTheElements.class));
        cards.add(new SetCardInfo("Well of Lost Dreams", 159, Rarity.RARE, mage.cards.w.WellOfLostDreams.class));
        cards.add(new SetCardInfo("Whispersilk Cloak", 160, Rarity.COMMON, mage.cards.w.WhispersilkCloak.class));
        cards.add(new SetCardInfo("Wirefly Hive", 161, Rarity.UNCOMMON, mage.cards.w.WireflyHive.class));
        cards.add(new SetCardInfo("Wurm's Tooth", 162, Rarity.UNCOMMON, mage.cards.w.WurmsTooth.class));
    }
}
