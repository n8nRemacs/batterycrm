package com.avito.android.comfortable_deal.client_room.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import ep.InterfaceC40139a;

/* compiled from: ClientRoomActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f119906a;

    public i(u uVar) {
        this.f119906a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC40139a) this.f119906a.get());
    }
}
