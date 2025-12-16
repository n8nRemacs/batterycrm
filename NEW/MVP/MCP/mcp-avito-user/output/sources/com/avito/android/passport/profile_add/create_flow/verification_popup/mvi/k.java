package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationPopupReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "LW50/c;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<VerificationPopupInternalAction, W50.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final W50.c a(VerificationPopupInternalAction verificationPopupInternalAction, W50.c cVar) {
        VerificationPopupInternalAction verificationPopupInternalAction2 = verificationPopupInternalAction;
        W50.c cVar2 = cVar;
        if (verificationPopupInternalAction2 instanceof VerificationPopupInternalAction.HandleDeeplink ? true : verificationPopupInternalAction2 instanceof VerificationPopupInternalAction.Navigate) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
