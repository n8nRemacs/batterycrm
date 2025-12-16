package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerRecallActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f119983a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f119983a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f119983a.get());
    }
}
