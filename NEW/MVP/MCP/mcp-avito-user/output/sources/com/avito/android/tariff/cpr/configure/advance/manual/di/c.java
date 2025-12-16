package com.avito.android.tariff.cpr.configure.advance.manual.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpr.configure.advance.manual.di.d;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: CprConfigureAdvanceManualModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f295366a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295367b;

    public c(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f295366a = provider;
        this.f295367b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((d.b.c) this.f295366a).f295385a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((d.b.a) this.f295367b).get();
        b.f295365a.getClass();
        return aVarS1.a(aVar, "cpr_advance_manual_request_key");
    }
}
