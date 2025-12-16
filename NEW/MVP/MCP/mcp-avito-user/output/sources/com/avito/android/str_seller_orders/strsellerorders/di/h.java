package com.avito.android.str_seller_orders.strsellerorders.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersItemsModule_ProvideAdapterPresenter$_avito_str_seller_orders_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f289767a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289768b;

    public h(f fVar, u uVar) {
        this.f289767a = fVar;
        this.f289768b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f289768b.get();
        this.f289767a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
