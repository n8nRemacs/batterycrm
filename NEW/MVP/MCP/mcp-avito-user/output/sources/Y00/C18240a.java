package Y00;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY00/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Y00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C18240a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f19216b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f19217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f19218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19219e;

    public C18240a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f19216b = str;
        this.f19217c = str2;
        this.f19218d = str3;
        this.f19219e = new ParametrizedClickStreamEvent(9446, 6, P0.g(new Q("mortgage_request_id", str), new Q("current_mortgage_stage", str2), new Q("applicant_type", str3), new Q("attr_title", "request_check_main_info")), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18240a)) {
            return false;
        }
        C18240a c18240a = (C18240a) obj;
        return L.f(this.f19216b, c18240a.f19216b) && L.f(this.f19217c, c18240a.f19217c) && L.f(this.f19218d, c18240a.f19218d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f19219e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19219e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f19219e.f90248c;
    }

    public final int hashCode() {
        return this.f19218d.hashCode() + androidx.compose.foundation.H.d(this.f19216b.hashCode() * 31, 31, this.f19217c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageImmutableDataDescriptionClicked(applicationId=");
        sb2.append(this.f19216b);
        sb2.append(", currentMortgageStage=");
        sb2.append(this.f19217c);
        sb2.append(", applicantType=");
        return C22026a.c(sb2, this.f19218d, ')');
    }
}
