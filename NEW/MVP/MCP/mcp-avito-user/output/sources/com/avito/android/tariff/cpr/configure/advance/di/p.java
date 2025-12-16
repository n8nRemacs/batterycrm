package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpr.configure.advance.di.s;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: CprConfigureModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f295226a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295227b;

    public p(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f295226a = provider;
        this.f295227b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((s.b.c) this.f295226a).f295256a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((s.b.a) this.f295227b).get();
        o.f295225a.getClass();
        return aVarS1.a(aVar, "cpr_advance_request_key");
    }
}
