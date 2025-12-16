package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: CallMicPopupAfterIncomingCallEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44269d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415035b;

    public C44269d(@Y61.k String str, @Y61.l Boolean bool) {
        this.f415035b = new ParametrizedClickStreamEvent(5631, 1, C47304a.a(P0.g(new kotlin.Q(IacEvent4101.KEY_CALL_ID, str), new kotlin.Q("iac_can_ask_mic", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415035b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415035b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415035b.f90248c;
    }
}
