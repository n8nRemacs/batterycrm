package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationPopupFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f212277a;

    /* renamed from: b, reason: collision with root package name */
    public final j f212278b;

    /* renamed from: c, reason: collision with root package name */
    public final l f212279c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212280d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f212281e;

    public h(e eVar, j jVar, l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f212277a = eVar;
        this.f212278b = jVar;
        this.f212279c = lVar;
        this.f212280d = provider;
        this.f212281e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f212277a.get();
        this.f212278b.getClass();
        i iVar = new i();
        this.f212279c.getClass();
        k kVar = new k();
        return new g("VerificationPopup", new W50.c(((VerificationPopupArguments) this.f212281e.f393949a).f212206h), new f(cVar, this.f212280d.get(), kVar, iVar));
    }
}
