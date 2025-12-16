package com.avito.android.tariff.cpr.configure.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCprConfigureAdvanceDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f295502a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f295502a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f295502a.get());
    }
}
