package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: ShowCustomDialogInSettingsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/O;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class O implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CallsPopupType f415025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final IacEnablingScenario f415026c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f415027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415028e;

    public O(CallsPopupType callsPopupType, IacEnablingScenario iacEnablingScenario, String str, int i12, C42822w c42822w) {
        iacEnablingScenario = (i12 & 2) != 0 ? null : iacEnablingScenario;
        str = (i12 & 4) != 0 ? null : str;
        this.f415025b = callsPopupType;
        this.f415026c = iacEnablingScenario;
        this.f415027d = str;
        C44656c.f419703a.getClass();
        kotlin.Q q12 = new kotlin.Q("iac_popup_type", C44656c.c(callsPopupType));
        String strD = C44656c.d(iacEnablingScenario);
        if (strD != null) {
            str = strD;
        } else if (str == null) {
            str = "";
        }
        this.f415028e = new ParametrizedClickStreamEvent(5175, 1, C47304a.a(P0.g(q12, new kotlin.Q("iac_enabling_scenario", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return this.f415025b == o12.f415025b && this.f415026c == o12.f415026c && kotlin.jvm.internal.L.f(this.f415027d, o12.f415027d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f415028e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415028e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f415028e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f415025b.hashCode() * 31;
        IacEnablingScenario iacEnablingScenario = this.f415026c;
        int iHashCode2 = (iHashCode + (iacEnablingScenario == null ? 0 : iacEnablingScenario.hashCode())) * 31;
        String str = this.f415027d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowCustomDialogInSettingsEvent(popupType=");
        sb2.append(this.f415025b);
        sb2.append(", iacEnableScenario=");
        sb2.append(this.f415026c);
        sb2.append(", iacEnableScenarioCustom=");
        return C22026a.c(sb2, this.f415027d, ')');
    }
}
