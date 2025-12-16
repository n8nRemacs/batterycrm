package com.avito.android.cpx_promo.v2;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.cpx_promo.common.deeplink.CpxPromoV2Link;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CpxPromoV2FragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/v2/n;", "LA50/b;", "Lcom/avito/android/cpx_promo/common/deeplink/CpxPromoV2Link;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements A50.b<CpxPromoV2Link> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpxPromoV2Link cpxPromoV2Link = (CpxPromoV2Link) deepLink;
        CpxPromoV2Fragment.f127346s0.getClass();
        CpxPromoV2Fragment cpxPromoV2Fragment = new CpxPromoV2Fragment();
        C35966w1.a(cpxPromoV2Fragment, -1, new d(cpxPromoV2Link.f126809c, cpxPromoV2Link.f126808b, cpxPromoV2Link.f126810d));
        return cpxPromoV2Fragment;
    }
}
