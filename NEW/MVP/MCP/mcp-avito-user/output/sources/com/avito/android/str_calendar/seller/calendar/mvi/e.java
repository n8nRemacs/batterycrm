package com.avito.android.str_calendar.seller.calendar.mvi;

import Hy0.C14050b;
import Hy0.C14052d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calendar.data.b f287683a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calendar.data.m> f287684b;

    /* renamed from: c, reason: collision with root package name */
    public final C14052d f287685c;

    /* renamed from: d, reason: collision with root package name */
    public final u f287686d;

    public e(com.avito.android.str_calendar.seller.calendar.data.b bVar, Provider provider, C14052d c14052d, u uVar) {
        this.f287683a = bVar;
        this.f287684b = provider;
        this.f287685c = c14052d;
        this.f287686d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.str_calendar.seller.calendar.data.a) this.f287683a.get(), this.f287684b.get(), (C14050b) this.f287685c.get(), (Cy0.b) this.f287686d.get());
    }
}
