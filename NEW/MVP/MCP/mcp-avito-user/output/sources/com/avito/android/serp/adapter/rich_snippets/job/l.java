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

/* compiled from: AdvertRichJobItemPresenter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f270815a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.a> f270816b;

    /* renamed from: c, reason: collision with root package name */
    public final C30092k4 f270817c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f270818d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<A> f270819e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f270820f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f270821g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f270822h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f270823i;

    /* renamed from: j, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.f f270824j;

    /* renamed from: k, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f270825k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f270826l;

    public l(Provider provider, Provider provider2, C30092k4 c30092k4, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6, dagger.internal.l lVar, ru.avito.component.serp.job.geo.f fVar, ru.avito.component.serp.job.geo.d dVar, dagger.internal.u uVar2) {
        this.f270815a = provider;
        this.f270816b = provider2;
        this.f270817c = c30092k4;
        this.f270818d = provider3;
        this.f270819e = provider4;
        this.f270820f = uVar;
        this.f270821g = provider5;
        this.f270822h = provider6;
        this.f270823i = lVar;
        this.f270824j = fVar;
        this.f270825k = dVar;
        this.f270826l = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f270815a);
        h31.e eVarB2 = dagger.internal.g.b(this.f270816b);
        com.avito.android.date_time_formatter.b bVar = (com.avito.android.date_time_formatter.b) this.f270817c.get();
        InterfaceC28616b interfaceC28616b = this.f270818d.get();
        A a12 = this.f270819e.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f270820f.get();
        InterfaceC34864v0 interfaceC34864v0 = this.f270821g.get();
        InterfaceC13095a interfaceC13095a = this.f270822h.get();
        SearchParams searchParams = (SearchParams) this.f270823i.f393949a;
        this.f270824j.getClass();
        ru.avito.component.serp.job.geo.e eVar = new ru.avito.component.serp.job.geo.e();
        this.f270825k.getClass();
        return new j(eVarB, eVarB2, bVar, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, searchParams, eVar, new ru.avito.component.serp.job.geo.b(), (com.avito.android.server_time.h) this.f270826l.get());
    }
}
