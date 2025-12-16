package z3;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SessionUpdateEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz3/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50363c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f443820b;

    public C50363c(boolean z12, boolean z13, @k String str) {
        this.f443820b = new ParametrizedClickStreamEvent(4403, 0, P0.g(new Q("is_auth", Boolean.valueOf(z12)), new Q("bool_param", Boolean.valueOf(z13)), new Q("s", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f443820b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f443820b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f443820b.f90248c;
    }
}
