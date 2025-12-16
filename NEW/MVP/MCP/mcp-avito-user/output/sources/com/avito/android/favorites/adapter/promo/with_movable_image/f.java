package com.avito.android.favorites.adapter.promo.with_movable_image;

import com.avito.android.favorites.adapter.promo.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoItemWithMovableImagePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f156705a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.a> f156706b;

    public f(Provider<p> provider, Provider<com.avito.android.favorites.adapter.promo.a> provider2) {
        this.f156705a = provider;
        this.f156706b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f156705a.get(), this.f156706b.get());
    }
}
