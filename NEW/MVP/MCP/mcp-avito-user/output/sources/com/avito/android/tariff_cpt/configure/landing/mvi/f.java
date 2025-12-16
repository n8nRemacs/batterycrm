package com.avito.android.tariff_cpt.configure.landing.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297782a;

    public f(u uVar) {
        this.f297782a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff_cpt.configure.landing.domain.a) this.f297782a.get());
    }
}
