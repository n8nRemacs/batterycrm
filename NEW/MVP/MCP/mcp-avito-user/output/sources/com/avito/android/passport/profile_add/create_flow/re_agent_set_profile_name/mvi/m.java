package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: ReAgentSetProfileNameReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<ReAgentSetProfileNameInternalAction, ReAgentSetProfileNameState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ReAgentSetProfileNameState a(ReAgentSetProfileNameInternalAction reAgentSetProfileNameInternalAction, ReAgentSetProfileNameState reAgentSetProfileNameState) {
        ReAgentSetProfileNameInternalAction reAgentSetProfileNameInternalAction2 = reAgentSetProfileNameInternalAction;
        ReAgentSetProfileNameState reAgentSetProfileNameState2 = reAgentSetProfileNameState;
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.FirstNameTextChanged) {
            ReAgentSetProfileNameState.InputState inputState = ReAgentSetProfileNameState.InputState.f211493b;
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, ((ReAgentSetProfileNameInternalAction.FirstNameTextChanged) reAgentSetProfileNameInternalAction2).f211476b, null, inputState, inputState, null, null, false, 66);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.SecondNameTextChanged) {
            ReAgentSetProfileNameState.InputState inputState2 = ReAgentSetProfileNameState.InputState.f211493b;
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, ((ReAgentSetProfileNameInternalAction.SecondNameTextChanged) reAgentSetProfileNameInternalAction2).f211482b, inputState2, inputState2, null, null, false, 65);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.EmptyNameError) {
            String str = reAgentSetProfileNameState2.f211486b;
            ReAgentSetProfileNameState.InputState inputState3 = C43066x.K(str) ? ReAgentSetProfileNameState.InputState.f211494c : ReAgentSetProfileNameState.InputState.f211493b;
            String str2 = reAgentSetProfileNameState2.f211487c;
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, null, inputState3, C43066x.K(str2) ? ReAgentSetProfileNameState.InputState.f211494c : ReAgentSetProfileNameState.InputState.f211493b, C43066x.K(str) ? com.avito.android.printable_text.b.c(R.string.re_agent_passport_add_profile_set_profile_name_empty_input_error, new Serializable[0]) : null, C43066x.K(str2) ? com.avito.android.printable_text.b.c(R.string.re_agent_passport_add_profile_set_profile_name_empty_input_error, new Serializable[0]) : null, false, 67);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.CreateProfileError) {
            Throwable th2 = ((ReAgentSetProfileNameInternalAction.CreateProfileError) reAgentSetProfileNameInternalAction2).f211471b;
            if (!com.avito.android.passport.profile_add.create_flow.set_profile_name.a.b(th2)) {
                ReAgentSetProfileNameState.InputState inputState4 = ReAgentSetProfileNameState.InputState.f211493b;
                return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, null, inputState4, inputState4, null, null, false, 67);
            }
            PrintableText printableTextF = com.avito.android.printable_text.b.f(com.avito.android.passport.profile_add.create_flow.set_profile_name.a.a(th2));
            ReAgentSetProfileNameState.InputState inputState5 = ReAgentSetProfileNameState.InputState.f211494c;
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, null, inputState5, inputState5, printableTextF, printableTextF, false, 67);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.StartLoading) {
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, null, null, null, null, null, true, 63);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.FinishLoading) {
            return ReAgentSetProfileNameState.a(reAgentSetProfileNameState2, null, null, null, null, null, null, false, 63);
        }
        if (reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.HandleDeeplink ? true : reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.OnFinal ? true : reAgentSetProfileNameInternalAction2 instanceof ReAgentSetProfileNameInternalAction.Close) {
            return reAgentSetProfileNameState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
