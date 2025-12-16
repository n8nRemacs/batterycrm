package com.avito.android.work_profile.profile.applies.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.JobAppliesToVacancyScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.work_profile.profile.applies.di.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliesToVacancyModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final c f330834a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f330835b;

    /* renamed from: c, reason: collision with root package name */
    public final l f330836c;

    public f(c cVar, Provider provider, l lVar) {
        this.f330834a = cVar;
        this.f330835b = provider;
        this.f330836c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((i.b.e) this.f330835b).get();
        r rVar = (r) this.f330836c.f393949a;
        this.f330834a.getClass();
        return interfaceC28481c.a(new C28478k(JobAppliesToVacancyScreen.f90386d, rVar, "jobAppliesToVacancy"));
    }
}
