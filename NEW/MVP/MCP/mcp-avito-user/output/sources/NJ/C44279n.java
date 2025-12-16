package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.CallEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: IacAdvertMicPermissionButtonShownEvent5831.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/n;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44279n implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415055b;

    public C44279n(@Y61.k String str, @Y61.k CallsPopupType callsPopupType, @Y61.l String str2, @Y61.k CallEnablingScenario callEnablingScenario) {
        kotlin.Q q12 = new kotlin.Q("esid", str);
        C44656c.f419703a.getClass();
        this.f415055b = new ParametrizedClickStreamEvent(5831, 2, C47304a.a(P0.g(q12, new kotlin.Q("iac_popup_type", C44656c.c(callsPopupType)), new kotlin.Q("iid", str2), new kotlin.Q("iac_enabling_scenario", C44656c.b(callEnablingScenario)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415055b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415055b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415055b.f90248c;
    }
}
