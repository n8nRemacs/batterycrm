package com.avito.android.trx_promo_goods.screens.status.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoGoodsConfigureSuccessDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f303792a;

    /* renamed from: b, reason: collision with root package name */
    public final g f303793b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f303794c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f303795d;

    public e(com.avito.android.paid_services_impl.e eVar, g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f303792a = eVar;
        this.f303793b = gVar;
        this.f303794c = eVar2;
        this.f303795d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.paid_services.a) this.f303792a.get(), (v50.c) this.f303793b.get(), (eH0.c) this.f303794c.get(), (InterfaceC44261b) this.f303795d.get());
    }
}
