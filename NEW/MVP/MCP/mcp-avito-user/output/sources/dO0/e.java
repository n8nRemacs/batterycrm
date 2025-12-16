package Do0;

import Y61.k;
import Y61.l;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SavedSearchOpenedEventV7.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDo0/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f3458b = new com.avito.android.analytics.provider.clickstream.b(4294, 7);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f3459c;

    public e(@l String str, @l String str2, @l String str3) {
        this.f3459c = C35755b0.c(P0.j(new Q("categoryid", str), new Q("from_page", str2), new Q("ssfid", str3)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f3458b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, String> getParams() {
        return this.f3459c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f3458b.f90263c;
    }
}
