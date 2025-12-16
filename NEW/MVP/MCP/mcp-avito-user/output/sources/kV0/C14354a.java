package Kv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SessionRefreshErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKv0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_session-refresher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14354a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9682b;

    /* JADX WARN: Multi-variable type inference failed */
    public C14354a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f9682b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9682b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f9682b.f90248c;
    }

    public C14354a(@l String str, @l Integer num) {
        this.f9682b = new ParametrizedClickStreamEvent(3851, 3, C35755b0.c(P0.g(new Q("errors_detailed", str), new Q("err", num))), null, 8, null);
    }

    public /* synthetic */ C14354a(String str, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num);
    }
}
