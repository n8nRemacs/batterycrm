package com.avito.android.edit_seller_type.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditSellerTypeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_seller_type.interactor.c f146777a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f146778b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f146779c;

    public d(com.avito.android.edit_seller_type.interactor.c cVar, Provider provider, Provider provider2) {
        this.f146777a = cVar;
        this.f146778b = provider;
        this.f146779c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.edit_seller_type.interactor.a) this.f146777a.get(), this.f146778b.get(), this.f146779c.get());
    }
}
