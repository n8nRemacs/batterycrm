package em;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleDeleteBlockEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lem/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f395343b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395345d;

    public f(@Y61.k String str, int i12) {
        this.f395343b = str;
        this.f395344c = i12;
        this.f395345d = new ParametrizedClickStreamEvent(8358, 2, P0.g(new Q("session_id", str), new Q("discount_block_index", Integer.valueOf(i12))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f395343b, fVar.f395343b) && this.f395344c == fVar.f395344c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f395345d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f395345d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f395345d.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f395344c) + (this.f395343b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleDeleteBlockEvent(sessionID=");
        sb2.append(this.f395343b);
        sb2.append(", discountBlockIndex=");
        return r.t(sb2, this.f395344c, ')');
    }
}
