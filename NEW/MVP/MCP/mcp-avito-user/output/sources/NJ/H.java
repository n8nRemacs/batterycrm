package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: MicPermissionDialogGrantedEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/H;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415013b;

    public H(@Y61.l String str, @Y61.k String str2) {
        CallsPopupType callsPopupType = CallsPopupType.f164278c;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str2);
        kotlin.Q q13 = new kotlin.Q("iid", str);
        C44655b.f419701a.getClass();
        kotlin.Q<String, String> q14 = C44655b.f419702b;
        C44656c.f419703a.getClass();
        this.f415013b = new ParametrizedClickStreamEvent(4610, 3, C47304a.a(P0.g(q12, q13, q14, new kotlin.Q("iac_popup_type", C44656c.c(callsPopupType)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415013b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415013b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415013b.f90248c;
    }
}
