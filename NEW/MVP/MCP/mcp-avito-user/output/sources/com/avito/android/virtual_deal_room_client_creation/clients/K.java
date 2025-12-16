package com.avito.android.virtual_deal_room_client_creation.clients;

import kotlinx.coroutines.flow.i2;

/* compiled from: ClientsViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.virtual_deal_room_client_creation.clients.mvi.h f326512a;

    public K(com.avito.android.virtual_deal_room_client_creation.clients.mvi.h hVar) {
        this.f326512a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.virtual_deal_room_client_creation.clients.mvi.g gVar = (com.avito.android.virtual_deal_room_client_creation.clients.mvi.g) this.f326512a.get();
        i2.f411430a.getClass();
        return new J(gVar, i2.a.f411433c);
    }
}
