package com.avito.android.rating_form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f248787a;

    /* renamed from: b, reason: collision with root package name */
    public final e f248788b;

    /* renamed from: c, reason: collision with root package name */
    public final m f248789c;

    /* renamed from: d, reason: collision with root package name */
    public final o f248790d;

    /* renamed from: e, reason: collision with root package name */
    public final u f248791e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f248792f;

    public k(h hVar, e eVar, m mVar, o oVar, u uVar, dagger.internal.l lVar) {
        this.f248787a = hVar;
        this.f248788b = eVar;
        this.f248789c = mVar;
        this.f248790d = oVar;
        this.f248791e = uVar;
        this.f248792f = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f248787a.get();
        d dVar = (d) this.f248788b.get();
        l lVar = (l) this.f248789c.get();
        n nVar = (n) this.f248790d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f248791e.get();
        RatingFormArguments ratingFormArguments = (RatingFormArguments) this.f248792f.f393949a;
        RatingFormState.f248743o.getClass();
        return new j("RatingForm", new RatingFormState(ratingFormArguments, -1, null, null, null, null, null, null, null, false, false, RatingFormState.RatingFormStepProgress.Empty.f248757b, null), new i(fVar, dVar, screenPerformanceTracker, nVar, lVar));
    }
}
