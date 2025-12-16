package com.avito.android.advertising.advertising_creative.mappers;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.CreativeNetworkBannerItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CreativeNetworkBannerItemMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/advertising_creative/mappers/b;", "Lcom/avito/android/advertising/advertising_creative/mappers/a;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.advertising.advertising_creative.mappers.a
    @k
    public final CommercialBanner a(@k CommercialBanner commercialBanner, @k String str) {
        List<AdNetworkBannerItem<?>> list = commercialBanner.f86886c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Parcelable creativeNetworkBannerItem : list) {
            if (creativeNetworkBannerItem instanceof BuzzoolaNetworkBannerItem) {
                BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem = (BuzzoolaNetworkBannerItem) creativeNetworkBannerItem;
                creativeNetworkBannerItem = new CreativeNetworkBannerItem(buzzoolaNetworkBannerItem.getBlockId(), buzzoolaNetworkBannerItem.getAlid(), buzzoolaNetworkBannerItem.getBannerCode(), buzzoolaNetworkBannerItem.getCategoryId(), buzzoolaNetworkBannerItem.getMicroCategoryId(), buzzoolaNetworkBannerItem.getLocationId(), str, buzzoolaNetworkBannerItem.getParams(), buzzoolaNetworkBannerItem.getAnalyticParams());
            }
            arrayList.add(creativeNetworkBannerItem);
        }
        return new CommercialBanner(commercialBanner.f86885b, arrayList, commercialBanner.f86887d, commercialBanner.f86888e, commercialBanner.f86889f, commercialBanner.f86890g, commercialBanner.f86891h, commercialBanner.f86892i);
    }
}
