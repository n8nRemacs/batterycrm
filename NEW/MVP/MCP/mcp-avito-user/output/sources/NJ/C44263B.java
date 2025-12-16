package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import qJ.C47304a;

/* compiled from: IacProblemStartupEvent6691.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/B;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.B, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44263B implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f414999b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f415000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415001d;

    public C44263B(@Y61.k Map<String, ? extends Object> map, @Y61.l String str) {
        this.f414999b = map;
        this.f415000c = str;
        this.f415001d = new ParametrizedClickStreamEvent(6691, 1, P0.k(map, C47304a.a(Collections.singletonMap("iac_enabling_scenario", str))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44263B)) {
            return false;
        }
        C44263B c44263b = (C44263B) obj;
        return kotlin.jvm.internal.L.f(this.f414999b, c44263b.f414999b) && kotlin.jvm.internal.L.f(this.f415000c, c44263b.f415000c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415001d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415001d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415001d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f414999b.hashCode() * 31;
        String str = this.f415000c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacProblemStartupEvent6691(problems=");
        sb2.append(this.f414999b);
        sb2.append(", iacProblemsScenario=");
        return C22026a.c(sb2, this.f415000c, ')');
    }

    public /* synthetic */ C44263B(Map map, String str, int i12, C42822w c42822w) {
        this(map, (i12 & 2) != 0 ? null : str);
    }
}
