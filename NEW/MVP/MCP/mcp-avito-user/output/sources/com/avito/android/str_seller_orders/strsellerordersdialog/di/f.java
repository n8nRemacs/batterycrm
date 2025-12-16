package com.avito.android.str_seller_orders.strsellerordersdialog.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersDialogItemsModule_ProvideListRecyclerAdapter$_avito_str_seller_orders_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f290119a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290120b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f290121c;

    public f(c cVar, u uVar, Provider provider) {
        this.f290119a = cVar;
        this.f290120b = uVar;
        this.f290121c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f290120b.get();
        com.avito.konveyor.a aVar2 = this.f290121c.get();
        this.f290119a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
