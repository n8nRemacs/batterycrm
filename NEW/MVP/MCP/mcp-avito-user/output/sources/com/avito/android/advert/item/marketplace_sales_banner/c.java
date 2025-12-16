package com.avito.android.advert.item.marketplace_sales_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketplaceSalesBannerFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner/c;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f77548e;

    @Inject
    public c(@k com.avito.android.advert_core.analytics.a aVar) {
        super(true, true, 0.0f, 1000L, 4, null);
        this.f77548e = aVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof MarketplaceSalesBannerItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        ParametrizedEvent showEvent;
        if (!(interfaceC10495b instanceof MarketplaceSalesBannerItem) || (showEvent = ((MarketplaceSalesBannerItem) interfaceC10495b).f77538d.getShowEvent()) == null) {
            return;
        }
        this.f77548e.O(showEvent);
    }
}
