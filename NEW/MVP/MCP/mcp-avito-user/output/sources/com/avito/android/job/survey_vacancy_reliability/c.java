package com.avito.android.job.survey_vacancy_reliability;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.H;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobSurveyVacancyReliabilityDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f174683a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f174684b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f174685c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f174686d;

    public c(dagger.internal.f fVar, dv.b bVar, Provider provider, Provider provider2) {
        this.f174683a = bVar;
        this.f174684b = fVar;
        this.f174685c = provider;
        this.f174686d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f174683a.get(), (InterfaceC28373a) this.f174684b.get(), this.f174685c.get(), this.f174686d.get());
    }
}
