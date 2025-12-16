package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public abstract class j6 {
    public static to1 a(k6 k6Var, l6 l6Var) {
        if (yq0.a()) {
            return new to1(k6Var, l6Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void a(View view, dx dxVar, @j.P String str);

    public abstract void b();
}
