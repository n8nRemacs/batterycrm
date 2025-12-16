package com.avito.android.comfortable_deal.stages_transition.mvi;

import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StagesTransitionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f122984a;

    /* renamed from: b, reason: collision with root package name */
    public final h f122985b;

    /* renamed from: c, reason: collision with root package name */
    public final j f122986c;

    /* renamed from: d, reason: collision with root package name */
    public final l f122987d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.stages_transition.mvi.builder.a> f122988e;

    public f(c cVar, h hVar, j jVar, l lVar, Provider provider) {
        this.f122984a = cVar;
        this.f122985b = hVar;
        this.f122986c = jVar;
        this.f122987d = lVar;
        this.f122988e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f122984a.get();
        this.f122985b.getClass();
        g gVar = new g();
        i iVar = (i) this.f122986c.get();
        StagesTransitionArguments stagesTransitionArguments = (StagesTransitionArguments) this.f122987d.f393949a;
        return new e("StagesTransition", this.f122988e.get().a(stagesTransitionArguments.f122953c, stagesTransitionArguments.f122954d, stagesTransitionArguments.f122955e), new d(bVar, iVar, gVar));
    }
}
