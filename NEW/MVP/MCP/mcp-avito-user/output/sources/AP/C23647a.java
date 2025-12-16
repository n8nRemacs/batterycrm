package ap;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MortgageActiveApplicationsShowedEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lap/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ap.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C23647a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C23647a f56238c = new C23647a();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f56239b = new ParametrizedClickStreamEvent(11329, 1, Collections.singletonMap("agent_flow_type", "CD"), null, 8, null);

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof C23647a);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f56239b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f56239b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f56239b.f90248c;
    }

    public final int hashCode() {
        return 518310061;
    }

    @k
    public final String toString() {
        return "MortgageActiveApplicationsShowedEvent";
    }
}
