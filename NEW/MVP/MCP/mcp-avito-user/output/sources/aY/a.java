package AY;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: MemoryConsumptionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAY/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437b;

    public a(@k String str, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24) {
        this.f437b = new ParametrizedClickStreamEvent(4274, 1, P0.j(new Q("screen_name", str), new Q("native_heap_size", Long.valueOf(j13)), new Q("java_heap_size", Long.valueOf(j12)), new Q("code_size", Long.valueOf(j14)), new Q("stack_size", Long.valueOf(j15)), new Q("graphics_size", Long.valueOf(j16)), new Q("private_other_size", Long.valueOf(j17)), new Q("gc_count", Long.valueOf(j18)), new Q("gc_time", Long.valueOf(j19)), new Q("blocking_gc_count", Long.valueOf(j22)), new Q("blocking_gc_time", Long.valueOf(j23)), new Q("time_range", Long.valueOf(j24))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f437b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f437b.f90248c;
    }
}
