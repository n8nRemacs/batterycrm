package com.avito.android.advert.business360;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.onboarding_manager.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBusiness360ToastPresenter_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f68830a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f68831b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<f> f68832c;

    public c(Provider<InterfaceC28373a> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<f> provider3) {
        this.f68830a = provider;
        this.f68831b = provider2;
        this.f68832c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f68830a.get(), this.f68831b.get(), this.f68832c.get());
    }
}
