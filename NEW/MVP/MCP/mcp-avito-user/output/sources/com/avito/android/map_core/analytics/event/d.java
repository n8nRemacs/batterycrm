package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.map_core.analytics.event.PinDescription;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickMarkerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/d;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f185612f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<Double> f185613g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f185614h;

    /* renamed from: i, reason: collision with root package name */
    public final int f185615i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f185616j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f185617k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final PinDescription.Type f185618l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final PinDescription.State f185619m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final PinDescription.Highlight f185620n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f185621o;

    public /* synthetic */ d(long j12, TreeClickStreamParent treeClickStreamParent, String str, List list, String str2, int i12, String str3, Integer num, PinDescription.Type type, PinDescription.State state, PinDescription.Highlight highlight, String str4, int i13, C42822w c42822w) {
        this(j12, treeClickStreamParent, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : str2, i12, str3, num, type, state, highlight, (i13 & 2048) != 0 ? null : str4);
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "serpdisplay_type", this.f185612f);
        j(linkedHashMap, "search_area", this.f185613g);
        j(linkedHashMap, "cid", this.f185614h);
        j(linkedHashMap, "total", Integer.valueOf(this.f185615i));
        j(linkedHashMap, "x", this.f185616j);
        Integer num = this.f185617k;
        j(linkedHashMap, "map_zoom", Integer.valueOf(num != null ? num.intValue() : 0));
        j(linkedHashMap, "pin_type", this.f185618l.f185596b);
        j(linkedHashMap, "pin_state", this.f185619m.f185590b);
        j(linkedHashMap, "pin_price", this.f185621o);
        j(linkedHashMap, "pin_highlight", this.f185620n.f185583b);
        return linkedHashMap;
    }

    public d(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l String str, @Y61.l List<Double> list, @Y61.l String str2, int i12, @Y61.k String str3, @Y61.l Integer num, @Y61.k PinDescription.Type type, @Y61.k PinDescription.State state, @Y61.k PinDescription.Highlight highlight, @Y61.l String str4) {
        super(j12, treeClickStreamParent, 2666, 9);
        this.f185612f = str;
        this.f185613g = list;
        this.f185614h = str2;
        this.f185615i = i12;
        this.f185616j = str3;
        this.f185617k = num;
        this.f185618l = type;
        this.f185619m = state;
        this.f185620n = highlight;
        this.f185621o = str4;
    }
}
