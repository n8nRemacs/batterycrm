package com.avito.android.tariff.cpx.info.limits;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCpxInfoLimitsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.limits.mvi.g f296597a;

    public h(com.avito.android.tariff.cpx.info.limits.mvi.g gVar) {
        this.f296597a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpx.info.limits.mvi.f fVar = (com.avito.android.tariff.cpx.info.limits.mvi.f) this.f296597a.get();
        i2.f411430a.getClass();
        return new g(fVar, i2.a.f411433c);
    }
}
