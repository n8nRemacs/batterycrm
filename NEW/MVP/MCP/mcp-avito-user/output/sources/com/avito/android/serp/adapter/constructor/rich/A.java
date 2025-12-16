package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import rn0.InterfaceC47690b;
import sN0.InterfaceC48080b;

/* compiled from: ConstructorAdvertItemRichPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f269551a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.a> f269552b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.q> f269553c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f269554d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f269555e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.empty_placeholder.a> f269556f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f269557g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f269558h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f269559i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f269560j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f269561k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f269562l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f269563m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f269564n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f269565o;

    public A(Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.u uVar3, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar4, dagger.internal.u uVar5, dagger.internal.u uVar6) {
        this.f269551a = provider;
        this.f269552b = provider2;
        this.f269553c = provider3;
        this.f269554d = uVar;
        this.f269555e = uVar2;
        this.f269556f = provider4;
        this.f269557g = provider5;
        this.f269558h = provider6;
        this.f269559i = provider7;
        this.f269560j = uVar3;
        this.f269561k = lVar;
        this.f269562l = lVar2;
        this.f269563m = uVar4;
        this.f269564n = uVar5;
        this.f269565o = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z(dagger.internal.g.b(this.f269551a), dagger.internal.g.b(this.f269552b), dagger.internal.g.b(this.f269553c), (InterfaceC28373a) this.f269554d.get(), (com.avito.android.account.E) this.f269555e.get(), this.f269556f.get(), this.f269557g.get(), dagger.internal.g.b(this.f269558h), this.f269559i.get(), (com.avito.android.deep_linking.x) this.f269560j.get(), (SearchParams) this.f269561k.f393949a, (Kundle) this.f269562l.f393949a, (com.avito.android.video_snippets.g) this.f269563m.get(), (InterfaceC48080b) this.f269564n.get(), (C36135w2) this.f269565o.get());
    }
}
