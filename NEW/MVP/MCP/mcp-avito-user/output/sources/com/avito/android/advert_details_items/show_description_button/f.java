package com.avito.android.advert_details_items.show_description_button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShowDescriptionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f85698a;

    public f(Provider<i> provider) {
        this.f85698a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85698a.get());
    }
}
