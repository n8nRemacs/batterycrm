package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import W50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationPopupOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "LW50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<VerificationPopupInternalAction, W50.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final W50.b b(VerificationPopupInternalAction verificationPopupInternalAction) {
        VerificationPopupInternalAction verificationPopupInternalAction2 = verificationPopupInternalAction;
        if (verificationPopupInternalAction2 instanceof VerificationPopupInternalAction.Navigate) {
            return new b.C1251b(((VerificationPopupInternalAction.Navigate) verificationPopupInternalAction2).f212272b);
        }
        if (verificationPopupInternalAction2 instanceof VerificationPopupInternalAction.HandleDeeplink) {
            return new b.a(((VerificationPopupInternalAction.HandleDeeplink) verificationPopupInternalAction2).f212271b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
