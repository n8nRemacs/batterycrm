package com.avito.android.rating_form;

import javax.inject.Provider;

/* compiled from: RatingFormStorageProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.photo_picker.r> f247881a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.rating_form.features.c f247882b;

    public A(Provider provider, com.avito.android.rating_form.features.c cVar) {
        this.f247881a = provider;
        this.f247882b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f247881a.get(), (com.avito.android.rating_form.features.a) this.f247882b.get());
    }
}
