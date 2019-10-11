package its_meow.whisperwoods.client.renderer.entity.model;

import its_meow.whisperwoods.entity.EntityMoth;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

/**
 * moth - cybecat5555
 * Created using Tabula 7.0.1
 */
public class ModelMoth extends EntityModel<EntityMoth> {
    public RendererModel thorax;
    public RendererModel head;
    public RendererModel abdomin;
    public RendererModel lLeg00;
    public RendererModel lLeg01;
    public RendererModel lLeg02;
    public RendererModel rLeg00;
    public RendererModel rLeg01;
    public RendererModel rLeg02;
    public RendererModel lWing;
    public RendererModel rWing;
    public RendererModel lAntenna;
    public RendererModel rAntenna;

    public ModelMoth() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.lWing = new RendererModel(this, 7, 0);
        this.lWing.setRotationPoint(1.2F, -1.0F, -1.0F);
        this.lWing.addBox(0.0F, 0.0F, -4.5F, 15, 0, 27, 0.0F);
        this.thorax = new RendererModel(this, 0, 7);
        this.thorax.setRotationPoint(0.0F, 20.9F, 0.0F);
        this.thorax.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 4, 0.0F);
        this.lLeg00 = new RendererModel(this, 17, 6);
        this.lLeg00.setRotationPoint(0.9F, 1.2F, -0.5F);
        this.lLeg00.addBox(-0.5F, 0.0F, -0.0F, 1, 4, 0, 0.0F);
        this.setRotateAngle(lLeg00, -1.0471975511965976F, -0.8726646259971648F, 0.0F);
        this.rAntenna = new RendererModel(this, 11, 0);
        this.rAntenna.mirror = true;
        this.rAntenna.setRotationPoint(-0.4F, -3.0F, -2.0F);
        this.rAntenna.addBox(-2.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F);
        this.setRotateAngle(rAntenna, -0.7853981633974483F, 0.2792526803190927F, 0.0F);
        this.lLeg01 = new RendererModel(this, 20, 5);
        this.lLeg01.setRotationPoint(0.9F, 1.2F, 0.0F);
        this.lLeg01.addBox(-0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F);
        this.setRotateAngle(lLeg01, 0.0F, 0.0F, -1.0471975511965976F);
        this.rLeg02 = new RendererModel(this, 17, 6);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-0.9F, 1.2F, 0.5F);
        this.rLeg02.addBox(-0.5F, 0.0F, -0.0F, 1, 4, 0, 0.0F);
        this.setRotateAngle(rLeg02, 1.0471975511965976F, -0.8726646259971648F, 0.0F);
        this.rLeg01 = new RendererModel(this, 20, 5);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-0.9F, 1.2F, 0.0F);
        this.rLeg01.addBox(-0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F);
        this.setRotateAngle(rLeg01, 0.0F, 0.0F, 1.0471975511965976F);
        this.rWing = new RendererModel(this, 7, 0);
        this.rWing.mirror = true;
        this.rWing.setRotationPoint(-1.2F, -1.0F, -1.0F);
        this.rWing.addBox(-15.0F, 0.0F, -4.5F, 15, 0, 27, 0.0F);
        this.lLeg02 = new RendererModel(this, 17, 6);
        this.lLeg02.setRotationPoint(0.9F, 1.2F, 0.5F);
        this.lLeg02.addBox(-0.5F, 0.0F, -0.0F, 1, 4, 0, 0.0F);
        this.setRotateAngle(lLeg02, 1.0471975511965976F, 0.8726646259971648F, 0.0F);
        this.abdomin = new RendererModel(this, 0, 16);
        this.abdomin.setRotationPoint(0.0F, 0.2F, 1.8F);
        this.abdomin.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(abdomin, -0.12217304763960307F, 0.0F, 0.0F);
        this.head = new RendererModel(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.2F, -1.4F);
        this.head.addBox(-1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.7853981633974483F, 0.0F, 0.0F);
        this.lAntenna = new RendererModel(this, 11, 0);
        this.lAntenna.setRotationPoint(0.4F, -3.0F, -2.0F);
        this.lAntenna.addBox(0.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F);
        this.setRotateAngle(lAntenna, -0.7853981633974483F, -0.2792526803190927F, 0.0F);
        this.rLeg00 = new RendererModel(this, 17, 6);
        this.rLeg00.mirror = true;
        this.rLeg00.setRotationPoint(-0.9F, 1.2F, -0.5F);
        this.rLeg00.addBox(-0.5F, 0.0F, -0.0F, 1, 4, 0, 0.0F);
        this.setRotateAngle(rLeg00, -1.0471975511965976F, 0.8726646259971648F, 0.0F);
        this.thorax.addChild(this.lWing);
        this.thorax.addChild(this.lLeg00);
        this.head.addChild(this.rAntenna);
        this.thorax.addChild(this.lLeg01);
        this.thorax.addChild(this.rLeg02);
        this.thorax.addChild(this.rLeg01);
        this.thorax.addChild(this.rWing);
        this.thorax.addChild(this.lLeg02);
        this.thorax.addChild(this.abdomin);
        this.thorax.addChild(this.head);
        this.head.addChild(this.lAntenna);
        this.thorax.addChild(this.rLeg00);
    }

    @Override
    public void render(EntityMoth entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.thorax.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}
