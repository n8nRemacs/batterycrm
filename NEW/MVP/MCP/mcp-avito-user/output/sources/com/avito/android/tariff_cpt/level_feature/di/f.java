package com.avito.android.tariff_cpt.level_feature.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff_cpt.level_feature.di.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCptLevelFeatureModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f298467a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f298468b;

    public f(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f298467a = provider;
        this.f298468b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.b) this.f298467a).f298462a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C9118a) this.f298468b).get();
        e.f298466a.getClass();
        return aVarS1.a(aVar, "cpt_level_feature_request_key");
    }
}
