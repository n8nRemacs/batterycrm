package com.avito.android.advert_collection_adding.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionAddingModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f81794a;

    /* renamed from: b, reason: collision with root package name */
    public final u f81795b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f81796c;

    public h(f fVar, u uVar, Provider provider) {
        this.f81794a = fVar;
        this.f81795b = uVar;
        this.f81796c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f81795b.get();
        com.avito.konveyor.a aVar2 = this.f81796c.get();
        this.f81794a.getClass();
        return new j(aVar, aVar2);
    }
}
