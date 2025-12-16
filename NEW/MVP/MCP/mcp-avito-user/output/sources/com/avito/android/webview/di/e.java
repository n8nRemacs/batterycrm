package com.avito.android.webview.di;

import android.webkit.CookieManager;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WebViewModule_ProvideCookieManager$_avito_webview_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class e implements h<CookieManager> {

    /* compiled from: WebViewModule_ProvideCookieManager$_avito_webview_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f329610a = new e();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = d.f329609a;
        return CookieManager.getInstance();
    }
}
