package me.znepb.zrm.init

import me.znepb.zrm.ZrmClient.logger
import me.znepb.zrm.render.PostBlockRenderer
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier

class ModelLoader {
    companion object {
        val models = listOf(
            PostBlockRenderer.POST_THIN_EXT_MODEL,
            PostBlockRenderer.POST_THIN_FOOTER_MODEL,
            PostBlockRenderer.POST_THIN_MID_MODEL,
            PostBlockRenderer.POST_THICK_EXT_MODEL,
            PostBlockRenderer.POST_THICK_FOOTER_MODEL,
            PostBlockRenderer.POST_THICK_MID_MODEL,
            PostBlockRenderer.POST_MEDIUM_EXT_MODEL,
            PostBlockRenderer.POST_MEDIUM_FOOTER_MODEL,
            PostBlockRenderer.POST_MEDIUM_MID_MODEL,
        )
    }

    init {
        ModelLoadingPlugin.register { plugin ->
            run {
                logger.info("Registering block models")
                plugin.addModels(models)
            }
        }
    }
}