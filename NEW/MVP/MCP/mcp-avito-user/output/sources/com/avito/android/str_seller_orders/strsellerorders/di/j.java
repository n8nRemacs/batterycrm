package com.avito.android.str_seller_orders.strsellerorders.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f289771a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289772b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f289773c;

    public j(f fVar, u uVar, Provider provider) {
        this.f289771a = fVar;
        this.f289772b = uVar;
        this.f289773c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f289772b.get();
        com.avito.konveyor.a aVar2 = this.f289773c.get();
        this.f289771a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new g());
    }
}
