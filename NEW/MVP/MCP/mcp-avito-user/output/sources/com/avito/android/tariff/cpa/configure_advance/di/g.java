package com.avito.android.tariff.cpa.configure_advance.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpa.configure_advance.di.o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: ConfigureAdvanceModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f294269a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f294270b;

    public g(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f294269a = provider;
        this.f294270b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((o.b.c) this.f294269a).f294309a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((o.b.C8948b) this.f294270b).get();
        d.f294266a.getClass();
        return aVarS1.a(aVar, "request_configure_advance");
    }
}
