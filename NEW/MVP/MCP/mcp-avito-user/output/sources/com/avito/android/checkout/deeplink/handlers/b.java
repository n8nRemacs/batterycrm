package com.avito.android.checkout.deeplink.handlers;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f118198a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f118198a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f118198a.get());
    }
}
