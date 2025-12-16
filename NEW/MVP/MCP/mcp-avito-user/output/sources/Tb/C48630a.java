package tb;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VideoCompleteEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb/a;", "Ltb/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48630a extends C48632c {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BannerInfo f439296d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f439297e;

    /* renamed from: f, reason: collision with root package name */
    public final int f439298f;

    public C48630a(int i12, @Y61.k BannerInfo bannerInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        super(bannerInfo, str, str2, 4787, 16);
        this.f439296d = bannerInfo;
        this.f439297e = str3;
        this.f439298f = i12;
    }

    @Override // tb.C48632c, com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        LinkedHashMap linkedHashMap = this.f439302c;
        BannerInfo bannerInfo = this.f439296d;
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        if (analyticsParams != null) {
            String str = analyticsParams.f87960g;
            if (str != null) {
                linkedHashMap.put("adv_fullview_id", str);
            }
            linkedHashMap.put("url_click_in", Boolean.valueOf(analyticsParams.f87961h));
        }
        String str2 = this.f439297e;
        if (str2 != null) {
            linkedHashMap.put("user_key", str2);
        }
        Integer num = bannerInfo.f87884o;
        if (num != null) {
            org.webrtc.h.i(num, "page_number", linkedHashMap);
        }
        linkedHashMap.put("item_position", Integer.valueOf(this.f439298f + 1));
        return linkedHashMap;
    }
}
