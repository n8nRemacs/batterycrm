package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaWaitingForPaymentOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f97911a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97912b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f97911a = lVar;
        this.f97912b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((WaitingForPaymentDetails) this.f97911a.f393949a, this.f97912b.get());
    }
}
