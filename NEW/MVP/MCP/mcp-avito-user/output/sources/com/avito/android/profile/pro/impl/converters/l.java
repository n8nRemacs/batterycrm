package com.avito.android.profile.pro.impl.converters;

import javax.inject.Provider;

/* compiled from: ProfileProGeoBannerItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E90.a> f222457a;

    public l(Provider<E90.a> provider) {
        this.f222457a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f222457a.get());
    }
}
