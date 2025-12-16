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

/* compiled from: CustomDialogInSettingsGrantedEvent5176.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44276k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CallsPopupType f415049b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final IacEnablingScenario f415050c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f415051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415052e;

    public C44276k(CallsPopupType callsPopupType, IacEnablingScenario iacEnablingScenario, String str, int i12, C42822w c42822w) {
        iacEnablingScenario = (i12 & 2) != 0 ? null : iacEnablingScenario;
        str = (i12 & 4) != 0 ? null : str;
        this.f415049b = callsPopupType;
        this.f415050c = iacEnablingScenario;
        this.f415051d = str;
        C44656c.f419703a.getClass();
        kotlin.Q q12 = new kotlin.Q("iac_popup_type", C44656c.c(callsPopupType));
        String strD = C44656c.d(iacEnablingScenario);
        if (strD != null) {
            str = strD;
        } else if (str == null) {
            str = "";
        }
        this.f415052e = new ParametrizedClickStreamEvent(5176, 1, C47304a.a(P0.g(q12, new kotlin.Q("iac_enabling_scenario", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44276k)) {
            return false;
        }
        C44276k c44276k = (C44276k) obj;
        return this.f415049b == c44276k.f415049b && this.f415050c == c44276k.f415050c && kotlin.jvm.internal.L.f(this.f415051d, c44276k.f415051d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415052e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415052e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415052e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f415049b.hashCode() * 31;
        IacEnablingScenario iacEnablingScenario = this.f415050c;
        int iHashCode2 = (iHashCode + (iacEnablingScenario == null ? 0 : iacEnablingScenario.hashCode())) * 31;
        String str = this.f415051d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomDialogInSettingsGrantedEvent5176(popupType=");
        sb2.append(this.f415049b);
        sb2.append(", iacEnableScenario=");
        sb2.append(this.f415050c);
        sb2.append(", iacEnableScenarioCustom=");
        return C22026a.c(sb2, this.f415051d, ')');
    }
}
