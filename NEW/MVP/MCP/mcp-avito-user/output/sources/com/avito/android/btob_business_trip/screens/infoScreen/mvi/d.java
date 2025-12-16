package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: B2bBusinessTripInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f107995a;

    public d(u uVar) {
        this.f107995a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.btob_business_trip.screens.common.interactors.a) this.f107995a.get());
    }
}
