package com.avito.android.trx_promo_goods.screens.status;

import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_goods.screens.status.TrxPromoGoodsStatusFragment;
import com.avito.android.trx_promo_goods.screens.status.deeplink.TrxPromoGoodsConfigureForbiddenLink;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsForbiddenFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/a;", "LA50/b;", "Lcom/avito/android/trx_promo_goods/screens/status/deeplink/TrxPromoGoodsConfigureForbiddenLink;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements A50.b<TrxPromoGoodsConfigureForbiddenLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TrxPromoGoodsConfigureForbiddenLink trxPromoGoodsConfigureForbiddenLink = (TrxPromoGoodsConfigureForbiddenLink) deepLink;
        TrxPromoGoodsStatusFragment.a aVar = TrxPromoGoodsStatusFragment.f303747B0;
        TrxPromoGoodsStatus trxPromoGoodsStatus = TrxPromoGoodsStatus.f303821c;
        aVar.getClass();
        TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = new TrxPromoGoodsStatusFragment();
        C35966w1.a(trxPromoGoodsStatusFragment, -1, new c(trxPromoGoodsConfigureForbiddenLink.f303774b, trxPromoGoodsConfigureForbiddenLink.f303776d, trxPromoGoodsStatus));
        return trxPromoGoodsStatusFragment;
    }
}
