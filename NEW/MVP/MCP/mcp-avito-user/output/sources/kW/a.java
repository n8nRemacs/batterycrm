package KW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CriteriaClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKW/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9502b;

    public a(@k String str, @k String str2, @l String str3, @l Float f12, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("uid", str), new Q("s", str6 == null ? "" : str6), new Q("business_platform", 3), new Q("from_page", str2), new Q("color", str3), new Q("feature_name", str7 != null ? str7 : ""), new Q("service_quality_level", str4), new Q("loyalty_program_vertical", str5), new Q("reputation_id", str8), new Q("reputation_state_id", str9));
        if (f12 != null) {
            linkedHashMapJ.put("score", f12);
        }
        G0 g02 = G0.f406611a;
        this.f9502b = new ParametrizedClickStreamEvent(9659, 1, "service_quality_feature_click", linkedHashMapJ);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f9502b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9502b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f9502b.f90248c;
    }
}
