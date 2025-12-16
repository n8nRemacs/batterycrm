package zl0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkRequestRetriesEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzl0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50584a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f444219b;

    public C50584a(int i12, @l String str, boolean z12) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("success", Boolean.valueOf(z12)), new Q("network_request_retry_count", Integer.valueOf(i12)));
        if (str != null) {
            linkedHashMapJ.put("ios_network_error_subtype", str);
        }
        G0 g02 = G0.f406611a;
        this.f444219b = new ParametrizedClickStreamEvent(5743, 3, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f444219b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f444219b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f444219b.f90248c;
    }

    public /* synthetic */ C50584a(int i12, boolean z12, String str, int i13, C42822w c42822w) {
        this(i12, (i13 & 4) != 0 ? null : str, z12);
    }
}
