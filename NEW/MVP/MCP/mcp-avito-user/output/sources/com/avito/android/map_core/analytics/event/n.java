package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MapZoomEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/n;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<Double> f185629f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f185630g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f185631h;

    public /* synthetic */ n(long j12, TreeClickStreamParent treeClickStreamParent, List list, String str, Integer num, int i12, C42822w c42822w) {
        this(j12, treeClickStreamParent, (i12 & 4) != 0 ? null : list, str, num);
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "search_area", this.f185629f);
        j(linkedHashMap, "x", this.f185630g);
        Integer num = this.f185631h;
        j(linkedHashMap, "map_zoom", Integer.valueOf(num != null ? num.intValue() : 0));
        return linkedHashMap;
    }

    public n(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l List<Double> list, @Y61.k String str, @Y61.l Integer num) {
        super(j12, treeClickStreamParent, 2740, 3);
        this.f185629f = list;
        this.f185630g = str;
        this.f185631h = num;
    }
}
