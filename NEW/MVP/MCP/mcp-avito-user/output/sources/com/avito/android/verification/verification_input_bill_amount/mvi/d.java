package com.avito.android.verification.verification_input_bill_amount.mvi;

import UM0.a;
import UM0.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.error.z;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.n;
import com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountArgs;
import com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InputBillAmountActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LUM0/a;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "LUM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.a<UM0.a, InputBillAmountInternalAction, UM0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationInputBillAmountArgs f325560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_input_bill_amount.c f325562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.n f325563d;

    @Inject
    public d(@Y61.k VerificationInputBillAmountArgs verificationInputBillAmountArgs, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_input_bill_amount.c cVar, @Y61.k com.avito.android.verification.inn.n nVar) {
        this.f325560a = verificationInputBillAmountArgs;
        this.f325561b = aVar;
        this.f325562c = cVar;
        this.f325563d = nVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InputBillAmountInternalAction> b(UM0.a aVar, UM0.c cVar) {
        C43210w c43210w;
        a.C10030a c10030a;
        UM0.a aVar2 = aVar;
        UM0.c cVar2 = cVar;
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(this, aVar2, null));
        }
        if (aVar2 instanceof a.C1118a) {
            c.b bVar = cVar2 instanceof c.b ? (c.b) cVar2 : null;
            ArrayList arrayList = (bVar == null || (c10030a = bVar.f16361c) == null) ? null : c10030a.f323872a;
            if (arrayList != null) {
                this.f325563d.getClass();
                n.a aVarA = com.avito.android.verification.inn.n.a(arrayList);
                if (aVarA instanceof n.a.C10034a) {
                    return C43175k.G(new b(aVarA, null));
                }
                if (aVarA instanceof n.a.b) {
                    return C43175k.G(new c(this, aVarA, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InputBillAmountInternalAction.ShowErrorToast(z.l(new UnknownError())));
        } else {
            if (aVar2.equals(a.d.f16356a)) {
                return this.f325562c.a(this.f325560a.f325482b);
            }
            if (!aVar2.equals(a.b.f16354a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InputBillAmountInternalAction.FinishActivity());
        }
        return c43210w;
    }
}
