package com.avito.android.re_agent_landing.landing.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.re_agent_landing.landing.mvi.entity.ReAgentProfileCreateLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReAgentProfileCreateLandingReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "LSh0/c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<ReAgentProfileCreateLandingInternalAction, Sh0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.re_agent_landing.landing.mvi.builder.a f250840b;

    @Inject
    public j(@Y61.k com.avito.android.re_agent_landing.landing.mvi.builder.a aVar) {
        this.f250840b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Sh0.c a(ReAgentProfileCreateLandingInternalAction reAgentProfileCreateLandingInternalAction, Sh0.c cVar) {
        ReAgentProfileCreateLandingInternalAction reAgentProfileCreateLandingInternalAction2 = reAgentProfileCreateLandingInternalAction;
        Sh0.c cVar2 = cVar;
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.StartLoading) {
            return Sh0.c.a(cVar2, null, true, false, false, 1);
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.LoadingError) {
            return Sh0.c.a(cVar2, null, false, true, false, 9);
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.ScreenDataLoaded) {
            return Sh0.c.a(cVar2, this.f250840b.a(((ReAgentProfileCreateLandingInternalAction.ScreenDataLoaded) reAgentProfileCreateLandingInternalAction2).f250832b), false, false, false, 8);
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.FollowDeeplink) {
            return Sh0.c.a(cVar2, null, false, false, ((ReAgentProfileCreateLandingInternalAction.FollowDeeplink) reAgentProfileCreateLandingInternalAction2).f250829c, 7);
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.OpenFlowsDialog) {
            return Sh0.c.a(cVar2, null, false, false, true, 7);
        }
        if (reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.Close ? true : reAgentProfileCreateLandingInternalAction2 instanceof ReAgentProfileCreateLandingInternalAction.ScrollToItem) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
