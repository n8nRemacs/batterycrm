package com.avito.android.tariff_cpt.levels.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff_cpt.levels.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCptLevelsModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f298603a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f298604b;

    public k(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f298603a = provider;
        this.f298604b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.d) this.f298603a).f298590a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.b) this.f298604b).get();
        j.f298602a.getClass();
        return aVarS1.a(aVar, "tariff_cpt_levels_request_key");
    }
}
