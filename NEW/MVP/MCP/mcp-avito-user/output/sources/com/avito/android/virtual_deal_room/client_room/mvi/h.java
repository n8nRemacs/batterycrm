package com.avito.android.virtual_deal_room.client_room.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientRoomBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f326402a;

    public h(u uVar) {
        this.f326402a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.virtual_deal_room.client_room.interactor.e) this.f326402a.get());
    }
}
