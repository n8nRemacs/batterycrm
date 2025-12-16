package HI;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelAvailableRoomsLoadedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHI/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7025b;

    public a(int i12, @k String str, @l String str2, @l String str3, @l Map map) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str), new Q("uid", str2), new Q("total", Integer.valueOf(i12)), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str3));
        if (map != null) {
            linkedHashMapJ.putAll(map);
        }
        G0 g02 = G0.f406611a;
        this.f7025b = new ParametrizedClickStreamEvent(11967, 3, C35755b0.c(linkedHashMapJ), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f7025b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7025b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f7025b.f90248c;
    }
}
