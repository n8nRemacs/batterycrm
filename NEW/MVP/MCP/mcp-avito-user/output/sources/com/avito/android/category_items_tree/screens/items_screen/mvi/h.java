package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Yn.C18303c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryItemsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f116999a;

    /* renamed from: b, reason: collision with root package name */
    public final c f117000b;

    /* renamed from: c, reason: collision with root package name */
    public final u f117001c;

    /* renamed from: d, reason: collision with root package name */
    public final l f117002d;

    /* renamed from: e, reason: collision with root package name */
    public final j f117003e;

    public h(e eVar, c cVar, u uVar, l lVar, j jVar) {
        this.f116999a = eVar;
        this.f117000b = cVar;
        this.f117001c = uVar;
        this.f117002d = lVar;
        this.f117003e = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f116999a.get();
        b bVar = (b) this.f117000b.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f117001c.get();
        this.f117002d.getClass();
        k kVar = new k();
        this.f117003e.getClass();
        i iVar = new i();
        C18303c.f19653f.getClass();
        return new g("CategoryItemsFeature", C18303c.f19654g, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
