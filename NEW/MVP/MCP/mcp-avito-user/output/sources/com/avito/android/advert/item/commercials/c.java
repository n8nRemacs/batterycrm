package com.avito.android.advert.item.commercials;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.di.C27710t;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCommercialsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/commercials/c;", "Lcom/avito/android/advert/item/commercials/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final gr0.b f74325a;

    @Inject
    public c(@k @C27710t.f gr0.b bVar) {
        this.f74325a = bVar;
    }

    @Override // com.avito.android.advert.item.commercials.b
    @k
    public final a a(@k List<PositionedBannerContainer> list, @k SerpDisplayType serpDisplayType) {
        l1 l1VarC;
        AdvertSerpCommercialBanner advertSerpCommercialBanner = null;
        AdvertSerpCommercialBanner advertSerpCommercialBanner2 = null;
        for (PositionedBannerContainer positionedBannerContainer : list) {
            boolean zF2 = L.f(positionedBannerContainer.f74321b, "item_atf_android");
            String str = positionedBannerContainer.f74321b;
            AdvertSerpCommercialBanner advertSerpCommercialBanner3 = ((zF2 || L.f(str, "promo_item_gallery_android")) && (l1VarC = this.f74325a.c(positionedBannerContainer.f74322c, serpDisplayType)) != null) ? new AdvertSerpCommercialBanner(l1VarC) : null;
            if (L.f(str, "item_atf_android")) {
                advertSerpCommercialBanner = advertSerpCommercialBanner3;
            } else if (L.f(str, "promo_item_gallery_android")) {
                advertSerpCommercialBanner2 = advertSerpCommercialBanner3;
            }
        }
        return new a(advertSerpCommercialBanner, advertSerpCommercialBanner2);
    }
}
