package com.avito.android.wallet.page.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPageFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f328161a;

    /* renamed from: b, reason: collision with root package name */
    public final g f328162b;

    /* renamed from: c, reason: collision with root package name */
    public final n f328163c;

    /* renamed from: d, reason: collision with root package name */
    public final p f328164d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f328165e;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider) {
        this.f328161a = iVar;
        this.f328162b = gVar;
        this.f328163c = nVar;
        this.f328164d = pVar;
        this.f328165e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f328161a.get();
        a aVar = (a) this.f328162b.get();
        this.f328163c.getClass();
        m mVar = new m();
        o oVar = (o) this.f328164d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f328165e.get();
        WalletPageState.f328187f.getClass();
        return new k("WalletPage", WalletPageState.f328188g, new j(hVar, aVar, screenPerformanceTracker, oVar, mVar));
    }
}
