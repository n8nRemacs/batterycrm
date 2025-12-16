package com.avito.android.help_center.help_center_articles.di;

import android.webkit.CookieManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterArticlesModule_ProvideCookieManager$_avito_help_center_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<CookieManager> {

    /* compiled from: HelpCenterArticlesModule_ProvideCookieManager$_avito_help_center_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f161725a = new h();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = g.f161724a;
        return CookieManager.getInstance();
    }
}
