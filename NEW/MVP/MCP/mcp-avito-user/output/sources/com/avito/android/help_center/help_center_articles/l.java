package com.avito.android.help_center.help_center_articles;

import android.webkit.CookieManager;
import com.avito.android.help_center.E;
import com.avito.android.help_center.H;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HelpCenterArticlesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f161741a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CookieManager> f161742b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.cookie_provider.e> f161743c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC30756m> f161744d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H> f161745e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f161746f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f161747g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f161748h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f161749i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f161750j;

    public l(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f161741a = provider;
        this.f161742b = provider2;
        this.f161743c = provider3;
        this.f161744d = provider4;
        this.f161745e = provider5;
        this.f161746f = provider6;
        this.f161747g = lVar;
        this.f161748h = lVar2;
        this.f161749i = lVar3;
        this.f161750j = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f161741a.get(), this.f161742b.get(), this.f161743c.get(), this.f161744d.get(), this.f161745e.get(), this.f161746f.get(), (String) this.f161747g.f393949a, (String) this.f161748h.f393949a, (String) this.f161749i.f393949a, (String) this.f161750j.f393949a);
    }
}
