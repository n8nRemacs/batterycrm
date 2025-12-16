package com.avito.android.tariff_cpt.configure.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLevelsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297913a;

    public j(u uVar) {
        this.f297913a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.tariff_cpt.configure.levels.domain.a) this.f297913a.get());
    }
}
