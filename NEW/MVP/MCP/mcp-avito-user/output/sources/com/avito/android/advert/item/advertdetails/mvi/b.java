package com.avito.android.advert.item.advertdetails.mvi;

import com.avito.android.advert.item.realty_quiz_banner.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f72705a;

    public b(Provider<k> provider) {
        this.f72705a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f72705a.get());
    }
}
