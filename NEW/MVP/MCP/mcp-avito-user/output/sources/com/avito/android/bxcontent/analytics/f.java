package com.avito.android.bxcontent.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BxContentShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f109487b;

    public f(@Y61.k String str, @Y61.k String str2, @Y61.k BxContentShowEventType bxContentShowEventType, @Y61.l String str3, @Y61.l String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cid", str);
        linkedHashMap.put("vertical_widgets", str2);
        linkedHashMap.put("type_page", bxContentShowEventType.f109458b);
        if (str3 != null) {
            linkedHashMap.put("cross_category", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("notification_message_id", str4);
        }
        G0 g02 = G0.f406611a;
        this.f109487b = new ParametrizedClickStreamEvent(7389, 4, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f109487b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f109487b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f109487b.f90248c;
    }

    @Y61.k
    public final String toString() {
        return this.f109487b.f90249d.toString();
    }

    public /* synthetic */ f(String str, String str2, BxContentShowEventType bxContentShowEventType, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "" : str2, bxContentShowEventType, str3, str4);
    }
}
