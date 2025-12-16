package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: CameraPermissionPopupResultEvent8103.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/i;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44274i implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f415044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f415045d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f415046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415047f;

    public C44274i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        this.f415043b = z12;
        this.f415044c = str;
        this.f415045d = str2;
        this.f415046e = str3;
        this.f415047f = new ParametrizedClickStreamEvent(8103, 1, C47304a.a(P0.g(new kotlin.Q("iid", str2), new kotlin.Q("camera_permission", String.valueOf(z12).toLowerCase(Locale.ROOT)), new kotlin.Q(IacEvent4101.KEY_CALL_ID, str3), new kotlin.Q("appcall_scenario", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44274i)) {
            return false;
        }
        C44274i c44274i = (C44274i) obj;
        return this.f415043b == c44274i.f415043b && kotlin.jvm.internal.L.f(this.f415044c, c44274i.f415044c) && this.f415045d.equals(c44274i.f415045d) && kotlin.jvm.internal.L.f(this.f415046e, c44274i.f415046e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f415047f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415047f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f415047f.f90248c;
    }

    public final int hashCode() {
        return this.f415046e.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Boolean.hashCode(this.f415043b) * 31, 31, this.f415044c), 31, this.f415045d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraPermissionPopupResultEvent8103(granted=");
        sb2.append(this.f415043b);
        sb2.append(", scenario=");
        sb2.append(this.f415044c);
        sb2.append(", itemId=");
        sb2.append(this.f415045d);
        sb2.append(", callId=");
        return C22026a.c(sb2, this.f415046e, ')');
    }
}
