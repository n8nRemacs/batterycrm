package com.avito.android.verification.di.form_builder;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationFormBuilderScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.form_builder.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323692a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323693b;

    public g(l lVar, Provider provider) {
        this.f323692a = provider;
        this.f323693b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f323692a).get();
        r rVar = (r) this.f323693b.f393949a;
        f.f323691a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationFormBuilderScreen.f90562d, rVar, "verificationPlatform-formBuilder"));
    }
}
