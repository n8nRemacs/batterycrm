package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPinCreationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.creation.mvi.b f328599a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.wallet_biometry.f> f328600b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f328601c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328602d;

    public l(com.avito.android.wallet.pin.impl.creation.mvi.b bVar, Provider provider, dagger.internal.l lVar, Provider provider2) {
        this.f328599a = bVar;
        this.f328600b = provider;
        this.f328601c = lVar;
        this.f328602d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.wallet.pin.impl.creation.mvi.a) this.f328599a.get(), this.f328600b.get(), (String) this.f328601c.f393949a, this.f328602d.get());
    }
}
