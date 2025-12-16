package com.avito.android.advert.item.service_booking;

import com.avito.android.advert.item.S;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<S> f79836a;

    /* renamed from: b, reason: collision with root package name */
    public final u f79837b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<T6.a> f79838c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f79836a = provider;
        this.f79837b = uVar;
        this.f79838c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f79836a.get(), (m) this.f79837b.get(), this.f79838c.get());
    }
}
