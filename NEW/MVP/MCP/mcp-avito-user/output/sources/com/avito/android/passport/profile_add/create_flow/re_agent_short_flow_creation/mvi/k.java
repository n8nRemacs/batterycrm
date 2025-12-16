package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity.ReAgentShortFlowCreationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentShortFlowCreationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "LS50/c;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<ReAgentShortFlowCreationInternalAction, S50.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final S50.c a(ReAgentShortFlowCreationInternalAction reAgentShortFlowCreationInternalAction, S50.c cVar) {
        ReAgentShortFlowCreationInternalAction reAgentShortFlowCreationInternalAction2 = reAgentShortFlowCreationInternalAction;
        S50.c cVar2 = cVar;
        return reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.StartLoading ? S50.c.a(cVar2, true) : reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.HandleDeeplinkForResult ? S50.c.a(cVar2, false) : reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnFailure ? S50.c.a(cVar2, false) : reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnFinal ? S50.c.a(cVar2, false) : cVar2;
    }
}
