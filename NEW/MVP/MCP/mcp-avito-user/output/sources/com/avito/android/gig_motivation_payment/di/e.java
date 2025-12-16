package com.avito.android.gig_motivation_payment.di;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rH.InterfaceC47543a;

/* compiled from: MotivationPaymentModule_ProvideRepositoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<InterfaceC47543a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RF.a> f160110a;

    public e(Provider<RF.a> provider) {
        this.f160110a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RF.a aVar = this.f160110a.get();
        d.f160109a.getClass();
        return new com.avito.android.gig_motivation_payment.data.e(aVar);
    }
}
