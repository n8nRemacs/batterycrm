package com.avito.android.str_seller_orders.orders_seller.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: StrSellerOrdersItemsModule_ProvideFiltersItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289309a;

    /* renamed from: b, reason: collision with root package name */
    public final A f289310b;

    public h(e eVar, A a12) {
        this.f289309a = eVar;
        this.f289310b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f289310b.get();
        this.f289309a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
