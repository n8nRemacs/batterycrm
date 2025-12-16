package com.avito.android.user_advert.advert.delegate.user_advert_action;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_advert.advert.InterfaceC35384d1;
import com.avito.android.user_advert.advert.S;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import kI0.InterfaceC42585a;

/* compiled from: UserAdvertActionPresenterDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308857a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42585a> f308858b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S> f308859c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308860d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35384d1> f308861e;

    /* renamed from: f, reason: collision with root package name */
    public final u f308862f;

    /* renamed from: g, reason: collision with root package name */
    public final u f308863g;

    public g(u uVar, Provider provider, Provider provider2, u uVar2, Provider provider3, u uVar3, u uVar4) {
        this.f308857a = uVar;
        this.f308858b = provider;
        this.f308859c = provider2;
        this.f308860d = uVar2;
        this.f308861e = provider3;
        this.f308862f = uVar3;
        this.f308863g = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f308857a.get(), this.f308858b.get(), this.f308859c.get(), (InterfaceC35745a5) this.f308860d.get(), this.f308861e.get(), (InterfaceC41196a) this.f308862f.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f308863g.get());
    }
}
