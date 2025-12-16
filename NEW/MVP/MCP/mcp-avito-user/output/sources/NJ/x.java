package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: IacOnBoardingClickEvent5829.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/x;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415082b;

    public x(@Y61.l String str, @Y61.k IacEnablingScenario iacEnablingScenario) {
        kotlin.Q q12 = new kotlin.Q("iid", str);
        C44656c.f419703a.getClass();
        this.f415082b = new ParametrizedClickStreamEvent(5829, 2, C47304a.a(P0.g(q12, new kotlin.Q("iac_enabling_scenario", C44656c.d(iacEnablingScenario)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f415082b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415082b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f415082b.f90248c;
    }

    public /* synthetic */ x(String str, IacEnablingScenario iacEnablingScenario, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, iacEnablingScenario);
    }
}
