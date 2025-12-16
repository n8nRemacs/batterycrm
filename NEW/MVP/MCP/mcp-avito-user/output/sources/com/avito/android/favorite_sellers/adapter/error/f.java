package com.avito.android.favorite_sellers.adapter.error;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: ErrorItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<vC.b>> f155562a;

    public f(Provider<Y1<vC.b>> provider) {
        this.f155562a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f155562a.get());
    }
}
