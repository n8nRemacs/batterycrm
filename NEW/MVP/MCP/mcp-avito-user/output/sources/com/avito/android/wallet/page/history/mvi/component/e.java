package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f328023a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.wallet.page.c> f328024b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328025c;

    public e(n nVar, Provider provider, Provider provider2) {
        this.f328023a = nVar;
        this.f328024b = provider;
        this.f328025c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((m) this.f328023a.get(), this.f328024b.get(), this.f328025c.get());
    }
}
