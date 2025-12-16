package com.avito.android.comfortable_deal.contract_sign.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.contract_sign.model.ContractSignArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pp.C47122c;

/* compiled from: ContractSignFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f120874a;

    /* renamed from: b, reason: collision with root package name */
    public final d f120875b;

    /* renamed from: c, reason: collision with root package name */
    public final k f120876c;

    /* renamed from: d, reason: collision with root package name */
    public final m f120877d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f120878e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f120879f;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider, dagger.internal.l lVar) {
        this.f120874a = fVar;
        this.f120875b = dVar;
        this.f120876c = kVar;
        this.f120877d = mVar;
        this.f120878e = provider;
        this.f120879f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f120874a.get();
        c cVar = (c) this.f120875b.get();
        this.f120876c.getClass();
        j jVar = new j();
        this.f120877d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f120878e.get();
        ContractSignArguments contractSignArguments = (ContractSignArguments) this.f120879f.f393949a;
        C47122c.f428772g.getClass();
        return new h("ContractSign", new C47122c(false, true, false, "", contractSignArguments.f120839b), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
