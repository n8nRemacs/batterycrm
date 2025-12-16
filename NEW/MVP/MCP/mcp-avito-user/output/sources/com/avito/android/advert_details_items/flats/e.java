package com.avito.android.advert_details_items.flats;

import com.avito.android.advert_core.advert.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFlatsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f84722a;

    public e(Provider<k> provider) {
        this.f84722a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f84722a.get());
    }
}
