package tb;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoStartupTimeEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439304b;

    public k(@Y61.k BannerPageSource bannerPageSource, @Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.l Integer num2) {
        String str;
        HashMap map = new HashMap();
        map.put("pagetype", bannerPageSource.f87786b);
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode != null) {
            map.put("banner_code", bannerCode);
        }
        Integer num3 = bannerInfo.f87894y;
        if (num3 != null) {
            map.put("creative_id", Integer.valueOf(num3.intValue()));
        }
        map.put("time_to_prepare_video", Integer.valueOf(num.intValue()));
        map.put("time_to_display_video", Integer.valueOf(num2.intValue()));
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        if (analyticsParams != null && (str = analyticsParams.f87957d) != null) {
            map.put("template_type_id", str);
        }
        map.put("block_id", bannerInfo.c());
        G0 g02 = G0.f406611a;
        this.f439304b = new ParametrizedClickStreamEvent(12004, 3, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f439304b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f439304b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f439304b.f90248c;
    }
}
