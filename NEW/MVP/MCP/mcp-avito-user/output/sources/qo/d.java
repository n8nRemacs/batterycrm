package qO;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShowAllSellerAddressDetailsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqO/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429269b;

    public d(@k String str) {
        HashMap map = new HashMap();
        map.put("iid", str);
        G0 g02 = G0.f406611a;
        this.f429269b = new ParametrizedClickStreamEvent(14628, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f429269b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429269b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19128c() {
        return this.f429269b.f90248c;
    }
}
