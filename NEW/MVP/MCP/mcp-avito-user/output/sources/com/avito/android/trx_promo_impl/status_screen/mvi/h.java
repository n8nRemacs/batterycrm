package com.avito.android.trx_promo_impl.status_screen.mvi;

import aG0.InterfaceC19771b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_impl.status_screen.mvi.entity.TrxPromoStatusInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoStatusOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "LaG0/b;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TrxPromoStatusInternalAction, InterfaceC19771b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19771b b(TrxPromoStatusInternalAction trxPromoStatusInternalAction) {
        DeepLink uxFeedbackUri;
        InterfaceC19771b.c cVar;
        TrxPromoStatusInternalAction trxPromoStatusInternalAction2 = trxPromoStatusInternalAction;
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Back) {
            return InterfaceC19771b.a.f20845a;
        }
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Close) {
            return InterfaceC19771b.C1488b.f20846a;
        }
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.HandleDeeplink) {
            DeepLink deepLink = ((TrxPromoStatusInternalAction.HandleDeeplink) trxPromoStatusInternalAction2).f304466b;
            if (deepLink != null) {
                cVar = new InterfaceC19771b.c(deepLink);
                return cVar;
            }
            return null;
        }
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Content.Success) {
            DeepLink uxFeedbackUri2 = ((TrxPromoStatusInternalAction.Content.Success) trxPromoStatusInternalAction2).f304463b.getUxFeedbackUri();
            if (uxFeedbackUri2 != null) {
                cVar = new InterfaceC19771b.c(uxFeedbackUri2);
                return cVar;
            }
            return null;
        }
        if ((trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Content.Forbidden) && (uxFeedbackUri = ((TrxPromoStatusInternalAction.Content.Forbidden) trxPromoStatusInternalAction2).f304462b.getUxFeedbackUri()) != null) {
            cVar = new InterfaceC19771b.c(uxFeedbackUri);
            return cVar;
        }
        return null;
    }
}
