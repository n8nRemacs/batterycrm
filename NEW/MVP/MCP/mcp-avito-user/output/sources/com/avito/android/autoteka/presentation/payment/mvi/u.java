package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPaymentReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/autoteka/items/payment/PaymentItem;", "it", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState$Success;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class u extends N implements Y41.l<AutotekaPaymentState.Success, PaymentItem> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f97523l = new u();

    public u() {
        super(1);
    }

    @Override // Y41.l
    public final PaymentItem invoke(AutotekaPaymentState.Success success) {
        return PaymentItem.a(success.f97463e, PaymentItem.LoadingVariant.f96848b, null, 4079);
    }
}
