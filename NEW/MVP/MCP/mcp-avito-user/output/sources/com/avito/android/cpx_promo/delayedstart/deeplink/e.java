package com.avito.android.cpx_promo.delayedstart.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoDelayedStartHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f126835a;

    public e(com.avito.android.paid_services_impl.e eVar) {
        this.f126835a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.paid_services.a) this.f126835a.get());
    }
}
