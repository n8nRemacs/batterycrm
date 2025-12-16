package B40;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ClickOnOnboardingButtonEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB40/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f873b;

    public a(@l String str, @l String str2, @l ArrayList arrayList, @l String str3, @l String str4, @l Integer num) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("onboarding_bottom_id", str);
        }
        if (str2 != null) {
            map.put("button_name", str2);
        }
        if (arrayList != null) {
            map.put("filter_value_names", C42745f0.O(arrayList, ",", "[", "]", null, 56));
        }
        if (str3 != null) {
            map.put("encoded", str3);
        }
        if (str4 != null) {
            map.put("title", str4);
        }
        if (num != null) {
            map.put("onboarding_page", Integer.valueOf(num.intValue()));
        }
        G0 g02 = G0.f406611a;
        this.f873b = new ParametrizedClickStreamEvent(5881, 7, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f873b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f873b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f873b.f90248c;
    }
}
