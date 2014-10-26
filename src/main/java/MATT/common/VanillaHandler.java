package MATT.common;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.TConstruct;
import tconstruct.smeltery.TinkerSmeltery;

public class VanillaHandler
{

	public static void addSmelting()
	{
		IMCHelper.addNewSmeltable(Items.bucket, 0, Blocks.iron_block,
				new FluidStack(TinkerSmeltery.moltenIronFluid, TConstruct.ingotLiquidValue * 3), 600);
		IMCHelper.addNewSmeltable(Item.getItemFromBlock(Blocks.anvil), 0, Blocks.anvil, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.blockLiquidValue * 3 + TConstruct.ingotLiquidValue * 4), 600);
		IMCHelper.addNewSmeltable(Items.golden_apple, 0, Blocks.gold_block, new FluidStack(TinkerSmeltery.moltenGoldFluid,
				TConstruct.ingotLiquidValue * 4), 540);
		IMCHelper.addNewSmeltable(Items.clock, 0, Blocks.gold_block, new FluidStack(TinkerSmeltery.moltenGoldFluid, TConstruct.ingotLiquidValue * 4),
				400);
		IMCHelper.addNewSmeltable(Item.getItemFromBlock(Blocks.hopper), 0, Blocks.hopper, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 5), 600);
		IMCHelper.addNewSmeltable(Items.iron_door, 0, Blocks.iron_block, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 6), 600);
		for (int i = 0; i < 16; i++)
			IMCHelper.addNewSmeltable(Item.getItemFromBlock(Blocks.stained_glass), i, Blocks.stained_glass, new FluidStack(
					TinkerSmeltery.moltenGlassFluid, TConstruct.blockLiquidValue), 100);
		IMCHelper.addNewSmeltable(Item.getItemFromBlock(Blocks.rail), 0, Blocks.rail, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 6), 600);
		IMCHelper.addNewSmeltable(Item.getItemFromBlock(Blocks.iron_bars), 0, Blocks.iron_bars, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 6), 600);
		IMCHelper.addNewSmeltable(Items.minecart, 0, Blocks.iron_block, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 5), 600);
		IMCHelper.addNewSmeltable(Items.hopper_minecart, 0, Blocks.iron_block, new FluidStack(TinkerSmeltery.moltenIronFluid,
				TConstruct.ingotLiquidValue * 10), 600);
		IMCHelper.addNewSmeltable(Items.compass, 0, Blocks.iron_block,
				new FluidStack(TinkerSmeltery.moltenIronFluid, TConstruct.ingotLiquidValue * 4), 600);
		IMCHelper.addNewSmeltable(Items.shears, 0, Blocks.iron_block,
				new FluidStack(TinkerSmeltery.moltenIronFluid, TConstruct.ingotLiquidValue * 2), 600);
		Item[] equip = new Item[] { Items.iron_boots, Items.iron_leggings, Items.iron_chestplate, Items.iron_helmet, Items.iron_axe, Items.iron_hoe,
				Items.iron_pickaxe, Items.iron_shovel, Items.iron_sword, Items.golden_boots, Items.golden_leggings, Items.golden_chestplate,
				Items.golden_helmet, Items.golden_axe, Items.golden_hoe, Items.golden_pickaxe, Items.golden_shovel, Items.golden_sword };
		int[] amount = new int[] { 4, 7, 8, 5, 3, 2, 3, 1, 2, 4, 7, 8, 5, 3, 2, 3, 1, 2 };
		for (int i = 0; i < equip.length; i++)
		{
			Block block = null;
			Fluid fluid = null;
			if (i < equip.length / 2)
			{
				block = Blocks.iron_block;
				fluid = TinkerSmeltery.moltenIronFluid;
			}
			else
			{
				block = Blocks.gold_block;
				fluid = TinkerSmeltery.moltenGoldFluid;
			}

			// if(equip[i])
			IMCHelper.addNewSmeltable(equip[i], 0, block, new FluidStack(fluid, TConstruct.ingotLiquidValue * amount[i]), 600);
		}
	}

}
