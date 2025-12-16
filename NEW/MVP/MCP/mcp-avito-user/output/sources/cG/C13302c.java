package Cg;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvlSharingOption.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13302c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2579b;

    public C13302c(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        HashMap map = new HashMap();
        if (str3 != null) {
            map.put("from_page", str3);
        }
        if (str != null) {
            map.put("iid", str);
        }
        if (str2 != null) {
            map.put("x", str2);
        }
        if (str4 != null) {
            map.put("x_avl_hash", str4);
        }
        map.put("sharing_channel", str5);
        G0 g02 = G0.f406611a;
        this.f2579b = new ParametrizedClickStreamEvent(10448, 3, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f2579b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2579b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f2579b.f90248c;
    }
}
