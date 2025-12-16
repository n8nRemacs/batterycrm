package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_selector.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvidePaymentMethodPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<com.avito.android.travel_payment_methods.items.payment_method.g<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302620a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f302621b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.payment_method.h> f302622c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f302623d;

    public p(g gVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f302620a = gVar;
        this.f302621b = lVar;
        this.f302622c = provider;
        this.f302623d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f302621b.f393949a;
        com.avito.android.travel_payment_methods.items.payment_method.i iVarWk = ((a.c.h) this.f302622c).f302598a.wk();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C9266c) this.f302623d).get();
        this.f302620a.getClass();
        return iVarWk.a(aVar, new j(lVar));
    }
}
