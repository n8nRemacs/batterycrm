package com.avito.android.messenger.channels.mvi.di;

import javax.inject.Provider;

/* compiled from: ChannelsListAdapterModule_ProvideChannelsListAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.di.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31744l implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f187432a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f187433b;

    public C31744l(dagger.internal.u uVar, Provider provider) {
        this.f187432a = uVar;
        this.f187433b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f187432a.get();
        com.avito.konveyor.a aVar2 = this.f187433b.get();
        C31743k.f187431a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
