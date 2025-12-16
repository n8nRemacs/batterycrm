package com.avito.android.intermediary_verification.presentation.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mO.InterfaceC43987a;

/* compiled from: IntermediaryVerificationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "LmO/a;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<IntermediaryVerificationInternalAction, InterfaceC43987a> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43987a b(IntermediaryVerificationInternalAction intermediaryVerificationInternalAction) {
        IntermediaryVerificationInternalAction intermediaryVerificationInternalAction2 = intermediaryVerificationInternalAction;
        if (intermediaryVerificationInternalAction2 instanceof IntermediaryVerificationInternalAction.Cancel) {
            return InterfaceC43987a.C11827a.f414485a;
        }
        if (intermediaryVerificationInternalAction2 instanceof IntermediaryVerificationInternalAction.LeavePublish) {
            return InterfaceC43987a.c.f414487a;
        }
        if (intermediaryVerificationInternalAction2 instanceof IntermediaryVerificationInternalAction.FollowDeeplink) {
            return new InterfaceC43987a.b(((IntermediaryVerificationInternalAction.FollowDeeplink) intermediaryVerificationInternalAction2).f173191b);
        }
        if (intermediaryVerificationInternalAction2 instanceof IntermediaryVerificationInternalAction.UpdateVerification) {
            return InterfaceC43987a.d.f414488a;
        }
        return null;
    }
}
