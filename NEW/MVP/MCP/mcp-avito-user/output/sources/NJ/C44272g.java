package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import qJ.C47304a;

/* compiled from: CallSettingsCloseEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/g;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44272g implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415038b;

    public C44272g(boolean z12, boolean z13, @Y61.l Boolean bool) {
        this.f415038b = new ParametrizedClickStreamEvent(6060, 2, C47304a.a(P0.g(new kotlin.Q("mic_access", Boolean.valueOf(z12)), new kotlin.Q("is_iac_enabled", Boolean.valueOf(z13)), new kotlin.Q("is_iac_enabled_time_range", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415038b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415038b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415038b.f90248c;
    }

    public /* synthetic */ C44272g(boolean z12, boolean z13, Boolean bool, int i12, C42822w c42822w) {
        this(z12, z13, (i12 & 4) != 0 ? null : bool);
    }
}
