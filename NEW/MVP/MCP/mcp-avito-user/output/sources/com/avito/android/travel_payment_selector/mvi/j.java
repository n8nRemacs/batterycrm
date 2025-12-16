package com.avito.android.travel_payment_selector.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.component.toast.f;
import com.avito.android.remote.error.ApiError;
import com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction;
import com.avito.android.travel_payment_selector.mvi.model.PaymentType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import lF0.InterfaceC43629b;

/* compiled from: PaymentSelectorOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "LlF0/b;", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<PaymentSelectorInternalAction, InterfaceC43629b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43629b b(PaymentSelectorInternalAction paymentSelectorInternalAction) {
        PaymentSelectorInternalAction paymentSelectorInternalAction2 = paymentSelectorInternalAction;
        if (paymentSelectorInternalAction2 instanceof PaymentSelectorInternalAction.Error) {
            ApiError apiError = ((PaymentSelectorInternalAction.Error) paymentSelectorInternalAction2).f302660c;
            return new InterfaceC43629b.C11780b(com.avito.android.printable_text.b.f(apiError.getMessage()), new f.c(apiError));
        }
        if (paymentSelectorInternalAction2 instanceof PaymentSelectorInternalAction.OpenPaymentDeeplink) {
            return new InterfaceC43629b.a(((PaymentSelectorInternalAction.OpenPaymentDeeplink) paymentSelectorInternalAction2).f302662b);
        }
        if (paymentSelectorInternalAction2 instanceof PaymentSelectorInternalAction.ChangePaymentType) {
            PaymentType[] paymentTypeArr = PaymentType.f302694b;
            if (L.f(((PaymentSelectorInternalAction.ChangePaymentType) paymentSelectorInternalAction2).f302658b, "prepaid")) {
                return InterfaceC43629b.c.f413674a;
            }
        }
        return null;
    }
}
