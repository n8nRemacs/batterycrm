package com.avito.android.advert.item.leadauto.analytics;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoNewCarsLeadFormFilter_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f77267a;

    public b(Provider<com.avito.android.advert_core.analytics.a> provider) {
        this.f77267a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77267a.get());
    }
}
