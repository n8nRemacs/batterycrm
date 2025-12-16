package com.avito.android.seller_room.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerRoomActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_room.e f268138a;

    public c(com.avito.android.seller_room.e eVar) {
        this.f268138a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.seller_room.d) this.f268138a.get());
    }
}
