package m40;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.offlinization.analytics.events.NetworkRequestType;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import m40.InterfaceC43878b;

/* compiled from: NetworkDataRequestEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm40/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414303b;

    public c(NetworkRequestType networkRequestType, String str, String str2, InterfaceC43878b interfaceC43878b, boolean z12, int i12, C42822w c42822w) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("cache_content_type", ((i12 & 1) != 0 ? NetworkRequestType.f208499c : networkRequestType).f208502b), new Q(ContextActionHandler.Link.URL, str), new Q("url_definition", str2), new Q("success", Boolean.valueOf(z12)));
        if (interfaceC43878b instanceof InterfaceC43878b.a) {
            InterfaceC43878b.a aVar = (InterfaceC43878b.a) interfaceC43878b;
            linkedHashMapJ.put("cache_request_reason", aVar.f414300a.f208494b);
            linkedHashMapJ.put("cache_technique", aVar.f414301b.f208498b);
        }
        G0 g02 = G0.f406611a;
        this.f414303b = new ParametrizedClickStreamEvent(14110, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f414303b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414303b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f414303b.f90248c;
    }
}
