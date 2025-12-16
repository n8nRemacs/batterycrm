package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f326647a;

    public e(u uVar) {
        this.f326647a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.virtual_deal_room_client_creation.clients.interactor.a) this.f326647a.get());
    }
}
