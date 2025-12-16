package com.avito.android.serp.adapter.skeleton;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertItemGridSkeletonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f272234a;

    public b(Provider<g> provider) {
        this.f272234a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f272234a.get());
    }
}
