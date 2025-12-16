package uq;

import Y61.k;
import Y61.l;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ComfortableDealInfoNextClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luq/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f440305b = new com.avito.android.analytics.provider.clickstream.b(14864, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f440306c;

    public f(@l String str, @l String str2) {
        this.f440306c = C35755b0.c(P0.j(new Q("from_page", str), new Q("to_page", str2)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f440305b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, String> getParams() {
        return this.f440306c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f440305b.f90263c;
    }
}
