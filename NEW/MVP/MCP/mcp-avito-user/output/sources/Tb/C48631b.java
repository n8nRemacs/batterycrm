package tb;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: VideoErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48631b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f439299b = new com.avito.android.analytics.provider.clickstream.b(11966, 4);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f439300c;

    public C48631b(@Y61.k BannerInfo bannerInfo, @Y61.k BannerPageSource bannerPageSource, @Y61.k String str, int i12, @Y61.k String str2, @Y61.l String str3) {
        String str4;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("media_name", str), new Q("errors_detailed", str2), new Q("pagetype", bannerPageSource.f87786b), new Q("selling_system", bannerInfo.d()), new Q("err", Integer.valueOf(i12)));
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode != null) {
            linkedHashMapJ.put("banner_code", bannerCode);
        }
        String alid = bannerInfo.getAlid();
        if (alid != null) {
            linkedHashMapJ.put("alid", alid);
        }
        Integer num = bannerInfo.f87894y;
        if (num != null) {
            org.webrtc.h.i(num, "creative_id", linkedHashMapJ);
        }
        if (str3 != null) {
            linkedHashMapJ.put("creative_title", str3);
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        if (analyticsParams != null && (str4 = analyticsParams.f87957d) != null) {
            linkedHashMapJ.put("template_type_id", str4);
        }
        linkedHashMapJ.put("block_id", bannerInfo.c());
        this.f439300c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f439299b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f439300c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f439299b.f90263c;
    }
}
