package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: IacFeedbackEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/v;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class v implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f415067b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IacCallDirection f415068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f415069d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f415070e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f415071f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f415072g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f415073h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f415074i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415075j;

    public v(@Y61.k String str, @Y61.k IacCallDirection iacCallDirection, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5, boolean z12) {
        this.f415067b = str;
        this.f415068c = iacCallDirection;
        this.f415069d = i12;
        this.f415070e = str2;
        this.f415071f = str3;
        this.f415072g = str4;
        this.f415073h = str5;
        this.f415074i = z12;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        C44656c.f419703a.getClass();
        kotlin.Q q13 = new kotlin.Q("call_side", C44656c.a(iacCallDirection));
        kotlin.Q q14 = new kotlin.Q("call_rating", Integer.valueOf(i12));
        C44655b.f419701a.getClass();
        this.f415075j = new ParametrizedClickStreamEvent(4099, 3, C47304a.a(P0.g(q12, q13, q14, C44655b.f419702b, new kotlin.Q("iid", str2), new kotlin.Q("appcall_decline_feedback_variant", str3), new kotlin.Q("appcall_decline_feedback_text", str4), new kotlin.Q("appcall_scenario", str5), new kotlin.Q("is_video_call", Boolean.valueOf(z12)))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.L.f(this.f415067b, vVar.f415067b) && this.f415068c == vVar.f415068c && this.f415069d == vVar.f415069d && kotlin.jvm.internal.L.f(this.f415070e, vVar.f415070e) && kotlin.jvm.internal.L.f(this.f415071f, vVar.f415071f) && kotlin.jvm.internal.L.f(this.f415072g, vVar.f415072g) && kotlin.jvm.internal.L.f(this.f415073h, vVar.f415073h) && this.f415074i == vVar.f415074i;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415075j.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415075j.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415075j.f90248c;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f415069d, (this.f415068c.hashCode() + (this.f415067b.hashCode() * 31)) * 31, 31);
        String str = this.f415070e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f415071f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f415072g;
        return Boolean.hashCode(this.f415074i) + androidx.compose.foundation.H.d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f415073h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacFeedbackEvent(callId=");
        sb2.append(this.f415067b);
        sb2.append(", direction=");
        sb2.append(this.f415068c);
        sb2.append(", callRating=");
        sb2.append(this.f415069d);
        sb2.append(", itemId=");
        sb2.append(this.f415070e);
        sb2.append(", variantText=");
        sb2.append(this.f415071f);
        sb2.append(", manualText=");
        sb2.append(this.f415072g);
        sb2.append(", scenario=");
        sb2.append(this.f415073h);
        sb2.append(", isVideo=");
        return androidx.appcompat.app.r.x(sb2, this.f415074i, ')');
    }
}
