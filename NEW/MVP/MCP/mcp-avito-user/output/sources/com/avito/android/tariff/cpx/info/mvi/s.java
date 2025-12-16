package com.avito.android.tariff.cpx.info.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.mvi.domain.converter.c f296741a;

    public s(com.avito.android.tariff.cpx.info.mvi.domain.converter.c cVar) {
        this.f296741a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f296741a.getClass();
        return new q(new com.avito.android.tariff.cpx.info.mvi.domain.converter.b());
    }
}
