package com.avito.android.mortgage.deeplink.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: MortgageApplicationEntryPointUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f198828a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198829b;

    public h(Provider<InterfaceC41203a> provider, Provider<R0> provider2) {
        this.f198828a = provider;
        this.f198829b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f198829b.get(), dagger.internal.g.b(this.f198828a));
    }
}
