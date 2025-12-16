package com.avito.android.vas_performance.screens.visual.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: GetVisualVasUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f321123a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f321124b;

    public f(Provider<InterfaceC50482a> provider, Provider<R0> provider2) {
        this.f321123a = provider;
        this.f321124b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f321123a.get(), this.f321124b.get());
    }
}
