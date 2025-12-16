package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: IacProblemBottomSheetDisplayedEvent6692.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/A;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.A, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44262A implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f414996b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f414997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414998d;

    public C44262A(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f414996b = linkedHashMap;
        this.f414997c = str;
        this.f414998d = new ParametrizedClickStreamEvent(6692, 1, P0.k(linkedHashMap, C47304a.a(Collections.singletonMap("iac_enabling_scenario", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44262A)) {
            return false;
        }
        C44262A c44262a = (C44262A) obj;
        return this.f414996b.equals(c44262a.f414996b) && kotlin.jvm.internal.L.f(this.f414997c, c44262a.f414997c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f414998d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f414998d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f414998d.f90248c;
    }

    public final int hashCode() {
        return this.f414997c.hashCode() + (this.f414996b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacProblemBottomSheetDisplayedEvent6692(problems=");
        sb2.append(this.f414996b);
        sb2.append(", iacProblemsScenario=");
        return C22026a.c(sb2, this.f414997c, ')');
    }
}
