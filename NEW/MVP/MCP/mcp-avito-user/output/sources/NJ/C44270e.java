package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: CallMicPopupAfterIncomingCallResultEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44270e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415036b;

    public C44270e(@Y61.k String str, boolean z12, @Y61.l Boolean bool) {
        this.f415036b = new ParametrizedClickStreamEvent(5632, 1, C47304a.a(P0.g(new kotlin.Q(IacEvent4101.KEY_CALL_ID, str), new kotlin.Q("iac_popup_result", Boolean.valueOf(z12)), new kotlin.Q("iac_can_ask_mic", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415036b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415036b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415036b.f90248c;
    }
}
