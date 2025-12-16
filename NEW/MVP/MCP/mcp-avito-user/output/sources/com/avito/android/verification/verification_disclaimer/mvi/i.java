package com.avito.android.verification.verification_disclaimer.mvi;

import NM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_disclaimer.mvi.entity.DisclaimerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclaimerEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "LNM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<DisclaimerInternalAction, NM0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final NM0.b b(DisclaimerInternalAction disclaimerInternalAction) {
        DisclaimerInternalAction disclaimerInternalAction2 = disclaimerInternalAction;
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.ShowToast) {
            return new b.a(com.avito.android.printable_text.b.f(((DisclaimerInternalAction.ShowToast) disclaimerInternalAction2).f325101b));
        }
        return null;
    }
}
