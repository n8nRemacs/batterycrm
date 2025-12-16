package com.avito.android.service_fee_conditions.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceFeeConditionsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_fee_conditions.domain.b f278441a;

    public b(com.avito.android.service_fee_conditions.domain.b bVar) {
        this.f278441a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.service_fee_conditions.domain.a) this.f278441a.get());
    }
}
