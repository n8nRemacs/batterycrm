package g80;

import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: ImageGroupSelectedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg80/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396339b;

    public c(@l String str, @l String str2, @Y61.k String str3, @Y61.k C50213a c50213a) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str3));
        if (str != null) {
            linkedHashMapJ.put("imgid", str);
        }
        if (str2 != null) {
            linkedHashMapJ.put("title", str2);
        }
        G0 g02 = G0.f406611a;
        this.f396339b = new ParametrizedClickStreamEvent(11580, 2, P0.k(linkedHashMapA, linkedHashMapJ), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF5939c() {
        return this.f396339b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f396339b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF5940d() {
        return this.f396339b.f90248c;
    }
}
