package com.avito.android.tariff.cpx.info.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.info.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: TariffCpxInfoModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f296415a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f296416b;

    public m(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f296415a = provider;
        this.f296416b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.e) this.f296415a).f296399a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.b) this.f296416b).get();
        l.f296414a.getClass();
        return aVarS1.a(aVar, "request_cpx_info");
    }
}
