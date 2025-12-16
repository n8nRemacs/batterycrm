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

/* compiled from: AdvertXlRichItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class a0 implements dagger.internal.h<Z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.a> f271128a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f271129b;

    /* renamed from: c, reason: collision with root package name */
    public final C30125n4 f271130c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.m> f271131d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f271132e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f271133f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f271134g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f271135h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.e> f271136i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f271137j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f271138k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f271139l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f271140m;

    public a0(Provider provider, Provider provider2, C30125n4 c30125n4, Provider provider3, dagger.internal.u uVar, Provider provider4, Provider provider5, dagger.internal.u uVar2, Provider provider6, dagger.internal.l lVar, Provider provider7, dagger.internal.l lVar2, dagger.internal.u uVar3) {
        this.f271128a = provider;
        this.f271129b = provider2;
        this.f271130c = c30125n4;
        this.f271131d = provider3;
        this.f271132e = uVar;
        this.f271133f = provider4;
        this.f271134g = provider5;
        this.f271135h = uVar2;
        this.f271136i = provider6;
        this.f271137j = lVar;
        this.f271138k = provider7;
        this.f271139l = lVar2;
        this.f271140m = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Z(dagger.internal.g.b(this.f271128a), dagger.internal.g.b(this.f271129b), dagger.internal.g.b(this.f271130c), this.f271131d.get(), (InterfaceC28373a) this.f271132e.get(), dagger.internal.g.b(this.f271133f), this.f271134g.get(), (C36135w2) this.f271135h.get(), this.f271136i.get(), (Kundle) this.f271137j.f393949a, this.f271138k.get(), (SearchParams) this.f271139l.f393949a, (com.avito.android.account.E) this.f271140m.get());
    }
}
