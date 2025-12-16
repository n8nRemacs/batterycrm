package com.avito.android.sbc.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DiscountDispatchVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f259963a;

    public l(com.avito.android.paid_services_impl.e eVar) {
        this.f259963a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.paid_services.a) this.f259963a.get());
    }
}
