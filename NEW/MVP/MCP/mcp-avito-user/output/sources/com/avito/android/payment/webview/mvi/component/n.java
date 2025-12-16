package com.avito.android.payment.webview.mvi.component;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WebPaymentMviOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f214913a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f214914b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f214915c;

    public n(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f214913a = provider;
        this.f214914b = provider2;
        this.f214915c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f214913a.get(), this.f214914b.get(), (com.avito.android.payment.webview.mvi.a) this.f214915c.f393949a);
    }
}
