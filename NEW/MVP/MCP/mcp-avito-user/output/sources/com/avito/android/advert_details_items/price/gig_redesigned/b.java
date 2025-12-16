package com.avito.android.advert_details_items.price.gig_redesigned;

import com.avito.android.advert_details_items.price.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceGigRedesignedBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f85183a;

    public b(Provider<c> provider) {
        this.f85183a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f85183a.get());
    }
}
