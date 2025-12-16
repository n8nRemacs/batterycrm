package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import javax.inject.Provider;

/* compiled from: AdvertSellerStatusInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f85594a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f85595b;

    public S(Provider<InterfaceC40383a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f85594a = provider;
        this.f85595b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f85595b.get(), dagger.internal.g.b(this.f85594a));
    }
}
