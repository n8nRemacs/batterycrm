package com.avito.android.advert_amenities.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenityBottomSheetDialogModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f81153a;

    /* renamed from: b, reason: collision with root package name */
    public final u f81154b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f81155c;

    public e(b bVar, u uVar, Provider provider) {
        this.f81153a = bVar;
        this.f81154b = uVar;
        this.f81155c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f81154b.get();
        com.avito.konveyor.a aVar2 = this.f81155c.get();
        this.f81153a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
