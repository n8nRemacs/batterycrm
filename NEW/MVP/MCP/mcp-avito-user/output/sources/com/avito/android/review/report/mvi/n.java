package com.avito.android.review.report.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealReviewsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final h f255427a;

    public n(h hVar) {
        this.f255427a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((g) this.f255427a.get(), null, 2, null);
    }
}
