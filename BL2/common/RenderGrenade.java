package BL2.common;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public class RenderGrenade extends Render{

	public ModelGrenade model = new ModelGrenade();
	
	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) 
	{
		this.renderGrenade((EntityGrenade) var1, var2, var4, var6, var8, var9);
	}
	
	public void renderGrenade(EntityGrenade par1EntityArrow, double par2, double par4, double par6, float par8, float par9)
    {
        this.loadTexture("/BL2/textures/bullet.png");
        GL11.glPushMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float)par2, (float)par4 + 1.2F, (float)par6);
        GL11.glScalef(1.0F, -1F, -1F);
        
        GL11.glRotatef(par1EntityArrow.rotationYaw + 180, 0, 1, 0);
        
        model.render();

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

}
