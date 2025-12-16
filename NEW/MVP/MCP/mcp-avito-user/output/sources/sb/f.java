package sb;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import org.webrtc.h;

/* compiled from: HtmlErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsb/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f437729b = new com.avito.android.analytics.provider.clickstream.b(12653, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f437730c;

    public f(@k BannerInfo bannerInfo, @k BannerPageSource bannerPageSource, @l Integer num, @l String str) {
        String str2;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("pagetype", bannerPageSource.f87786b), new Q("selling_system", bannerInfo.d()));
        if (str != null) {
            linkedHashMapJ.put("errors_detailed", str);
        }
        if (num != null) {
            h.i(num, "err", linkedHashMapJ);
        }
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode != null) {
            linkedHashMapJ.put("banner_code", bannerCode);
        }
        String alid = bannerInfo.getAlid();
        if (alid != null) {
            linkedHashMapJ.put("alid", alid);
        }
        Integer num2 = bannerInfo.f87894y;
        if (num2 != null) {
            h.i(num2, "creative_id", linkedHashMapJ);
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        if (analyticsParams != null && (str2 = analyticsParams.f87957d) != null) {
            linkedHashMapJ.put("template_type_id", str2);
        }
        linkedHashMapJ.put("block_id", bannerInfo.c());
        this.f437730c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f437729b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437730c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f437729b.f90263c;
    }
}
