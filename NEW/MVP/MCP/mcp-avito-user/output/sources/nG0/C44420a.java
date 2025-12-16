package ng0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.quic.events.CronetReportedErrorType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CronetErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ng0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44420a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419122b;

    public C44420a(@l Integer num, @l Integer num2, @l Integer num3, @l String str, @l String str2, @k CronetReportedErrorType cronetReportedErrorType) {
        this.f419122b = new ParametrizedClickStreamEvent(6289, 3, P0.g(new Q("cronet_error_code", Integer.valueOf(num != null ? num.intValue() : 0)), new Q("cronet_internal_error_code", Integer.valueOf(num2 != null ? num2.intValue() : 0)), new Q("cronet_quic_error_code", Integer.valueOf(num3 != null ? num3.intValue() : 0)), new Q("cronet_queried_host", str == null ? "" : str), new Q("cronet_queried_path", str2 == null ? "" : str2), new Q("cronet_error_type", cronetReportedErrorType.f246256b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f419122b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419122b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f419122b.f90248c;
    }
}
