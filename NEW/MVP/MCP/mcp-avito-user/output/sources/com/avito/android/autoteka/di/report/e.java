package com.avito.android.autoteka.di.report;

import com.avito.android.H0;
import com.avito.android.autoteka.di.report.h;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import javax.inject.Provider;

/* compiled from: AutotekaReportModule_Companion_ProvideCookieProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B0> f96538a;

    /* renamed from: b, reason: collision with root package name */
    public final u f96539b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f96540c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H0> f96541d;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f96538a = provider;
        this.f96539b = uVar;
        this.f96540c = provider2;
        this.f96541d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) ((h.b.C2866h) this.f96538a).get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f96539b.get();
        C c12 = (C) ((h.b.e) this.f96540c).get();
        H0 h02 = (H0) ((h.b.f) this.f96541d).get();
        b.f96534a.getClass();
        return new com.avito.android.cookie_provider.f(Collections.singletonList(b02), bVar, c12, h02);
    }
}
