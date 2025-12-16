package com.avito.android.tariff.cpx.info.limits.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoLimitsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.limits.mvi.domain.b f296599a;

    public b(com.avito.android.tariff.cpx.info.limits.mvi.domain.b bVar) {
        this.f296599a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.tariff.cpx.info.limits.mvi.domain.a) this.f296599a.get());
    }
}
