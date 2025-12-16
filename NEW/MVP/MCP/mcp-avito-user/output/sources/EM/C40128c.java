package em;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleBlockChangedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lem/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: em.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40128c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f395335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f395336c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f395337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395338e;

    public C40128c(@Y61.k String str, @Y61.k String str2, @l String str3) {
        this.f395335b = str;
        this.f395336c = str2;
        this.f395337d = str3;
        this.f395338e = new ParametrizedClickStreamEvent(7149, 5, C35755b0.c(P0.g(new Q("session_id", str), new Q("form_input_field_name", str2), new Q("form_input_field_value", str3), new Q("promocampaign_type", "sales"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40128c)) {
            return false;
        }
        C40128c c40128c = (C40128c) obj;
        return L.f(this.f395335b, c40128c.f395335b) && L.f(this.f395336c, c40128c.f395336c) && L.f(this.f395337d, c40128c.f395337d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f395338e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f395338e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f395338e.f90248c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f395335b.hashCode() * 31, 31, this.f395336c);
        String str = this.f395337d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleBlockChangedEvent(sessionID=");
        sb2.append(this.f395335b);
        sb2.append(", formInputName=");
        sb2.append(this.f395336c);
        sb2.append(", formInputValue=");
        return C22026a.c(sb2, this.f395337d, ')');
    }
}
