package com.avito.android.account;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: AccountUpdateInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f68081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f68082b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<e0> f68083c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.A f68084d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.l f68085e;

    public V(dagger.internal.f fVar, Provider provider, Provider provider2, dagger.internal.A a12, B3.l lVar) {
        this.f68081a = fVar;
        this.f68082b = provider;
        this.f68083c = provider2;
        this.f68084d = a12;
        this.f68085e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U((InterfaceC28373a) this.f68081a.get(), this.f68082b.get(), this.f68083c.get(), dagger.internal.g.a(dagger.internal.w.a(this.f68084d)), (B3.f) this.f68085e.get());
    }
}
