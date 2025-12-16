package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvCreationItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f272761a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272762b;

    public g(dagger.internal.f fVar, Provider provider) {
        this.f272761a = fVar;
        this.f272762b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f272762b.get(), dagger.internal.g.b(this.f272761a));
    }
}
