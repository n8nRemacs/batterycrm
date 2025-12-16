package com.avito.android.advert.item.other_categories;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OtherCategoriesItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77849a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f77849a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f77849a.get());
    }
}
