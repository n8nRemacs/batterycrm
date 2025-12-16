package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.kp0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ih implements w20 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f386488a;

    public ih(@j.N Context context) {
        this.f386488a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.w20
    public final void a(@j.N Map<String, Bitmap> map) {
    }

    @Override // com.yandex.mobile.ads.impl.w20
    @j.P
    public final Bitmap a(@j.N b30 b30Var) {
        kp0.c cVarB = kp0.c(this.f386488a).b();
        String strD = b30Var.d();
        if (strD == null) {
            return null;
        }
        Bitmap bitmapA = cVarB.a(strD);
        if (bitmapA == null || bitmapA.getWidth() != 1 || bitmapA.getHeight() != 1) {
            return bitmapA;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, b30Var.e(), b30Var.a(), false);
        cVarB.a(strD, bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }
}
