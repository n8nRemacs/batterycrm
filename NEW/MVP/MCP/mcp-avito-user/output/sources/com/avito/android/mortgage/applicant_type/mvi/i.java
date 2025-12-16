package com.avito.android.mortgage.applicant_type.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.applicant_type.mvi.entity.ApplicantTypeSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicantTypeSelectorReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "LPZ/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements u<ApplicantTypeSelectorInternalAction, PZ.c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OZ.b f198333b;

    @Inject
    public i(@k OZ.b bVar) {
        this.f198333b = bVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final PZ.c a(ApplicantTypeSelectorInternalAction applicantTypeSelectorInternalAction, PZ.c cVar) {
        ApplicantTypeSelectorInternalAction applicantTypeSelectorInternalAction2 = applicantTypeSelectorInternalAction;
        PZ.c cVarA = cVar;
        if (applicantTypeSelectorInternalAction2 instanceof ApplicantTypeSelectorInternalAction.Init) {
            ApplicantTypeSelectorArguments applicantTypeSelectorArguments = ((ApplicantTypeSelectorInternalAction.Init) applicantTypeSelectorInternalAction2).f198325b;
            cVarA = PZ.c.a(cVarA, applicantTypeSelectorArguments.f198309b, applicantTypeSelectorArguments.f198310c, null, 4);
        } else if (applicantTypeSelectorInternalAction2 instanceof ApplicantTypeSelectorInternalAction.SelectApplicantType) {
            cVarA = PZ.c.a(cVarA, null, null, ((ApplicantTypeSelectorInternalAction.SelectApplicantType) applicantTypeSelectorInternalAction2).f198326b, 3);
        }
        this.f198333b.a(applicantTypeSelectorInternalAction2, cVarA);
        return cVarA;
    }
}
