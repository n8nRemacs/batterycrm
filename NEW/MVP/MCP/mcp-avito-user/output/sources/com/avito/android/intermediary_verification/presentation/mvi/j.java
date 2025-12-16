package com.avito.android.intermediary_verification.presentation.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IntermediaryVerificationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "LmO/b;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<IntermediaryVerificationInternalAction, mO.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final mO.b a(IntermediaryVerificationInternalAction intermediaryVerificationInternalAction, mO.b bVar) {
        IntermediaryVerificationInternalAction intermediaryVerificationInternalAction2 = intermediaryVerificationInternalAction;
        mO.b bVar2 = bVar;
        if (!(intermediaryVerificationInternalAction2 instanceof IntermediaryVerificationInternalAction.BuildState)) {
            return bVar2;
        }
        ((IntermediaryVerificationInternalAction.BuildState) intermediaryVerificationInternalAction2).getClass();
        return new mO.b(null);
    }
}
