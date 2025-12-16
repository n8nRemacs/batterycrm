package com.avito.android.vas_performance.screens.visual.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: GetVasContextUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f321114a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f321115b;

    public c(Provider<InterfaceC50482a> provider, Provider<R0> provider2) {
        this.f321114a = provider;
        this.f321115b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f321114a.get(), this.f321115b.get());
    }
}
