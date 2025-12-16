package com.avito.android.help_center;

import android.webkit.CookieManager;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Provider;

/* compiled from: HelpCenterPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f161589a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CookieManager> f161590b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.cookie_provider.e> f161591c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC30756m> f161592d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f161593e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f161594f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f161595g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35845m2> f161596h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<H> f161597i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f161598j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f161599k;

    public A(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f161589a = provider;
        this.f161590b = provider2;
        this.f161591c = provider3;
        this.f161592d = provider4;
        this.f161593e = provider5;
        this.f161594f = provider6;
        this.f161595g = provider7;
        this.f161596h = provider8;
        this.f161597i = provider9;
        this.f161598j = lVar;
        this.f161599k = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f161589a.get(), this.f161590b.get(), this.f161591c.get(), this.f161592d.get(), this.f161593e.get(), this.f161594f.get(), this.f161595g.get(), this.f161596h.get(), this.f161597i.get(), (String) this.f161598j.f393949a, (HelpCenterPresenterState) this.f161599k.f393949a);
    }
}
