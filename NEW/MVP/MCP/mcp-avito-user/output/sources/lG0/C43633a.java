package lG0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.universal_map.analytics.RequestType;
import com.avito.android.util.C35755b0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalMapRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlG0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43633a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413688b;

    public C43633a(boolean z12, @l Boolean bool, @k RequestType requestType, @k String str, @k String str2, @l Boolean bool2, @l Integer num, @k String str3, @k String str4, @l List<String> list, @l List<String> list2) {
        this.f413688b = new ParametrizedClickStreamEvent(8349, 4, C35755b0.c(P0.g(new Q("success", Boolean.valueOf(z12)), new Q("ie", bool), new Q("rdt", requestType.name().toLowerCase(Locale.ROOT)), new Q("screen_name_map", str), new Q("business_platform", 3), new Q("handler_name", str2), new Q("has_geo", bool2), new Q("pins", num), new Q("screen_id_map", str3), new Q("viewport_map", list), new Q("clusters_map", list2), new Q("app_version", str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f413688b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413688b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f413688b.f90248c;
    }

    public /* synthetic */ C43633a(boolean z12, Boolean bool, RequestType requestType, String str, String str2, Boolean bool2, Integer num, String str3, String str4, List list, List list2, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : bool, requestType, str, str2, (i12 & 32) != 0 ? null : bool2, (i12 & 64) != 0 ? null : num, str3, str4, (i12 & 512) != 0 ? null : list, (i12 & 1024) != 0 ? null : list2);
    }
}
