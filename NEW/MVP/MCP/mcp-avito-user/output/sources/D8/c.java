package D8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickIcebreakersEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD8/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2952b;

    public c(@k String str, @l String str2, @l String str3, @k String str4, int i12, int i13, @l String str5, @l String str6) {
        this.f2952b = new ParametrizedClickStreamEvent(4210, 7, C35755b0.c(P0.j(new Q("iid", str), new Q("cid", str2 == null ? "" : str2), new Q("mcid", str3 == null ? "" : str3), new Q("title", str4), new Q("position", Integer.valueOf(i12)), new Q("ice_breakers_id", Integer.valueOf(i13)), new Q("from_space", str5), new Q("s", str6))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f2952b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2952b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f2952b.f90248c;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, int i14, C42822w c42822w) {
        this(str, str2, str3, str4, i12, i13, str5, (i14 & 128) != 0 ? null : str6);
    }
}
