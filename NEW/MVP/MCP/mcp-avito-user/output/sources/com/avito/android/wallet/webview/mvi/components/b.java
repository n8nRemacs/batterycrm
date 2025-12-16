package com.avito.android.wallet.webview.mvi.components;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletWebViewActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f329414a;

    public b(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f329414a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f329414a.get());
    }
}
