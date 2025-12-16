package com.avito.android.help_center.help_center_request;

import android.webkit.CookieManager;
import com.avito.android.help_center.E;
import com.avito.android.help_center.H;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HelpCenterRequestPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f161821a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CookieManager> f161822b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.cookie_provider.e> f161823c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC30756m> f161824d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H> f161825e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f161826f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f161827g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f161828h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f161829i;

    public m(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f161821a = provider;
        this.f161822b = provider2;
        this.f161823c = provider3;
        this.f161824d = provider4;
        this.f161825e = provider5;
        this.f161826f = provider6;
        this.f161827g = lVar;
        this.f161828h = lVar2;
        this.f161829i = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f161821a.get(), this.f161822b.get(), this.f161823c.get(), this.f161824d.get(), this.f161825e.get(), this.f161826f.get(), (String) this.f161827g.f393949a, (String) this.f161828h.f393949a, (String) this.f161829i.f393949a);
    }
}
