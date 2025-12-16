package com.avito.android.tariff.cpx.info.limits.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoLimitsHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f296579a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f296579a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f296579a.get());
    }
}
