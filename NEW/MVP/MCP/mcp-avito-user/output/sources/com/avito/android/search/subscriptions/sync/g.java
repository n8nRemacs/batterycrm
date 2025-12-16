package com.avito.android.search.subscriptions.sync;

import Go0.InterfaceC13902a;
import com.avito.android.account.G;
import com.avito.android.db.n;
import com.avito.android.db.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionSyncInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13902a> f264016a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<TV.c> f264017b;

    /* renamed from: c, reason: collision with root package name */
    public final p f264018c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<G> f264019d;

    public g(Provider provider, Provider provider2, p pVar, Provider provider3) {
        this.f264016a = provider;
        this.f264017b = provider2;
        this.f264018c = pVar;
        this.f264019d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f264016a), this.f264017b.get(), (n) this.f264018c.get(), this.f264019d.get());
    }
}
