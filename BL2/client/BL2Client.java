package BL2.client;

import net.minecraftforge.client.MinecraftForgeClient;
import BL2.common.BL2Core;
import BL2.common.BL2Proxy;
import BL2.common.EntityBullet;
import BL2.common.EntityGrenade;
import BL2.common.RenderBullet;
import BL2.common.RenderGrenade;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class BL2Client extends BL2Proxy{
	
	@Override
    public void registerRenderInformation()
    {
            MinecraftForgeClient.preloadTexture("/BL2/textures/Items.png");
            MinecraftForgeClient.preloadTexture("/BL2/textures/bullet.png");
            MinecraftForgeClient.preloadTexture("/BL2/textures/Shields.png");
            RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
            BL2Core.shieldrenderid = RenderingRegistry.addNewArmourRendererPrefix("BL2/textures");
            RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade());
            //MinecraftForge.EVENT_BUS.register(new RenderShield());
    }

	@Override
    public void registerRenderTickHandler() {

        TickRegistry.registerTickHandler(new ShieldGUIHandler(), Side.CLIENT);
    }
	
	public void registerKeyBinding()
	{
		KeyBindingRegistry.registerKeyBinding(new BL2.client.BL2KeyHandler());
	}
}
