package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BannerRenderEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/f;", "Lcom/avito/android/advertising/analytics/events/BannerEvent;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends BannerEvent {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BannerInfo f87798l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f87799m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f87800n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f87801o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f87802p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final String f87803q;

    public f(@k BannerInfo bannerInfo, @k BannerPageSource bannerPageSource, @l String str, @k BannerEvent.Type type, long j12, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l Integer num) {
        super(bannerInfo, bannerPageSource, str, num, type, j12, 3970, 19);
        this.f87798l = bannerInfo;
        this.f87799m = str2;
        this.f87800n = str3;
        this.f87801o = str4;
        this.f87802p = str5;
        this.f87803q = str6;
    }

    @Override // com.avito.android.advertising.analytics.events.BannerEvent
    public final void i(@k LinkedHashMap linkedHashMap) {
        k(linkedHashMap, "req_num", Integer.valueOf(this.f87772k));
        BannerInfo bannerInfo = this.f87798l;
        k(linkedHashMap, "creative_id", bannerInfo.f87894y);
        String strSubstring = this.f87799m;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() >= 100) {
            strSubstring = strSubstring.substring(0, 100);
        }
        k(linkedHashMap, "adv_domain", strSubstring);
        String strSubstring2 = this.f87800n;
        if (strSubstring2 == null) {
            strSubstring2 = null;
        } else if (strSubstring2.length() >= 2048) {
            strSubstring2 = strSubstring2.substring(0, 2048);
        }
        k(linkedHashMap, "adv_legal", strSubstring2);
        String strSubstring3 = this.f87801o;
        if (strSubstring3 == null) {
            strSubstring3 = null;
        } else if (strSubstring3.length() >= 200) {
            strSubstring3 = strSubstring3.substring(0, 200);
        }
        k(linkedHashMap, "creative_body", strSubstring3);
        String str = this.f87802p;
        k(linkedHashMap, "creative_title", str != null ? str.length() >= 200 ? str.substring(0, 200) : str : null);
        k(linkedHashMap, "uid", this.f87803q);
        k(linkedHashMap, "puid", bannerInfo.f87882m);
        j(linkedHashMap, bannerInfo.f());
    }
}
