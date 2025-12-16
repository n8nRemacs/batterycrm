package m40;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.offlinization.analytics.events.NoCacheStartReason;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CacheStartInfoEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm40/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43877a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414299b;

    /* JADX WARN: Multi-variable type inference failed */
    public C43877a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f414299b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414299b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f414299b.f90248c;
    }

    public C43877a(@l NoCacheStartReason noCacheStartReason) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (noCacheStartReason != null) {
            dVar.put("no_cache_reason", noCacheStartReason.f208507b);
        }
        G0 g02 = G0.f406611a;
        this.f414299b = new ParametrizedClickStreamEvent(14111, 1, dVar.b(), null, 8, null);
    }

    public /* synthetic */ C43877a(NoCacheStartReason noCacheStartReason, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : noCacheStartReason);
    }
}
