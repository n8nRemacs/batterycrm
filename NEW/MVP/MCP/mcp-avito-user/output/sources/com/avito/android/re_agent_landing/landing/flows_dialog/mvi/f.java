package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import com.avito.android.re_agent_landing.landing.flows_dialog.model.ReAgentProfileCreateLandingFlowsArguments;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentProfileCreateLandingFlowsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f250698a;

    /* renamed from: b, reason: collision with root package name */
    public final h f250699b;

    /* renamed from: c, reason: collision with root package name */
    public final j f250700c;

    /* renamed from: d, reason: collision with root package name */
    public final l f250701d;

    public f(c cVar, h hVar, j jVar, l lVar) {
        this.f250698a = cVar;
        this.f250699b = hVar;
        this.f250700c = jVar;
        this.f250701d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f250698a.get();
        this.f250699b.getClass();
        g gVar = new g();
        this.f250700c.getClass();
        i iVar = new i();
        ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments = (ReAgentProfileCreateLandingFlowsArguments) this.f250701d.f393949a;
        ReAgentProfileCreateLandingFlowsState.f250683c.getClass();
        return new e("ReAgentProfileCreateLandingFlows", new ReAgentProfileCreateLandingFlowsState(reAgentProfileCreateLandingFlowsArguments.f250673b, ReAgentProfileCreateLandingFlowsState.FlowType.f250686b), new d(bVar, iVar, gVar));
    }
}
