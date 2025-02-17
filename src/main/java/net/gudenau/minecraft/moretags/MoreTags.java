package net.gudenau.minecraft.moretags;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.gudenau.minecraft.moretags.mixins.farmland.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;

public final class MoreTags implements ModInitializer{
    public static final String MOD_ID = "moretags";
    
    public static final Tag<Block> BOOKSHELVES = TagRegistry.block(new Identifier(MOD_ID, "bookshelves"));
    public static final Tag<Block> ORES = TagRegistry.block(new Identifier(MOD_ID, "ores"));
    public static final Tag<Block> STRIPPED_WOOD = TagRegistry.block(new Identifier(MOD_ID, "stripped_wood"));
    public static final Tag<Block> STRIPPED_LOGS = TagRegistry.block(new Identifier(MOD_ID, "stripped_logs"));
    public static final Tag<Block> STRIPPED_BARK = TagRegistry.block(new Identifier(MOD_ID, "stripped_bark"));
    public static final Tag<Block> DRESSED_WOOD = TagRegistry.block(new Identifier(MOD_ID, "dressed_wood"));
    public static final Tag<Block> DRESSED_LOGS = TagRegistry.block(new Identifier(MOD_ID, "dressed_logs"));
    public static final Tag<Block> DRESSED_BARK = TagRegistry.block(new Identifier(MOD_ID, "dressed_bark"));
    public static final Tag<Block> GLASS = TagRegistry.block(new Identifier(MOD_ID, "glass"));
    public static final Tag<Block> GLASS_BLOCKS = TagRegistry.block(new Identifier(MOD_ID, "glass_blocks"));
    public static final Tag<Block> GLASS_PANES = TagRegistry.block(new Identifier(MOD_ID, "glass_panes"));
    public static final Tag<Block> CHESTS = TagRegistry.block(new Identifier(MOD_ID, "chests"));
    public static final Tag<Block> BRICKS = TagRegistry.block(new Identifier(MOD_ID, "bricks"));
    public static final Tag<Block> INFESTED = TagRegistry.block(new Identifier(MOD_ID, "infested"));
    public static final Tag<Block> SKULLS = TagRegistry.block(new Identifier(MOD_ID, "skulls"));
    public static final Tag<Block> WALL_SKULLS = TagRegistry.block(new Identifier(MOD_ID, "wall_skulls"));
    public static final Tag<Block> FLOOR_SKULLS = TagRegistry.block(new Identifier(MOD_ID, "floor_skulls"));
    public static final Tag<Block> REDSTONE_DEVICES = TagRegistry.block(new Identifier(MOD_ID, "redstone_devices"));
    public static final Tag<Block> REDSTONE_RAILS = TagRegistry.block(new Identifier(MOD_ID, "redstone_rails"));
    public static final Tag<Block> REDSTONE = TagRegistry.block(new Identifier(MOD_ID, "redstone"));
    public static final Tag<Block> PISTONS = TagRegistry.block(new Identifier(MOD_ID, "pistons"));
    public static final Tag<Block> REDSTONE_GATES = TagRegistry.block(new Identifier(MOD_ID, "redstone_gates"));
    public static final Tag<Block> TERRACOTTA = TagRegistry.block(new Identifier(MOD_ID, "terracotta"));
    public static final Tag<Block> GLAZED_TERRACOTTA = TagRegistry.block(new Identifier(MOD_ID, "glazed_terracotta"));
    public static final Tag<Block> TERRACOTTA_BLOCKS = TagRegistry.block(new Identifier(MOD_ID, "terracotta_blocks"));
    public static final Tag<Block> STICKY_BLOCKS = TagRegistry.block(new Identifier(MOD_ID, "sticky_blocks"));
    public static final Tag<Block> HONEY_BLOCKS = TagRegistry.block(new Identifier(MOD_ID, "honey_blocks"));
    public static final Tag<Block> SLIME_BLOCKS = TagRegistry.block(new Identifier(MOD_ID, "slime_blocks"));
    public static final Tag<Block> CONCRETE = TagRegistry.block(new Identifier(MOD_ID, "concrete"));
    public static final Tag<Block> CONCRETE_POWDER = TagRegistry.block(new Identifier(MOD_ID, "concrete_powder"));
    public static final Tag<Block> FARMLAND = TagRegistry.block(new Identifier(MOD_ID, "farmland"));
    public static final Tag<Block> MOIST_FARMLAND = TagRegistry.block(new Identifier(MOD_ID, "moist_farmland"));
    
    public static final Tag<Item> SKULL_ITEMS = TagRegistry.item(new Identifier(MOD_ID, "skull"));
    
    @Override
    public void onInitialize(){
        ServerLifecycleEvents.SERVER_STARTED.register((server)->{
            // Support for farmland, Vanilla assumes it will always be a specific block and we change that during runtime
            ((VillagerProfessionAccessor)VillagerProfession.FARMER).setSecondaryJobSites(ImmutableSet.copyOf(FARMLAND.values()));
        });
    }
}
