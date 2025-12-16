package com.avito.android.stories.adapter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WideBannerSerpStoriesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f285072a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.stories.view.j> f285073b;

    public m(Provider<d> provider, Provider<com.avito.android.stories.view.j> provider2) {
        this.f285072a = provider;
        this.f285073b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f285072a.get(), this.f285073b.get());
    }
}
