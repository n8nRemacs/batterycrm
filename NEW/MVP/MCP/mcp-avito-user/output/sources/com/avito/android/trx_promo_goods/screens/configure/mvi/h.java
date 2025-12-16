package com.avito.android.trx_promo_goods.screens.configure.mvi;

import com.avito.android.paid_services.PaidServicesResultRepository;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.domain.b f303598a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f303599b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f303600c;

    /* renamed from: d, reason: collision with root package name */
    public final LF0.c f303601d;

    public h(com.avito.android.trx_promo_goods.screens.configure.domain.b bVar, Provider provider, dagger.internal.l lVar, LF0.c cVar) {
        this.f303598a = bVar;
        this.f303599b = provider;
        this.f303600c = lVar;
        this.f303601d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.trx_promo_goods.screens.configure.domain.a) this.f303598a.get(), this.f303599b.get(), (PaidServicesResultRepository) this.f303600c.f393949a, (LF0.a) this.f303601d.get());
    }
}
