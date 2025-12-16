package com.avito.android.webview;

import Mu.InterfaceC14529b;
import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.CalledFrom;
import com.avito.android.Y2;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.remote.interceptor.InterfaceC34316x0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.U;
import com.avito.android.util.W;
import javax.inject.Provider;

/* compiled from: WebViewPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f329668a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f329669b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f329670c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f329671d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<CookieManager> f329672e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.cookie_provider.e> f329673f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<FP0.a> f329674g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Y2> f329675h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC14529b> f329676i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f329677j;

    /* renamed from: k, reason: collision with root package name */
    public final W f329678k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC34316x0> f329679l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<Lq.d> f329680m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f329681n;

    public v(Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, W w12, Provider provider8, Provider provider9, dagger.internal.u uVar) {
        this.f329668a = provider;
        this.f329669b = lVar;
        this.f329670c = lVar2;
        this.f329671d = lVar3;
        this.f329672e = provider2;
        this.f329673f = provider3;
        this.f329674g = provider4;
        this.f329675h = provider5;
        this.f329676i = provider6;
        this.f329677j = provider7;
        this.f329678k = w12;
        this.f329679l = provider8;
        this.f329680m = provider9;
        this.f329681n = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f329668a.get(), (Uri) this.f329669b.f393949a, (WebViewLinkSettings) this.f329670c.f393949a, (CalledFrom) this.f329671d.f393949a, this.f329672e.get(), this.f329673f.get(), this.f329674g.get(), this.f329675h.get(), this.f329676i.get(), this.f329677j.get(), (U) this.f329678k.get(), this.f329679l.get(), this.f329680m.get(), (GP0.a) this.f329681n.get());
    }
}
