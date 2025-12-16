package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorLandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.landing.domain.b f299724a;

    public g(com.avito.android.tariff_lf_constructor.configure.landing.domain.b bVar) {
        this.f299724a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.tariff_lf_constructor.configure.landing.domain.a) this.f299724a.get());
    }
}
