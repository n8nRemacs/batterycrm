package com.avito.android.iac_problems.impl_module.miui_permission.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_problems.impl_module.miui_permission.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacMiuiPermissionBottomSheetPerformanceTracker_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f168800a;

    /* renamed from: b, reason: collision with root package name */
    public final l f168801b;

    public f(l lVar, Provider provider) {
        this.f168800a = provider;
        this.f168801b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C4998a) this.f168800a).get();
        r rVar = (r) this.f168801b.f393949a;
        int i12 = d.f168799a;
        return interfaceC28481c.a(new C28478k(MainStartOnboardingMiuiProblemSheetScreen.f168795d, rVar, null, 4, null));
    }
}
