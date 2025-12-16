package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: OpenBankApplicationUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f202993a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f202994b;

    public F(Provider<InterfaceC41203a> provider, Provider<R0> provider2) {
        this.f202993a = provider;
        this.f202994b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f202994b.get(), dagger.internal.g.b(this.f202993a));
    }
}
