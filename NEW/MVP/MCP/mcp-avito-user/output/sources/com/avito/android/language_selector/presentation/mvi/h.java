package com.avito.android.language_selector.presentation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LanguageSelectorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f174992a;

    /* renamed from: b, reason: collision with root package name */
    public final c f174993b;

    /* renamed from: c, reason: collision with root package name */
    public final j f174994c;

    /* renamed from: d, reason: collision with root package name */
    public final l f174995d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f174996e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f174992a = eVar;
        this.f174993b = cVar;
        this.f174994c = jVar;
        this.f174995d = lVar;
        this.f174996e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f174992a.get();
        b bVar = (b) this.f174993b.get();
        this.f174994c.getClass();
        i iVar = new i();
        k kVar = (k) this.f174995d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f174996e.get();
        eR.d.f395192e.getClass();
        return new g("LanguageSelector", eR.d.f395193f, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
