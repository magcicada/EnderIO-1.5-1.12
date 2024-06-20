package crazypants.enderio.base.lang;

import javax.annotation.Nonnull;

import crazypants.enderio.base.EnderIO;

public enum Lang implements ILang {

  PRINTOUT_ADDTARGET("item.item_location_printout.chat.addTarget"),
  PRINTOUT_SETTARGET("item.item_location_printout.chat.setTarget"),
  PRINTOUT_PRIVATE("item.item_location_printout.chat.privateBlock"),
  PRINTOUT_NOPAPER("item.item_location_printout.chat.noPaper"),
  MACHINE_CONFIGURED(".machine.tooltip.configured"),
  AXE_MULTIHARVEST("item.item_dark_steel_axe.tooltip.multiHarvest"),
  AXE_POWERED("item.item_dark_steel_axe.tooltip.effPowered"),
  CROOK_MULTIHARVEST("item.item_dark_steel_crook.tooltip.multiHarvest"),
  PICK_POWERED("item.item_dark_steel_pickaxe.tooltip.effPowered"),
  PICK_OBSIDIAN("item.item_dark_steel_pickaxe.tooltip.effObs"),
  PICK_OBSIDIAN_COST("item.item_dark_steel_pickaxe.tooltip.cost"),
  SHEARS_MULTIHARVEST("item.item_dark_steel_shears.tooltip.multiHarvest"),
  SHEARS_POWERED("item.item_dark_steel_shears.tooltip.effPowered"),
  RETURN_ROD_FLUID("item.item_rod_of_return.tooltip.fluid"),
  RETURN_ROD_POWER("item.item_rod_of_return.tooltip.power"),
  RETURN_ROD_NO_POWER("item.item_rod_of_return.chat.notEnoughPower"),
  RETURN_ROD_NO_TARGET("item.item_rod_of_return.chat.targetNotSet"),
  RETURN_ROD_NO_FLUID("item.item_rod_of_return.chat.notEnoughFluid"),
  RETURN_ROD_SYNC_TELEPAD("item.item_rod_of_return.chat.sync.telepad"),
  RETURN_ROD_SYNC("item.item_rod_of_return.chat.sync"),
  GRINDING_BALL_1(".grindingball.tooltip.line1"),
  GRINDING_BALL_2(".grindingball.tooltip.line2"),
  GRINDING_BALL_3(".grindingball.tooltip.line3"),
  GRINDING_BALL_4(".grindingball.tooltip.line4"),
  GRINDING_BALL_DURABILITY(".grindingball.gui.durability"),
  STAFF_NO_POWER("item.item_travel_staff.chat.notEnoughPower"),
  COLD_FIRE_NO_FLUID("item.item_cold_fire_igniter.chat.outoffluid"),
  DARK_STEEL_POWERED("item.item_dark_steel_armor.tooltip"),
  DARK_BOOTS_POWERED("item.item_dark_steel_boots.tooltip"),
  DARK_STEEL_LEVELS1("item.item_dark_steel_armor.tooltip.levelcost.line1"),
  DARK_STEEL_LEVELS2("item.item_dark_steel_armor.tooltip.levelcost.line2"),
  DARK_STEEL_ANVIL_UPGRADES_ALL(".tooltip.anvilupgrades.all"),
  PRESSURE_PLATE_TUNED("tile.block_painted_pressure_plate.tuned.tooltip"),
  GUI_PERMISSION_DENIED(".gui.permission.denied"),
  BLOCK_BLAST_RESISTANT(".block.tooltip.blastResistant"),
  BLOCK_LIGHT_EMITTER(".block.tooltip.lightEmitter"),
  BLOCK_LIGHT_BLOCKER(".block.tooltip.lightBlocker"),

  BLOCK_ALLOW_PLAYERS(".block.tooltip.allowPlayers"),
  BLOCK_ALLOW_MONSTERS(".block.tooltip.allowMonsters"),
  BLOCK_ALLOW_ANIMALS(".block.tooltip.allowAnimals"),
  BLOCK_DISALLOW_PLAYERS(".block.tooltip.disallowPlayers"),
  BLOCK_DISALLOW_MONSTERS(".block.tooltip.disallowMonsters"),
  BLOCK_DISALLOW_ANIMALS(".block.tooltip.disallowAnimals"),

  MACHINE_UPGRADE(".machine.tooltip.upgrade"),
  FLUID_TICKPER(".fluid.millibucket.format.tickper"),
  FLUID_AMOUNT(".fluid.millibucket.format"),
  FLUID_LEVEL(".fluid.millibucket.format.of"),
  GUI_REDSTONE_MODE(".gui.tooltip.redstoneControlMode"),
  FUEL_GENERATES(".fuel.tooltip.generates"),
  FUEL_BURNTIME(".fuel.tooltip.burnTime"),
  FUEL_HEADING(".fuel.tooltip.heading"),
  COOLANT_HEADING(".coolant.tooltip.heading"),
  COOLANT_DEGREES(".coolant.tooltip.degreesPerBucket"),
  FLUID_AMOUNT_NAME(".fluid.millibucket.format.name"),
  FLUID_LEVEL_NAME(".fluid.millibucket.format.ofname"),
  SOUL_VIAL_HEALTH("item.item_soul_vial.tooltip.health"),
  SOUL_VIAL_FLUID("item.item_soul_vial.tooltip.fluidname"),
  SOUL_VIAL_COLOR("item.item_soul_vial.tooltip.color"),
  SOUL_VIAL_EMPTY("item.item_soul_vial.tooltip.empty"),
  ITEM_FILTER(".item_item_filter_upgrade"),
  ITEM_FILTER_CONFIGURED(".item_item_filter_upgrade.configured"),
  ITEM_FILTER_CLEAR(".item_item_filter_upgrade.clear_config_method"),
  ITEM_FILTER_CLEAR_WARNING(".item_item_filter_upgrade.clear_config_warning"),
  ITEM_FILTER_UPDATED(".item.item_existing_item_filter.filter_updated"),
  ITEM_FILTER_NOTUPDATED(".item.item_existing_item_filter.filter_not_updated"),
  POWER_SYMBOL(".power.symbol"),
  POWER(".power.format"),
  POWER_OF(".power.format.of"),
  POWER_PERTICK(".power.format.pertick"),
  POWER_NAME(".power.format.name"),
  POWER_DETAILS(".power.format.details"),
  TEMP_DEGC(".temperature.format.deg_c"),
  GUI_GENERIC_EFFICIENCY(".format.percent_efficiency"),
  GUI_GENERIC_MAX(".gui.generic.max"),
  GUI_GENERIC_LOSS(".gui.generic.loss"),
  GUI_GENERIC_PROGRESS(".gui.generic.progress"),
  GUI_GENERIC_OVERLAY(".gui.generic.ioMode.overlay.tooltip"),
  GUI_GENERIC_OVERLAY_ON(".gui.generic.ioMode.overlay.tooltip.visible"),
  RECIPE_CLEAR(".recipe.tooltip.clearConfig"),
  BETTER_WITH_BACON(".block.tooltip.isBeaconBase"),
  PAINTED_WITH(".generic.tooltip.paintedWith"),
  PAINTED_NOT(".generic.tooltip.unpainted"),
  WRENCH_DENIED(".wrench.permission.denied"),
  WRENCH_DENIED_BLOCKBREAK(".wrench.permission.denied.blockbreak"),
  EASTER_PIGGY(".easteregg.piginabottle"),
  SOUL_VIAL_DENIED(".soulvial.denied"),
  SOUL_VIAL_DENIED_OWNED_PET(".soulvial.owned.denied"),
  SOUL_VIAL_DENIED_PLAYER(".soulvial.player.denied"),
  SOUL_VIAL_DENIED_AALISTED(".soulvial.blacklisted.denied"),
  SOUL_VIAL_DENIED_DEAD(".soulvial.dead.denied"),
  SOUL_VIAL_DENIED_UNKNOWN(".soulvial.unknown.denied"),
  CONFIG_TITLE(".config.title"),
  GUI_NOCAP(".gui.generic.nocap"),
  GUI_PROBE_COPIED(".gui.probe.copied"),
  GUI_PROBE_PASTED(".gui.probe.pasted"),

  // FILTERS
  GUI_EDIT_ITEM_FILTER(".gui.edit_item_filter"),
  GUI_ITEM_FILTER_CLOSE(".gui.item_filter.close"),
  GUI_ITEM_FILTER_CLOSE_2(".gui.item_filter.close2"),

  GUI_ITEM_FILTER_WHITELIST(".gui.item_filter.whitelist"),
  GUI_ITEM_FILTER_BLACKLIST(".gui.item_filter.blacklist"),
  GUI_ITEM_FILTER_MATCH_META(".gui.item_filter.match_meta"),
  GUI_ITEM_FILTER_IGNORE_META(".gui.item_filter.ignore_meta"),
  GUI_ITEM_FILTER_STICKY_ENABLED(".gui.item_filter.sticky_enabled"),
  GUI_ITEM_FILTER_STICKY_ENABLED_2(".gui.item_filter.sticky_enabled2"),
  GUI_ITEM_FILTER_STICKY_DISABLED(".gui.item_filter.sticky_disabled"),
  GUI_ITEM_FILTER_ORE_DIC_ENABLED(".gui.item_filter.ore_dic_enabled"),
  GUI_ITEM_FILTER_ORE_DIC_DISABLED(".gui.item_filter.ore_dic_disabled"),
  GUI_ITEM_FILTER_MATCH_NBT(".gui.item_filter.match_nbt"),
  GUI_ITEM_FILTER_IGNORE_NBT(".gui.item_filter.ignore_nbt"),

  GUI_EXISTING_ITEM_FILTER_SNAPSHOT(".gui.existing.item_filter.snapshot"),
  GUI_EXISTING_ITEM_FILTER_SNAPSHOT_2(".gui.existing.item_filter.snapshot2"),
  GUI_EXISTING_ITEM_FILTER_MERGE(".gui.existing.item_filter.merge"),
  GUI_EXISTING_ITEM_FILTER_CLEAR(".gui.existing.item_filter.clear"),
  GUI_EXISTING_ITEM_FILTER_SHOW(".gui.existing.item_filter.show"),
  GUI_EXISTING_ITEM_FILTER_MERGE_2(".gui.existing.item_filter.merge2"),
  GUI_EXISTING_ITEM_FILTER_CLEAR_2(".gui.existing.item_filter.clear2"),
  GUI_EXISTING_ITEM_FILTER_SHOW_2(".gui.existing.item_filter.show2"),

  GUI_MOD_ITEM_FILTER_DELETE(".gui.mod.item_filter.delete"),
  GUI_MOD_ITEM_FILTER_SLOT(".gui.mod.item_filter.slot"),

  GUI_POWER_ITEM_FILTER_COMPARE(".gui.power.item_filter.compare"),
  GUI_POWER_ITEM_FILTER_PERCENT(".gui.power.item_filter.percent"),

  GUI_BASIC_ITEM_FILTER(".gui.basic_item_filter"),
  GUI_ADVANCED_ITEM_FILTER(".gui.advanced_item_filter"),
  GUI_LIMITED_ITEM_FILTER(".gui.limited_item_filter"),
  GUI_BIG_ITEM_FILTER(".gui.big_item_filter"),
  GUI_EXISTING_ITEM_FILTER(".gui.existing_item_filter"),
  GUI_MOD_ITEM_FILTER(".gui.mod_item_filter"),
  GUI_POWER_ITEM_FILTER(".gui.power_item_filter"),
  GUI_BIG_ADVANCED_ITEM_FILTER(".gui.big_advanced_item_filter"),
  GUI_SOUL_FILTER_NORMAL(".gui.soul_filter_normal"),
  GUI_SOUL_FILTER_BIG(".gui.soul_filter_big"),
  GUI_ENCH_FILTER_NORMAL(".gui.enchantment_filter_normal"),
  GUI_ENCH_FILTER_BIG(".gui.enchantment_filter_big"),

  GUI_SPECIES_ITEM_FILTER(".gui.species_item_filter"),
  GUI_FLUID_FILTER(".gui.fluid_filter"),

  GUI_REDSTONE_FILTER_AND(".gui.redstone_filter.and"),
  GUI_REDSTONE_FILTER_OR(".gui.redstone_filter.or"),
  GUI_REDSTONE_FILTER_NAND(".gui.redstone_filter.nand"),
  GUI_REDSTONE_FILTER_NOR(".gui.redstone_filter.nor"),
  GUI_REDSTONE_FILTER_XOR(".gui.redstone_filter.xor"),
  GUI_REDSTONE_FILTER_XNOR(".gui.redstone_filter.xnor"),
  GUI_REDSTONE_FILTER_COUNTING(".gui.redstone_filter.counting"),
  GUI_REDSTONE_FILTER_TIMER(".gui.redstone_filter.timer"),

  GUI_REDSTONE_FILTER_SIGNAL_COLOR(".gui.redstone_filter.signal_color"),
  GUI_REDSTONE_FILTER_INPUT_SIGNAL(".gui.redstone_filter.input_signal"),
  GUI_INFINTY_RECIPE_DIMENSIONS(".gui.infinity_recipe_dimensions"),
  GUI_INFINTY_RECIPE_DIMENSIONS_MULTI(".gui.infinity_recipe_dimensions.multi"),
  GUI_INFINTY_RECIPE_DIMENSIONS_THESE(".gui.infinity_recipe_dimensions.these"),
  GUI_INFINTY_RECIPE_DIMENSIONS_LIST(".gui.infinity_recipe_dimensions.list"),
  GUI_INFINTY_RECIPE_DIMENSIONS_LIST_HERE(".gui.infinity_recipe_dimensions.list.here"),
  GUI_INFINTY_RECIPE_DIMENSIONS_NOTHERE(".gui.infinity_recipe_dimensions.nothere"),
  GUI_REDSTONE_FILTER_COUNT(".gui.redstone_filter.count"),
  GUI_REDSTONE_FILTER_TIME(".gui.redstone_filter.time"),

  OWL_NO_OWL(".owlegg.no_owl"),
  INVCHARGER_NEEDUPGRADE(".tooltip.inventory_charger.need_upgrade"),
  INVCHARGER_ENABLED(".tooltip.inventory_charger.enabled"),
  INVCHARGER_DISABLED(".tooltip.inventory_charger.disabled"),

  NETWORK_BAD_CONFIG(".network.bad_config"),
  NETWORK_CONFIG_CONNECTED(".network.autosync.connected"),
  NETWORK_CONFIG_OFFLINE(".network.autosync.offline"),
  NETWORK_CONFIG_SYNC(".network.manusync"),

  GUI_NO_ARMOR_INVENTORY(".keybind.inventory.none_equipped"),
  GUI_STEP_ASSIST_UNAVAILABLE(".gui.step_assis_unavailable"),

  DSU_TOOLTIP_MAIN(".darksteel.upgrades.tooltip.main"),
  DSU_TOOLTIP_DEPS(".darksteel.upgrades.tooltip.dependencies"),
  DSU_TOOLTIP_CLAS(".darksteel.upgrades.tooltip.itemclasses"),
  DSU_TOOLTIP_LINE(".darksteel.upgrades.tooltip.lineitem"),
  DSU_TOOLTIP_LEVELS_1(".darksteel.upgrades.tooltip.levels.line1"),
  DSU_TOOLTIP_LEVELS_2(".darksteel.upgrades.tooltip.levels.line2"),
  DSU_TOOLTIP_APPLY_1(".darksteel.upgrades.tooltip.apply.line1"),
  DSU_TOOLTIP_APPLY_2(".darksteel.upgrades.tooltip.apply.line2"),

  DSU_CLASS_EVERYTHING(".darksteel.upgrades.everything"),
  DSU_CLASS_WEAPONS(".darksteel.upgrades.weapons"),
  DSU_CLASS_WEAPONS_SWORD(".darksteel.upgrades.weapons.sword"),
  DSU_CLASS_TOOLS(".darksteel.upgrades.tools"),
  DSU_CLASS_TOOLS_AXE(".darksteel.upgrades.tools.axe"),
  DSU_CLASS_TOOLS_CROOK(".darksteel.upgrades.tools.crook"),
  DSU_CLASS_TOOLS_PICKAXE(".darksteel.upgrades.tools.pickaxe"),
  DSU_CLASS_ARMOR(".darksteel.upgrades.armor"),
  DSU_CLASS_ARMOR_HEAD(".darksteel.upgrades.armor.head"),
  DSU_CLASS_ARMOR_CHEST(".darksteel.upgrades.armor.chest"),
  DSU_CLASS_ARMOR_LEGS(".darksteel.upgrades.armor.legs"),
  DSU_CLASS_ARMOR_FEET(".darksteel.upgrades.armor.feet"),

  DSU_CHECK_PREREQ_MISSING(".darksteel.upgrades.check.prerequisite.missing"), // see IDarkSteelUpgrade
  DSU_CHECK_PREREQ_ENERGY(".darksteel.upgrades.check.prerequisite.energy"),

  GUI_ARMOR_INVENTORY_CONTAINER(".darksteel.upgrade.inv.container"),
  GUI_ARMOR_INVENTORY_BIG(".darksteel.upgrade.inv.big"),

  DSU_GUI_NOT_ENOUGH_LEVELS(".darksteel.upgrades.gui.not_levels"),
  DSU_GUI_ACTIVATED(".darksteel.upgrades.gui.activated"),
  DSU_GUI_NO_ITEMS(".darksteel.upgrades.gui.no_items"),

  GUI_DSU_NOT_INSTALLED(".darksteel.upgrades.gui.not_installed"),
  GUI_DSU_NOT_INSERTED(".darksteel.upgrades.gui.not_inserted"),
  GUI_DSU_STORAGE(".darksteel.upgrades.gui.storage"),

  GUI_ZOOM_STORED(".keybind.zoom.stored"),

  JEI_NOTSIMPLE(".jei.notSimple"),
  JEI_NOTNORMAL(".jei.notNormal"),

  GUI_TRAVEL_SKIP_LOCKED(".gui.travel_accessable.skip.locked"),
  GUI_TRAVEL_SKIP_PRIVATE(".gui.travel_accessable.skip.private"),
  GUI_TRAVEL_SKIP_OBSTRUCTED(".gui.travel_accessable.skip.obstructed"),
  GUI_TRAVEL_UNAUTHORIZED(".gui.travel_accessable.unauthorized"),
  GUI_TRAVEL_OUT_OF_RANGE(".gui.travel_accessable.outofrange"),
  GUI_TRAVEL_INVALID_TARGET(".gui.travel_accessable.invalidtarget"),

  GUI_TOO_MANY_LEVELS(".gui.too_many_levels"),

  GUI_GRAVE_NOT_OWNER(".gui.block_death_pouch.not_owner"),
  GUI_GRAVE_PLACED(".gui.block_death_pouch.placed"),

  ;

  private final @Nonnull String key;

  private Lang(@Nonnull String key) {
    if (key.startsWith(".")) {
      this.key = getLang().addPrefix(key.substring(1));
    } else {
      this.key = key;
    }
  }

  @Override
  public @Nonnull String getKey() {
    return key;
  }

  @Override
  public @Nonnull com.enderio.core.common.Lang getLang() {
    return EnderIO.lang;
  }

  static {
    for (Lang lang : values()) {
      lang.checkTranslation();
    }
  }

}
