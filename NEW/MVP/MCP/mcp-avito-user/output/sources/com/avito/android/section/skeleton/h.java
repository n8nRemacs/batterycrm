package com.avito.android.section.skeleton;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionSkeletonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f264874a;

    public h(Provider<a> provider) {
        this.f264874a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f264874a.get());
    }
}
