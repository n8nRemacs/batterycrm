package com.avito.android.cpx_promo.v2.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoV2Handler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f127418a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f127418a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f127418a.get());
    }
}
