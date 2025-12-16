package com.avito.android.advert.item.buyer_trust_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;

/* compiled from: BuyerTrustBannerFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/buyer_trust_banner/c;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends WV0.a {
    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof BuyerTrustBannerItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        if ((interfaceC10495b instanceof BuyerTrustBannerItem) && ((BuyerTrustBannerItem) interfaceC10495b).f74215e.getShowEvent() != null) {
            throw null;
        }
    }
}
