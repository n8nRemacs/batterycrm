package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class b40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ug0 f383781a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InitializationListener f383782b;

    public b40(@j.N ug0 ug0Var, @j.N InitializationListener initializationListener) {
        this.f383781a = ug0Var;
        this.f383782b = initializationListener;
    }

    public final void a() {
        ug0 ug0Var = this.f383781a;
        InitializationListener initializationListener = this.f383782b;
        Objects.requireNonNull(initializationListener);
        ug0Var.b(new J(initializationListener, 3));
    }
}
