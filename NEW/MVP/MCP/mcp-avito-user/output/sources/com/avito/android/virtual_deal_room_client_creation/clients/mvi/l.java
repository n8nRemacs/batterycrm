package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.c f326670a;

    public l(com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.c cVar) {
        this.f326670a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.a) this.f326670a.get());
    }
}
