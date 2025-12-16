package com.avito.android.mortgage.applicant_type.mvi;

import PZ.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.applicant_type.mvi.entity.ApplicantTypeSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicantTypeSelectorOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "LPZ/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<ApplicantTypeSelectorInternalAction, PZ.b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final PZ.b b(ApplicantTypeSelectorInternalAction applicantTypeSelectorInternalAction) {
        ApplicantTypeSelectorInternalAction applicantTypeSelectorInternalAction2 = applicantTypeSelectorInternalAction;
        if (applicantTypeSelectorInternalAction2 instanceof ApplicantTypeSelectorInternalAction.CloseDialogWithResult) {
            return new b.a(((ApplicantTypeSelectorInternalAction.CloseDialogWithResult) applicantTypeSelectorInternalAction2).f198324b);
        }
        return null;
    }
}
