package com.avito.android.advert.item.hotel.hotel_offer;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelOfferLoaderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f76185a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f76186b;

    /* renamed from: c, reason: collision with root package name */
    public final u f76187c;

    public l(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f76185a = lVar;
        this.f76186b = provider;
        this.f76187c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((String) this.f76185a.f393949a, this.f76186b.get(), (e) this.f76187c.get());
    }
}
