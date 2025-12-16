package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import dagger.internal.y;
import java.util.Date;

/* compiled from: StrCalendarParametersBootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.o f287422a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f287423b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f287424c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f287425d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f287426e;

    public j(com.avito.android.str_calendar.seller.calandar_parameters.domain.o oVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f287422a = oVar;
        this.f287423b = lVar;
        this.f287424c = lVar2;
        this.f287425d = lVar3;
        this.f287426e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.str_calendar.seller.calandar_parameters.domain.b) this.f287422a.get(), (String) this.f287423b.f393949a, (Date) this.f287424c.f393949a, (Date) this.f287425d.f393949a, ((Boolean) this.f287426e.f393949a).booleanValue());
    }
}
