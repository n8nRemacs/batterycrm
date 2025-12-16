package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class o11 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final eg f388419a = new eg();

    @j.N
    public final Bitmap a(@j.N Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            eg egVar = this.f388419a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            egVar.getClass();
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            eg egVar2 = this.f388419a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            egVar2.getClass();
            bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
