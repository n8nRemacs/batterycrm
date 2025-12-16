package com.avito.android.stories.adapter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpStoriesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f285048a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.stories.view.j> f285049b;

    public b(Provider<d> provider, Provider<com.avito.android.stories.view.j> provider2) {
        this.f285048a = provider;
        this.f285049b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f285048a.get(), this.f285049b.get());
    }
}
