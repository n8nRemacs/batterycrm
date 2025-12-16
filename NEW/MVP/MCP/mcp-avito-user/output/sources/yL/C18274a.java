package Yl;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CalltrackingItemClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYl/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18274a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19641b;

    public C18274a(@k String str, @k String str2) {
        this.f19641b = new ParametrizedClickStreamEvent(5871, 1, P0.g(new Q("uid", str), new Q("call_id", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f19641b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19641b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f19641b.f90248c;
    }
}
