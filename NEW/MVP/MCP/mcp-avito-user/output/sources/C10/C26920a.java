package c10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ImmutableInfoDescriptionClosedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc10/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C26920a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f57616c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f57617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57618e;

    public C26920a(@k String str, @k String str2, @k String str3) {
        this.f57615b = str;
        this.f57616c = str2;
        this.f57617d = str3;
        this.f57618e = new ParametrizedClickStreamEvent(9446, 6, P0.g(new Q("mortgage_request_id", str), new Q("current_mortgage_stage", str2), new Q("applicant_type", str3), new Q("attr_title", "request_check_main_info_close")), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26920a)) {
            return false;
        }
        C26920a c26920a = (C26920a) obj;
        return L.f(this.f57615b, c26920a.f57615b) && L.f(this.f57616c, c26920a.f57616c) && L.f(this.f57617d, c26920a.f57617d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f57618e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57618e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f57618e.f90248c;
    }

    public final int hashCode() {
        return this.f57617d.hashCode() + H.d(this.f57615b.hashCode() * 31, 31, this.f57616c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescriptionClosedEvent(applicationId=");
        sb2.append(this.f57615b);
        sb2.append(", currentMortgageStage=");
        sb2.append(this.f57616c);
        sb2.append(", selectedApplicant=");
        return C22026a.c(sb2, this.f57617d, ')');
    }
}
