package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: UpsertRealtyObjectInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f203049a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f203050b;

    public P(Provider<InterfaceC41203a> provider, Provider<R0> provider2) {
        this.f203049a = provider;
        this.f203050b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O(this.f203050b.get(), dagger.internal.g.b(this.f203049a));
    }
}
