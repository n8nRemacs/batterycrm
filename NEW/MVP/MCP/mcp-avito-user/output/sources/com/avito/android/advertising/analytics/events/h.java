package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerViewEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/h;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BannerInfo f87804l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f87805m;

    public h(@k BannerInfo bannerInfo, @l String str, @k BannerPageSource bannerPageSource, @l String str2, int i12, @k BannerEvent.Type type, long j12) {
        super(bannerInfo, bannerPageSource, str2, Integer.valueOf(i12), type, j12, 3968, 18);
        this.f87804l = bannerInfo;
        this.f87805m = str;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "uid", this.f87805m);
        BannerInfo bannerInfo = this.f87804l;
        k(linkedHashMap, "puid", bannerInfo.f87882m);
        k(linkedHashMap, "creative_id", bannerInfo.f87894y);
        Integer num = bannerInfo.f87893x;
        if (num != null) {
            k(linkedHashMap, "adv_loading_progress", Integer.valueOf(num.intValue()));
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        k(linkedHashMap, "adv_impression_id", analyticsParams != null ? analyticsParams.f87958e : null);
        j(linkedHashMap, bannerInfo.f());
    }
}
