package com.avito.android.checkout.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import so.InterfaceC48388a;

/* compiled from: CheckoutSaveV3UseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48388a> f118306a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f118307b;

    public f(Provider<InterfaceC48388a> provider, Provider<R0> provider2) {
        this.f118306a = provider;
        this.f118307b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f118306a.get(), this.f118307b.get());
    }
}
