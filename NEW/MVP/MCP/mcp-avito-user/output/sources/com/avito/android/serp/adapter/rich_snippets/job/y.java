package com.avito.android.serp.adapter.rich_snippets.job;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30092k4;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import javax.inject.Provider;
import rn0.InterfaceC47690b;

/* compiled from: AdvertXlRichJobItemPresenter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f270871a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.a> f270872b;

    /* renamed from: c, reason: collision with root package name */
    public final C30092k4 f270873c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f270874d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<A> f270875e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f270876f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f270877g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f270878h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f270879i;

    /* renamed from: j, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.f f270880j;

    /* renamed from: k, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f270881k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f270882l;

    public y(Provider provider, Provider provider2, C30092k4 c30092k4, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6, dagger.internal.l lVar, ru.avito.component.serp.job.geo.f fVar, ru.avito.component.serp.job.geo.d dVar, dagger.internal.u uVar2) {
        this.f270871a = provider;
        this.f270872b = provider2;
        this.f270873c = c30092k4;
        this.f270874d = provider3;
        this.f270875e = provider4;
        this.f270876f = uVar;
        this.f270877g = provider5;
        this.f270878h = provider6;
        this.f270879i = lVar;
        this.f270880j = fVar;
        this.f270881k = dVar;
        this.f270882l = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f270871a);
        h31.e eVarB2 = dagger.internal.g.b(this.f270872b);
        com.avito.android.date_time_formatter.b bVar = (com.avito.android.date_time_formatter.b) this.f270873c.get();
        InterfaceC28616b interfaceC28616b = this.f270874d.get();
        A a12 = this.f270875e.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f270876f.get();
        InterfaceC34864v0 interfaceC34864v0 = this.f270877g.get();
        InterfaceC13095a interfaceC13095a = this.f270878h.get();
        SearchParams searchParams = (SearchParams) this.f270879i.f393949a;
        this.f270880j.getClass();
        ru.avito.component.serp.job.geo.e eVar = new ru.avito.component.serp.job.geo.e();
        this.f270881k.getClass();
        return new x(eVarB, eVarB2, bVar, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, searchParams, eVar, new ru.avito.component.serp.job.geo.b(), (com.avito.android.server_time.h) this.f270882l.get());
    }
}
