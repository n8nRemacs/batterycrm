package Wa;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionSharingOption.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWa/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-collection-sharing-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17953b;

    public b(@l String str, @l String str2, @l Boolean bool, @l String str3, @l String str4) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("uid", str);
        }
        if (str2 != null) {
            map.put("u", str2);
        }
        if (bool != null) {
            map.put("is_favcollection_owner", bool);
        }
        if (str3 != null) {
            map.put("favunified_id", str3);
        }
        map.put("sharing_channel", str4);
        G0 g02 = G0.f406611a;
        this.f17953b = new ParametrizedClickStreamEvent(14322, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f17953b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17953b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f17953b.f90248c;
    }
}
