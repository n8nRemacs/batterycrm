package com.avito.android.advert_details_items.search_suggests;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: AdvertDetailsSearchSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f85525a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f85526b;

    public f(Provider<com.avito.android.advert_core.analytics.a> provider, Provider<l<SimpleTestGroupWithNone>> provider2) {
        this.f85525a = provider;
        this.f85526b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85525a.get(), this.f85526b.get());
    }
}
