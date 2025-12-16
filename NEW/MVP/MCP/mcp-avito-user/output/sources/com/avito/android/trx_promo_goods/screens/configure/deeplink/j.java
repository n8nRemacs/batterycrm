package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoGoodsConfigureDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f303413a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.g f303414b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f303415c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f303416d;

    public j(com.avito.android.paid_services_impl.e eVar, com.avito.android.paid_services_impl.g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f303413a = eVar;
        this.f303414b = gVar;
        this.f303415c = eVar2;
        this.f303416d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.paid_services.a) this.f303413a.get(), (v50.c) this.f303414b.get(), (eH0.c) this.f303415c.get(), (InterfaceC44261b) this.f303416d.get());
    }
}
