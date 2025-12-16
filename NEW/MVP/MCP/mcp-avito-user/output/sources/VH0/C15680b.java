package Vh0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAdviceButtonClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVh0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15680b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17360b;

    public C15680b() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f17360b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17360b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f17360b.f90248c;
    }

    public C15680b(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        str3 = (i12 & 4) != 0 ? null : str3;
        str4 = (i12 & 8) != 0 ? null : str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("iid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("RealtyDevelopment_id", str2);
            linkedHashMap.put("development_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("lid", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("from_page", str4);
        }
        G0 g02 = G0.f406611a;
        this.f17360b = new ParametrizedClickStreamEvent(4219, 5, linkedHashMap, null, 8, null);
    }
}
