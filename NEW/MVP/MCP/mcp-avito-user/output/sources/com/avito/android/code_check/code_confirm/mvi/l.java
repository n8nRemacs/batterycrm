package com.avito.android.code_check.code_confirm.mvi;

import Jo.C14226c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeConfirmFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f118766a;

    /* renamed from: b, reason: collision with root package name */
    public final n f118767b;

    /* renamed from: c, reason: collision with root package name */
    public final p f118768c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f118769d;

    /* renamed from: e, reason: collision with root package name */
    public final i f118770e;

    public l(g gVar, n nVar, p pVar, Provider provider, i iVar) {
        this.f118766a = gVar;
        this.f118767b = nVar;
        this.f118768c = pVar;
        this.f118769d = provider;
        this.f118770e = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f118766a.get();
        this.f118767b.getClass();
        m mVar = new m();
        this.f118768c.getClass();
        o oVar = new o();
        return new k("CodeConfirm", new C14226c(null, false, 3, null), new j(eVar, this.f118769d.get(), oVar, mVar, (h) this.f118770e.get()));
    }
}
