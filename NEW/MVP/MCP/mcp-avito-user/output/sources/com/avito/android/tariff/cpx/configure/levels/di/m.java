package com.avito.android.tariff.cpx.configure.levels.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.configure.levels.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCpxConfigureLevelsModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f296124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f296125b;

    public m(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f296124a = provider;
        this.f296125b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.C9011c) this.f296124a).f296108a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C9010a) this.f296125b).get();
        l.f296123a.getClass();
        return aVarS1.a(aVar, "cpx_configure_levels_request_key");
    }
}
