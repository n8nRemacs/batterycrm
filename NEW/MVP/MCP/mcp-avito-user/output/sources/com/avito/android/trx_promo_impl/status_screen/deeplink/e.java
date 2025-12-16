package com.avito.android.trx_promo_impl.status_screen.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoConfigureSuccessDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f304406a;

    /* renamed from: b, reason: collision with root package name */
    public final g f304407b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f304408c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f304409d;

    public e(com.avito.android.paid_services_impl.e eVar, g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f304406a = eVar;
        this.f304407b = gVar;
        this.f304408c = eVar2;
        this.f304409d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.paid_services.a) this.f304406a.get(), (v50.c) this.f304407b.get(), (eH0.c) this.f304408c.get(), (InterfaceC44261b) this.f304409d.get());
    }
}
