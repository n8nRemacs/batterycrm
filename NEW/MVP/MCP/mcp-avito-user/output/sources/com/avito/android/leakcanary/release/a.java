package com.avito.android.leakcanary.release;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: MemoryLeakEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leakcanary/release/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_leakcanary-release_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f175076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f175077c;

    public a(@Y61.k String str, @Y61.k List<String> list, long j12, int i12, int i13) {
        this.f175076b = list;
        this.f175077c = new ParametrizedClickStreamEvent(8837, 2, P0.g(new Q("class_name", str), new Q("references_chain", list), new Q("analysis_duration", Long.valueOf(j12)), new Q("retained_heap_size_in_bytes", Integer.valueOf(i12)), new Q("retained_objects_count", Integer.valueOf(i13))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f175077c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f175077c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f175077c.f90248c;
    }

    @Y61.k
    public final String toString() {
        return this.f175077c.i();
    }
}
