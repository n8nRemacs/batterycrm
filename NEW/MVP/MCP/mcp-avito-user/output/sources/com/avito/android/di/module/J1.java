package com.avito.android.di.module;

import com.avito.android.ab_tests.configs.DegradeSomeScreensTestGroup;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.analytics.screens.ExtendedProfileScreen;
import com.avito.android.analytics.screens.HomeScreen;
import kotlin.collections.C42745f0;

/* compiled from: AvitoDegradeScreenModule_ProvideDegradeScreenStepsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J1 implements dagger.internal.h<com.avito.android.analytics.screens.tracker.degrade.a> {

    /* renamed from: a, reason: collision with root package name */
    public final t3.U f144014a;

    public J1(t3.U u12) {
        this.f144014a = u12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DegradeSomeScreensTestGroup degradeSomeScreensTestGroup = (DegradeSomeScreensTestGroup) this.f144014a.get();
        I1.f144001a.getClass();
        return new com.avito.android.analytics.screens.tracker.degrade.a(C42745f0.U(HomeScreen.f90372d, AdvertScreen.f90278d, ExtendedProfileScreen.f90351d), degradeSomeScreensTestGroup);
    }
}
