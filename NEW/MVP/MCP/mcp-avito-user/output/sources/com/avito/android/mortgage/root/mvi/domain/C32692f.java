package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ApplicationPollingInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.root.mvi.domain.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32692f implements dagger.internal.h<C32691e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f203077a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SK0.b> f203078b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f203079c;

    public C32692f(Provider<z> provider, Provider<SK0.b> provider2, Provider<R0> provider3) {
        this.f203077a = provider;
        this.f203078b = provider2;
        this.f203079c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32691e(this.f203077a.get(), this.f203078b.get(), this.f203079c.get());
    }
}
