package com.avito.android.trx_promo_goods.screens.status.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoGoodsConfigureForbiddenDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f303784a;

    /* renamed from: b, reason: collision with root package name */
    public final g f303785b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f303786c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f303787d;

    public b(com.avito.android.paid_services_impl.e eVar, g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f303784a = eVar;
        this.f303785b = gVar;
        this.f303786c = eVar2;
        this.f303787d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f303784a.get(), (v50.c) this.f303785b.get(), (eH0.c) this.f303786c.get(), (InterfaceC44261b) this.f303787d.get());
    }
}
