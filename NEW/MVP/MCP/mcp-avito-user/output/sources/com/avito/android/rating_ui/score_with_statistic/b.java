package com.avito.android.rating_ui.score_with_statistic;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingScoreWithStatisticCompactItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f250418a;

    public b(Provider<e> provider) {
        this.f250418a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f250418a.get());
    }
}
