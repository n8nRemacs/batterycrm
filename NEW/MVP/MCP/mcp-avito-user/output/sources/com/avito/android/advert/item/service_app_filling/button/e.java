package com.avito.android.advert.item.service_app_filling.button;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertServiceAppFillingButtonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.service_app_filling.a> f79792a;

    public e(Provider<com.avito.android.advert.item.service_app_filling.a> provider) {
        this.f79792a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f79792a.get());
    }
}
