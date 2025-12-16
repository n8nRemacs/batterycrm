package cc;

import Y61.k;
import com.avito.android.analytics.clickstream.W;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: OnCrashMemoryStateEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f58048b;

    public h(@k com.avito.android.error_reporting.memory.a aVar, @k Throwable th2) {
        this.f58048b = new ParametrizedClickStreamEvent(10800, 1, P0.j(new Q("error_text", W.g(W.e(th2))), new Q("java_heap_used_mb", Long.valueOf(aVar.f147918a)), new Q("java_heap_free_mb", Long.valueOf(aVar.f147919b)), new Q("java_heap_max_size_mb", Long.valueOf(aVar.f147920c)), new Q("native_heap_used_mb", Long.valueOf(aVar.f147921d)), new Q("native_heap_free_mb", Long.valueOf(aVar.f147922e)), new Q("native_heap_max_size_mb", Long.valueOf(aVar.f147923f))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f58048b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58048b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f58048b.f90248c;
    }
}
