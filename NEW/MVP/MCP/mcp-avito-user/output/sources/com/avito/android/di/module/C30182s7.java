package com.avito.android.di.module;

import com.avito.android.InterfaceC32896n;
import javax.inject.Provider;

/* compiled from: ScreenGraphiteAnalyticsModule_ProvideScreenTrackingLoggerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.s7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30182s7 implements dagger.internal.h<com.avito.android.analytics.screens.tracker.M> {

    /* renamed from: a, reason: collision with root package name */
    public final C30139o7 f144578a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f144579b;

    public C30182s7(C30139o7 c30139o7, Provider<InterfaceC32896n> provider) {
        this.f144578a = c30139o7;
        this.f144579b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32896n interfaceC32896n = this.f144579b.get();
        this.f144578a.getClass();
        return new com.avito.android.analytics.screens.tracker.M(interfaceC32896n);
    }
}
