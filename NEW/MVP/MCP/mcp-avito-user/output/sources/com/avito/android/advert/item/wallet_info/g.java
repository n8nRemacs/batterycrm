package com.avito.android.advert.item.wallet_info;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletInfoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f80732a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80733b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f80734c;

    public g(Provider<com.avito.android.deep_linking.x> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<InterfaceC28373a> provider3) {
        this.f80732a = provider;
        this.f80733b = provider2;
        this.f80734c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f80734c.get(), this.f80732a.get(), this.f80733b.get());
    }
}
