package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MarkerItemsLoadedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/X;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class X extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<List<List<String>>> f90000f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f90001g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SearchParams f90002h;

    /* JADX WARN: Multi-variable type inference failed */
    public X(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k List<? extends List<? extends List<String>>> list, @Y61.k String str, @Y61.k SearchParams searchParams) {
        super(j12, treeClickStreamParent, 3559, 5);
        this.f90000f = list;
        this.f90001g = str;
        this.f90002h = searchParams;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "i", this.f90000f);
        j(linkedHashMap, "x", this.f90001g);
        Map<String, SearchParam<?>> params = this.f90002h.getParams();
        StringBuilder sb2 = new StringBuilder();
        if (params != null) {
            for (Map.Entry<String, SearchParam<?>> entry : params.entrySet()) {
                if (entry.getValue().getValue() != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey() + ": " + entry.getValue().getValue());
                }
            }
        }
        if (sb2.length() > 0) {
            linkedHashMap.put("infm_raw_params", "{ " + ((Object) sb2) + " }");
        }
        return linkedHashMap;
    }
}
