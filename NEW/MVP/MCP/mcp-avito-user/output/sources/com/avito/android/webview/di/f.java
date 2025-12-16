package com.avito.android.webview.di;

import com.avito.android.H0;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.util.C;
import com.avito.android.webview.C36148a;
import com.avito.android.webview.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: WebViewModule_ProvideCookieProvider$_avito_webview_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B0> f329611a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f329612b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f329613c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<I> f329614d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<M> f329615e;

    /* renamed from: f, reason: collision with root package name */
    public final u f329616f;

    /* renamed from: g, reason: collision with root package name */
    public final l f329617g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C> f329618h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<H0> f329619i;

    public f(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f329611a = provider;
        this.f329612b = provider2;
        this.f329613c = provider3;
        this.f329614d = provider4;
        this.f329615e = provider5;
        this.f329616f = uVar;
        this.f329617g = lVar;
        this.f329618h = provider6;
        this.f329619i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) ((a.c.n) this.f329611a).get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) ((a.c.j) this.f329613c).get();
        I i12 = (I) ((a.c.g) this.f329614d).get();
        M m12 = (M) ((a.c.h) this.f329615e).get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f329616f.get();
        WebViewLinkSettings webViewLinkSettings = (WebViewLinkSettings) this.f329617g.f393949a;
        C c12 = (C) ((a.c.C10239c) this.f329618h).get();
        H0 h02 = (H0) ((a.c.i) this.f329619i).get();
        int i13 = d.f329609a;
        ArrayList arrayListE0 = C42745f0.e0(b02, i12, m12, new C36148a(webViewLinkSettings.f133867b), interfaceC47681a);
        c12.getF125491k().getClass();
        return new com.avito.android.cookie_provider.f(arrayListE0, bVar, c12, h02);
    }
}
