package tA0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsScreenOpenEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtA0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439184b;

    public b(@l String str, @l String str2, @l String str3, @l String str4, @l Integer num) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("cid", str);
        }
        if (str2 != null) {
            map.put("lid", str2);
        }
        if (num != null) {
            map.put("from_block", Integer.valueOf(num.intValue()));
        }
        if (str3 != null) {
            map.put("geo_session", str3);
        }
        if (str4 != null) {
            map.put("user_key", str4);
        }
        G0 g02 = G0.f406611a;
        this.f439184b = new ParametrizedClickStreamEvent(2916, 3, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f439184b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f439184b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f439184b.f90248c;
    }
}
