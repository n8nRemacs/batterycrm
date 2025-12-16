package sm;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchEnterSaleEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsm/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C48379a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f438843b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f438844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f438845d;

    public C48379a(@k String str, @k String str2) {
        this.f438843b = str;
        this.f438844c = str2;
        this.f438845d = new ParametrizedClickStreamEvent(10110, 4, P0.g(new Q("session_id", str), new Q("item_id", str2), new Q("avitosales_add_delete_item_flag", 1)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48379a)) {
            return false;
        }
        C48379a c48379a = (C48379a) obj;
        return L.f(this.f438843b, c48379a.f438843b) && L.f(this.f438844c, c48379a.f438844c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f438845d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f438845d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f438845d.f90248c;
    }

    public final int hashCode() {
        return this.f438844c.hashCode() + (this.f438843b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleSearchEnterSaleEvent(sessionID=");
        sb2.append(this.f438843b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f438844c, ')');
    }
}
