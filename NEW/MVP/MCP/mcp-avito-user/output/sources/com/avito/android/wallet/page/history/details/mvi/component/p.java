package com.avito.android.wallet.page.history.details.mvi.component;

import SO0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaymentHistoryDetailsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/component/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "LSO0/c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements u<PaymentHistoryDetailsInternalAction, SO0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f327921b;

    @Inject
    public p(@Y61.k r rVar) {
        this.f327921b = rVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final SO0.c a(PaymentHistoryDetailsInternalAction paymentHistoryDetailsInternalAction, SO0.c cVar) {
        PaymentHistoryDetailsInternalAction paymentHistoryDetailsInternalAction2 = paymentHistoryDetailsInternalAction;
        SO0.c cVar2 = cVar;
        boolean z12 = paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.Loading;
        r rVar = this.f327921b;
        if (z12) {
            return rVar.a(SO0.c.a(cVar2, c.b.C1013c.f14970a, null, 2));
        }
        if (paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.Content) {
            return rVar.a(SO0.c.a(cVar2, new c.b.a(((PaymentHistoryDetailsInternalAction.Content) paymentHistoryDetailsInternalAction2).f327936b), null, 2));
        }
        if (!(paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.Refund)) {
            return paymentHistoryDetailsInternalAction2 instanceof PaymentHistoryDetailsInternalAction.Error ? rVar.a(SO0.c.a(cVar2, new c.b.C1012b(((PaymentHistoryDetailsInternalAction.Error) paymentHistoryDetailsInternalAction2).f327937b), null, 2)) : cVar2;
        }
        PaymentHistoryDetailsInternalAction.Refund refund = (PaymentHistoryDetailsInternalAction.Refund) paymentHistoryDetailsInternalAction2;
        return rVar.a(SO0.c.a(cVar2, new c.b.d(refund.f327939b, refund.f327940c), null, 2));
    }
}
