package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: AdvertXlRichServiceItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f271292a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f271293b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f271294c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f271295d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f271296e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f271297f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C36135w2> f271298g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f271299h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f271300i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<p1> f271301j;

    public P(dagger.internal.f fVar, dagger.internal.f fVar2, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.l lVar2, Provider provider6) {
        this.f271292a = fVar;
        this.f271293b = fVar2;
        this.f271294c = lVar;
        this.f271295d = provider;
        this.f271296e = provider2;
        this.f271297f = provider3;
        this.f271298g = provider4;
        this.f271299h = provider5;
        this.f271300i = lVar2;
        this.f271301j = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f271292a);
        h31.e eVarB2 = dagger.internal.g.b(this.f271293b);
        Kundle kundle = (Kundle) this.f271294c.f393949a;
        h31.e eVarB3 = dagger.internal.g.b(this.f271295d);
        com.avito.android.async_phone.A a12 = this.f271296e.get();
        InterfaceC28373a interfaceC28373a = this.f271297f.get();
        this.f271298g.get();
        return new O(eVarB, eVarB2, kundle, eVarB3, a12, interfaceC28373a, this.f271299h.get(), (SearchParams) this.f271300i.f393949a, this.f271301j.get());
    }
}
