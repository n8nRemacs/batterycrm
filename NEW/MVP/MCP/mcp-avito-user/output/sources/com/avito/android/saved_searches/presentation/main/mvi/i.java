package com.avito.android.saved_searches.presentation.main.mvi;

import com.avito.android.account.E;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchMainActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f258691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.saved_searches.presentation.core.a> f258692b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I30.d> f258693c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<TV.c> f258694d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.libs.saved_searches.domain.a> f258695e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.saved_searches_core.b> f258696f;

    public i(Provider<E> provider, Provider<com.avito.android.saved_searches.presentation.core.a> provider2, Provider<I30.d> provider3, Provider<TV.c> provider4, Provider<com.avito.android.libs.saved_searches.domain.a> provider5, Provider<com.avito.android.saved_searches_core.b> provider6) {
        this.f258691a = provider;
        this.f258692b = provider2;
        this.f258693c = provider3;
        this.f258694d = provider4;
        this.f258695e = provider5;
        this.f258696f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f258691a.get(), this.f258692b.get(), this.f258693c.get(), this.f258694d.get(), this.f258695e.get(), this.f258696f.get());
    }
}
