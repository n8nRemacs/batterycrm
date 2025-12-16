package com.avito.android.vas_performance.di.stickers;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersEditVasModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f320129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f320130b;

    public o(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f320129a = provider;
        this.f320130b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f320129a.get();
        com.avito.konveyor.a aVar2 = this.f320130b.get();
        int i12 = m.f320126a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
