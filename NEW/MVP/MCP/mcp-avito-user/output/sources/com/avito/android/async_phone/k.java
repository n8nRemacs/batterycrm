package com.avito.android.async_phone;

import Id.InterfaceC14060a;
import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AsyncPhonePresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f92222a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l> f92223b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f92224c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28615a> f92225d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f92226e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f92227f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC14060a> f92228g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f92229h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<ZL.a> f92230i;

    public k(Provider<u> provider, Provider<l> provider2, Provider<E> provider3, Provider<InterfaceC28615a> provider4, Provider<InterfaceC35745a5> provider5, Provider<com.avito.android.remote.error.f> provider6, Provider<InterfaceC14060a> provider7, Provider<R0> provider8, Provider<ZL.a> provider9) {
        this.f92222a = provider;
        this.f92223b = provider2;
        this.f92224c = provider3;
        this.f92225d = provider4;
        this.f92226e = provider5;
        this.f92227f = provider6;
        this.f92228g = provider7;
        this.f92229h = provider8;
        this.f92230i = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f92222a), this.f92223b.get(), this.f92224c.get(), dagger.internal.g.b(this.f92225d), this.f92226e.get(), this.f92227f.get(), this.f92228g.get(), this.f92229h.get(), this.f92230i.get());
    }
}
