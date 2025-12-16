package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rH.InterfaceC47543a;

/* compiled from: MotivationPaymentActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f160243a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f160244b;

    /* renamed from: c, reason: collision with root package name */
    public final u f160245c;

    public i(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f160243a = lVar;
        this.f160244b = provider;
        this.f160245c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f160244b.get(), (MotivationPaymentOpenParams) this.f160243a.f393949a, (InterfaceC47543a) this.f160245c.get());
    }
}
