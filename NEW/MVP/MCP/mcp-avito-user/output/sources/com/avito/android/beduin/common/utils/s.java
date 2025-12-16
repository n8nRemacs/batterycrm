package com.avito.android.beduin.common.utils;

import android.content.Context;
import com.avito.android.beduin.common.component.image.BorderStyle;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: Drawees.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {
    public static final void a(@Y61.k GW0.b bVar, @Y61.l ImageStyle imageStyle, @Y61.k Context context) {
        BorderStyle border = imageStyle != null ? imageStyle.getBorder() : null;
        if ((imageStyle != null ? imageStyle.getCorners() : null) == null) {
            if ((imageStyle != null ? imageStyle.getCornerRadius() : null) == null && border == null) {
                bVar.f6552q = null;
                return;
            }
        }
        float[] fArrA = com.avito.android.beduin.common.component.image.i.a(imageStyle, false);
        if (fArrA != null) {
            RoundingParams roundingParamsA = RoundingParams.a(fArrA);
            Corners corners = imageStyle.getCorners();
            if ((corners != null ? corners.getStaticColor() : null) == null) {
                roundingParamsA.f340151a = RoundingParams.RoundingMethod.f340159c;
                roundingParamsA.f(1.0f);
            } else {
                RoundingParams.RoundingMethod roundingMethod = RoundingParams.RoundingMethod.f340158b;
                roundingParamsA.f340151a = roundingMethod;
                roundingParamsA.f(0.0f);
                roundingParamsA.f340154d = C48063a.f437606a.a(context, imageStyle.getCorners().getStaticColor());
                roundingParamsA.f340151a = roundingMethod;
            }
            bVar.f6552q = roundingParamsA;
        }
        if (border != null) {
            if (bVar.f6552q == null) {
                bVar.f6552q = new RoundingParams();
            }
            RoundingParams roundingParams = bVar.f6552q;
            if (roundingParams != null) {
                roundingParams.f(1.0f);
            }
            RoundingParams roundingParams2 = bVar.f6552q;
            if (roundingParams2 != null) {
                int iA2 = C48063a.f437606a.a(context, border.getColor());
                float fB2 = y6.b(border.getWidth());
                com.facebook.common.internal.o.b("the border width cannot be < 0", fB2 >= 0.0f);
                roundingParams2.f340155e = fB2;
                roundingParams2.f340156f = iA2;
            }
        }
    }
}
