package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.configure.advance.di.n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: CpxConfigureAdvanceModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f295596a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295597b;

    public l(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f295596a = provider;
        this.f295597b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((n.b.c) this.f295596a).f295627a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((n.b.a) this.f295597b).get();
        k.f295595a.getClass();
        return aVarS1.a(aVar, "key_cpx_configure_advance_request");
    }
}
