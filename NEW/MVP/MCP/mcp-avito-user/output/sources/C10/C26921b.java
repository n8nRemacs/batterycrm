package c10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ImmutableInfoDescriptionShowedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc10/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C26921b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57619b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f57620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57621d;

    public C26921b(@k String str, @k String str2) {
        this.f57619b = str;
        this.f57620c = str2;
        this.f57621d = new ParametrizedClickStreamEvent(9427, 4, P0.g(new Q("mortgage_request_id", str), new Q("current_mortgage_stage", str2), new Q("mortgage_popup_name", "request_check_pop_up")), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26921b)) {
            return false;
        }
        C26921b c26921b = (C26921b) obj;
        return L.f(this.f57619b, c26921b.f57619b) && L.f(this.f57620c, c26921b.f57620c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f57621d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57621d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f57621d.f90248c;
    }

    public final int hashCode() {
        return this.f57620c.hashCode() + (this.f57619b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescriptionShowedEvent(applicationId=");
        sb2.append(this.f57619b);
        sb2.append(", currentMortgageStage=");
        return C22026a.c(sb2, this.f57620c, ')');
    }
}
