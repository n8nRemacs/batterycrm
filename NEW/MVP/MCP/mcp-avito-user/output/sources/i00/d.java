package I00;

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

/* compiled from: PhoneConfirmAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI00/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7875b;

    public d(@k String str, @l String str2, @k String str3) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("mortgage_request_id", str), new Q("current_mortgage_stage", "draft"));
        if (str2 != null) {
            linkedHashMapJ.put("applicant_type", str2);
            if (!str2.equals("borrower")) {
                linkedHashMapJ.put("co_borrower_id", str3);
            }
        }
        G0 g02 = G0.f406611a;
        this.f7875b = new ParametrizedClickStreamEvent(9530, 5, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f7875b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7875b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f7875b.f90248c;
    }
}
