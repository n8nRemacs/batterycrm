package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IReporter;

/* loaded from: classes8.dex */
public final class w11 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final x11 f391255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a21 f391256b;

    public w11(@Y61.k py0 py0Var, @Y61.k x11 x11Var, @Y61.k a21 a21Var) {
        this.f391255a = x11Var;
        this.f391256b = a21Var;
    }

    public final void a() {
        this.f391256b.a(this.f391255a);
    }

    public w11(@Y61.l IReporter iReporter, @Y61.k py0 py0Var) {
        this(py0Var, new x11(new ha(), iReporter, py0Var), a21.a());
    }
}
