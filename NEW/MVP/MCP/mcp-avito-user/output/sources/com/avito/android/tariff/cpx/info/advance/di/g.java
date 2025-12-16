package com.avito.android.tariff.cpx.info.advance.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.info.advance.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCpxInfoAdvanceModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f296328a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f296329b;

    public g(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f296328a = provider;
        this.f296329b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.b) this.f296328a).f296322a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C9019a) this.f296329b).get();
        f.f296327a.getClass();
        return aVarS1.a(aVar, "tariff_cpx_info_advance_deeplink_request_key");
    }
}
