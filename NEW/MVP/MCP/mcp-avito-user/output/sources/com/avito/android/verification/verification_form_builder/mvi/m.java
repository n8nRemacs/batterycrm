package com.avito.android.verification.verification_form_builder.mvi;

import TM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f325468a;

    /* renamed from: b, reason: collision with root package name */
    public final h f325469b;

    /* renamed from: c, reason: collision with root package name */
    public final o f325470c;

    /* renamed from: d, reason: collision with root package name */
    public final q f325471d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325472e;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider) {
        this.f325468a = jVar;
        this.f325469b = hVar;
        this.f325470c = oVar;
        this.f325471d = qVar;
        this.f325472e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f325468a.get();
        g gVar = (g) this.f325469b.get();
        this.f325470c.getClass();
        n nVar = new n();
        p pVar = (p) this.f325471d.get();
        return new l("VerificationFormBuilder", c.C1067c.f15625b, new k(iVar, gVar, this.f325472e.get(), pVar, nVar));
    }
}
