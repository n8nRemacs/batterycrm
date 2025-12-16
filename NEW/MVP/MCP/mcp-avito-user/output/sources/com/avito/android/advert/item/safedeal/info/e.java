package com.avito.android.advert.item.safedeal.info;

import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealInfoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f78882a;

    public e(Provider<InterfaceC28173a> provider) {
        this.f78882a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f78882a.get());
    }
}
