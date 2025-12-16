package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import S50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity.ReAgentShortFlowCreationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentShortFlowCreationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "LS50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<ReAgentShortFlowCreationInternalAction, S50.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final S50.b b(ReAgentShortFlowCreationInternalAction reAgentShortFlowCreationInternalAction) {
        ReAgentShortFlowCreationInternalAction reAgentShortFlowCreationInternalAction2 = reAgentShortFlowCreationInternalAction;
        if (reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnBack) {
            return new b.C1000b(((ReAgentShortFlowCreationInternalAction.OnBack) reAgentShortFlowCreationInternalAction2).f211599b);
        }
        if (reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnClose) {
            return b.c.f14814a;
        }
        if (reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnFinal) {
            return new b.d(((ReAgentShortFlowCreationInternalAction.OnFinal) reAgentShortFlowCreationInternalAction2).f211603b);
        }
        if (!(reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.HandleDeeplinkForResult)) {
            if (reAgentShortFlowCreationInternalAction2 instanceof ReAgentShortFlowCreationInternalAction.OnFailure) {
                return new b.e(((ReAgentShortFlowCreationInternalAction.OnFailure) reAgentShortFlowCreationInternalAction2).f211601b);
            }
            return null;
        }
        ReAgentShortFlowCreationInternalAction.HandleDeeplinkForResult handleDeeplinkForResult = (ReAgentShortFlowCreationInternalAction.HandleDeeplinkForResult) reAgentShortFlowCreationInternalAction2;
        return new b.a(handleDeeplinkForResult.f211598d, handleDeeplinkForResult.f211596b, handleDeeplinkForResult.f211597c);
    }
}
