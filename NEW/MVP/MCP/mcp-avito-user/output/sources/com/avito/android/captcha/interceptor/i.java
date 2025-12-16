package com.avito.android.captcha.interceptor;

import com.avito.android.D;
import com.avito.android.F;
import com.avito.android.H0;
import com.avito.android.captcha.w;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ym.C50266b;
import ym.C50267c;
import zm.InterfaceC50587a;

/* compiled from: TooManyRequestsInterceptorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C50266b f115088a;

    /* renamed from: b, reason: collision with root package name */
    public final F f115089b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H0> f115090c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f115091d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Gson> f115092e;

    /* renamed from: f, reason: collision with root package name */
    public final C50267c f115093f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.captcha.analytics.d f115094g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f115095h;

    /* renamed from: i, reason: collision with root package name */
    public final e f115096i;

    public i(C50266b c50266b, F f12, Provider provider, Provider provider2, Provider provider3, C50267c c50267c, com.avito.android.captcha.analytics.d dVar, Provider provider4, e eVar) {
        this.f115088a = c50266b;
        this.f115089b = f12;
        this.f115090c = provider;
        this.f115091d = provider2;
        this.f115092e = provider3;
        this.f115093f = c50267c;
        this.f115094g = dVar;
        this.f115095h = provider4;
        this.f115096i = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((w) this.f115088a.get(), (D) this.f115089b.get(), this.f115090c.get(), dagger.internal.g.b(this.f115091d), dagger.internal.g.b(this.f115092e), (InterfaceC50587a) this.f115093f.get(), (com.avito.android.captcha.analytics.b) this.f115094g.get(), this.f115095h.get(), (a) this.f115096i.get());
    }
}
