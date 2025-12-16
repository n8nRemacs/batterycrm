package com.avito.android.advert_details_items.price_description_button;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceDescriptionButtonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f85302a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f85302a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85302a.get());
    }
}
