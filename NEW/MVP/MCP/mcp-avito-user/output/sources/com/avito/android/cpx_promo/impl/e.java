package com.avito.android.cpx_promo.impl;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.cpx_promo.common.deeplink.CpxPromoLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CpxPromoFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/impl/e;", "LA50/b;", "Lcom/avito/android/cpx_promo/common/deeplink/CpxPromoLink;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements A50.b<CpxPromoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpxPromoLink cpxPromoLink = (CpxPromoLink) deepLink;
        CpxPromoFragment.f126889s0.getClass();
        CpxPromoFragment cpxPromoFragment = new CpxPromoFragment();
        C35966w1.a(cpxPromoFragment, -1, new c(cpxPromoLink.f126806c, cpxPromoLink.f126805b, cpxPromoLink.f126807d));
        return cpxPromoFragment;
    }
}
