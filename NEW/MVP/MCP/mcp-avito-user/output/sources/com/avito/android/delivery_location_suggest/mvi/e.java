package com.avito.android.delivery_location_suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: DeliveryLocationSuggestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.mvi.useCase.g f135165a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.mvi.useCase.d f135166b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C44245a> f135167c;

    public e(com.avito.android.delivery_location_suggest.mvi.useCase.g gVar, com.avito.android.delivery_location_suggest.mvi.useCase.d dVar, Provider provider) {
        this.f135165a = gVar;
        this.f135166b = dVar;
        this.f135167c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.delivery_location_suggest.mvi.useCase.e) this.f135165a.get(), (com.avito.android.delivery_location_suggest.mvi.useCase.c) this.f135166b.get(), this.f135167c.get());
    }
}
