package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class d51 {
    @Y61.k
    public static c51 a(@Y61.k c51 c51Var, @Y61.k c51 c51Var2, @Y61.k RectF rectF, @Y61.k RectF rectF2) {
        float fA2 = g51.a(c51Var, rectF2, rectF);
        float fA3 = g51.a(c51Var2, rectF2, rectF);
        return fA2 == Float.MAX_VALUE ? c51Var2 : fA2 == fA3 ? c51Var.a() > c51Var2.a() ? c51Var : c51Var2 : fA2 > fA3 ? c51Var2 : c51Var;
    }
}
