package com.avito.android.stories.di.module;

import android.webkit.CookieManager;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StoriesActivityModule_ProvideCookieManager$_avito_stories_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class b implements h<CookieManager> {

    /* compiled from: StoriesActivityModule_ProvideCookieManager$_avito_stories_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f285132a = new b();
    }

    public static b a() {
        return a.f285132a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = com.avito.android.stories.di.module.a.f285131a;
        return CookieManager.getInstance();
    }
}
