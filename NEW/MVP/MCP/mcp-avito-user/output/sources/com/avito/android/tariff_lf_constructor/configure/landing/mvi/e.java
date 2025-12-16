package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorLandingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.landing.domain.b f299716a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f299717b;

    public e(com.avito.android.tariff_lf_constructor.configure.landing.domain.b bVar, Provider provider) {
        this.f299716a = bVar;
        this.f299717b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.tariff_lf_constructor.configure.landing.domain.a) this.f299716a.get(), this.f299717b.get());
    }
}
