package com.yandex.mobile.ads.impl;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class cg {
    public static bg a(@j.N Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new dg() : new sr();
    }
}
