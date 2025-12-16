package o40;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PcElicitationResult.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo40/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419372b;

    public h(@k String str, @l String str2, @l String str3, boolean z12, @l String str4, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("pc_source_id", str), new Q("is_fallback", Boolean.valueOf(z12)), new Q("with_pattern_cache_key", Boolean.valueOf(str2 != null)));
        if (str3 != null) {
            linkedHashMapJ.put("pc_rule_id", str3);
        }
        if (str2 != null) {
            linkedHashMapJ.put("pc_cache_key", str2);
        }
        if (str4 != null) {
            linkedHashMapJ.put("error_message", str4);
        }
        if (beduinPatternCacheErrorType != null) {
            linkedHashMapJ.put("error_type", beduinPatternCacheErrorType.f208523b);
        }
        G0 g02 = G0.f406611a;
        this.f419372b = new ParametrizedClickStreamEvent(16352, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f419372b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419372b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f419372b.f90248c;
    }

    public /* synthetic */ h(String str, String str2, String str3, boolean z12, String str4, BeduinPatternCacheErrorType beduinPatternCacheErrorType, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, z12, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : beduinPatternCacheErrorType);
    }
}
