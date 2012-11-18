package BL2.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import BL2.common.BL2Proxy;
import BL2.common.EntityBullet;
import BL2.common.RenderBullet;
import net.minecraftforge.client.MinecraftForgeClient;

public class BL2Client extends BL2Proxy{
	
	@Override
    public void registerRenderInformation()
    {
            MinecraftForgeClient.preloadTexture("/BL2/textures/Items.png");
            MinecraftForgeClient.preloadTexture("/BL2/textures/bullet.png");
            RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
    }

}