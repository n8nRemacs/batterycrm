package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_selector.deeplink.TravelPaymentSelectorDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import hF0.C40815b;
import lv.C43834a;

/* compiled from: PaymentSelectorDeeplinkModule_ProvidePaymentDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f302601a;

    /* renamed from: b, reason: collision with root package name */
    public final C40815b f302602b;

    public e(d dVar, C40815b c40815b) {
        this.f302601a = dVar;
        this.f302602b = c40815b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f302601a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TravelPaymentSelectorDeeplink.class, new hF0.c(), new C43834a.b.C11809b(this.f302602b));
    }
}
