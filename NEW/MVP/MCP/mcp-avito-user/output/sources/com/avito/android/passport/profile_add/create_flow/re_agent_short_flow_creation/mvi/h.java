package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.model.ReAgentShortFlowCreationArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentShortFlowCreationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f211608a;

    /* renamed from: b, reason: collision with root package name */
    public final j f211609b;

    /* renamed from: c, reason: collision with root package name */
    public final l f211610c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f211611d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f211612e;

    public h(e eVar, j jVar, l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f211608a = eVar;
        this.f211609b = jVar;
        this.f211610c = lVar;
        this.f211611d = provider;
        this.f211612e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f211608a.get();
        this.f211609b.getClass();
        i iVar = new i();
        this.f211610c.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f211611d.get();
        ReAgentShortFlowCreationArguments reAgentShortFlowCreationArguments = (ReAgentShortFlowCreationArguments) this.f211612e.f393949a;
        S50.c.f14817d.getClass();
        return new g("ReAgentShortFlowCreation", new S50.c(reAgentShortFlowCreationArguments.f211578b, false), new f(cVar, screenPerformanceTracker, kVar, iVar));
    }
}
