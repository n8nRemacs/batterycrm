package com.avito.android.delivery_location_suggest;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryLocationSuggestViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.mvi.j f135217a;

    public s(com.avito.android.delivery_location_suggest.mvi.j jVar) {
        this.f135217a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((com.avito.android.delivery_location_suggest.mvi.i) this.f135217a.get(), null, 2, null);
    }
}
