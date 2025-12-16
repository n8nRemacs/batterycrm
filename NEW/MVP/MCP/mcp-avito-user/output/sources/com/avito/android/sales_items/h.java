package com.avito.android.sales_items;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: FavoriteSalesCounterInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f258228a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f258229b;

    /* renamed from: c, reason: collision with root package name */
    public final I30.b f258230c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f258231d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<j> f258232e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<m> f258233f;

    /* renamed from: g, reason: collision with root package name */
    public final u f258234g;

    public h(Provider provider, Provider provider2, I30.b bVar, Provider provider3, Provider provider4, Provider provider5, u uVar) {
        this.f258228a = provider;
        this.f258229b = provider2;
        this.f258230c = bVar;
        this.f258231d = provider3;
        this.f258232e = provider4;
        this.f258233f = provider5;
        this.f258234g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f258228a.get(), this.f258229b.get(), (I30.d) this.f258230c.get(), this.f258231d.get(), this.f258232e.get(), this.f258233f.get(), (u3.h) this.f258234g.get());
    }
}
