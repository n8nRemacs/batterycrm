package com.avito.android.mortgage_invite.lead.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import com.avito.android.mortgage_invite.lead.mvi.entity.LeadType;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationLeadFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f205919a;

    /* renamed from: b, reason: collision with root package name */
    public final e f205920b;

    /* renamed from: c, reason: collision with root package name */
    public final l f205921c;

    /* renamed from: d, reason: collision with root package name */
    public final c f205922d;

    /* renamed from: e, reason: collision with root package name */
    public final j f205923e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f205924f;

    public h(dagger.internal.l lVar, e eVar, l lVar2, c cVar, j jVar, Provider provider) {
        this.f205919a = lVar;
        this.f205920b = eVar;
        this.f205921c = lVar2;
        this.f205922d = cVar;
        this.f205923e = jVar;
        this.f205924f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ApplicationLeadArguments applicationLeadArguments = (ApplicationLeadArguments) this.f205919a.f393949a;
        d dVar = (d) this.f205920b.get();
        this.f205921c.getClass();
        k kVar = new k();
        a aVar = (a) this.f205922d.get();
        this.f205923e.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f205924f.get();
        n20.c.f414862e.getClass();
        return new g("ApplicationLeadSelector", new n20.c(applicationLeadArguments.f205894b, applicationLeadArguments.f205895c, LeadType.f205910b), new f(dVar, screenPerformanceTracker, kVar, aVar, iVar));
    }
}
