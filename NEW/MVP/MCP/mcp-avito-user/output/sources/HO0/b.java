package ho0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SafetySettingsDeleteSessionEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lho0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f397413b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f397413b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f397413b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f397413b.f90248c;
    }

    public b(@l SafetySettingsElement.SessionItem sessionItem, @l SafetySettingsElement.SessionItem sessionItem2) {
        this.f397413b = new ParametrizedClickStreamEvent(4487, 1, C35755b0.c(P0.g(new Q("sess_info_curr", sessionItem != null ? c.a(sessionItem) : null), new Q("sess_info_susp", sessionItem2 != null ? c.a(sessionItem2) : null), new Q("sessidhash", sessionItem2 != null ? sessionItem2.f257676f : null))), null, 8, null);
    }

    public /* synthetic */ b(SafetySettingsElement.SessionItem sessionItem, SafetySettingsElement.SessionItem sessionItem2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : sessionItem, (i12 & 2) != 0 ? null : sessionItem2);
    }
}
