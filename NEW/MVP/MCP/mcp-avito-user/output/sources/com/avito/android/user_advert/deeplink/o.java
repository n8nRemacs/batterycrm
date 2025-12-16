package com.avito.android.user_advert.deeplink;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MyAdvertDeactivateV2LinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.r f310748a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310749b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f310750c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f310751d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f310752e;

    public o(com.avito.android.user_advert.advert.r rVar, Provider provider, dagger.internal.f fVar, dv.b bVar, dv.b bVar2) {
        this.f310748a = rVar;
        this.f310749b = provider;
        this.f310750c = fVar;
        this.f310751d = bVar;
        this.f310752e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC35391g) this.f310748a.get(), this.f310749b.get(), (InterfaceC28373a) this.f310750c.get(), (a.d) this.f310751d.get(), (a.f) this.f310752e.get());
    }
}
