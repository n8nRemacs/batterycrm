package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: B2bBusinessTripSelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f108204a;

    public d(dagger.internal.l lVar) {
        this.f108204a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SelectItemsInfo) this.f108204a.f393949a);
    }
}
