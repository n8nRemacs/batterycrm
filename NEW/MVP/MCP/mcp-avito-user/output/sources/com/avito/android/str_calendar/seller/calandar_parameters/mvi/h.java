package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import com.avito.android.str_calendar.seller.calandar_parameters.C35095f;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: StrCalendarParametersActor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.o f287409a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Cy0.b> f287410b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f287411c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43624b> f287412d;

    public h(com.avito.android.str_calendar.seller.calandar_parameters.domain.o oVar, Provider provider, dagger.internal.u uVar, Provider provider2) {
        this.f287409a = oVar;
        this.f287410b = provider;
        this.f287411c = uVar;
        this.f287412d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_calendar.seller.calandar_parameters.domain.b bVar = (com.avito.android.str_calendar.seller.calandar_parameters.domain.b) this.f287409a.get();
        Cy0.b bVar2 = this.f287410b.get();
        C35095f c35095f = (C35095f) this.f287411c.get();
        this.f287412d.get();
        return new a(bVar, bVar2, c35095f);
    }
}
