package com.avito.android.imv_goods_advert.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f170497a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f170498b;

    public g(u uVar, Provider provider) {
        this.f170497a = uVar;
        this.f170498b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f170497a.get();
        com.avito.konveyor.a aVar2 = this.f170498b.get();
        f.f170496a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
