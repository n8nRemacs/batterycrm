package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import Q50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentSetProfileNameOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "LQ50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements t<ReAgentSetProfileNameInternalAction, Q50.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Q50.b b(ReAgentSetProfileNameInternalAction reAgentSetProfileNameInternalAction) {
        ReAgentSetProfileNameInternalAction reAgentSetProfileNameInternalAction2 = reAgentSetProfileNameInternalAction;
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.CreateProfileError) {
            Throwable th2 = ((ReAgentSetProfileNameInternalAction.CreateProfileError) reAgentSetProfileNameInternalAction2).f211471b;
            if (com.avito.android.passport.profile_add.create_flow.set_profile_name.a.b(th2)) {
                return null;
            }
            return new b.d(th2);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.Close) {
            return b.a.f13473a;
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.OnFinal) {
            ReAgentSetProfileNameInternalAction.OnFinal onFinal = (ReAgentSetProfileNameInternalAction.OnFinal) reAgentSetProfileNameInternalAction2;
            return new b.c(onFinal.f211480b, onFinal.f211481c);
        }
        if (!(reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.HandleDeeplink)) {
            return null;
        }
        ReAgentSetProfileNameInternalAction.HandleDeeplink handleDeeplink = (ReAgentSetProfileNameInternalAction.HandleDeeplink) reAgentSetProfileNameInternalAction2;
        return new b.C0887b(handleDeeplink.f211479d, handleDeeplink.f211477b, handleDeeplink.f211478c);
    }
}
