package com.avito.android.serp.adapter.recommendations_vacancy;

import Ax.InterfaceC13095a;
import com.avito.android.advert.di.C27791y;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30092k4;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsAdvertVacancyItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f270605a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f270606b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f270607c;

    /* renamed from: d, reason: collision with root package name */
    public final C27791y f270608d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f270609e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f270610f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f270611g;

    /* renamed from: h, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.d f270612h;

    /* renamed from: i, reason: collision with root package name */
    public final C30092k4 f270613i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f270614j;

    public i(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider, C27791y c27791y, Provider provider2, Provider provider3, Provider provider4, ru.avito.component.serp.job.geo.d dVar, C30092k4 c30092k4, Provider provider5) {
        this.f270605a = fVar;
        this.f270606b = fVar2;
        this.f270607c = provider;
        this.f270608d = c27791y;
        this.f270609e = provider2;
        this.f270610f = provider3;
        this.f270611g = provider4;
        this.f270612h = dVar;
        this.f270613i = c30092k4;
        this.f270614j = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f270605a);
        h31.e eVarB2 = dagger.internal.g.b(this.f270606b);
        InterfaceC28616b interfaceC28616b = this.f270607c.get();
        A a12 = (A) this.f270608d.get();
        InterfaceC28373a interfaceC28373a = this.f270609e.get();
        InterfaceC34864v0 interfaceC34864v0 = this.f270610f.get();
        InterfaceC13095a interfaceC13095a = this.f270611g.get();
        this.f270612h.getClass();
        return new h(eVarB, eVarB2, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, new ru.avito.component.serp.job.geo.b(), (com.avito.android.date_time_formatter.b) this.f270613i.get(), this.f270614j.get());
    }
}
