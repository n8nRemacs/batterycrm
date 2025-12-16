package com.avito.android.image_loader;

import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: AvitoPicture.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_image-loader_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @Y61.k
    public static final a a(@Y61.l DimmedImage dimmedImage) {
        return new a(dimmedImage != null ? dimmedImage.getImage() : null, dimmedImage != null ? dimmedImage.getDimming() : null);
    }

    @Y61.k
    public static final a b(@Y61.l Image image) {
        return new a(image, null, 2, null);
    }

    @Y61.k
    public static final a c(@Y61.l DimmedImage dimmedImage) {
        Boolean dimming;
        return new a(dimmedImage != null ? dimmedImage.getImage() : null, Boolean.valueOf((dimmedImage == null || (dimming = dimmedImage.getDimming()) == null) ? true : dimming.booleanValue()));
    }
}
