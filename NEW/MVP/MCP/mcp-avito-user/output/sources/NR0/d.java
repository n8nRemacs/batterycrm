package Nr0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.serp.adapter.vertical_main.analytics.WidgetPageSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalMainAnyActionWidgetEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNr0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11764b;

    public d(@Y61.k WidgetPageSource widgetPageSource, @l Integer num, @l Integer num2, @l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("cid", str);
        }
        linkedHashMap.put("position", String.valueOf(num));
        if (str2 != null) {
            linkedHashMap.put("x", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("from_page", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("target_page", str4);
        }
        if (num2 != null) {
            linkedHashMap.put("option_number", String.valueOf(num2.intValue()));
        }
        if (str5 != null) {
            linkedHashMap.put("promo_id", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("cross_category", str6);
        }
        String str7 = widgetPageSource.f272580b;
        if (str7 != null) {
            linkedHashMap.put("from_source", str7);
        }
        if (l12 != null) {
            linkedHashMap.put("mcid", String.valueOf(l12.longValue()));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        G0 g02 = G0.f406611a;
        this.f11764b = new ParametrizedClickStreamEvent(4921, 8, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f11764b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f11764b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public int getF11770c() {
        return this.f11764b.f90248c;
    }
}
