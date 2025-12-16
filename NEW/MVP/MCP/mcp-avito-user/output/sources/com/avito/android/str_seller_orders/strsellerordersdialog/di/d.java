package com.avito.android.str_seller_orders.strsellerordersdialog.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersDialogItemsModule_ProvideAdapterPresenter$_avito_str_seller_orders_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f290115a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290116b;

    public d(c cVar, u uVar) {
        this.f290115a = cVar;
        this.f290116b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f290116b.get();
        this.f290115a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
