package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class qf {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f389155a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f389155a.get();
    }

    public final void b() {
        this.f389155a.set(true);
    }
}
