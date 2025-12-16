package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickShortcutTreeEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/A;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f89896f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<Double> f89897g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f89898h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f89899i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f89900j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f89901k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Integer f89902l;

    public A() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(long j12, TreeClickStreamParent treeClickStreamParent, String str, List list, String str2, String str3, String str4, Integer num, Integer num2, int i12, C42822w c42822w) {
        super(j12, treeClickStreamParent, 2664, 9);
        String str5 = (i12 & 4) != 0 ? null : str;
        List list2 = (i12 & 8) != 0 ? null : list;
        String str6 = (i12 & 64) != 0 ? null : str4;
        Integer num3 = (i12 & 128) != 0 ? null : num;
        Integer num4 = (i12 & 256) != 0 ? null : num2;
        this.f89896f = str5;
        this.f89897g = list2;
        this.f89898h = str2;
        this.f89899i = str3;
        this.f89900j = str6;
        this.f89901k = num3;
        this.f89902l = num4;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "serpdisplay_type", this.f89896f);
        j(linkedHashMap, "search_area", this.f89897g);
        j(linkedHashMap, "shortcut_description", this.f89898h);
        j(linkedHashMap, "cid", this.f89899i);
        String str = this.f89900j;
        if (str != null) {
            j(linkedHashMap, "from_page", str);
        }
        Integer num2 = this.f89901k;
        if (num2 != null && (num = this.f89902l) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num2);
            sb2.append(num);
            j(linkedHashMap, "position", sb2.toString());
        }
        return linkedHashMap;
    }
}
