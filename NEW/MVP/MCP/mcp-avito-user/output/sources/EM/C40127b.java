package em;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleAddBlockEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lem/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: em.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40127b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f395332b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395334d;

    public C40127b(@Y61.k String str, int i12) {
        this.f395332b = str;
        this.f395333c = i12;
        this.f395334d = new ParametrizedClickStreamEvent(8357, 2, P0.g(new Q("session_id", str), new Q("discount_block_index", Integer.valueOf(i12))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40127b)) {
            return false;
        }
        C40127b c40127b = (C40127b) obj;
        return L.f(this.f395332b, c40127b.f395332b) && this.f395333c == c40127b.f395333c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f395334d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f395334d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f395334d.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f395333c) + (this.f395332b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleAddBlockEvent(sessionID=");
        sb2.append(this.f395332b);
        sb2.append(", discountBlockIndex=");
        return r.t(sb2, this.f395333c, ')');
    }
}
