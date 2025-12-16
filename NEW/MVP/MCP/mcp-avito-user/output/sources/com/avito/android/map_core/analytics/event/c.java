package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickFindMeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/c;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<Double> f185610f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f185611g;

    public /* synthetic */ c(long j12, TreeClickStreamParent treeClickStreamParent, List list, String str, int i12, C42822w c42822w) {
        this(j12, treeClickStreamParent, (i12 & 4) != 0 ? null : list, str);
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "search_area", this.f185610f);
        j(linkedHashMap, "x", this.f185611g);
        return linkedHashMap;
    }

    public c(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l List<Double> list, @Y61.k String str) {
        super(j12, treeClickStreamParent, 2741, 4);
        this.f185610f = list;
        this.f185611g = str;
    }
}
