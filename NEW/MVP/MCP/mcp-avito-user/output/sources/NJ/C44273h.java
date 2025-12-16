package nJ;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import qJ.C47304a;

/* compiled from: CallSettingsOpenEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/h;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44273h implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f415039b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f415040c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f415041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415042e;

    public C44273h(boolean z12, boolean z13, @Y61.l Boolean bool) {
        this.f415039b = z12;
        this.f415040c = z13;
        this.f415041d = bool;
        this.f415042e = new ParametrizedClickStreamEvent(5172, 2, C47304a.a(P0.g(new kotlin.Q("mic_access", Boolean.valueOf(z12)), new kotlin.Q("is_iac_enabled", Boolean.valueOf(z13)), new kotlin.Q("is_iac_enabled_time_range", bool))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44273h)) {
            return false;
        }
        C44273h c44273h = (C44273h) obj;
        return this.f415039b == c44273h.f415039b && this.f415040c == c44273h.f415040c && kotlin.jvm.internal.L.f(this.f415041d, c44273h.f415041d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f415042e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415042e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f415042e.f90248c;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(Boolean.hashCode(this.f415039b) * 31, 31, this.f415040c);
        Boolean bool = this.f415041d;
        return i12 + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallSettingsOpenEvent(micAccess=");
        sb2.append(this.f415039b);
        sb2.append(", callsEnabled=");
        sb2.append(this.f415040c);
        sb2.append(", callTimeEnabled=");
        return C0.g(sb2, this.f415041d, ')');
    }

    public /* synthetic */ C44273h(boolean z12, boolean z13, Boolean bool, int i12, C42822w c42822w) {
        this(z12, z13, (i12 & 4) != 0 ? null : bool);
    }
}
