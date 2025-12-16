package com.avito.android.mortgage.consultation.mvi;

import XZ.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageConsultationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "LXZ/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<MortgageConsultationInternalAction, XZ.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final XZ.c b(MortgageConsultationInternalAction mortgageConsultationInternalAction) {
        MortgageConsultationInternalAction mortgageConsultationInternalAction2 = mortgageConsultationInternalAction;
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotAssignLoadingCompleted) {
            return ((MortgageConsultationInternalAction.SlotAssignLoadingCompleted) mortgageConsultationInternalAction2).f198617b ? new c.a(com.avito.android.printable_text.b.c(R.string.mortgage_consultation_success, new Serializable[0])) : new c.b(com.avito.android.printable_text.b.c(R.string.mortgage_consultation_error, new Serializable[0]));
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotAssignLoadingFailed) {
            return new c.b(com.avito.android.printable_text.b.c(R.string.mortgage_consultation_error, new Serializable[0]));
        }
        return null;
    }
}
