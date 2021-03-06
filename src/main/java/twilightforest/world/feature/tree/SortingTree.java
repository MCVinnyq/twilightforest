package twilightforest.world.feature.tree;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import twilightforest.worldgen.ConfiguredFeatures;

import java.util.Random;

public class SortingTree extends Tree {

	@Override
	public ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random rand, boolean largeHive) {
		return ConfiguredFeatures.SORT_TREE_BASE;
	}
}
