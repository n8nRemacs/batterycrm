package com.avito.android.profile.user_profile.cards.wallet;

import com.avito.android.account.E;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletItemViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f225800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f225801b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f225802c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f225803d;

    public r(Provider<com.avito.android.clientEventBus.a> provider, Provider<InterfaceC34401z0> provider2, Provider<R0> provider3, Provider<E> provider4) {
        this.f225800a = provider;
        this.f225801b = provider2;
        this.f225802c = provider3;
        this.f225803d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f225800a.get(), dagger.internal.g.b(this.f225801b), this.f225802c.get(), this.f225803d.get());
    }
}
