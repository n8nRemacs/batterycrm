package cc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TestClickStreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f58049b;

    public i() {
        this(false, null, 0, 7, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f58049b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58049b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f58049b.f90248c;
    }

    public i(boolean z12, String str, int i12, int i13, C42822w c42822w) {
        this.f58049b = new ParametrizedClickStreamEvent(2108, 0, P0.g(new Q("bool_param", Boolean.valueOf((i13 & 1) != 0 ? true : z12)), new Q("string_param", (i13 & 2) != 0 ? "lorem ipsum" : str), new Q("int_param", Integer.valueOf((i13 & 4) != 0 ? 248 : i12))), null, 8, null);
    }
}
