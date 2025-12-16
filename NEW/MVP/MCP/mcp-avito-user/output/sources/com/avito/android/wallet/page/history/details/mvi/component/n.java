package com.avito.android.wallet.page.history.details.mvi.component;

import SO0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaymentHistoryDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/component/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "LSO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements t<PaymentHistoryDetailsInternalAction, SO0.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final SO0.b b(PaymentHistoryDetailsInternalAction paymentHistoryDetailsInternalAction) {
        PaymentHistoryDetailsInternalAction paymentHistoryDetailsInternalAction2 = paymentHistoryDetailsInternalAction;
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.RunChromeCustomTabs) {
            PaymentHistoryDetailsInternalAction.RunChromeCustomTabs runChromeCustomTabs = (PaymentHistoryDetailsInternalAction.RunChromeCustomTabs) paymentHistoryDetailsInternalAction2;
            return new b.C1011b(runChromeCustomTabs.f327941b, runChromeCustomTabs.f327942c);
        }
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.ShowFiscalizationErrorDialog) {
            return b.c.f14960a;
        }
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.ShowFiscalizationInProgressDialog) {
            return b.d.f14961a;
        }
        if (paymentHistoryDetailsInternalAction2.equals(PaymentHistoryDetailsInternalAction.ShowRefundError.f327945b)) {
            return b.e.f14962a;
        }
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.ShowRefundSuccess) {
            return new b.f(((PaymentHistoryDetailsInternalAction.ShowRefundSuccess) paymentHistoryDetailsInternalAction2).f327946b);
        }
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.CloseRefundConfirmationSheet) {
            return b.a.f14957a;
        }
        return null;
    }
}
