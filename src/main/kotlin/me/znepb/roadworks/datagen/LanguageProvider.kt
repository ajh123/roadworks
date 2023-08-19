package me.znepb.roadworks.datagen

import me.znepb.roadworks.RoadworksMain.NAMESPACE
import me.znepb.roadworks.Registry
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(translationBuilder: TranslationBuilder) {
        translationBuilder.add(Registry.ModBlocks.THICK_POST, "Thick Post")
        translationBuilder.add(Registry.ModBlocks.POST, "Post")
        translationBuilder.add(Registry.ModBlocks.THIN_POST, "Thin Post")

        translationBuilder.add(Registry.ModBlocks.TRAFFIC_CONE, "Traffic Cone")
        translationBuilder.add(Registry.ModBlocks.CHANNELER, "Channeler")
        translationBuilder.add(Registry.ModBlocks.DRUM, "Drum")
        translationBuilder.add(Registry.ModBlocks.BOLLARD_THIN, "Thin Bollard")
        translationBuilder.add(Registry.ModBlocks.BOLLARD, "Bollard")
        translationBuilder.add(Registry.ModBlocks.BOLLARD_THICK, "Thick Bollard")

        translationBuilder.add(Registry.ModBlocks.STOP_SIGN, "Stop Sign")
        translationBuilder.add(Registry.ModBlocks.STOP_SIGN_4_WAY, "4-way Stop Sign")
        translationBuilder.add(Registry.ModBlocks.STOP_SIGN_AHEAD, "Stop Ahead Sign")
        translationBuilder.add(Registry.ModBlocks.YIELD_SIGN, "Yield Sign")
        translationBuilder.add(Registry.ModBlocks.YIELD_SIGN_AHEAD, "Yield Ahead Sign")
        translationBuilder.add(Registry.ModBlocks.SIGNAL_AHEAD, "Signal Ahead Sign")
        translationBuilder.add(Registry.ModBlocks.ROAD_WORK_AHEAD, "Road Work Ahead Sign")

        translationBuilder.add(Registry.ModItems.LINKER, "Linker")
        translationBuilder.add(Registry.ModBlocks.TRAFFIC_CABINET, "Traffic Cabinet")
        translationBuilder.add(Registry.ModBlocks.THREE_HEAD_TRAFFIC_SIGNAL, "Three-head Traffic Signal")
        translationBuilder.add(Registry.ModBlocks.THREE_HEAD_TRAFFIC_SIGNAL_LEFT, "Three-head Traffic Signal Left")
        translationBuilder.add(Registry.ModBlocks.THREE_HEAD_TRAFFIC_SIGNAL_RIGHT, "Three-head Traffic Signal Right")
        translationBuilder.add(Registry.ModBlocks.THREE_HEAD_TRAFFIC_SIGNAL_STRAIGHT, "Three-head Traffic Signal Straight")
        translationBuilder.add(Registry.ModBlocks.FIVE_HEAD_TRAFFIC_SIGNAL_LEFT, "Five-head Traffic Signal Left")
        translationBuilder.add(Registry.ModBlocks.FIVE_HEAD_TRAFFIC_SIGNAL_RIGHT, "Five-head Traffic Signal Right")

        translationBuilder.add(Registry.ModBlocks.WHITE_INFILL_MARKING, "White Infill Marking")
        translationBuilder.add(Registry.ModBlocks.WHITE_CENTER_DASH_MARKING, "Centered White Dash")
        translationBuilder.add(Registry.ModBlocks.WHITE_CENTER_TURN_MARKING, "Centered White Turn Line")
        translationBuilder.add(Registry.ModBlocks.WHITE_CENTER_MARKING, "Centered Long White Line")
        translationBuilder.add(Registry.ModBlocks.WHITE_T_CENTER, "Center T Marking")

        translationBuilder.add(Registry.ModBlocks.WHITE_EDGE_DASH_MARKING, "Edge White Dash")
        translationBuilder.add(Registry.ModBlocks.WHITE_EDGE_MARKING, "Edge White Line")
        translationBuilder.add(Registry.ModBlocks.WHITE_EDGE_TURN_MARKING_INSIDE, "Inside White Edge Turn Line")
        translationBuilder.add(Registry.ModBlocks.WHITE_EDGE_TURN_MARKING_OUTSIDE, "Outside White Edge Turn Line")

        translationBuilder.add("itemGroup.${NAMESPACE}.main", "Roadworks")
    }
}