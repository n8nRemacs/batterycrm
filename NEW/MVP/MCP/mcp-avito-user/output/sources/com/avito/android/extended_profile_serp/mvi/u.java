package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final r f153058a;

    /* renamed from: b, reason: collision with root package name */
    public final p f153059b;

    /* renamed from: c, reason: collision with root package name */
    public final w f153060c;

    /* renamed from: d, reason: collision with root package name */
    public final y f153061d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f153062e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f153063f;

    public u(r rVar, p pVar, w wVar, y yVar, Provider provider, dagger.internal.l lVar) {
        this.f153058a = rVar;
        this.f153059b = pVar;
        this.f153060c = wVar;
        this.f153061d = yVar;
        this.f153062e = provider;
        this.f153063f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f153058a.get();
        n nVar = (n) this.f153059b.get();
        v vVar = (v) this.f153060c.get();
        x xVar = (x) this.f153061d.get();
        return new t("ExtendedProfileSerp", new ExtendedProfileSerpState(null, 0, ((ExtendedProfileSerpConfig) this.f153063f.f393949a).f152444d, null, null, 0, 0, null, false, false, false, 0, null, null, null, false, null, null, null, null, 1048571, null), new s(qVar, nVar, this.f153062e.get(), xVar, vVar));
    }
}
