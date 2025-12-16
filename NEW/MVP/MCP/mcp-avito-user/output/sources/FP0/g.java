package FP0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewPageOpenedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFP0/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_webview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f4708b;

    public g(@k String str, @l String str2, @l String str3, @l String str4) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q(ContextActionHandler.Link.URL, str));
        if (str2 != null) {
            linkedHashMapJ.put("landing_slug", str2);
        }
        if (str3 != null) {
            linkedHashMapJ.put("iid", str3);
        }
        if (str4 != null) {
            linkedHashMapJ.put("from_page", str4);
        }
        G0 g02 = G0.f406611a;
        this.f4708b = new ParametrizedClickStreamEvent(4742, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f4708b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f4708b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f4708b.f90248c;
    }
}
