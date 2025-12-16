package com.avito.android.advert.item.safedeal.services;

import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealServicesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79021a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f79022b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.d<MyAdvertSafeDeal>> f79023c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f79021a = uVar;
        this.f79022b = provider;
        this.f79023c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((q) this.f79021a.get(), this.f79022b.get(), this.f79023c.get());
    }
}
