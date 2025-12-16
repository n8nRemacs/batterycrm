package com.avito.android.gig_motivation_payment.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vH.InterfaceC49212b;

/* compiled from: MotivationPaymentOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "LvH/b;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements com.avito.android.arch.mvi.t<MotivationPaymentInternalAction, InterfaceC49212b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49212b b(MotivationPaymentInternalAction motivationPaymentInternalAction) {
        InterfaceC49212b c12759b;
        MotivationPaymentInternalAction motivationPaymentInternalAction2 = motivationPaymentInternalAction;
        if (motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.a) {
            return InterfaceC49212b.a.f440635a;
        }
        if (motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.f) {
            c12759b = new InterfaceC49212b.c(((MotivationPaymentInternalAction.f) motivationPaymentInternalAction2).f160233b);
        } else {
            if (!(motivationPaymentInternalAction2 instanceof MotivationPaymentInternalAction.e)) {
                return null;
            }
            c12759b = new InterfaceC49212b.C12759b(((MotivationPaymentInternalAction.e) motivationPaymentInternalAction2).f160232b);
        }
        return c12759b;
    }
}
