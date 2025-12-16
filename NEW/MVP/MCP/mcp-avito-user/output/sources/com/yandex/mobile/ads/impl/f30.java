package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class f30 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final w20 f385161a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cg f385162b = new cg();

    public f30(@j.N w20 w20Var) {
        this.f385161a = w20Var;
    }

    public final boolean a(@j.P Drawable drawable, @j.N b30 b30Var) {
        Bitmap bitmapA = this.f385161a.a(b30Var);
        if (drawable == null || bitmapA == null) {
            return false;
        }
        this.f385162b.getClass();
        return cg.a(drawable).a(drawable, bitmapA);
    }
}
