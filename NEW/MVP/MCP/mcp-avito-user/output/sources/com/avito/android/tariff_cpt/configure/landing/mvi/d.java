package com.avito.android.tariff_cpt.configure.landing.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLandingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297773a;

    public d(u uVar) {
        this.f297773a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff_cpt.configure.landing.domain.a) this.f297773a.get());
    }
}
