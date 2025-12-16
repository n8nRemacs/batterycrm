package com.avito.android.favorites.adapter.advert;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.favorites.adapter.advert.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d.a> f156462a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.h<SimpleTestGroup>> f156463b;

    public q(Provider<d.a> provider, Provider<u3.h<SimpleTestGroup>> provider2) {
        this.f156462a = provider;
        this.f156463b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f156462a.get(), this.f156463b.get());
    }
}
