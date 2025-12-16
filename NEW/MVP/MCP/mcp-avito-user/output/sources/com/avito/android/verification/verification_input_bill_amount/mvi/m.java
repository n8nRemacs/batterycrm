package com.avito.android.verification.verification_input_bill_amount.mvi;

import UM0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.inn.VerificationInputBillAmountResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.p;
import com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InputBillAmountReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "LUM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements u<InputBillAmountInternalAction, UM0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f325589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.a f325590c;

    @Inject
    public m(@Y61.k p pVar, @Y61.k com.avito.android.verification.inn.a aVar) {
        this.f325589b = pVar;
        this.f325590c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final UM0.c a(InputBillAmountInternalAction inputBillAmountInternalAction, UM0.c cVar) {
        c.b bVar;
        InputBillAmountInternalAction inputBillAmountInternalAction2 = inputBillAmountInternalAction;
        UM0.c cVar2 = cVar;
        if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Loading) {
            return c.C1120c.f16362b;
        }
        boolean z12 = inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Loaded;
        com.avito.android.verification.inn.a aVar = this.f325590c;
        if (z12) {
            VerificationInputBillAmountResult verificationInputBillAmountResult = ((InputBillAmountInternalAction.Loaded) inputBillAmountInternalAction2).f325571b;
            VerificationAction action = verificationInputBillAmountResult.getAction();
            String title = action != null ? action.getTitle() : null;
            if (title == null) {
                title = "";
            }
            bVar = new c.b(new UU.a(title, null, false, false, false, null, null, null, null, false, 1022, null), com.avito.android.verification.inn.a.b(aVar, p.b(this.f325589b, verificationInputBillAmountResult.getFields(), verificationInputBillAmountResult.getTitle(), verificationInputBillAmountResult.getSubtitle(), 24)));
        } else {
            if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Error) {
                return new c.a(z.k(((InputBillAmountInternalAction.Error) inputBillAmountInternalAction2).f325568b));
            }
            if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.InputValidationFailed) {
                if (!(cVar2 instanceof c.b)) {
                    return cVar2;
                }
                c.b bVar2 = (c.b) cVar2;
                ArrayList arrayList = bVar2.f16361c.f323872a;
                Map<String, AttributedText> map = ((InputBillAmountInternalAction.InputValidationFailed) inputBillAmountInternalAction2).f325570b;
                aVar.getClass();
                bVar = new c.b(bVar2.f16360b, com.avito.android.verification.inn.a.a(arrayList, map));
            } else {
                if (!(inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.SetButtonLoading)) {
                    if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.ShowErrorToast ? true : inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.FinishActivity) {
                        return cVar2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(cVar2 instanceof c.b)) {
                    return cVar2;
                }
                c.b bVar3 = (c.b) cVar2;
                bVar = new c.b(UU.a.a(bVar3.f16360b, null, false, ((InputBillAmountInternalAction.SetButtonLoading) inputBillAmountInternalAction2).f325572b, false, null, 1015), bVar3.f16361c);
            }
        }
        return bVar;
    }
}
