package club.deneb.client.features.modules.render;

import club.deneb.client.features.Category;
import club.deneb.client.features.Module;
import club.deneb.client.value.ModeValue;
import club.deneb.client.value.Value;

/**
 * Created by 086 on 9/04/2018.
 */
@Module.Info(name = "AntiFog", description = "Disables or reduces fog", category = Category.RENDER)
public class AntiFog extends Module {

    public static ModeValue<String> mode;
    private static AntiFog INSTANCE = new AntiFog();

    @Override
    public void onInit() {
        mode = setting("Mode","NoFog",listOf("NoFog","Air"));
        INSTANCE = this;
    }

    public static boolean enabled() {
        return INSTANCE.isEnabled();
    }


}
