package com.avito.android.verification.verification_finish.mvi;

import QM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FinishOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "LQM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<FinishInternalAction, QM0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final QM0.b b(FinishInternalAction finishInternalAction) {
        if (finishInternalAction.equals(FinishInternalAction.Close.f325282b)) {
            return b.a.f13698a;
        }
        return null;
    }
}
