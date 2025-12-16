package com.avito.android.rating.details.answer.text.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerTextFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f246885a;

    /* renamed from: b, reason: collision with root package name */
    public final b f246886b;

    /* renamed from: c, reason: collision with root package name */
    public final i f246887c;

    /* renamed from: d, reason: collision with root package name */
    public final k f246888d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<RatingAddAnswerTextValidationInteractor> f246889e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f246890f;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider, Provider provider2) {
        this.f246885a = dVar;
        this.f246886b = bVar;
        this.f246887c = iVar;
        this.f246888d = kVar;
        this.f246889e = provider;
        this.f246890f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f246885a.get();
        a aVar = (a) this.f246886b.get();
        this.f246887c.getClass();
        h hVar = new h();
        this.f246888d.getClass();
        j jVar = new j();
        return new f("RatingAddAnswerText", new RatingAddAnswerTextState("", this.f246889e.get().a("", false)), new e(cVar, aVar, this.f246890f.get(), jVar, hVar));
    }
}
