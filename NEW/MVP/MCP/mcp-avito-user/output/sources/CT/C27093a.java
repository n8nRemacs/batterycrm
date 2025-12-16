package cT;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BeduinV2ErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcT/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27093a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57862b;

    public C27093a(@k String str, @k String str2, @k String str3, @k ArrayList arrayList, @k String str4, @k String str5, @k String str6, @k String str7, @k String str8) {
        this.f57862b = new ParametrizedClickStreamEvent(14742, 6, C35755b0.c(P0.g(new Q("beduin2_scenario_id", str), new Q("beduin2_parent_scenario_id", str2), new Q("screen_name", str3), new Q("feature_owners", arrayList), new Q("beduin2_contract_version", str4), new Q("beduin2_agent_platform", "Android"), new Q("error_type", str5), new Q("beduin2_error_location", str6), new Q("errors_detailed", str7), new Q("beduin2_error_id", str8))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f57862b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57862b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f57862b.f90248c;
    }
}
