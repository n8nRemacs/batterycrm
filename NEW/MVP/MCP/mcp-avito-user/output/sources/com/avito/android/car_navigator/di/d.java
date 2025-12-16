package com.avito.android.car_navigator.di;

import android.webkit.CookieManager;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarNavigatorModule_ProvideCookieManager$_avito_car_navigator_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class d implements h<CookieManager> {

    /* compiled from: CarNavigatorModule_ProvideCookieManager$_avito_car_navigator_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f115155a = new d();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = c.f115154a;
        return CookieManager.getInstance();
    }
}
