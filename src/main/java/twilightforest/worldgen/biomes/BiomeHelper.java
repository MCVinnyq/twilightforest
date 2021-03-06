package twilightforest.worldgen.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import twilightforest.TFSounds;
import twilightforest.TFStructures;
import twilightforest.entity.TFEntities;
import twilightforest.worldgen.ConfiguredFeatures;

import java.util.function.Consumer;

public abstract class BiomeHelper {
    
	//TODO: uncomment all druid huts when theyre fixed
    public static BiomeGenerationSettings.Builder twilightForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		
		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addCanopyTrees(biome);
		addTwilightOakTrees(biome);
		addTwilightOakTrees(biome);
		addHollowOakTrees(biome);
		addDefaultStructures(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder denseForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.JUNGLE_BUSH);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.JUNGLE_BUSH);

		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addCanopyTrees(biome);
		addCanopyTrees(biome);
		addTwilightOakTrees(biome);
		addTwilightOakTrees(biome);
		addHollowOakTrees(biome);
		addDefaultStructures(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder fireflyForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.LAMPPOST);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MUSHGLOOM_CLUSTER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_PUMPKIN);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.FOREST_FLOWER_VEGETATION_COMMON);
		
		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addFireflyCanopyTrees(biome);
		addTwilightOakTrees(biome);
		addHollowOakTrees(biome);
		addDefaultStructures(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder oakSavannaGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);

		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addRareOakTrees(biome);
		addDefaultStructures(biome);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder enchantedForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.VINES);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addRainbowOaks(biome);
		addCanopyTrees(biome);
		addHollowOakTrees(biome);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder spookyForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.PUMPKIN_LAMPPOST);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.SMALL_LOG);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WEBS);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FALLEN_LEAVES);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.GRAVEYARD);
		addDeadCanopyTrees(biome);
		addTwilightOakTrees(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder mushroomForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MYCELIUM_BLOB);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);

		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addTwilightOakTrees(biome);
		addHollowOakTrees(biome);
		addCanopyMushrooms(biome, false);
		addDefaultStructures(biome);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder denseMushroomForestGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MYCELIUM_BLOB);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);

		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		addTwilightOakTrees(biome);
		addHollowOakTrees(biome);
		addCanopyMushrooms(biome, true);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder thornlandsGen(BiomeGenerationSettings.Builder biome) {
		biome.withSurfaceBuilder(twilightforest.worldgen.ConfiguredSurfaceBuilders.CONFIGURED_PLATEAU);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		
		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		
		//TODO: actually fix thorns so they arent so laggy
		addThorns(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder highlandsGen(BiomeGenerationSettings.Builder biome) {
		biome.withSurfaceBuilder(twilightforest.worldgen.ConfiguredSurfaceBuilders.CONFIGURED_HIGHLANDS);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.TROLL_ROOTS);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.MEGA_SPRUCE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.TREES_GIANT_SPRUCE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRUCE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.FOREST_ROCK);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_GRASS_TAIGA);
		
		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder swampGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_WATER_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_SUGAR_CANE_SWAMP);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.VINES);
		
		//biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DRUID_HUT);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.WELL);
		
		addMangroveTrees(biome);
		addSwampOakTrees(biome);
		addHollowOakTrees(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder fireSwampGen(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_FALLEN_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_WATER_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FIRE_JET);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_SUGAR_CANE_SWAMP);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.VINES);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.BROWN_MUSHROOM_SWAMP);

		addSwampOakTrees(biome);
		addHollowOakTrees(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder darkForestGen() {
		BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder()
                .withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MUSHGLOOM_CLUSTER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_BROWN_MUSHROOM);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.SMALL_LOG);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_DEAD_BUSH);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.JUNGLE_BUSH);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.OAK);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_PUMPKIN);
		
		addDarkwoodLanternTrees(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder darkForestCenterGen() {
		BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder()
                .withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);
		
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FOREST_GRASS_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLACER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.SMALL_LOG);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MUSHGLOOM_CLUSTER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_DEAD_BUSH);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.JUNGLE_BUSH);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.OAK);
		
		addDarkwoodTrees(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder snowyForestGen() {
		BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder()
				.withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);
		biome.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_WATER);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RANDOM_COMMON_FEATURE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.SMALL_LOG);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRUCE_SNOWY);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.TREES_GIANT_SPRUCE);
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PILE_SNOW);
		
		DefaultBiomeFeatures.withOverworldOres(biome);
		DefaultBiomeFeatures.withFrozenTopLayer(biome);
		
		return biome;
	}
	
	public static BiomeGenerationSettings.Builder glacierGen() {
		BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder()
                .withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);

		return biome;
	}
	
	public static BiomeGenerationSettings.Builder withWoodRoots(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredFeatures.WOOD_ROOTS_SPREAD);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addDefaultStructures(BiomeGenerationSettings.Builder biome) {
    	return biome.
				withStructure(TFStructures.CONFIGURED_HEDGE_MAZE).
				withStructure(TFStructures.CONFIGURED_HOLLOW_HILL_SMALL).
				withStructure(TFStructures.CONFIGURED_HOLLOW_HILL_MEDIUM).
				withStructure(TFStructures.CONFIGURED_HOLLOW_HILL_LARGE).
				withStructure(TFStructures.CONFIGURED_NAGA_COURTYARD).
				withStructure(TFStructures.CONFIGURED_LICH_TOWER);
	}
    
    public static BiomeGenerationSettings.Builder addThorns(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.THORNS);

        return biome;
    }

    //Canopies, trees, and anything resembling a forest thing
    public static BiomeGenerationSettings.Builder addCanopyTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.CANOPY_TREES);

        return biome;
    }
    public static BiomeGenerationSettings.Builder addFireflyCanopyTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.FIREFLY_CANOPY_TREES);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addDeadCanopyTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DEAD_CANOPY_TREES);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addCanopyMushrooms(BiomeGenerationSettings.Builder biome, boolean dense) {
        DefaultBiomeFeatures.withNormalMushroomGeneration(biome); // Add small mushrooms
        DefaultBiomeFeatures.withMushroomBiomeVegetation(biome); // Add large mushrooms

        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, dense ? ConfiguredFeatures.CANOPY_MUSHROOMS_DENSE : ConfiguredFeatures.CANOPY_MUSHROOMS_SPARSE);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addRainbowOaks(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.RAINBOW_OAK_TREES);
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.LARGE_RAINBOW_OAK_TREES);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addMangroveTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.MANGROVE_TREES);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addDarkwoodTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DARKWOOD_TREES);

        return biome;
    }

    public static BiomeGenerationSettings.Builder addDarkwoodLanternTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DARKWOOD_LANTERN_TREES);

        return biome;
    }
    
    public static BiomeGenerationSettings.Builder addTwilightOakTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.TWILIGHT_OAK_TREES);

        return biome;
    }
    
    public static BiomeGenerationSettings.Builder addHollowOakTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.HOLLOW_TREE_PLACER);

        return biome;
    }
    
    public static BiomeGenerationSettings.Builder addRareOakTrees(BiomeGenerationSettings.Builder biome) {
        biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.OAK_TREES_SPARSE);

        return biome;
    }

	public static BiomeGenerationSettings.Builder addSwampOakTrees(BiomeGenerationSettings.Builder biome) {
		biome.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.SWAMPY_OAK_TREES);

		return biome;
	}

    public static BiomeAmbience.Builder whiteAshParticles(BiomeAmbience.Builder builder) {
        builder.setParticle(new ParticleEffectAmbience(ParticleTypes.WHITE_ASH, 0.2f));
        return builder;
    }

    // Only use if a Builder modification function does not return the builder
    public static BiomeGenerationSettings.Builder modify(BiomeGenerationSettings.Builder builder, Consumer<BiomeGenerationSettings.Builder> consumer) {
        consumer.accept(builder);
        return builder;
    }

    // Defaults

    public static BiomeAmbience.Builder defaultAmbientBuilder() {
        return new BiomeAmbience.Builder()
                .setFogColor(0xC0FFD8) // TODO Change based on Biome. Not previously done before
                .setWaterColor(0x3F76E4)
                .setWaterFogColor(0x050533)
                .withSkyColor(0x20224A) //TODO Change based on Biome. Not previously done before
                .setMoodSound(MoodSoundAmbience.DEFAULT_CAVE) // We should probably change it
                .setMusic(ConfiguredFeatures.TFMUSICTYPE);
        
    }

    public static BiomeGenerationSettings.Builder addWildcardTrees(BiomeGenerationSettings.Builder builder) {
        return builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ConfiguredFeatures.DEFAULT_TWILIGHT_TREES);
    }

    public static BiomeGenerationSettings.Builder defaultGenSettingBuilder() {
        BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder()
                .withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j); // GRASS_DIRT_GRAVEL_CONFIG

        // TODO Re-enable, currently disabled so it's just easier to read the jsons
        DefaultBiomeFeatures.withCommonOverworldBlocks(biome);
        DefaultBiomeFeatures.withOverworldOres(biome);
        //DefaultBiomeFeatures.withLavaAndWaterLakes(biome);
        DefaultBiomeFeatures.withClayDisks(biome);
        DefaultBiomeFeatures.withForestGrass(biome);
        DefaultBiomeFeatures.withTallGrass(biome);

        DefaultBiomeFeatures.withLavaAndWaterSprings(biome);

        withWoodRoots(biome);

        return biome;
    }

    public static MobSpawnInfo.Builder defaultMobSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.1f);

        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.bighorn_sheep, 12, 4, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.wild_boar, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.CHICKEN, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.deer, 15, 4, 5));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 5, 4, 4));

        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.tiny_bird, 15, 4, 8));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.squirrel, 10, 2, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.bunny, 10, 4, 5));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.raven, 10, 1, 2));

        // TODO make Monsters spawn underground only somehow - These are originally underground spawns
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 1, 4, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 1, 1, 4));
        spawnInfo.withSpawner(EntityClassification. MONSTER, new MobSpawnInfo.Spawners(TFEntities.kobold, 10, 4, 8));

        spawnInfo.withSpawner(EntityClassification. AMBIENT, new MobSpawnInfo.Spawners(EntityType.BAT, 10, 8, 8));

        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder penguinSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.2f);
        
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.penguin, 10, 4, 4));
        
        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder darkForestSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.1f);
        
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 1, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 5, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SKELETON, 5, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.mist_wolf, 10, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.skeleton_druid, 10, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.king_spider, 10, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.kobold, 10, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WITCH, 1, 1, 1));
        
        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder winterWolfSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.1f);
        
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.winter_wolf, 5, 1, 4));
        
        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder ravenSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.3f);
        
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.raven, 10, 4, 4));
        
        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder swampSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.2f);
        
        spawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 10, 4, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.mosquito_swarm, 10, 1, 1));
		
        return spawnInfo;
    }
    
    public static MobSpawnInfo.Builder spookSpawning() {
        MobSpawnInfo.Builder spawnInfo = new MobSpawnInfo.Builder();

        spawnInfo.withCreatureSpawnProbability(0.4f);
        
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SPIDER, 50, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SKELETON, 20, 1, 4));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TFEntities.skeleton_druid, 5, 1, 1));
        spawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.BAT, 20, 8, 8));

        return spawnInfo;
    }

    public static Biome.Builder biomeWithDefaults() {
        return biomeWithDefaults(defaultAmbientBuilder(), new MobSpawnInfo.Builder(), defaultGenSettingBuilder());
    }

    public static Biome.Builder biomeWithDefaults(BiomeAmbience.Builder biomeAmbience, MobSpawnInfo.Builder mobSpawnInfo, BiomeGenerationSettings.Builder biomeGenerationSettings) {
        return new Biome.Builder()
                .precipitation(Biome.RainType.RAIN)
                .category(Biome.Category.FOREST)
                .depth(0.1F)
                .scale(0.2F)
                .temperature(0.5F)
                .downfall(0.5F)
                .setEffects(biomeAmbience.build())
                .withMobSpawnSettings(mobSpawnInfo.copy())
                .withGenerationSettings(biomeGenerationSettings.build())
                .withTemperatureModifier(Biome.TemperatureModifier.NONE);
    }
}
