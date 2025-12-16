package tb;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: VideoEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tb.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C48632c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f439301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f439302c;

    public C48632c(@Y61.k BannerInfo bannerInfo, @Y61.k String str, @Y61.l String str2, int i12, int i13) {
        String str3;
        this.f439301b = new com.avito.android.analytics.provider.clickstream.b(i12, i13);
        LinkedHashMap linkedHashMapJ = P0.j(new Q("media_name", str));
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode != null) {
            linkedHashMapJ.put("from_source", bannerCode);
        }
        String alid = bannerInfo.getAlid();
        if (alid != null) {
            linkedHashMapJ.put("media_session", alid);
        }
        if (str2 != null) {
            linkedHashMapJ.put("uid", str2);
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
        Object obj = bannerInfo.f87894y;
        obj = obj == null ? analyticsParams != null ? analyticsParams.f87955b : null : obj;
        if (obj != null) {
            linkedHashMapJ.put("creative_id", obj);
        }
        if (analyticsParams != null && (str3 = analyticsParams.f87957d) != null) {
            linkedHashMapJ.put("template_type_id", str3);
        }
        linkedHashMapJ.put("block_id", bannerInfo.c());
        this.f439302c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90247b() {
        return this.f439301b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public Map<String, Object> getParams() {
        return this.f439302c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90248c() {
        return this.f439301b.f90263c;
    }
}
