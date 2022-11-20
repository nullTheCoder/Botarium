package earth.terrarium.botarium.fabric.extensions;

import earth.terrarium.botarium.api.registry.fluid.FluidData;
import net.minecraft.world.item.BucketItem;
import net.msrandom.extensions.annotations.ClassExtension;
import net.msrandom.extensions.annotations.ExtensionInjectedElement;
import net.msrandom.extensions.annotations.ImplementsBaseElement;

@ClassExtension(earth.terrarium.botarium.api.registry.fluid.FluidBucketItem.class)
public class FluidBucketItemImpl extends BucketItem {

    @ExtensionInjectedElement
    private final FluidData data;

    @ImplementsBaseElement
    public FluidBucketItemImpl(FluidData data, Properties properties) {
        super(data.getStillFluid().get(), properties);
        this.data = data;
        data.setBucket(() -> this);
    }

    @ImplementsBaseElement
    public FluidData getData() {
        return data;
    }
}
