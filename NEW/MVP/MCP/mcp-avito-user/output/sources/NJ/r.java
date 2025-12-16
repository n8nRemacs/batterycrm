package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: IacConnectionQualityEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/r;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class r implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f415060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f415061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f415062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415063e;

    public r(@Y61.l Boolean bool, @Y61.k String str, @Y61.k String str2) {
        this.f415060b = str;
        this.f415061c = bool;
        this.f415062d = str2;
        this.f415063e = new ParametrizedClickStreamEvent(10252, 0, C47304a.a(P0.g(new kotlin.Q(IacEvent4101.KEY_CALL_ID, str), new kotlin.Q("vpn_active", bool), new kotlin.Q("iac_connection_quality_value", str2), new kotlin.Q("iac_connection_quality_trigger", "value_change"))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.L.f(this.f415060b, rVar.f415060b) && kotlin.jvm.internal.L.f(this.f415061c, rVar.f415061c) && this.f415062d.equals(rVar.f415062d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415063e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415063e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415063e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f415060b.hashCode() * 31;
        Boolean bool = this.f415061c;
        return this.f415062d.hashCode() + androidx.appcompat.app.r.i((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, false);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacConnectionQualityEvent(callId=");
        sb2.append(this.f415060b);
        sb2.append(", isVpnActive=");
        sb2.append(this.f415061c);
        sb2.append(", isTriggeredByCallStart=false, connectionQuality=");
        return C22026a.c(sb2, this.f415062d, ')');
    }
}
