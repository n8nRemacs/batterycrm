package com.avito.android.user_address.list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final h f307385a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307386b;

    /* renamed from: c, reason: collision with root package name */
    public final j f307387c;

    /* renamed from: d, reason: collision with root package name */
    public final o f307388d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f307389e;

    public c(h hVar, m mVar, j jVar, o oVar, Provider provider) {
        this.f307385a = hVar;
        this.f307386b = mVar;
        this.f307387c = jVar;
        this.f307388d = oVar;
        this.f307389e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f307385a.get();
        this.f307386b.getClass();
        k kVar = new k();
        i iVar = (i) this.f307387c.get();
        this.f307388d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f307389e.get();
        XG0.d.f18800b.getClass();
        return new b("UserAddressList", XG0.d.f18801c, new a(gVar, screenPerformanceTracker, kVar, iVar, nVar));
    }
}
