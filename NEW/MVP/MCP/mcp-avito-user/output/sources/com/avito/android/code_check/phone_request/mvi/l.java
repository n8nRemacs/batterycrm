package com.avito.android.code_check.phone_request.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f119131a;

    /* renamed from: b, reason: collision with root package name */
    public final n f119132b;

    /* renamed from: c, reason: collision with root package name */
    public final p f119133c;

    /* renamed from: d, reason: collision with root package name */
    public final i f119134d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f119135e;

    public l(g gVar, n nVar, p pVar, i iVar, Provider provider) {
        this.f119131a = gVar;
        this.f119132b = nVar;
        this.f119133c = pVar;
        this.f119134d = iVar;
        this.f119135e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f119131a.get();
        this.f119132b.getClass();
        m mVar = new m();
        this.f119133c.getClass();
        o oVar = new o();
        return new k("PhoneRequest", new Ro.c(false, null, 0L, 7, null), new j((h) this.f119134d.get(), cVar, this.f119135e.get(), oVar, mVar));
    }
}
