package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletSecuritySettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f328841a;

    /* renamed from: b, reason: collision with root package name */
    public final h f328842b;

    /* renamed from: c, reason: collision with root package name */
    public final q f328843c;

    /* renamed from: d, reason: collision with root package name */
    public final s f328844d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f328845e;

    public m(j jVar, h hVar, q qVar, s sVar, Provider provider) {
        this.f328841a = jVar;
        this.f328842b = hVar;
        this.f328843c = qVar;
        this.f328844d = sVar;
        this.f328845e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f328841a.get();
        a aVar = (a) this.f328842b.get();
        this.f328843c.getClass();
        p pVar = new p();
        r rVar = (r) this.f328844d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f328845e.get();
        WalletSecuritySettingsState.f328860f.getClass();
        return new l("WalletSecuritySettings", WalletSecuritySettingsState.f328861g, new k(iVar, aVar, screenPerformanceTracker, rVar, pVar));
    }
}
