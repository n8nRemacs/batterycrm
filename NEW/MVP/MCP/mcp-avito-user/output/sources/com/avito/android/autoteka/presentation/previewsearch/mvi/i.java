package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPreviewSearchFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final g f97653a;

    /* renamed from: b, reason: collision with root package name */
    public final k f97654b;

    /* renamed from: c, reason: collision with root package name */
    public final m f97655c;

    /* renamed from: d, reason: collision with root package name */
    public final u f97656d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f97657e;

    public i(g gVar, k kVar, m mVar, u uVar, dagger.internal.l lVar) {
        this.f97653a = gVar;
        this.f97654b = kVar;
        this.f97655c = mVar;
        this.f97656d = uVar;
        this.f97657e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((a) this.f97653a.get(), (j) this.f97654b.get(), (l) this.f97655c.get(), (ScreenPerformanceTracker) this.f97656d.get(), (AutotekaPreviewSearchDetails) this.f97657e.f393949a);
    }
}
