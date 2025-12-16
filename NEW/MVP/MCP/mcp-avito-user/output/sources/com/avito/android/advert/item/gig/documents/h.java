package com.avito.android.advert.item.gig.documents;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigPersonalInfoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75734a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75735b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f75736c;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC28373a> provider2, Provider<E> provider3) {
        this.f75734a = provider;
        this.f75735b = provider2;
        this.f75736c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f75734a.get(), this.f75735b.get(), this.f75736c.get());
    }
}
