package com.avito.android.payment.di.module;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import v60.InterfaceC49169a;

/* compiled from: WebPaymentMviModule_Companion_ProvidePaymentWebViewErrorHandlerDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Y implements dagger.internal.h<InterfaceC49169a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f214246a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f214247b;

    public Y(dagger.internal.l lVar, Provider provider) {
        this.f214246a = provider;
        this.f214247b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f214246a.get();
        com.avito.android.payment.webview.mvi.a aVar = (com.avito.android.payment.webview.mvi.a) this.f214247b.f393949a;
        W.f214236a.getClass();
        return new v60.b(interfaceC28373a, aVar.f214850a, aVar.f214852c);
    }
}
