package com.avito.android.free_delivery.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.free_delivery.FreeDeliveryDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FreeDeliveryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f158811a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f158812b;

    public o(dagger.internal.l lVar, Provider provider) {
        this.f158811a = provider;
        this.f158812b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f158811a.get(), (FreeDeliveryDetails) this.f158812b.f393949a);
    }
}
