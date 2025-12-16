package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletSecuritySettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f328807a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.wallet_biometry.f> f328808b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f328809c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328810d;

    public h(o oVar, Provider provider, Provider provider2, Provider provider3) {
        this.f328807a = oVar;
        this.f328808b = provider;
        this.f328809c = provider2;
        this.f328810d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((n) this.f328807a.get(), this.f328808b.get(), this.f328809c.get(), this.f328810d.get());
    }
}
