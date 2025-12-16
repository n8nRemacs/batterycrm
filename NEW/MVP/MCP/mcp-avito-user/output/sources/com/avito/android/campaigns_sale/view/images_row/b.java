package com.avito.android.campaigns_sale.view.images_row;

import Y61.k;
import android.graphics.drawable.ColorDrawable;
import com.avito.android.remote.model.Size;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: ImagesRowAdapter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    @k
    public static final ColorDrawable a(@k Size size, @InterfaceC42156l int i12, float f12) {
        ColorDrawable colorDrawable = new ColorDrawable(i12);
        colorDrawable.setBounds(0, 0, size.getWidth(), size.getHeight());
        colorDrawable.setAlpha((int) (255 * f12));
        return colorDrawable;
    }
}
