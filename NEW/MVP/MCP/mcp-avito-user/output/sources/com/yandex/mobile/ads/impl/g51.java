package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class g51 {
    public static final float a(@Y61.k c51 c51Var, @Y61.k RectF rectF, @Y61.k RectF rectF2) {
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float fHeight2 = rectF2.height();
        float fWidth2 = rectF2.width();
        if (fHeight == 0.0f || fWidth == 0.0f || fHeight2 == 0.0f || fWidth2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float fMin = Math.min(1.0f, fWidth2 / fHeight2 > fWidth / fHeight ? fHeight / fHeight2 : fWidth / fWidth2);
        if (fWidth < ((int) (c51Var.c() * fMin)) || fHeight < ((int) (c51Var.b() * fMin))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(fHeight - (c51Var.b() * fMin)) + Math.abs(fWidth - (c51Var.c() * fMin));
    }
}
