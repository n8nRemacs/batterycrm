package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.items.fullScreenError.payment.PaymentErrorItem;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaPaymentReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/A;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements com.avito.android.arch.mvi.u<AutotekaPaymentInternalAction, AutotekaPaymentState> {
    @Inject
    public A() {
    }

    public static AutotekaPaymentState b(AutotekaPaymentState autotekaPaymentState, Y41.l lVar) {
        return autotekaPaymentState instanceof AutotekaPaymentState.Success ? new AutotekaPaymentState.Success((PaymentItem) lVar.invoke(autotekaPaymentState)) : autotekaPaymentState;
    }

    @Override // com.avito.android.arch.mvi.u
    public final AutotekaPaymentState a(AutotekaPaymentInternalAction autotekaPaymentInternalAction, AutotekaPaymentState autotekaPaymentState) {
        AutotekaPaymentInternalAction autotekaPaymentInternalAction2 = autotekaPaymentInternalAction;
        AutotekaPaymentState autotekaPaymentState2 = autotekaPaymentState;
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.Success) {
            return new AutotekaPaymentState.Success(((AutotekaPaymentInternalAction.Success) autotekaPaymentInternalAction2).f97454b);
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.LoadingPayment) {
            return b(autotekaPaymentState2, u.f97523l);
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenPayment) {
            return b(autotekaPaymentState2, v.f97524l);
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.Loading) {
            AutotekaPaymentState.f97457c.getClass();
            return AutotekaPaymentState.f97458d;
        }
        if (!(autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.Error)) {
            return autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.ToastError ? b(autotekaPaymentState2, w.f97525l) : autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OrderItemError ? b(autotekaPaymentState2, x.f97526l) : autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.LoadingPromoCode ? b(autotekaPaymentState2, y.f97527l) : autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.PromoCodeChange ? b(autotekaPaymentState2, new z(autotekaPaymentInternalAction2)) : autotekaPaymentState2;
        }
        ApiError apiError = ((AutotekaPaymentInternalAction.Error) autotekaPaymentInternalAction2).f97439b;
        return new AutotekaPaymentState.Error(new PaymentErrorItem(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null), apiError);
    }
}
