package com.avito.android.advert.item.advertnumber.global;

import com.avito.android.advert.item.advertnumber.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAdvertNumberGlobalBrandBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f72730a;

    public b(Provider<c> provider) {
        this.f72730a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f72730a.get());
    }
}
