package com.avito.android.verification.verification_passport.mvi;

import VM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PassportOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "LVM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements t<PassportInternalAction, VM0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final VM0.b b(PassportInternalAction passportInternalAction) {
        PassportInternalAction passportInternalAction2 = passportInternalAction;
        if (passportInternalAction2.equals(PassportInternalAction.DismissCbrSDK.f325724b)) {
            return b.a.f17097a;
        }
        if (passportInternalAction2.equals(PassportInternalAction.SetSuccessAndFinish.f325727b)) {
            return b.d.f17100a;
        }
        if (passportInternalAction2.equals(PassportInternalAction.FinishWithNoChanges.f325725b)) {
            return b.C1176b.f17098a;
        }
        if (passportInternalAction2 instanceof PassportInternalAction.SetErrorAndFinish) {
            return new b.c(((PassportInternalAction.SetErrorAndFinish) passportInternalAction2).f325726b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
