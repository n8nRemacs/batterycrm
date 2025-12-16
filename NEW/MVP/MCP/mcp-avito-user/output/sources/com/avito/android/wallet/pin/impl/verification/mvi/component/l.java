package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import javax.inject.Provider;

/* compiled from: WalletPinVerificationFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f329174a;

    /* renamed from: b, reason: collision with root package name */
    public final g f329175b;

    /* renamed from: c, reason: collision with root package name */
    public final y f329176c;

    /* renamed from: d, reason: collision with root package name */
    public final A f329177d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f329178e;

    public l(i iVar, g gVar, y yVar, A a12, Provider provider) {
        this.f329174a = iVar;
        this.f329175b = gVar;
        this.f329176c = yVar;
        this.f329177d = a12;
        this.f329178e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f329174a.get();
        C36145a c36145a = (C36145a) this.f329175b.get();
        this.f329176c.getClass();
        x xVar = new x();
        z zVar = (z) this.f329177d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f329178e.get();
        WalletPinVerificationState.f329293j.getClass();
        return new k("WalletPinVerification", WalletPinVerificationState.f329294k, new j(hVar, c36145a, screenPerformanceTracker, zVar, xVar));
    }
}
