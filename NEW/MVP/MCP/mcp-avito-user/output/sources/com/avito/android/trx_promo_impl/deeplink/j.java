package com.avito.android.trx_promo_impl.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoConfigureDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f304098a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.g f304099b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f304100c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f304101d;

    public j(com.avito.android.paid_services_impl.e eVar, com.avito.android.paid_services_impl.g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f304098a = eVar;
        this.f304099b = gVar;
        this.f304100c = eVar2;
        this.f304101d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.paid_services.a) this.f304098a.get(), (v50.c) this.f304099b.get(), (eH0.c) this.f304100c.get(), (InterfaceC44261b) this.f304101d.get());
    }
}
