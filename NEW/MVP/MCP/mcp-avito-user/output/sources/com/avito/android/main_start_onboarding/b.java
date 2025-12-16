package com.avito.android.main_start_onboarding;

import JX.i;
import JX.k;
import JX.m;
import JX.o;
import JX.q;
import JX.s;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MainStartOnboardingChainInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<MainStartOnboardingChainInteractorImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final JX.c f184227a;

    /* renamed from: b, reason: collision with root package name */
    public final k f184228b;

    /* renamed from: c, reason: collision with root package name */
    public final o f184229c;

    /* renamed from: d, reason: collision with root package name */
    public final JX.g f184230d;

    /* renamed from: e, reason: collision with root package name */
    public final s f184231e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f184232f;

    public b(JX.c cVar, k kVar, o oVar, JX.g gVar, s sVar, dagger.internal.f fVar) {
        this.f184227a = cVar;
        this.f184228b = kVar;
        this.f184229c = oVar;
        this.f184230d = gVar;
        this.f184231e = sVar;
        this.f184232f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MainStartOnboardingChainInteractorImpl((JX.a) this.f184227a.get(), (i) this.f184228b.get(), (m) this.f184229c.get(), (JX.e) this.f184230d.get(), (q) this.f184231e.get(), (InterfaceC28373a) this.f184232f.get());
    }
}
