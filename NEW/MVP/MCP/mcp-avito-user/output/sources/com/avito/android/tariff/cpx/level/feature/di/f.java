package com.avito.android.tariff.cpx.level.feature.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.level.feature.di.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCpxLevelFeatureModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f296969a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f296970b;

    public f(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f296969a = provider;
        this.f296970b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.b) this.f296969a).f296964a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C9046a) this.f296970b).get();
        e.f296968a.getClass();
        return aVarS1.a(aVar, "cpx_level_feature_request_key");
    }
}
