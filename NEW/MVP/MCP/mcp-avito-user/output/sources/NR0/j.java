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

/* compiled from: VerticalMainSwipeActionWidgetEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNr0/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11771b;

    public j(@Y61.k WidgetPageSource widgetPageSource, @l String str, @l String str2, @Y61.k String str3, @l String str4, @l String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("cid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("x", str2);
        }
        linkedHashMap.put("from_page", str3);
        if (str4 != null) {
            linkedHashMap.put("target_page", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("cross_category", str5);
        }
        String str6 = widgetPageSource.f272580b;
        if (str6 != null) {
            linkedHashMap.put("from_source", str6);
        }
        G0 g02 = G0.f406611a;
        this.f11771b = new ParametrizedClickStreamEvent(5807, 5, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f11771b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f11771b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f11771b.f90248c;
    }
}
