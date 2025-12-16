package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BackPressSerpTreeEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/l;", "Lcom/avito/android/analytics/event/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28425l extends AbstractC28427m {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f90100g;

    public C28425l(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k String str, boolean z12) {
        super(j12, treeClickStreamParent, z12);
        this.f90100g = str;
    }

    @Override // com.avito.android.analytics.event.AbstractC28427m
    @Y61.k
    public final Map<String, Object> k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "categoryid", this.f90100g);
        return linkedHashMap;
    }

    @Override // com.avito.android.analytics.event.AbstractC28427m
    @Y61.k
    public final String l() {
        return "search_shop";
    }
}
