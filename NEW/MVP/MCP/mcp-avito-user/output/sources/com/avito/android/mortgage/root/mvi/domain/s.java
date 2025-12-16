package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: DeleteRealtyObjectUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f203126a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z> f203127b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f203128c;

    public s(Provider<InterfaceC41203a> provider, Provider<z> provider2, Provider<R0> provider3) {
        this.f203126a = provider;
        this.f203127b = provider2;
        this.f203128c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f203127b.get(), this.f203128c.get(), dagger.internal.g.b(this.f203126a));
    }
}
