package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.remote.d1;
import com.avito.android.str_calendar.seller.calandar_parameters.t;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36020m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f287012a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f287013b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC36020m> f287014c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f287015d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<t> f287016e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.mvi.k> f287017f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j> f287018g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a> f287019h;

    /* renamed from: i, reason: collision with root package name */
    public final u f287020i;

    public o(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f287012a = provider;
        this.f287013b = provider2;
        this.f287014c = provider3;
        this.f287015d = provider4;
        this.f287016e = provider5;
        this.f287017f = provider6;
        this.f287018g = provider7;
        this.f287019h = provider8;
        this.f287020i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f287012a.get(), this.f287013b.get(), this.f287014c.get(), this.f287015d.get(), this.f287016e.get(), this.f287017f.get(), this.f287018g.get(), this.f287019h.get(), (Cy0.b) this.f287020i.get());
    }
}
