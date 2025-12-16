package com.avito.android.help_center.help_center_request.di;

import android.webkit.CookieManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterRequestModule_ProvideCookieManager$_avito_help_center_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<CookieManager> {

    /* compiled from: HelpCenterRequestModule_ProvideCookieManager$_avito_help_center_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f161806a = new g();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = f.f161805a;
        return CookieManager.getInstance();
    }
}
