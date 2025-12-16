package com.avito.android.mandatory_verification.presentation.mvi;

import UX.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "LUX/b;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<MandatoryVerificationInternalAction, UX.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final UX.b b(MandatoryVerificationInternalAction mandatoryVerificationInternalAction) {
        MandatoryVerificationInternalAction mandatoryVerificationInternalAction2 = mandatoryVerificationInternalAction;
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.FollowDeeplink) {
            return new b.C1128b(((MandatoryVerificationInternalAction.FollowDeeplink) mandatoryVerificationInternalAction2).f184789b);
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.OpenFilePicker) {
            return new b.c(((MandatoryVerificationInternalAction.OpenFilePicker) mandatoryVerificationInternalAction2).f184790b);
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ShowToast) {
            return new b.e(((MandatoryVerificationInternalAction.ShowToast) mandatoryVerificationInternalAction2).f184795b);
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ProceedSuccess) {
            return b.d.f16429a;
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.Cancel) {
            return b.a.f16426a;
        }
        return null;
    }
}
