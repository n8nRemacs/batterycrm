package com.avito.android.wallet.page.history.mvi.component;

import VO0.c;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaymentHistoryOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "LVO0/c;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements com.avito.android.arch.mvi.t<PaymentHistoryInternalAction, VO0.c> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final VO0.c b(PaymentHistoryInternalAction paymentHistoryInternalAction) {
        PaymentHistoryInternalAction paymentHistoryInternalAction2 = paymentHistoryInternalAction;
        if (paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.StartActivity) {
            return new c.b(((PaymentHistoryInternalAction.StartActivity) paymentHistoryInternalAction2).f328076b);
        }
        if (paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.OpenRefundInfoBanner) {
            return c.a.f17120a;
        }
        return null;
    }
}
