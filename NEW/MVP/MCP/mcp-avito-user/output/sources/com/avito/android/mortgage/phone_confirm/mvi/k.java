package com.avito.android.mortgage.phone_confirm.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.domain.check_access.a;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "LJ00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<PhoneConfirmInternalAction, J00.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I00.a f201661b;

    @Inject
    public k(@Y61.k I00.a aVar) {
        this.f201661b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final J00.c a(PhoneConfirmInternalAction phoneConfirmInternalAction, J00.c cVar) {
        J00.c cVarA;
        Integer num;
        PhoneConfirmInternalAction phoneConfirmInternalAction2 = phoneConfirmInternalAction;
        J00.c cVarA2 = cVar;
        boolean z12 = phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.InitState;
        int iIntValue = cVarA2.f8710k;
        if (z12) {
            PhoneConfirmArguments phoneConfirmArguments = ((PhoneConfirmInternalAction.InitState) phoneConfirmInternalAction2).f201645b;
            String str = phoneConfirmArguments.f201581f;
            String str2 = phoneConfirmArguments.f201578c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            Integer num2 = phoneConfirmArguments.f201579d;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            cVarA = J00.c.a(cVarA2, str, phoneConfirmArguments.f201582g, phoneConfirmArguments.f201583h, phoneConfirmArguments.f201585j, str3, null, phoneConfirmArguments.f201580e, iIntValue, 0, false, false, 7368);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.AccessCheckStarted) {
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, 0, 0, false, true, 4095);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.AccessCheckCompleted) {
            com.avito.android.mortgage.domain.check_access.a aVar = ((PhoneConfirmInternalAction.AccessCheckCompleted) phoneConfirmInternalAction2).f201633b;
            a.C5890a c5890a = aVar instanceof a.C5890a ? (a.C5890a) aVar : null;
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, (c5890a == null || (num = c5890a.f199472c) == null) ? iIntValue : num.intValue(), 0, false, false, 3583);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.AccessCheckFailed) {
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, 0, 0, false, false, 4095);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.ConfirmationStarted) {
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, 0, 0, true, false, 6143);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.ConfirmationCompleted) {
            PhoneConfirmInternalAction.ConfirmationCompleted confirmationCompleted = (PhoneConfirmInternalAction.ConfirmationCompleted) phoneConfirmInternalAction2;
            if (!confirmationCompleted.f201639b) {
                cVarA2 = J00.c.a(cVarA2, null, null, null, null, null, null, confirmationCompleted.f201640c, 0, 0, false, false, 5887);
            }
            cVarA = cVarA2;
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.ConfirmationFailed) {
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, 0, 0, false, false, 6143);
        } else if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.CodeChanged) {
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, ((PhoneConfirmInternalAction.CodeChanged) phoneConfirmInternalAction2).f201638b, null, 0, 0, false, false, 7871);
        } else {
            if (!(phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.TimerTick)) {
                throw new NoWhenBranchMatchedException();
            }
            cVarA = J00.c.a(cVarA2, null, null, null, null, null, null, null, 0, ((PhoneConfirmInternalAction.TimerTick) phoneConfirmInternalAction2).f201646b, false, false, 7167);
        }
        this.f201661b.a(phoneConfirmInternalAction2, cVarA);
        return cVarA;
    }
}
