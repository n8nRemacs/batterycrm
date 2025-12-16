package com.avito.android.gig_motivation_payment.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import vH.c;

/* compiled from: MotivationPaymentReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "LvH/c;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements u<MotivationPaymentInternalAction, vH.c> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final vH.c a(MotivationPaymentInternalAction motivationPaymentInternalAction, vH.c cVar) {
        vH.c bVar;
        MotivationPaymentInternalAction motivationPaymentInternalAction2 = motivationPaymentInternalAction;
        vH.c cVar2 = cVar;
        if (cVar2 instanceof c.b) {
            c.b bVar2 = (c.b) cVar2;
            if (motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.ContentLoaded) {
                return new c.b(((MotivationPaymentInternalAction.ContentLoaded) motivationPaymentInternalAction2).f160227b, false);
            }
            if (motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.b) {
                bVar = c.C12760c.f440642c;
            } else if (L.f(motivationPaymentInternalAction2, MotivationPaymentInternalAction.c.f160230b)) {
                bVar = c.d.f440643c;
            } else {
                if (!L.f(motivationPaymentInternalAction2, MotivationPaymentInternalAction.d.f160231b)) {
                    return bVar2;
                }
                bVar = new c.b(bVar2.f440640c, true);
            }
        } else {
            if (!(cVar2 instanceof c.C12760c)) {
                if (cVar2 instanceof c.d) {
                    return motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.ContentLoaded ? new c.b(((MotivationPaymentInternalAction.ContentLoaded) motivationPaymentInternalAction2).f160227b, false) : motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.b ? c.C12760c.f440642c : (c.d) cVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            c.C12760c c12760c = (c.C12760c) cVar2;
            if (!L.f(motivationPaymentInternalAction2, MotivationPaymentInternalAction.c.f160230b)) {
                return c12760c;
            }
            bVar = c.d.f440643c;
        }
        return bVar;
    }
}
