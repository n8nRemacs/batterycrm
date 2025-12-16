package com.avito.android.analytics_adjust;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AnalyticsIdsAppStartEvent.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/analytics_adjust/s;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics_adjust/y;", "idfa", "Lcom/avito/android/analytics_adjust/h;", "adid", "Lcom/avito/android/analytics_adjust/A;", "oaid", "Lcom/avito/android/analytics_adjust/B;", "myTrackerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f91245b;

    public s(String str, String str2, String str3, String str4, C42822w c42822w) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        y yVarA = y.a(str);
        yVarA = C43066x.K(yVarA.f91253a) ? null : yVarA;
        String str5 = yVarA != null ? yVarA.f91253a : null;
        if (str5 != null) {
            dVar.put("idfa_gps_adid", y.a(str5).f91253a);
        }
        h hVarA = h.a(str2);
        hVarA = C43066x.K(hVarA.f91217a) ? null : hVarA;
        String str6 = hVarA != null ? hVarA.f91217a : null;
        if (str6 != null) {
            dVar.put("adjust_id", h.a(str6).f91217a);
        }
        A a12 = A.a(str3);
        a12 = C43066x.K(a12.f91120a) ? null : a12;
        String str7 = a12 != null ? a12.f91120a : null;
        if (str7 != null) {
            dVar.put("oaid", A.a(str7).f91120a);
        }
        B bA2 = B.a(str4);
        bA2 = C43066x.K(bA2.f91189a) ? null : bA2;
        String str8 = bA2 != null ? bA2.f91189a : null;
        if (str8 != null) {
            dVar.put("mt_instance_id", B.a(str8).f91189a);
        }
        G0 g02 = G0.f406611a;
        this.f91245b = new ParametrizedClickStreamEvent(7018, 5, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f91245b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f91245b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f91245b.f90248c;
    }
}
