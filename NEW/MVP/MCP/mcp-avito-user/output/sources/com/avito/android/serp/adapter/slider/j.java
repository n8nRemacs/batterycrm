package com.avito.android.serp.adapter.slider;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SliderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f272274a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272275b;

    public j(dagger.internal.f fVar, Provider provider) {
        this.f272274a = fVar;
        this.f272275b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f272275b.get(), dagger.internal.g.b(this.f272274a));
    }
}
