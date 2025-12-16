package com.avito.android.str_seller_orders.strsellerorders.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerOrdersScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersPerfModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final k f289774a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f289775b;

    public l(k kVar, dagger.internal.l lVar) {
        this.f289774a = kVar;
        this.f289775b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f289775b.f393949a;
        this.f289774a.getClass();
        return new C28478k(StrSellerOrdersScreen.f90522d, rVar, null, 4, null);
    }
}
