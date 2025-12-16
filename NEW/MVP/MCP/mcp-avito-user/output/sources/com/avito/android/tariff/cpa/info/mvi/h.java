package com.avito.android.tariff.cpa.info.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpa.info.domain.a> f294769a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f294770b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f294771c;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f294769a = provider;
        this.f294770b = lVar;
        this.f294771c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f294769a.get(), ((Boolean) this.f294770b.f393949a).booleanValue(), ((Boolean) this.f294771c.f393949a).booleanValue());
    }
}
