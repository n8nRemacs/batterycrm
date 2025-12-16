package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedMicRequestScreenFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final j f166800a;

    /* renamed from: b, reason: collision with root package name */
    public final h f166801b;

    /* renamed from: c, reason: collision with root package name */
    public final l f166802c;

    /* renamed from: d, reason: collision with root package name */
    public final q f166803d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f166804e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f166805f;

    public o(j jVar, h hVar, l lVar, q qVar, Provider provider, dagger.internal.l lVar2) {
        this.f166800a = jVar;
        this.f166801b = hVar;
        this.f166802c = lVar;
        this.f166803d = qVar;
        this.f166804e = provider;
        this.f166805f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f166800a.get();
        g gVar = (g) this.f166801b.get();
        this.f166802c.getClass();
        k kVar = new k();
        p pVar = (p) this.f166803d.get();
        return new n("IacFinishedMicRequestScreen", new IacFinishedMicRequestScreenState.Initial((IacFinishedMicRequestScreenArgument) this.f166805f.f393949a), new m(iVar, gVar, this.f166804e.get(), pVar, kVar));
    }
}
