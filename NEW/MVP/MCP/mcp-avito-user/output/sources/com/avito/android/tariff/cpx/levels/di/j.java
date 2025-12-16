package com.avito.android.tariff.cpx.levels.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpx.levels.di.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: CpxLevelsModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f297060a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f297061b;

    public j(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f297060a = provider;
        this.f297061b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((l.b.c) this.f297060a).f297087a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((l.b.a) this.f297061b).get();
        i.f297059a.getClass();
        return aVarS1.a(aVar, "cpx_levels_request_key");
    }
}
