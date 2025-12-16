package com.avito.android.trx_promo_impl;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureLink;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: TrxPromoFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_impl/i;", "LA50/b;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureLink;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements A50.b<TrxPromoConfigureLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TrxPromoConfigureLink trxPromoConfigureLink = (TrxPromoConfigureLink) deepLink;
        TrxPromoFragment.f303863H0.getClass();
        TrxPromoFragment trxPromoFragment = new TrxPromoFragment();
        trxPromoFragment.setArguments(C22777e.b(new Q("trx_promo_key_context", trxPromoConfigureLink.f304507b), new Q("trx_promo_key_closable", Boolean.valueOf(trxPromoConfigureLink.f304510e))));
        return trxPromoFragment;
    }
}
