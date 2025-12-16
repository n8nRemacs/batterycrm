package com.avito.android.verification.di.input_bill_amount;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationInputBillAmountScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.input_bill_amount.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputBillAmountTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323747a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323748b;

    public e(l lVar, Provider provider) {
        this.f323747a = provider;
        this.f323748b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.d) this.f323747a).get();
        r rVar = (r) this.f323748b.f393949a;
        d.f323746a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationInputBillAmountScreen.f90563d, rVar, "verificationPlatform-inputBillAmount"));
    }
}
