package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaWaitingForPaymentBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.orderStatus.a> f97882a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97883b;

    public e(dagger.internal.l lVar, Provider provider) {
        this.f97882a = provider;
        this.f97883b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f97882a.get(), (WaitingForPaymentDetails) this.f97883b.f393949a);
    }
}
