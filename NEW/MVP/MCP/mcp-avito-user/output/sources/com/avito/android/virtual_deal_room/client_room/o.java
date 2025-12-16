package com.avito.android.virtual_deal_room.client_room;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientRoomViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.virtual_deal_room.client_room.mvi.k f326417a;

    public o(com.avito.android.virtual_deal_room.client_room.mvi.k kVar) {
        this.f326417a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.virtual_deal_room.client_room.mvi.j) this.f326417a.get(), null, 2, null);
    }
}
