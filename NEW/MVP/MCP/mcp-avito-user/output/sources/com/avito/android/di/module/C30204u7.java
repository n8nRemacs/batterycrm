package com.avito.android.di.module;

import com.avito.android.analytics.screens.tracker.C28482d;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import javax.inject.Provider;

/* compiled from: ScreenGraphiteAnalyticsModule_ProvidesBaseScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30204u7 implements dagger.internal.h<InterfaceC28481c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30139o7 f144618a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144619b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.I> f144620c;

    public C30204u7(C30139o7 c30139o7, Provider<com.avito.android.util.C> provider, Provider<com.avito.android.analytics.screens.tracker.I> provider2) {
        this.f144618a = c30139o7;
        this.f144619b = provider;
        this.f144620c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f144619b.get();
        com.avito.android.analytics.screens.tracker.I i12 = this.f144620c.get();
        this.f144618a.getClass();
        return new C28482d(c12, i12);
    }
}
