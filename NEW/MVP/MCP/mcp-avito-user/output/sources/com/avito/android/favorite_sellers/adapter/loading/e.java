package com.avito.android.favorite_sellers.adapter.loading;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: LoadingItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<vC.b>> f155581a;

    public e(Provider<Y1<vC.b>> provider) {
        this.f155581a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f155581a.get());
    }
}
