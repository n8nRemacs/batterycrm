package com.avito.android.credits.landing.di;

import android.webkit.CookieManager;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreditProductsLandingModule_ProvideCookieManager$_avito_credits_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<CookieManager> {

    /* renamed from: a, reason: collision with root package name */
    public final c f128904a;

    public d(c cVar) {
        this.f128904a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f128904a.getClass();
        return CookieManager.getInstance();
    }
}
