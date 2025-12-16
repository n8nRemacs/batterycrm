package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
final class dg implements bg<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean a(@j.N Drawable drawable, @j.N Bitmap bitmap) {
        return bitmap.equals(((BitmapDrawable) drawable).getBitmap());
    }
}
