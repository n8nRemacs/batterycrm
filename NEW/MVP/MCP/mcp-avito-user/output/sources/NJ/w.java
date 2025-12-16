package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import qJ.C47304a;

/* compiled from: IacGreenButtonClickedEvent4682.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/w;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class w implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f415076b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f415077c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f415078d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f415079e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f415080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415081g;

    public w(@Y61.k String str, @Y61.l String str2, boolean z12, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
        this.f415076b = str;
        this.f415077c = z12;
        this.f415078d = bool;
        this.f415079e = bool2;
        this.f415080f = str2;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        C44655b.f419701a.getClass();
        this.f415081g = new ParametrizedClickStreamEvent(4682, 4, C47304a.a(P0.g(q12, C44655b.f419702b, new kotlin.Q("iac_dialer_scenario", z12 ? "application" : ChannelContext.System.TYPE), new kotlin.Q("mic_access", bool), new kotlin.Q("iac_can_ask_mic", bool2), new kotlin.Q("iac_tech_info", str2))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.L.f(this.f415076b, wVar.f415076b) && this.f415077c == wVar.f415077c && kotlin.jvm.internal.L.f(this.f415078d, wVar.f415078d) && kotlin.jvm.internal.L.f(this.f415079e, wVar.f415079e) && kotlin.jvm.internal.L.f(this.f415080f, wVar.f415080f);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415081g.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415081g.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415081g.f90248c;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.f415076b.hashCode() * 31, 31, this.f415077c);
        Boolean bool = this.f415078d;
        int iHashCode = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f415079e;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f415080f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacGreenButtonClickedEvent4682(callId=");
        sb2.append(this.f415076b);
        sb2.append(", isFromAppUi=");
        sb2.append(this.f415077c);
        sb2.append(", micAccess=");
        sb2.append(this.f415078d);
        sb2.append(", canAskMic=");
        sb2.append(this.f415079e);
        sb2.append(", techInfo=");
        return C22026a.c(sb2, this.f415080f, ')');
    }
}
