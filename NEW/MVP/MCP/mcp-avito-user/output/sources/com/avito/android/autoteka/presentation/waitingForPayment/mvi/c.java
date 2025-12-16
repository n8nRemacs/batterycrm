package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaWaitingForPaymentActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.orderStatus.a> f97872a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97873b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f97872a = provider;
        this.f97873b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f97872a.get(), (WaitingForPaymentDetails) this.f97873b.f393949a);
    }
}
