package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/d;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BannerInfo f87794l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f87795m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f87796n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f87797o;

    public d(@k BannerInfo bannerInfo, @k BannerPageSource bannerPageSource, @l String str, @k BannerEvent.Type type, @l String str2, @k String str3, @l String str4, int i12, long j12) {
        super(bannerInfo, bannerPageSource, str, Integer.valueOf(i12), type, j12, 3215, 36);
        this.f87794l = bannerInfo;
        this.f87795m = str2;
        this.f87796n = str3;
        this.f87797o = str4;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "iid", this.f87795m);
        k(linkedHashMap, "uuid", this.f87796n);
        k(linkedHashMap, "uid", this.f87797o);
        BannerInfo bannerInfo = this.f87794l;
        k(linkedHashMap, "puid", bannerInfo.f87882m);
        k(linkedHashMap, "creative_id", bannerInfo.f87894y);
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        k(linkedHashMap, "adv_click_id", analyticsParams != null ? analyticsParams.f87959f : null);
        j(linkedHashMap, bannerInfo.f());
    }
}
