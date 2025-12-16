package com.avito.android.str_seller_orders.strsellerordersdialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerOrdersDialogScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersDialogModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f290122a;

    /* renamed from: b, reason: collision with root package name */
    public final l f290123b;

    public h(g gVar, l lVar) {
        this.f290122a = gVar;
        this.f290123b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f290123b.f393949a;
        this.f290122a.getClass();
        return new C28478k(StrSellerOrdersDialogScreen.f90520d, rVar, null, 4, null);
    }
}
