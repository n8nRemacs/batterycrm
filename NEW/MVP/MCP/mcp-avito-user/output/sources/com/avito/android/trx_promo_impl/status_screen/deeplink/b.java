package com.avito.android.trx_promo_impl.status_screen.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: TrxPromoConfigureForbiddenDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f304398a;

    /* renamed from: b, reason: collision with root package name */
    public final g f304399b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f304400c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f304401d;

    public b(com.avito.android.paid_services_impl.e eVar, g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f304398a = eVar;
        this.f304399b = gVar;
        this.f304400c = eVar2;
        this.f304401d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f304398a.get(), (v50.c) this.f304399b.get(), (eH0.c) this.f304400c.get(), (InterfaceC44261b) this.f304401d.get());
    }
}
