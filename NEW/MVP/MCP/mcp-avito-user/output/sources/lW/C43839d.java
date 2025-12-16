package lw;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationFormSubmitButtonClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llw/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lw.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43839d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414246b;

    public C43839d(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("iid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("RealtyDevelopment_id", str2);
            linkedHashMap.put("development_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("developer_company_group_id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("lid", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("from_page", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("node_type", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("request_type", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("marketing_params", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("mcid", str9);
        }
        G0 g02 = G0.f406611a;
        this.f414246b = new ParametrizedClickStreamEvent(4197, 11, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414246b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414246b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414246b.f90248c;
    }

    public /* synthetic */ C43839d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9);
    }
}
