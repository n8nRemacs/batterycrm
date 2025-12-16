package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30081j4;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselVacancyViewedXlItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f269232a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f269233b;

    /* renamed from: c, reason: collision with root package name */
    public final C30081j4 f269234c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f269235d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<A> f269236e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f269237f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f269238g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f269239h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f269240i;

    /* renamed from: j, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f269241j;

    public r(dagger.internal.f fVar, dagger.internal.f fVar2, C30081j4 c30081j4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.l lVar, ru.avito.component.serp.job.geo.d dVar) {
        this.f269232a = fVar;
        this.f269233b = fVar2;
        this.f269234c = c30081j4;
        this.f269235d = provider;
        this.f269236e = provider2;
        this.f269237f = provider3;
        this.f269238g = provider4;
        this.f269239h = provider5;
        this.f269240i = lVar;
        this.f269241j = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f269232a);
        h31.e eVarB2 = dagger.internal.g.b(this.f269233b);
        h31.e eVarA = dagger.internal.g.a(w.a(this.f269234c));
        h31.e eVarB3 = dagger.internal.g.b(this.f269235d);
        A a12 = this.f269236e.get();
        InterfaceC28373a interfaceC28373a = this.f269237f.get();
        InterfaceC34864v0 interfaceC34864v0 = this.f269238g.get();
        InterfaceC13095a interfaceC13095a = this.f269239h.get();
        SearchParams searchParams = (SearchParams) this.f269240i.f393949a;
        this.f269241j.getClass();
        return new q(eVarB, eVarB2, eVarA, eVarB3, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, searchParams, new ru.avito.component.serp.job.geo.b());
    }
}
