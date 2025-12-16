package com.avito.android.passport.profile_add.onboarding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.onboarding.mvi.entity.PassportOnboardingInternalAction;
import h60.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PassportOnboardingOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "Lh60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<PassportOnboardingInternalAction, h60.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final h60.b b(PassportOnboardingInternalAction passportOnboardingInternalAction) {
        PassportOnboardingInternalAction passportOnboardingInternalAction2 = passportOnboardingInternalAction;
        if (passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.Close.f213584b)) {
            return b.C11243b.f397001a;
        }
        if (passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.Continue.f213585b)) {
            return b.c.f397002a;
        }
        if (passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.KnowMore.f213586b)) {
            return b.d.f397003a;
        }
        if (passportOnboardingInternalAction2.equals(PassportOnboardingInternalAction.ProfileCreated.f213587b)) {
            return b.e.f397004a;
        }
        if (passportOnboardingInternalAction2 instanceof PassportOnboardingInternalAction.AccountsMerged) {
            return new b.a(((PassportOnboardingInternalAction.AccountsMerged) passportOnboardingInternalAction2).f213583b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
