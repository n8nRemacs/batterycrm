package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes8.dex */
final class n20 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final z20 f388144a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final y20 f388145b;

    public n20(@j.N Context context, @j.N z20 z20Var) {
        this.f388144a = z20Var;
        this.f388145b = new y20(context);
    }

    @j.P
    public final b30 a(@j.N Map<String, Bitmap> map, @j.P com.monetization.ads.mediation.nativeads.c cVar) {
        if (cVar == null) {
            return null;
        }
        this.f388144a.getClass();
        Bitmap bitmap = map.get(null);
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String strA = this.f388145b.a(width, height);
        b30 b30Var = new b30();
        b30Var.b((String) null);
        b30Var.b(width);
        b30Var.a(height);
        b30Var.a(strA);
        return b30Var;
    }
}
