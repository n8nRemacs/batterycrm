package com.avito.android.trx_promo_goods.screens.configure.mvi;

import MF0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsConfigureOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "LMF0/c;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<TrxPromoGoodsConfigureInternalAction, MF0.c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final MF0.c b(TrxPromoGoodsConfigureInternalAction trxPromoGoodsConfigureInternalAction) {
        TrxPromoGoodsConfigureInternalAction trxPromoGoodsConfigureInternalAction2 = trxPromoGoodsConfigureInternalAction;
        if (trxPromoGoodsConfigureInternalAction2 instanceof TrxPromoGoodsConfigureInternalAction.Content) {
            DeepLink termsUri = ((TrxPromoGoodsConfigureInternalAction.Content) trxPromoGoodsConfigureInternalAction2).f303583b.getTermsUri();
            if (termsUri == null) {
                return null;
            }
            return new c.C0669c(termsUri, null, null, 6, null);
        }
        if (trxPromoGoodsConfigureInternalAction2 instanceof TrxPromoGoodsConfigureInternalAction.Close) {
            return c.a.f10505a;
        }
        if (trxPromoGoodsConfigureInternalAction2 instanceof TrxPromoGoodsConfigureInternalAction.FinishFlow) {
            return c.b.f10506a;
        }
        if (!(trxPromoGoodsConfigureInternalAction2 instanceof TrxPromoGoodsConfigureInternalAction.HandleDeeplink)) {
            return null;
        }
        TrxPromoGoodsConfigureInternalAction.HandleDeeplink handleDeeplink = (TrxPromoGoodsConfigureInternalAction.HandleDeeplink) trxPromoGoodsConfigureInternalAction2;
        return new c.C0669c(handleDeeplink.f303585b, handleDeeplink.f303586c, handleDeeplink.f303587d);
    }
}
