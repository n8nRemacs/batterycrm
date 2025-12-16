package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemBottomSheetPerformanceTrackerModule_ProvideIacProblemTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f168893a;

    /* renamed from: b, reason: collision with root package name */
    public final l f168894b;

    public f(l lVar, Provider provider) {
        this.f168893a = provider;
        this.f168894b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f168893a).get();
        r rVar = (r) this.f168894b.f393949a;
        int i12 = d.f168892a;
        return interfaceC28481c.a(new C28478k(IacProblemScreen.f168874d, rVar, null, 4, null));
    }
}
