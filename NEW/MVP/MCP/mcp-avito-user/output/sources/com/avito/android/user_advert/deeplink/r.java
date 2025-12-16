package com.avito.android.user_advert.deeplink;

import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MyAdvertDeletionLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.r f310757a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310758b;

    public r(com.avito.android.user_advert.advert.r rVar, Provider provider) {
        this.f310757a = rVar;
        this.f310758b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC35391g) this.f310757a.get(), this.f310758b.get());
    }
}
