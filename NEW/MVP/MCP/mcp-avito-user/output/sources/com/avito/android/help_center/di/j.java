package com.avito.android.help_center.di;

import android.webkit.CookieManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterModule_ProvideCookieManager$_avito_help_center_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<CookieManager> {

    /* compiled from: HelpCenterModule_ProvideCookieManager$_avito_help_center_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f161675a = new j();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = i.f161674a;
        return CookieManager.getInstance();
    }
}
