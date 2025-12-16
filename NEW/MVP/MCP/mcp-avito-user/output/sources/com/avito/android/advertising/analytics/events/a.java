package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerImpressionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/a;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BannerInfo f87787l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f87788m;

    public a(@k BannerInfo bannerInfo, @l String str, @k BannerPageSource bannerPageSource, @l String str2, int i12, @k BannerEvent.Type type, long j12) {
        super(bannerInfo, bannerPageSource, str2, Integer.valueOf(i12), type, j12, 6890, 15);
        this.f87787l = bannerInfo;
        this.f87788m = str;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "uid", this.f87788m);
        BannerInfo bannerInfo = this.f87787l;
        k(linkedHashMap, "puid", bannerInfo.f87882m);
        k(linkedHashMap, "item_id", bannerInfo.f87883n);
        k(linkedHashMap, "creative_id", bannerInfo.f87894y);
        int i12 = bannerInfo.f87891v;
        if (i12 != -1) {
            k(linkedHashMap, "adv_banner_per_screen", Integer.valueOf(i12));
        }
        Integer num = bannerInfo.f87893x;
        if (num != null) {
            k(linkedHashMap, "adv_loading_progress", Integer.valueOf(num.intValue()));
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        k(linkedHashMap, "adv_impression_id", analyticsParams != null ? analyticsParams.f87958e : null);
        j(linkedHashMap, bannerInfo.f());
    }
}
