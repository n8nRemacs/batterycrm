package com.avito.android.safedeal.universal_delivery_type.shipping_competition;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256817a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.h f256818b;

    public g(Provider provider, com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.h hVar) {
        this.f256817a = provider;
        this.f256818b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f256817a.get(), (com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.g) this.f256818b.get());
    }
}
