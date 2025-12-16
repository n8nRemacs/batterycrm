package com.avito.android.tariff.cpx.info.limits.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoLimitsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.limits.mvi.domain.b f296601a;

    public d(com.avito.android.tariff.cpx.info.limits.mvi.domain.b bVar) {
        this.f296601a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff.cpx.info.limits.mvi.domain.a) this.f296601a.get());
    }
}
