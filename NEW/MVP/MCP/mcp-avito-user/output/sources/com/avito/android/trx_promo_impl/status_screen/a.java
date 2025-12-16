package com.avito.android.trx_promo_impl.status_screen;

import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureForbiddenLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: TrxPromoFragmentStatusForbiddenFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/a;", "LA50/b;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureForbiddenLink;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements A50.b<TrxPromoConfigureForbiddenLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TrxPromoConfigureForbiddenLink trxPromoConfigureForbiddenLink = (TrxPromoConfigureForbiddenLink) deepLink;
        TrxPromoStatusFragment.f304371z0.getClass();
        TrxPromoStatusFragment trxPromoStatusFragment = new TrxPromoStatusFragment();
        C35966w1.a(trxPromoStatusFragment, -1, new e(trxPromoConfigureForbiddenLink.f304503b, trxPromoConfigureForbiddenLink.f304505d, trxPromoConfigureForbiddenLink.f304506e));
        return trxPromoStatusFragment;
    }
}
