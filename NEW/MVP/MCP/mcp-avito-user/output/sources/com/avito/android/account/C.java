package com.avito.android.account;

import Yd.InterfaceC18254a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import fg0.InterfaceC40419c;
import javax.inject.Provider;

/* compiled from: AccountInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C implements dagger.internal.h<C27672j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f68031a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40419c> f68032b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.e f68033c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f68034d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<O> f68035e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f68036f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.remote.error.i f68037g;

    /* renamed from: h, reason: collision with root package name */
    public final Yd.c f68038h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f68039i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.S f68040j;

    public C(Provider provider, Provider provider2, B3.e eVar, Provider provider3, Provider provider4, Provider provider5, com.avito.android.remote.error.i iVar, Yd.c cVar, dagger.internal.f fVar, com.avito.android.S s5) {
        this.f68031a = provider;
        this.f68032b = provider2;
        this.f68033c = eVar;
        this.f68034d = provider3;
        this.f68035e = provider4;
        this.f68036f = provider5;
        this.f68037g = iVar;
        this.f68038h = cVar;
        this.f68039i = fVar;
        this.f68040j = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27672j(dagger.internal.g.b(this.f68031a), this.f68032b.get(), (B3.c) this.f68033c.get(), this.f68034d.get(), this.f68035e.get(), this.f68036f.get(), (com.avito.android.remote.error.f) this.f68037g.get(), (InterfaceC18254a) this.f68038h.get(), (InterfaceC28373a) this.f68039i.get(), (com.avito.android.P) this.f68040j.get());
    }
}
