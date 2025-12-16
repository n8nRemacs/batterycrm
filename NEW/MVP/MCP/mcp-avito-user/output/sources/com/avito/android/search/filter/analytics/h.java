package com.avito.android.search.filter.analytics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FilterSelectEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/analytics/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f262651b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f262652c;

    public h(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f262651b = new com.avito.android.analytics.provider.clickstream.b(5557, 7);
        LinkedHashMap linkedHashMapJ = P0.j(new Q("filter_name", str2), new Q("filter_id", str3), new Q("filter_value_names", list), new Q("filter_value_ids", list2), new Q("filter_type", str4));
        if (str6 != null) {
            linkedHashMapJ.put("user_key", str6);
        }
        if (str7 != null) {
            linkedHashMapJ.put("from_page", str7);
        }
        if (str != null) {
            linkedHashMapJ.put("cid", str);
        }
        if (str5 != null) {
            linkedHashMapJ.put("widget_type", str5);
        }
        this.f262652c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f262651b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f262652c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f262651b.f90263c;
    }

    public /* synthetic */ h(String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(str, str2, str3, list, list2, str4, str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7);
    }
}
