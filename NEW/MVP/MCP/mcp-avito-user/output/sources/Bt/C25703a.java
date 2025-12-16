package bt;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AddComparisonEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbt/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C25703a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57505b;

    public C25703a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f57505b = new ParametrizedClickStreamEvent(16453, 1, P0.g(new Q("uid", str == null ? "" : str), new Q("rid", str2 == null ? "" : str2), new Q("current_tab", str3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f57505b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f57505b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f57505b.f90248c;
    }
}
