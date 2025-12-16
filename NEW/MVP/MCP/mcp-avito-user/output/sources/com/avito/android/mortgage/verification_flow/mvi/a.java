package com.avito.android.mortgage.verification_flow.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import s10.C47959c;
import s10.InterfaceC47957a;

/* compiled from: VerificationFlowActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ls10/a;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "Ls10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC47957a, VerificationFlowInternalAction, C47959c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VerificationFlowInternalAction> b(InterfaceC47957a interfaceC47957a, C47959c c47959c) {
        C43210w c43210w;
        InterfaceC47957a interfaceC47957a2 = interfaceC47957a;
        if (interfaceC47957a2 instanceof InterfaceC47957a.C12605a) {
            return new C43210w(VerificationFlowInternalAction.BackClick.f203915b);
        }
        if (interfaceC47957a2 instanceof InterfaceC47957a.b) {
            c43210w = new C43210w(new VerificationFlowInternalAction.PrimaryActionClicked(((InterfaceC47957a.b) interfaceC47957a2).f437287a));
        } else {
            if (!(interfaceC47957a2 instanceof InterfaceC47957a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new VerificationFlowInternalAction.SecondaryActionClicked(((InterfaceC47957a.c) interfaceC47957a2).f437288a));
        }
        return c43210w;
    }
}
