package K00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: PreApprovalAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LK00/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a, e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9208b;

    public a(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("mortgage_goal", str);
        }
        if (str2 != null) {
            linkedHashMap.put("mortgage_region", str2);
        }
        String str8 = L.f(str, "building_house") ? "mortgage_cost" : "mortgage_house_cost";
        if (num != null) {
            h.i(num, str8, linkedHashMap);
        }
        if (L.f(str, "building_house") && num2 != null) {
            h.i(num2, "mortgage_land_cost", linkedHashMap);
        }
        if (num3 != null) {
            h.i(num3, "mortgage_init_payment", linkedHashMap);
        }
        if (num5 != null) {
            h.i(num5, "mortgage_income", linkedHashMap);
        }
        if (num4 != null) {
            h.i(num4, "mortgage_loan_term", linkedHashMap);
        }
        if (str4 != null) {
            linkedHashMap.put("mortgage_income_proof", str4);
        }
        if (str3 != null) {
            linkedHashMap.put("mortgage_age", str3);
        }
        if (str6 != null) {
            linkedHashMap.put("mortgage_last_exp", str6);
        }
        if (str5 != null) {
            linkedHashMap.put("mortgage_employment_type", str5);
        }
        if (str7 != null) {
            linkedHashMap.put("from_page", str7);
        }
        G0 g02 = G0.f406611a;
        this.f9208b = new ParametrizedClickStreamEvent(10917, 3, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f9208b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9208b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f9208b.f90248c;
    }

    public /* synthetic */ a(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, Integer num5, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, (i12 & 2048) != 0 ? null : str7);
    }
}
