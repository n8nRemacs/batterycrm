package com.avito.android.tariff_cpt.configure.levels.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff_cpt.configure.levels.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCptConfigureLevelsModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f297858a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f297859b;

    public j(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f297858a = provider;
        this.f297859b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.d) this.f297858a).f297846a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.b) this.f297859b).get();
        i.f297857a.getClass();
        return aVarS1.a(aVar, "cpt_configure_levels_request_key");
    }
}
