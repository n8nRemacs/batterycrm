package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.c f326876a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a> f326877b;

    public i(com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.c cVar, Provider provider) {
        this.f326876a = cVar;
        this.f326877b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.a) this.f326876a.get(), this.f326877b.get());
    }
}
