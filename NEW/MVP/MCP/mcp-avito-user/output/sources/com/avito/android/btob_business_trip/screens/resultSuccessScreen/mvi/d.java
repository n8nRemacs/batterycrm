package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: B2bBusinessTripSuccessScreenBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f108100a;

    public d(l lVar) {
        this.f108100a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SuccessScreenInfo) this.f108100a.f393949a);
    }
}
