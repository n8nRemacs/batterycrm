package com.avito.android.stories;

import javax.inject.Provider;

/* compiled from: StoriesItemListener_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f285294a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f285295b;

    public n(dagger.internal.f fVar, Provider provider) {
        this.f285294a = fVar;
        this.f285295b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f285295b.get(), dagger.internal.g.a(dagger.internal.w.a(this.f285294a)));
    }
}
