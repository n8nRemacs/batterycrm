package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f246762a;

    /* renamed from: b, reason: collision with root package name */
    public final e f246763b;

    /* renamed from: c, reason: collision with root package name */
    public final l f246764c;

    /* renamed from: d, reason: collision with root package name */
    public final n f246765d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f246766e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f246762a = gVar;
        this.f246763b = eVar;
        this.f246764c = lVar;
        this.f246765d = nVar;
        this.f246766e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f246762a.get();
        d dVar = (d) this.f246763b.get();
        k kVar = (k) this.f246764c.get();
        this.f246765d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f246766e.get();
        RatingAddAnswerPhotoState.f246736e.getClass();
        return new i("RatingAddAnswerPhoto", RatingAddAnswerPhotoState.f246737f, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
