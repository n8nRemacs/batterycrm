package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.virtual_deal_room_client_creation.clients.interactor.a> f326644a;

    /* renamed from: b, reason: collision with root package name */
    public final u f326645b;

    public c(u uVar, Provider provider) {
        this.f326644a = provider;
        this.f326645b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f326644a.get(), (ON0.a) this.f326645b.get());
    }
}
