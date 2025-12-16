package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.short_term_rent.bookingform.di.c;
import com.avito.android.short_term_rent.bookingform.di.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_PageContentModule_KonveyorModule_ProvidePaymentMethodPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.android.travel_payment_methods.items.payment_method.g<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.payment_method.h> f281251a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f281252b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f281253c;

    public k(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f281251a = provider;
        this.f281252b = lVar;
        this.f281253c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.payment_method.i iVarWk = ((p.b.i) this.f281251a).f281318a.wk();
        Y41.l lVar = (Y41.l) this.f281252b.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((p.b.c) this.f281253c).get();
        c.InterfaceC8378c.a.f281239a.getClass();
        return iVarWk.a(aVar, new f(lVar));
    }
}
