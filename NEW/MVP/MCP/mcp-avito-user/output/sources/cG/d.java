package Cg;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.avl_analytics.AvlEntryType;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvlVideoPreviewShown.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2580b;

    public d(@l String str, @l String str2, @l Integer num, @l Integer num2) {
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        HashMap map = new HashMap();
        if (str != null) {
            map.put("uid", str);
        }
        map.put("position", Integer.valueOf(num.intValue()));
        if (str2 != null) {
            map.put("iid", str2);
        }
        if (num2 != null) {
            map.put("avl_entry_position", Integer.valueOf(num2.intValue()));
        }
        map.put("avl_entry_type", "full-width");
        G0 g02 = G0.f406611a;
        this.f2580b = new ParametrizedClickStreamEvent(8228, 6, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f2580b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2580b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f2580b.f90248c;
    }
}
