package com.avito.android.advert_details_items.price.services_redesigned;

import com.avito.android.advert_details_items.price.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceServicesRedesignedBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f85279a;

    public b(Provider<c> provider) {
        this.f85279a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f85279a.get());
    }
}
