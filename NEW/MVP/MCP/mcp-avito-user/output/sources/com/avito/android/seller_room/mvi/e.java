package com.avito.android.seller_room.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerRoomBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_room.e f268143a;

    public e(com.avito.android.seller_room.e eVar) {
        this.f268143a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.seller_room.d) this.f268143a.get());
    }
}
