package com.avito.android.mortgage.applicant_type.mvi;

import PZ.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.applicant_type.mvi.entity.ApplicantTypeSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicantTypeSelectorActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LPZ/a;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "LPZ/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<PZ.a, ApplicantTypeSelectorInternalAction, PZ.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ApplicantTypeSelectorInternalAction> b(PZ.a aVar, PZ.c cVar) {
        PZ.a aVar2 = aVar;
        PZ.c cVar2 = cVar;
        if (aVar2 instanceof a.C0850a) {
            return new C43210w(new ApplicantTypeSelectorInternalAction.CloseDialogWithResult(cVar2.f13142d));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new ApplicantTypeSelectorInternalAction.SelectApplicantType(((a.b) aVar2).f13136a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
