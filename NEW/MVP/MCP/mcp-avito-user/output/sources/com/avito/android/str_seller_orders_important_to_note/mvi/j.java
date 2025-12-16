package com.avito.android.str_seller_orders_important_to_note.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerImportantToNoteFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f291412a;

    /* renamed from: b, reason: collision with root package name */
    public final e f291413b;

    /* renamed from: c, reason: collision with root package name */
    public final l f291414c;

    /* renamed from: d, reason: collision with root package name */
    public final n f291415d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f291416e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f291412a = gVar;
        this.f291413b = eVar;
        this.f291414c = lVar;
        this.f291415d = nVar;
        this.f291416e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f291412a.get();
        a aVar = (a) this.f291413b.get();
        this.f291414c.getClass();
        k kVar = new k();
        this.f291415d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f291416e.get();
        aA0.c.f20797f.getClass();
        return new i("StrSellerImportantToNote", aA0.c.f20798g, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
