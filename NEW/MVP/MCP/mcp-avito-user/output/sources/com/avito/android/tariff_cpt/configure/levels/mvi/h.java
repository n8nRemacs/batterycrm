package com.avito.android.tariff_cpt.configure.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptConfigureLevelsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.configure.levels.domain.a> f297909a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f297910b;

    /* renamed from: c, reason: collision with root package name */
    public final u f297911c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f297909a = provider;
        this.f297910b = provider2;
        this.f297911c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f297909a.get(), this.f297910b.get(), (v50.g) this.f297911c.get());
    }
}
