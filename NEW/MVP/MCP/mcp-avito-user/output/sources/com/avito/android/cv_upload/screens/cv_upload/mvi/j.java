package com.avito.android.cv_upload.screens.cv_upload.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvUploadFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f131780a;

    /* renamed from: b, reason: collision with root package name */
    public final l f131781b;

    /* renamed from: c, reason: collision with root package name */
    public final n f131782c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f131783d;

    public j(g gVar, l lVar, n nVar, Provider provider) {
        this.f131780a = gVar;
        this.f131781b = lVar;
        this.f131782c = nVar;
        this.f131783d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f131780a.get();
        this.f131781b.getClass();
        k kVar = new k();
        m mVar = (m) this.f131782c.get();
        return new i("CvUpload", new Ot.c(false, null, null, null, 15, null), new h(aVar, this.f131783d.get(), mVar, kVar));
    }
}
