package vL0;

import com.avito.android.analytics.screens.AppliedServicesScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliedServicesAnalyticsModule_ProvideScreenTrackerFactory$_avito_vas_performance_implFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f440695a;

    /* renamed from: b, reason: collision with root package name */
    public final l f440696b;

    public b(l lVar, Provider provider) {
        this.f440695a = provider;
        this.f440696b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f440695a.get();
        r rVar = (r) this.f440696b.f393949a;
        int i12 = C49230a.f440694a;
        AppliedServicesScreen appliedServicesScreen = AppliedServicesScreen.f90283d;
        appliedServicesScreen.getClass();
        return interfaceC28481c.a(new C28478k(appliedServicesScreen, rVar, AppliedServicesScreen.f90284e));
    }
}
