package com.avito.android.campaigns_sale.view.images_row;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesRowMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/d;", "", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    public static Size a(int i12, Image image) {
        Size size = (Size) C42745f0.F(image.getVariants().keySet());
        return new Size((int) (i12 / ((size != null ? size.getHeight() : 0) / (size != null ? size.getWidth() : 0))), i12);
    }
}
