package em;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lem/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f395350b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f395351c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f395352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395353e;

    public i(@Y61.k String str, boolean z12, @l String str2) {
        this.f395350b = str;
        this.f395351c = z12;
        this.f395352d = str2;
        this.f395353e = new ParametrizedClickStreamEvent(7148, 3, C35755b0.c(P0.g(new Q("session_id", str), new Q("is_first_time_promo", Boolean.valueOf(z12)), new Q("promocampaign_type", "sales"), new Q("from_page", str2))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f395350b, iVar.f395350b) && this.f395351c == iVar.f395351c && L.f(this.f395352d, iVar.f395352d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f395353e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f395353e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f395353e.f90248c;
    }

    public final int hashCode() {
        int i12 = r.i(this.f395350b.hashCode() * 31, 31, this.f395351c);
        String str = this.f395352d;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleOpenEvent(sessionID=");
        sb2.append(this.f395350b);
        sb2.append(", isFirstTimePromo=");
        sb2.append(this.f395351c);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f395352d, ')');
    }
}
