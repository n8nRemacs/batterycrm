package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class aj1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yi1 f383579a;

    public aj1(@j.N yi1 yi1Var) {
        this.f383579a = yi1Var;
    }

    public final boolean a() {
        View view = this.f383579a.getView();
        return (view == null || rj1.d(view) || !rj1.a(view, 50)) ? false : true;
    }
}
