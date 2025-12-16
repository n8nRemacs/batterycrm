package com.avito.android.autoteka.di.report;

import android.webkit.CookieManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportModule_Companion_ProvideCookieManagerFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<CookieManager> {

    /* compiled from: AutotekaReportModule_Companion_ProvideCookieManagerFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f96537a = new d();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f96534a.getClass();
        return CookieManager.getInstance();
    }
}
