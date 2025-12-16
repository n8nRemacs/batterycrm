package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SnippetScrollDepthEventSerp.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/e1;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e1 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90031b;

    public e1(int i12, @Y61.k List<String> list, @Y61.l Integer num, @Y61.k String str, int i13, @Y61.k String str2) {
        HashMap mapE = kotlin.collections.P0.e(new kotlin.Q("offset", Integer.valueOf(i12)), new kotlin.Q("iids", list), new kotlin.Q("x", str), new kotlin.Q("total_count", Integer.valueOf(i13)), new kotlin.Q("type", str2));
        if (num != null) {
            mapE.put("items", Integer.valueOf(num.intValue()));
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f90031b = new ParametrizedClickStreamEvent(4906, 1, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90031b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90031b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90031b.f90248c;
    }
}
