package com.avito.android.beduin.common.component.image;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.ViewOverlay;
import com.avito.android.beduin.common.utils.A;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BeduinImageComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    public static final void a(a aVar, ImageStyle imageStyle, Size size) {
        OverlayStyle overlay;
        BeduinLinearGradient linearGradient;
        OverlayStyle overlay2;
        UniversalColor color;
        if (imageStyle != null && (overlay2 = imageStyle.getOverlay()) != null && (color = overlay2.getColor()) != null) {
            ViewOverlay overlay3 = aVar.getOverlay();
            ColorDrawable colorDrawableA = H.a(aVar.getContext(), color);
            colorDrawableA.setBounds(0, 0, y6.b(size.getWidth()), y6.b(size.getHeight()));
            overlay3.add(colorDrawableA);
        }
        if (imageStyle == null || (overlay = imageStyle.getOverlay()) == null || (linearGradient = overlay.getLinearGradient()) == null) {
            return;
        }
        ViewOverlay overlay4 = aVar.getOverlay();
        A a12 = new A(linearGradient, aVar.getContext());
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(a12);
        paintDrawable.setBounds(0, 0, y6.b(size.getWidth()), y6.b(size.getHeight()));
        overlay4.add(paintDrawable);
    }

    public static final com.avito.android.lib.design.gradient.a b(Integer num, Context context, Integer num2) {
        a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context, num.intValue(), 0, 4, null);
        c5277a.f179264a = y6.b(num2 != null ? num2.intValue() : 0);
        return new com.avito.android.lib.design.gradient.a(context, c5277a.a());
    }
}
