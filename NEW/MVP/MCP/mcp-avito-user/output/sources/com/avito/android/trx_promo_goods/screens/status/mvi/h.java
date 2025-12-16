package com.avito.android.trx_promo_goods.screens.status.mvi;

import PF0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoGoodsStatusOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "LPF0/b;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TrxPromoGoodsStatusInternalAction, PF0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final PF0.b b(TrxPromoGoodsStatusInternalAction trxPromoGoodsStatusInternalAction) {
        DeepLink uxFeedbackUri;
        b.c cVar;
        TrxPromoGoodsStatusInternalAction trxPromoGoodsStatusInternalAction2 = trxPromoGoodsStatusInternalAction;
        if (trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.Close) {
            return b.a.f12917a;
        }
        if (trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.FinishFlow) {
            return b.C0837b.f12918a;
        }
        if (trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.HandleDeeplink) {
            DeepLink deepLink = ((TrxPromoGoodsStatusInternalAction.HandleDeeplink) trxPromoGoodsStatusInternalAction2).f303850b;
            if (deepLink != null) {
                cVar = new b.c(deepLink);
                return cVar;
            }
            return null;
        }
        if ((trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.Content) && (uxFeedbackUri = ((TrxPromoGoodsStatusInternalAction.Content) trxPromoGoodsStatusInternalAction2).f303846b.getUxFeedbackUri()) != null) {
            cVar = new b.c(uxFeedbackUri);
            return cVar;
        }
        return null;
    }
}
