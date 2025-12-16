package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentProfileCreateLandingFlowsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements u<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b, ReAgentProfileCreateLandingFlowsState> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ReAgentProfileCreateLandingFlowsState a(com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b bVar, ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState) {
        com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b bVar2 = bVar;
        ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState2 = reAgentProfileCreateLandingFlowsState;
        return bVar2 instanceof b.a ? new ReAgentProfileCreateLandingFlowsState(reAgentProfileCreateLandingFlowsState2.f250684a, ((b.a) bVar2).f250694a) : reAgentProfileCreateLandingFlowsState2;
    }
}
