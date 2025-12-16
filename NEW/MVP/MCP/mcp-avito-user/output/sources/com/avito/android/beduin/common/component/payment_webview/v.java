package com.avito.android.beduin.common.component.payment_webview;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: WebPaymentModule_ProvideCookieProvider$_avito_beduin_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f101896a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f101897b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B0> f101898c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cookie_provider.d f101899d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<U0> f101900e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<I> f101901f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f101902g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C> f101903h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<H0> f101904i;

    public v(Provider provider, Provider provider2, Provider provider3, com.avito.android.cookie_provider.d dVar, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f101896a = provider;
        this.f101897b = provider2;
        this.f101898c = provider3;
        this.f101899d = dVar;
        this.f101900e = provider4;
        this.f101901f = provider5;
        this.f101902g = provider6;
        this.f101903h = provider7;
        this.f101904i = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M m12 = this.f101896a.get();
        this.f101897b.get();
        B0 b02 = this.f101898c.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f101899d.get();
        U0 u02 = this.f101900e.get();
        I i12 = this.f101901f.get();
        InterfaceC47681a interfaceC47681a = this.f101902g.get();
        C c12 = this.f101903h.get();
        H0 h02 = this.f101904i.get();
        u.f101895a.getClass();
        ArrayList arrayListE0 = C42745f0.e0(m12, b02, u02, i12, interfaceC47681a);
        c12.getF125491k().getClass();
        return new com.avito.android.cookie_provider.f(arrayListE0, bVar, c12, h02);
    }
}
