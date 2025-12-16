package com.avito.android.wallet.page.mvi.component;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPageBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.mvi.b f328154a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328155b;

    public i(com.avito.android.wallet.page.mvi.b bVar, Provider provider) {
        this.f328154a = bVar;
        this.f328155b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.wallet.page.mvi.a) this.f328154a.get(), this.f328155b.get());
    }
}
