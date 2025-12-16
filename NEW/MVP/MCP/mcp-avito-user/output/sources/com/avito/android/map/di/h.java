package com.avito.android.map.di;

import Oi0.C14700d;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertsInPinModule_ProvidePinAdvertsAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f184843a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f184844b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f184845c;

    public h(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f184843a = uVar;
        this.f184844b = provider;
        this.f184845c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f184843a.get();
        com.avito.konveyor.a aVar2 = this.f184844b.get();
        C c12 = this.f184845c.get();
        d dVar = d.f184841a;
        return new C14700d(aVar, aVar2, c12);
    }
}
