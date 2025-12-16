package com.avito.android.advert_collection_list;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZC.f> f82164a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<O7.a> f82165b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f82166c;

    public h(Provider<ZC.f> provider, Provider<O7.a> provider2, Provider<R0> provider3) {
        this.f82164a = provider;
        this.f82165b = provider2;
        this.f82166c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.a(dagger.internal.w.a(this.f82164a)), this.f82165b.get(), this.f82166c.get());
    }
}
