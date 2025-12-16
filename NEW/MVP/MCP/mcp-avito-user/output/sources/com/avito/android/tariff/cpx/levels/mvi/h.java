package com.avito.android.tariff.cpx.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxLevelsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.levels.domain.a> f297136a;

    /* renamed from: b, reason: collision with root package name */
    public final u f297137b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f297138c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f297136a = provider;
        this.f297137b = uVar;
        this.f297138c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f297136a.get(), (v50.g) this.f297137b.get(), this.f297138c.get());
    }
}
