package com.avito.android.passport.profile_add.onboarding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.onboarding.mvi.entity.PassportOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PassportOnboardingReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "Lh60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<PassportOnboardingInternalAction, h60.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final h60.c a(PassportOnboardingInternalAction passportOnboardingInternalAction, h60.c cVar) {
        PassportOnboardingInternalAction passportOnboardingInternalAction2 = passportOnboardingInternalAction;
        h60.c cVar2 = cVar;
        if (passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.Close.f213584b) ? true : passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.Continue.f213585b) ? true : passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.ProfileCreated.f213587b) ? true : passportOnboardingInternalAction2 instanceof PassportOnboardingInternalAction.AccountsMerged ? true : passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.KnowMore.f213586b)) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
