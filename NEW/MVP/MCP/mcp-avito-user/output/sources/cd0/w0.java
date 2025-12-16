package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yc.C50213a;

/* compiled from: PublishLocalValidationErrorEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/w0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<String> f2480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2481c;

    public w0(@Y61.k C50213a c50213a, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l List<String> list) {
        List<String> list2 = list;
        this.f2480b = list2;
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("error_id", str), new kotlin.Q("form_element_id", str2), new kotlin.Q("element_type", str3), new kotlin.Q("element_subtype", str4), new kotlin.Q("navigation", str5), new kotlin.Q("form_step", str6));
        linkedHashMapJ.putAll(c50213a.a());
        if (str8 != null) {
            linkedHashMapJ.put("errors_detailed", str8);
        }
        if (str7 != null) {
            linkedHashMapJ.put("element_value", str7);
        }
        if (list2 != null) {
            list2 = list2.isEmpty() ? null : list2;
            if (list2 != null) {
                linkedHashMapJ.put("constraints", list2);
            }
        }
        if (str9 != null) {
            linkedHashMapJ.put("motivation", str9);
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f2481c = new ParametrizedClickStreamEvent(10045, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f2481c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2481c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f2481c.f90248c;
    }

    public /* synthetic */ w0(C50213a c50213a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i12, C42822w c42822w) {
        this(c50213a, str, str2, str3, str4, str5, str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? null : str8, (i12 & 512) != 0 ? null : str9, (i12 & 1024) != 0 ? null : list);
    }
}
