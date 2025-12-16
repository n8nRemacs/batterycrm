package com.avito.android.tariff.cpx.configure.advance_manual.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.configure.advance_manual.di.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: CpxConfigureAdvanceManualModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f295809a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295810b;

    public e(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f295809a = provider;
        this.f295810b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((g.b.C9003b) this.f295809a).f295824a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((g.b.a) this.f295810b).get();
        d.f295808a.getClass();
        return aVarS1.a(aVar, "cpx_configure_advance_manual_request_key");
    }
}
