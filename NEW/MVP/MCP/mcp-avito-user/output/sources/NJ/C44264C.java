package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import mJ.AbstractC43973b;
import oJ.C44655b;
import qJ.C47304a;

/* compiled from: IacRedButtonClickedEvent4683.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/C;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.C, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44264C implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f415002b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f415003c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC43973b f415004d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f415005e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f415006f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f415007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415008h;

    public C44264C(@Y61.k String str, @Y61.k String str2, @Y61.k AbstractC43973b abstractC43973b, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str3) {
        this.f415002b = str;
        this.f415003c = str2;
        this.f415004d = abstractC43973b;
        this.f415005e = bool;
        this.f415006f = bool2;
        this.f415007g = str3;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        kotlin.Q q13 = new kotlin.Q("appcall_scenario", str2);
        C44655b.f419701a.getClass();
        this.f415008h = new ParametrizedClickStreamEvent(4683, 5, C47304a.a(P0.g(q12, q13, C44655b.f419702b, new kotlin.Q("iac_dialer_scenario", abstractC43973b.f414451a), new kotlin.Q("mic_access", bool), new kotlin.Q("iac_can_ask_mic", bool2), new kotlin.Q("iac_tech_info", str3))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44264C)) {
            return false;
        }
        C44264C c44264c = (C44264C) obj;
        return kotlin.jvm.internal.L.f(this.f415002b, c44264c.f415002b) && kotlin.jvm.internal.L.f(this.f415003c, c44264c.f415003c) && kotlin.jvm.internal.L.f(this.f415004d, c44264c.f415004d) && kotlin.jvm.internal.L.f(this.f415005e, c44264c.f415005e) && kotlin.jvm.internal.L.f(this.f415006f, c44264c.f415006f) && kotlin.jvm.internal.L.f(this.f415007g, c44264c.f415007g);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f415008h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415008h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f415008h.f90248c;
    }

    public final int hashCode() {
        int iHashCode = (this.f415004d.hashCode() + androidx.compose.foundation.H.d(this.f415002b.hashCode() * 31, 31, this.f415003c)) * 31;
        Boolean bool = this.f415005e;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f415006f;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f415007g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacRedButtonClickedEvent4683(callId=");
        sb2.append(this.f415002b);
        sb2.append(", scenario=");
        sb2.append(this.f415003c);
        sb2.append(", iacDialerScenario=");
        sb2.append(this.f415004d);
        sb2.append(", micAccess=");
        sb2.append(this.f415005e);
        sb2.append(", canAskMic=");
        sb2.append(this.f415006f);
        sb2.append(", techInfo=");
        return C22026a.c(sb2, this.f415007g, ')');
    }
}
