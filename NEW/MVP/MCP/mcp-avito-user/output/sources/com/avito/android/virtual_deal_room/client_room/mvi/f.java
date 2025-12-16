package com.avito.android.virtual_deal_room.client_room.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f326395a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.virtual_deal_room.client_room.interactor.a> f326396b;

    public f(u uVar, Provider provider) {
        this.f326395a = uVar;
        this.f326396b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.virtual_deal_room.client_room.interactor.e) this.f326395a.get(), this.f326396b.get());
    }
}
