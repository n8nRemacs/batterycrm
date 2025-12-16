package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rH.InterfaceC47543a;

/* compiled from: MotivationPaymentBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f160260a;

    /* renamed from: b, reason: collision with root package name */
    public final u f160261b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f160262c;

    public m(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f160260a = lVar;
        this.f160261b = uVar;
        this.f160262c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f160262c.get(), (MotivationPaymentOpenParams) this.f160260a.f393949a, (InterfaceC47543a) this.f160261b.get());
    }
}
