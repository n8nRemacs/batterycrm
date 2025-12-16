package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPinCreationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f328608a;

    /* renamed from: b, reason: collision with root package name */
    public final j f328609b;

    /* renamed from: c, reason: collision with root package name */
    public final q f328610c;

    /* renamed from: d, reason: collision with root package name */
    public final s f328611d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f328612e;

    public o(l lVar, j jVar, q qVar, s sVar, Provider provider) {
        this.f328608a = lVar;
        this.f328609b = jVar;
        this.f328610c = qVar;
        this.f328611d = sVar;
        this.f328612e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f328608a.get();
        a aVar = (a) this.f328609b.get();
        this.f328610c.getClass();
        p pVar = new p();
        r rVar = (r) this.f328611d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f328612e.get();
        WalletPinCreationState.f328641k.getClass();
        return new n("WalletPinCreation", WalletPinCreationState.f328642l, new m(kVar, aVar, screenPerformanceTracker, rVar, pVar));
    }
}
