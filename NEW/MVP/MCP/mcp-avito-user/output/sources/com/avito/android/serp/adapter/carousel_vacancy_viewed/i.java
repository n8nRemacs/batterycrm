package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30081j4;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselVacancyViewedItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f269194a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f269195b;

    /* renamed from: c, reason: collision with root package name */
    public final C30081j4 f269196c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f269197d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<A> f269198e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f269199f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f269200g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f269201h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f269202i;

    /* renamed from: j, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f269203j;

    public i(dagger.internal.f fVar, dagger.internal.f fVar2, C30081j4 c30081j4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.l lVar, ru.avito.component.serp.job.geo.d dVar) {
        this.f269194a = fVar;
        this.f269195b = fVar2;
        this.f269196c = c30081j4;
        this.f269197d = provider;
        this.f269198e = provider2;
        this.f269199f = provider3;
        this.f269200g = provider4;
        this.f269201h = provider5;
        this.f269202i = lVar;
        this.f269203j = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f269194a);
        h31.e eVarB2 = dagger.internal.g.b(this.f269195b);
        com.avito.android.date_time_formatter.b bVar = (com.avito.android.date_time_formatter.b) this.f269196c.get();
        InterfaceC28616b interfaceC28616b = this.f269197d.get();
        A a12 = this.f269198e.get();
        InterfaceC28373a interfaceC28373a = this.f269199f.get();
        InterfaceC34864v0 interfaceC34864v0 = this.f269200g.get();
        InterfaceC13095a interfaceC13095a = this.f269201h.get();
        SearchParams searchParams = (SearchParams) this.f269202i.f393949a;
        this.f269203j.getClass();
        return new h(eVarB, eVarB2, bVar, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, searchParams, new ru.avito.component.serp.job.geo.b());
    }
}
