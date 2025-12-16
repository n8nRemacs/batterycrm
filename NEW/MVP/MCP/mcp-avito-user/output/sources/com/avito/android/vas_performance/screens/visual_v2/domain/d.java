package com.avito.android.vas_performance.screens.visual_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wL0.InterfaceC49533a;

/* compiled from: GetVisualVasV2UseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49533a> f321228a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f321229b;

    public d(Provider<InterfaceC49533a> provider, Provider<R0> provider2) {
        this.f321228a = provider;
        this.f321229b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f321228a.get(), this.f321229b.get());
    }
}
