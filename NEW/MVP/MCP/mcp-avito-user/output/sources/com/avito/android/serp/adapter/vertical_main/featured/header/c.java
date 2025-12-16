package com.avito.android.serp.adapter.vertical_main.featured.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeaturedHeaderBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272862a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f272863b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f272864c;

    public c(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f272862a = uVar;
        this.f272863b = provider;
        this.f272864c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f272862a.get(), this.f272863b.get(), dagger.internal.g.b(this.f272864c));
    }
}
