package com.avito.android.user_advert.deeplink;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MyAdvertDeactivateLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35473i implements dagger.internal.h<C35472h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.r f310729a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310730b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f310731c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f310732d;

    public C35473i(com.avito.android.user_advert.advert.r rVar, Provider provider, dagger.internal.f fVar, dv.b bVar) {
        this.f310729a = rVar;
        this.f310730b = provider;
        this.f310731c = fVar;
        this.f310732d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35472h((InterfaceC35391g) this.f310729a.get(), this.f310730b.get(), (InterfaceC28373a) this.f310731c.get(), (a.g) this.f310732d.get());
    }
}
