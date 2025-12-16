package com.avito.android.vas_performance.di.stickers;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersBuyVasModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f320122a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f320123b;

    public j(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f320122a = provider;
        this.f320123b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f320122a.get();
        com.avito.konveyor.a aVar2 = this.f320123b.get();
        int i12 = h.f320120a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
