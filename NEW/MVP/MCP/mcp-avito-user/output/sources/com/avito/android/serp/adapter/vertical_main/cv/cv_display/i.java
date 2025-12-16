package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvDisplayItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f272793a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272794b;

    public i(dagger.internal.f fVar, Provider provider) {
        this.f272793a = fVar;
        this.f272794b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f272794b.get(), dagger.internal.g.b(this.f272793a));
    }
}
