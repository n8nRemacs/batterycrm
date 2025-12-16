package com.avito.android.tariff.cpa.info.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaInfoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.info.data.c f294786a;

    public o(com.avito.android.tariff.cpa.info.data.c cVar) {
        this.f294786a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.tariff.cpa.info.data.a) this.f294786a.get());
    }
}
