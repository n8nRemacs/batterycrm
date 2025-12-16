package com.avito.android.verification.di.status_list;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationStatusListScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.status_list.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusListTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323859a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323860b;

    public g(l lVar, Provider provider) {
        this.f323859a = provider;
        this.f323860b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f323859a).get();
        r rVar = (r) this.f323860b.f393949a;
        f.f323858a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationStatusListScreen.f90565d, rVar, "verificationPlatform-statusList"));
    }
}
