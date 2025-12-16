package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: CallScreenOpenedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44271f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415037b;

    public C44271f(@Y61.k String str, @Y61.k IacCallDirection iacCallDirection, @Y61.k String str2) {
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        C44656c.f419703a.getClass();
        this.f415037b = new ParametrizedClickStreamEvent(4782, 1, C47304a.a(P0.g(q12, new kotlin.Q("call_side", C44656c.a(iacCallDirection)), new kotlin.Q("appcall_scenario", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f415037b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415037b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f415037b.f90248c;
    }
}
