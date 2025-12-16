package Vh0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAdviceExpertReviewsClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVh0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vh0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15682d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17361b;

    public C15682d() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f17361b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17361b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f17361b.f90248c;
    }

    public C15682d(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("iid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("RealtyDevelopment_id", str2);
            linkedHashMap.put("development_id", str2);
        }
        if (str4 != null) {
            linkedHashMap.put("lid", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("from_page", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("x", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("node_type", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("request_type", str8);
        }
        if (str3 != null) {
            linkedHashMap.put("developer_company_group_id", str3);
        }
        G0 g02 = G0.f406611a;
        this.f17361b = new ParametrizedClickStreamEvent(8488, 1, linkedHashMap, null, 8, null);
    }

    public /* synthetic */ C15682d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) == 0 ? str8 : null);
    }
}
