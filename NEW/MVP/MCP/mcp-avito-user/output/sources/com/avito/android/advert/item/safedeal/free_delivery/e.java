package com.avito.android.advert.item.safedeal.free_delivery;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FreeDeliveryInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z9.a> f78807a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78808b;

    public e(Provider<Z9.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f78807a = provider;
        this.f78808b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f78808b.get(), g.b(this.f78807a));
    }
}
