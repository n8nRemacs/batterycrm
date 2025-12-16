package com.avito.android.verification.verification_confirm_requisites.mvi;

import LM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmRequisitesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f325008a;

    /* renamed from: b, reason: collision with root package name */
    public final g f325009b;

    /* renamed from: c, reason: collision with root package name */
    public final n f325010c;

    /* renamed from: d, reason: collision with root package name */
    public final p f325011d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325012e;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider) {
        this.f325008a = iVar;
        this.f325009b = gVar;
        this.f325010c = nVar;
        this.f325011d = pVar;
        this.f325012e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f325008a.get();
        a aVar = (a) this.f325009b.get();
        this.f325010c.getClass();
        m mVar = new m();
        o oVar = (o) this.f325011d.get();
        return new k("Verification_confirm_requisites_mvi", c.C0613c.f9938b, new j(hVar, aVar, this.f325012e.get(), oVar, mVar));
    }
}
