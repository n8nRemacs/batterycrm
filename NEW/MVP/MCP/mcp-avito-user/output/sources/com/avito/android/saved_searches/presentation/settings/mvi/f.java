package com.avito.android.saved_searches.presentation.settings.mvi;

import com.avito.android.analytics.screens.SavedSearchNotificationSettingsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f258780a;

    /* renamed from: b, reason: collision with root package name */
    public final h f258781b;

    /* renamed from: c, reason: collision with root package name */
    public final j f258782c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f258783d;

    public f(c cVar, h hVar, j jVar, Provider provider) {
        this.f258780a = cVar;
        this.f258781b = hVar;
        this.f258782c = jVar;
        this.f258783d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f258780a.getClass();
        b bVar = new b();
        this.f258781b.getClass();
        g gVar = new g();
        i iVar = (i) this.f258782c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f258783d.get();
        SavedSearchSettingsState.f258771g.getClass();
        return new e(SavedSearchNotificationSettingsScreen.f90468d.f90471b, SavedSearchSettingsState.f258772h, new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
