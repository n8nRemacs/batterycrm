package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: AdvertRichServiceItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f271381a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f271382b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f271383c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f271384d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f271385e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f271386f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C36135w2> f271387g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f271388h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f271389i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<p1> f271390j;

    public t(dagger.internal.f fVar, dagger.internal.f fVar2, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.l lVar2, Provider provider6) {
        this.f271381a = fVar;
        this.f271382b = fVar2;
        this.f271383c = lVar;
        this.f271384d = provider;
        this.f271385e = provider2;
        this.f271386f = provider3;
        this.f271387g = provider4;
        this.f271388h = provider5;
        this.f271389i = lVar2;
        this.f271390j = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(dagger.internal.g.b(this.f271381a), dagger.internal.g.b(this.f271382b), (Kundle) this.f271383c.f393949a, dagger.internal.g.b(this.f271384d), this.f271385e.get(), this.f271386f.get(), this.f271387g.get(), this.f271388h.get(), (SearchParams) this.f271389i.f393949a, this.f271390j.get());
    }
}
