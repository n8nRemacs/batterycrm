package o8;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShowPhoneDialerEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/q;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419441b;

    public q(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.l String str3, @Y61.l String str4) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str), new Q("from_page", str2), new Q("from_block", Integer.valueOf(!z12 ? 1 : 0)));
        if (str3 != null) {
            linkedHashMapJ.put("cid", str3);
        }
        if (str4 != null) {
            linkedHashMapJ.put("mcid", str4);
        }
        G0 g02 = G0.f406611a;
        this.f419441b = new ParametrizedClickStreamEvent(3381, 4, "ShowPhoneDialerEvent", linkedHashMapJ);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f419441b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f419441b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f419441b.f90248c;
    }

    public /* synthetic */ q(String str, String str2, boolean z12, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}
