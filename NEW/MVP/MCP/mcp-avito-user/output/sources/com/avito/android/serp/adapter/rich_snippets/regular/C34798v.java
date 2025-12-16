package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30125n4;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import rn0.InterfaceC47690b;

/* compiled from: AdvertRichItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34798v implements dagger.internal.h<C34797u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f271225a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.a> f271226b;

    /* renamed from: c, reason: collision with root package name */
    public final C30125n4 f271227c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f271228d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f271229e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f271230f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f271231g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f271232h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.e> f271233i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f271234j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f271235k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f271236l;

    public C34798v(Provider provider, Provider provider2, C30125n4 c30125n4, dagger.internal.u uVar, dagger.internal.l lVar, Provider provider3, Provider provider4, dagger.internal.u uVar2, Provider provider5, Provider provider6, dagger.internal.l lVar2, dagger.internal.u uVar3) {
        this.f271225a = provider;
        this.f271226b = provider2;
        this.f271227c = c30125n4;
        this.f271228d = uVar;
        this.f271229e = lVar;
        this.f271230f = provider3;
        this.f271231g = provider4;
        this.f271232h = uVar2;
        this.f271233i = provider5;
        this.f271234j = provider6;
        this.f271235k = lVar2;
        this.f271236l = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34797u(dagger.internal.g.b(this.f271225a), dagger.internal.g.b(this.f271226b), dagger.internal.g.b(this.f271227c), (InterfaceC28373a) this.f271228d.get(), (Kundle) this.f271229e.f393949a, dagger.internal.g.b(this.f271230f), this.f271231g.get(), (C36135w2) this.f271232h.get(), this.f271233i.get(), this.f271234j.get(), (SearchParams) this.f271235k.f393949a, (com.avito.android.account.E) this.f271236l.get());
    }
}
