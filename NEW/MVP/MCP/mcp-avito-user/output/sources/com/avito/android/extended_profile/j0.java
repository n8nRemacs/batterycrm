package com.avito.android.extended_profile;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: ExtendedProfileSubscriptionInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.Q> f150013a;

    /* renamed from: b, reason: collision with root package name */
    public final I30.b f150014b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f150015c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f150016d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f150017e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f150018f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f150019g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f150020h;

    /* renamed from: i, reason: collision with root package name */
    public final I30.b f150021i;

    public j0(Provider provider, I30.b bVar, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4, Provider provider5, Provider provider6, I30.b bVar2) {
        this.f150013a = provider;
        this.f150014b = bVar;
        this.f150015c = provider2;
        this.f150016d = provider3;
        this.f150017e = uVar;
        this.f150018f = provider4;
        this.f150019g = provider5;
        this.f150020h = provider6;
        this.f150021i = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f0(this.f150013a.get(), (I30.d) this.f150014b.get(), this.f150015c.get(), this.f150016d.get(), (InterfaceC50647a) this.f150017e.get(), this.f150018f.get(), this.f150019g.get(), this.f150020h.get(), (I30.d) this.f150021i.get());
    }
}
