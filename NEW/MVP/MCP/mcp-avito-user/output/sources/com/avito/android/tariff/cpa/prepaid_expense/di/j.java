package com.avito.android.tariff.cpa.prepaid_expense.di;

import com.avito.android.paid_services_impl.n;
import com.avito.android.tariff.cpa.prepaid_expense.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v50.g;

/* compiled from: PublicationAdvanceModule_ProvidePaymentFlowInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<v50.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g.b> f295001a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295002b;

    public j(Provider<g.b> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f295001a = provider;
        this.f295002b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVarS1 = ((a.c.C8968c) this.f295001a).f294990a.S1();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.b) this.f295002b).get();
        g.f294998a.getClass();
        return aVarS1.a(aVar, "request_publication_advance");
    }
}
