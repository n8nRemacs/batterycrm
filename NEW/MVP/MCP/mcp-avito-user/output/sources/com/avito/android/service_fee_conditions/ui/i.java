package com.avito.android.service_fee_conditions.ui;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ServiceFeeConditionsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_fee_conditions.mvi.g f278584a;

    public i(com.avito.android.service_fee_conditions.mvi.g gVar) {
        this.f278584a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_fee_conditions.mvi.f fVar = (com.avito.android.service_fee_conditions.mvi.f) this.f278584a.get();
        i2.f411430a.getClass();
        return new h(fVar, i2.a.f411433c);
    }
}
