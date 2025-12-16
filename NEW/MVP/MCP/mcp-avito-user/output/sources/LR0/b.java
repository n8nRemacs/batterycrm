package Lr0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressShowEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLr0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10146b;

    public b(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("cid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("mcid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("lid", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("geo_session", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("user_address_id", str5);
        }
        linkedHashMap.put("from_page", str6);
        if (str7 != null) {
            linkedHashMap.put("new_address_block_type", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("iid", str8);
        }
        G0 g02 = G0.f406611a;
        this.f10146b = new ParametrizedClickStreamEvent(8458, 3, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f10146b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f10146b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f10146b.f90248c;
    }
}
