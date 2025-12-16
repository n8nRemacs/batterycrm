package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rH.InterfaceC47543a;

/* compiled from: GigMotivationPaymentTypeDeeplinkHandlerModule_ProvideRepositoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<InterfaceC47543a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RF.a> f160210a;

    public g(Provider<RF.a> provider) {
        this.f160210a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RF.a aVar = this.f160210a.get();
        e.f160208a.getClass();
        return new com.avito.android.gig_motivation_payment.data.e(aVar);
    }
}
