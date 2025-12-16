package com.avito.android.trx_promo_impl.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.header.b f304157a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.commission.b f304158b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.extra_info.b f304159c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.date.b f304160d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.discount_v2.b f304161e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.item.banner.c f304162f;

    public q(com.avito.android.trx_promo_impl.item.header.b bVar, com.avito.android.trx_promo_impl.item.commission.b bVar2, com.avito.android.trx_promo_impl.item.extra_info.b bVar3, com.avito.android.trx_promo_impl.item.date.b bVar4, com.avito.android.trx_promo_impl.item.discount_v2.b bVar5, com.avito.android.trx_promo_impl.item.banner.c cVar) {
        this.f304157a = bVar;
        this.f304158b = bVar2;
        this.f304159c = bVar3;
        this.f304160d = bVar4;
        this.f304161e = bVar5;
        this.f304162f = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.trx_promo_impl.item.header.a aVar = (com.avito.android.trx_promo_impl.item.header.a) this.f304157a.get();
        com.avito.android.trx_promo_impl.item.commission.a aVar2 = (com.avito.android.trx_promo_impl.item.commission.a) this.f304158b.get();
        com.avito.android.trx_promo_impl.item.extra_info.a aVar3 = (com.avito.android.trx_promo_impl.item.extra_info.a) this.f304159c.get();
        com.avito.android.trx_promo_impl.item.date.a aVar4 = (com.avito.android.trx_promo_impl.item.date.a) this.f304160d.get();
        com.avito.android.trx_promo_impl.item.discount_v2.a aVar5 = (com.avito.android.trx_promo_impl.item.discount_v2.a) this.f304161e.get();
        com.avito.android.trx_promo_impl.item.banner.b bVar = (com.avito.android.trx_promo_impl.item.banner.b) this.f304162f.get();
        o.f304155a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
