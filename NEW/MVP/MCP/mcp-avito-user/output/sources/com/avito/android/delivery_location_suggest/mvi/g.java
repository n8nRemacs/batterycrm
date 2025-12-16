package com.avito.android.delivery_location_suggest.mvi;

import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryLocationSuggestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f135178a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.mvi.useCase.g f135179b;

    public g(dagger.internal.l lVar, com.avito.android.delivery_location_suggest.mvi.useCase.g gVar) {
        this.f135178a = lVar;
        this.f135179b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((DeliveryLocationSuggestParams) this.f135178a.f393949a, (com.avito.android.delivery_location_suggest.mvi.useCase.e) this.f135179b.get());
    }
}
