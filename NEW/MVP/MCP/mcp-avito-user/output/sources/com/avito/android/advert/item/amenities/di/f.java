package com.avito.android.advert.item.amenities.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenitiesBottomSheetModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f72750a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72751b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f72752c;

    public f(c cVar, u uVar, Provider provider) {
        this.f72750a = cVar;
        this.f72751b = uVar;
        this.f72752c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f72751b.get();
        com.avito.konveyor.a aVar2 = this.f72752c.get();
        this.f72750a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
