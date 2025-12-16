package com.avito.android.trx_promo_goods.screens.configure;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_goods.deeplink.TrxPromoGoodsConfigureLink;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: TrxPromoGoodsConfigureFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/e;", "LA50/b;", "Lcom/avito/android/trx_promo_goods/deeplink/TrxPromoGoodsConfigureLink;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements A50.b<TrxPromoGoodsConfigureLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TrxPromoGoodsConfigureLink trxPromoGoodsConfigureLink = (TrxPromoGoodsConfigureLink) deepLink;
        TrxPromoGoodsConfigureFragment.f303328I0.getClass();
        TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = new TrxPromoGoodsConfigureFragment();
        trxPromoGoodsConfigureFragment.setArguments(C22777e.b(new Q("trx_promo_goods_key_context", trxPromoGoodsConfigureLink.f303324b), new Q("trx_promo_goods_key_closable", Boolean.valueOf(trxPromoGoodsConfigureLink.f303327e))));
        return trxPromoGoodsConfigureFragment;
    }
}
