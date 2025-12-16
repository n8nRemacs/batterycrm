package com.avito.android.favorites.adapter.promo.with_icon;

import com.avito.android.favorites.adapter.promo.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoItemWithIconPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.groupable_item.b> f156691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<p> f156692b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.a> f156693c;

    public f(Provider<com.avito.android.lib.util.groupable_item.b> provider, Provider<p> provider2, Provider<com.avito.android.favorites.adapter.promo.a> provider3) {
        this.f156691a = provider;
        this.f156692b = provider2;
        this.f156693c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.util.groupable_item.b bVar = this.f156691a.get();
        return new e(this.f156693c.get(), this.f156692b.get(), bVar);
    }
}
