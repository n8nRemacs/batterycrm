package com.avito.android.tariff_cpt.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.levels.domain.a> f298651a;

    /* renamed from: b, reason: collision with root package name */
    public final u f298652b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f298653c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f298651a = provider;
        this.f298652b = uVar;
        this.f298653c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f298651a.get(), (v50.g) this.f298652b.get(), this.f298653c.get());
    }
}
