package com.avito.android.service_fee_conditions.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceFeeConditionsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_fee_conditions.domain.b f278443a;

    public d(com.avito.android.service_fee_conditions.domain.b bVar) {
        this.f278443a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.service_fee_conditions.domain.a) this.f278443a.get());
    }
}
