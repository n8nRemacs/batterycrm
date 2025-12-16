package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsConfigureModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.item.header.b f303463a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.item.commission.b f303464b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.item.date.b f303465c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.item.extra_info.b f303466d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.b f303467e;

    public m(com.avito.android.trx_promo_goods.screens.configure.item.header.b bVar, com.avito.android.trx_promo_goods.screens.configure.item.commission.b bVar2, com.avito.android.trx_promo_goods.screens.configure.item.date.b bVar3, com.avito.android.trx_promo_goods.screens.configure.item.extra_info.b bVar4, com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.b bVar5) {
        this.f303463a = bVar;
        this.f303464b = bVar2;
        this.f303465c = bVar3;
        this.f303466d = bVar4;
        this.f303467e = bVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.trx_promo_goods.screens.configure.item.header.a aVar = (com.avito.android.trx_promo_goods.screens.configure.item.header.a) this.f303463a.get();
        com.avito.android.trx_promo_goods.screens.configure.item.commission.a aVar2 = (com.avito.android.trx_promo_goods.screens.configure.item.commission.a) this.f303464b.get();
        com.avito.android.trx_promo_goods.screens.configure.item.date.a aVar3 = (com.avito.android.trx_promo_goods.screens.configure.item.date.a) this.f303465c.get();
        com.avito.android.trx_promo_goods.screens.configure.item.extra_info.a aVar4 = (com.avito.android.trx_promo_goods.screens.configure.item.extra_info.a) this.f303466d.get();
        com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.a aVar5 = (com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.a) this.f303467e.get();
        j.f303460a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        return c10493a.a();
    }
}
