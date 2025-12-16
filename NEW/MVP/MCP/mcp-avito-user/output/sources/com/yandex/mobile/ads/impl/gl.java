package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class gl {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final gx0 f385771a;

    public gl(@Y61.k gx0 gx0Var) {
        this.f385771a = gx0Var;
    }

    @Y61.k
    public final gx0 a() {
        return this.f385771a;
    }

    public gl(@Y61.k TimeUnit timeUnit) {
        this(new gx0(o81.f388458h, timeUnit));
    }

    public gl() {
        this(TimeUnit.MINUTES);
    }
}
