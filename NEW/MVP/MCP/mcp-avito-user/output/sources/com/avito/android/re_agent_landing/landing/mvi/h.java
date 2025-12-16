package com.avito.android.re_agent_landing.landing.mvi;

import Sh0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.re_agent_landing.landing.mvi.entity.ReAgentProfileCreateLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentProfileCreateLandingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "LSh0/b;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<ReAgentProfileCreateLandingInternalAction, Sh0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Sh0.b b(ReAgentProfileCreateLandingInternalAction reAgentProfileCreateLandingInternalAction) {
        Sh0.b dVar;
        ReAgentProfileCreateLandingInternalAction reAgentProfileCreateLandingInternalAction2 = reAgentProfileCreateLandingInternalAction;
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.Close) {
            return b.a.f15119a;
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.OpenFlowsDialog) {
            dVar = new b.c(((ReAgentProfileCreateLandingInternalAction.OpenFlowsDialog) reAgentProfileCreateLandingInternalAction2).f250831b);
        } else if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.FollowDeeplink) {
            dVar = new b.C1031b(((ReAgentProfileCreateLandingInternalAction.FollowDeeplink) reAgentProfileCreateLandingInternalAction2).f250828b);
        } else {
            if (!(reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.ScrollToItem)) {
                return null;
            }
            dVar = new b.d(((ReAgentProfileCreateLandingInternalAction.ScrollToItem) reAgentProfileCreateLandingInternalAction2).f250833b);
        }
        return dVar;
    }
}
