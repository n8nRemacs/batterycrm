package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f326848a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ON0.a> f326849b;

    public b(u uVar, Provider provider) {
        this.f326848a = uVar;
        this.f326849b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.virtual_deal_room_client_creation.create.interactor.a) this.f326848a.get(), this.f326849b.get());
    }
}
