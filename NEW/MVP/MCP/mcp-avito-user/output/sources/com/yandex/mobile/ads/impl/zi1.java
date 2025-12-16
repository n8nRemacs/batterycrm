package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class zi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yi1 f392273a;

    public zi1(@j.N yi1 yi1Var) {
        this.f392273a = yi1Var;
    }

    public final boolean a() {
        View view = this.f392273a.getView();
        return (view == null || rj1.d(view) || rj1.b(view) < 1) ? false : true;
    }
}
