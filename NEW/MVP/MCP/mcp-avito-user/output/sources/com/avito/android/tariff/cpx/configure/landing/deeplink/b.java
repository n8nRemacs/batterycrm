package com.avito.android.tariff.cpx.configure.landing.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureLandingDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f295894a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f295894a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f295894a.get());
    }
}
