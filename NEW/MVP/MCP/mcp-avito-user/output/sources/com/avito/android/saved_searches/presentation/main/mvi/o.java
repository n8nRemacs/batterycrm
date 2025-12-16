package com.avito.android.saved_searches.presentation.main.mvi;

import com.avito.android.analytics.screens.SavedSearchMainScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainViewState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchMainFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final i f258713a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258714b;

    /* renamed from: c, reason: collision with root package name */
    public final q f258715c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f258716d;

    /* renamed from: e, reason: collision with root package name */
    public final s f258717e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f258718f;

    public o(i iVar, l lVar, q qVar, Provider provider, s sVar, dagger.internal.l lVar2) {
        this.f258713a = iVar;
        this.f258714b = lVar;
        this.f258715c = qVar;
        this.f258716d = provider;
        this.f258717e = sVar;
        this.f258718f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f258713a.get();
        k kVar = (k) this.f258714b.get();
        this.f258715c.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f258716d.get();
        r rVar = (r) this.f258717e.get();
        SavedSearchParams savedSearchParams = (SavedSearchParams) this.f258718f.f393949a;
        SavedSearchMainState.f258661j.getClass();
        return new n(SavedSearchMainScreen.f90467d.f90471b, new SavedSearchMainState(null, savedSearchParams, false, false, false, null, false, SavedSearchMainViewState.Initial.f258678b), new m(gVar, kVar, pVar, screenPerformanceTracker, rVar));
    }
}
