package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.CpxPromoGeoLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CpxPromoGeoFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/ui/d;", "LA50/b;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/deeplink/CpxPromoGeoLink;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements A50.b<CpxPromoGeoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpxPromoGeoLink cpxPromoGeoLink = (CpxPromoGeoLink) deepLink;
        CpxPromoGeoFragment.f127915s0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("context", cpxPromoGeoLink.f127793b);
        bundle.putString("itemId", cpxPromoGeoLink.f127794c);
        CpxPromoGeoFragment cpxPromoGeoFragment = new CpxPromoGeoFragment();
        cpxPromoGeoFragment.setArguments(bundle);
        return cpxPromoGeoFragment;
    }
}
