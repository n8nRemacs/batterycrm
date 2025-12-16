package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: MicPermissionPopupResultEvent4100.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/J;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class J implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final MicAccessScenario f415016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f415017d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f415018e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f415019f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f415020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415021h;

    public J(boolean z12, MicAccessScenario micAccessScenario, String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        String str5 = null;
        MicAccessScenario micAccessScenario2 = (i12 & 2) != 0 ? null : micAccessScenario;
        String str6 = (i12 & 4) != 0 ? null : str;
        String str7 = (i12 & 8) != 0 ? null : str2;
        String str8 = (i12 & 16) != 0 ? null : str3;
        String str9 = (i12 & 32) != 0 ? null : str4;
        this.f415015b = z12;
        this.f415016c = micAccessScenario2;
        this.f415017d = str6;
        this.f415018e = str7;
        this.f415019f = str8;
        this.f415020g = str9;
        kotlin.Q q12 = new kotlin.Q("iid", str6);
        kotlin.Q q13 = new kotlin.Q("mic_access", Boolean.valueOf(z12));
        kotlin.Q q14 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str7);
        kotlin.Q q15 = new kotlin.Q("esid", str8);
        C44656c.f419703a.getClass();
        switch (micAccessScenario2 == null ? -1 : C44656c.a.f419706c[micAccessScenario2.ordinal()]) {
            case -1:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                str5 = "comm_methods";
                break;
            case 2:
                str5 = "item_publishing";
                break;
            case 3:
                str5 = "incoming_call";
                break;
            case 4:
                str5 = "outgoing_call";
                break;
            case 5:
                str5 = "iac_toggle";
                break;
            case 6:
                str5 = "after_incoming_call";
                break;
            case 7:
                str5 = "item_edit";
                break;
            case 8:
                str5 = "comm_methods_block";
                break;
            case 9:
                str5 = "iac_permissions_screen";
                break;
            case 10:
                str5 = "item_add";
                break;
            case 11:
                str5 = AttachMenuItem.Support.KEY;
                break;
            case 12:
                str5 = "pro_popup";
                break;
        }
        if (str5 != null) {
            str9 = str5;
        } else if (str9 == null) {
            str9 = "";
        }
        this.f415021h = new ParametrizedClickStreamEvent(4100, 4, C47304a.a(P0.g(q12, q13, q14, q15, new kotlin.Q("micaccess_scenario", str9))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j12 = (J) obj;
        return this.f415015b == j12.f415015b && this.f415016c == j12.f415016c && kotlin.jvm.internal.L.f(this.f415017d, j12.f415017d) && kotlin.jvm.internal.L.f(this.f415018e, j12.f415018e) && kotlin.jvm.internal.L.f(this.f415019f, j12.f415019f) && kotlin.jvm.internal.L.f(this.f415020g, j12.f415020g);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f415021h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415021h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f415021h.f90248c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f415015b) * 31;
        MicAccessScenario micAccessScenario = this.f415016c;
        int iHashCode2 = (iHashCode + (micAccessScenario == null ? 0 : micAccessScenario.hashCode())) * 31;
        String str = this.f415017d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f415018e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f415019f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f415020g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MicPermissionPopupResultEvent4100(granted=");
        sb2.append(this.f415015b);
        sb2.append(", scenario=");
        sb2.append(this.f415016c);
        sb2.append(", itemId=");
        sb2.append(this.f415017d);
        sb2.append(", callId=");
        sb2.append(this.f415018e);
        sb2.append(", publishSessionId=");
        sb2.append(this.f415019f);
        sb2.append(", scenarioCustom=");
        return C22026a.c(sb2, this.f415020g, ')');
    }
}
