package g80;

import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: ImageAreaClickedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg80/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396338b;

    public b(@l String str, @Y61.k ClickArea clickArea, @Y61.k C50213a c50213a) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("imgid", str);
        }
        String str2 = clickArea.f218476b;
        if (str2 != null) {
            linkedHashMap.put("target_page", str2);
        }
        G0 g02 = G0.f406611a;
        this.f396338b = new ParametrizedClickStreamEvent(4857, 6, P0.k(linkedHashMapA, linkedHashMap), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f396338b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f396338b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f396338b.f90248c;
    }
}
