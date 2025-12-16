package com.avito.android.rating_ui.badge_score;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingBadgeScoreItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<b>> f249968a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l41.g<k>> f249969b;

    public h(Provider<l41.g<b>> provider, Provider<l41.g<k>> provider2) {
        this.f249968a = provider;
        this.f249969b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f249968a.get(), this.f249969b.get());
    }
}
