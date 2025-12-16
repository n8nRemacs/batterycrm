package com.avito.android.mortgage.person_form.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PersonFormAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/analytics/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f200478b;

    public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k String str5) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("field_activation_dttm", Long.valueOf(Instant.now().getEpochSecond())), new Q("field_target_id", str), new Q(CrashHianalyticsData.PROCESS_ID, str2), new Q("service_name", "frontend"), new Q("mortgage_request_id", str3));
        if (str4 != null) {
            linkedHashMapJ.put("applicant_type", str4);
            if (!str4.equals("borrower")) {
                linkedHashMapJ.put("co_borrower_id", str5);
            }
        }
        G0 g02 = G0.f406611a;
        this.f200478b = new ParametrizedClickStreamEvent(12417, 4, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f200478b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f200478b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f200478b.f90248c;
    }
}
