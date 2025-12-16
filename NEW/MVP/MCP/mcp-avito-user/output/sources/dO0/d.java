package Do0;

import Y61.k;
import Y61.l;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SavedSearchClosedEventV3.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LDo0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f3456b = new com.avito.android.analytics.provider.clickstream.b(4295, 3);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f3457c;

    public d(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f3457c = C35755b0.c(P0.j(new Q("categoryid", str), new Q("from_page", str2), new Q("ssfid", str3), new Q("push_banner", str4), new Q("email_banner", str5)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f3456b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, String> getParams() {
        return this.f3457c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f3456b.f90263c;
    }
}
