package com.avito.android.vas_performance.screens.visual_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import eL0.InterfaceC40020a;
import javax.inject.Provider;

/* compiled from: SetVisualVasV2AutoprolongUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f321241a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40020a> f321242b;

    public f(Provider<R0> provider, Provider<InterfaceC40020a> provider2) {
        this.f321241a = provider;
        this.f321242b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f321241a.get(), this.f321242b.get());
    }
}
