package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import qJ.C47304a;

/* compiled from: ToggleCallsEnabledEvent5173.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/Q;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Q implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f415030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415031d;

    public Q(boolean z12, @Y61.l String str) {
        this.f415029b = z12;
        this.f415030c = str;
        this.f415031d = new ParametrizedClickStreamEvent(5173, 1, C47304a.a(P0.g(new kotlin.Q("is_iac_enabled", Boolean.valueOf(z12)), new kotlin.Q("iac_analytics_info", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q12 = (Q) obj;
        return this.f415029b == q12.f415029b && kotlin.jvm.internal.L.f(this.f415030c, q12.f415030c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f415031d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415031d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f415031d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f415029b) * 31;
        String str = this.f415030c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleCallsEnabledEvent5173(callsEnabled=");
        sb2.append(this.f415029b);
        sb2.append(", analyticsInfo=");
        return C22026a.c(sb2, this.f415030c, ')');
    }

    public /* synthetic */ Q(boolean z12, String str, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : str);
    }
}
