package com.avito.android.tariff.cpx.configure.levels.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxConfigureLevelsHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f296083a;

    public d(com.avito.android.paid_services_impl.e eVar) {
        this.f296083a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.paid_services.a) this.f296083a.get());
    }
}
