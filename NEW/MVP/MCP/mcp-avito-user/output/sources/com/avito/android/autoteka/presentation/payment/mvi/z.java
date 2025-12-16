package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPaymentReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/autoteka/items/payment/PaymentItem;", "it", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Success;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class z extends N implements Y41.l<AutotekaPaymentState.Success, PaymentItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentInternalAction f97528l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AutotekaPaymentInternalAction autotekaPaymentInternalAction) {
        super(1);
        this.f97528l = autotekaPaymentInternalAction;
    }

    @Override // Y41.l
    public final PaymentItem invoke(AutotekaPaymentState.Success success) {
        PaymentItem paymentItem = success.f97463e;
        PaymentItem.PromoCodeState promoCodeState = paymentItem.f96844j;
        promoCodeState.f96853b = ((AutotekaPaymentInternalAction.PromoCodeChange) this.f97528l).f97451b;
        promoCodeState.f96854c = "";
        return paymentItem;
    }
}
