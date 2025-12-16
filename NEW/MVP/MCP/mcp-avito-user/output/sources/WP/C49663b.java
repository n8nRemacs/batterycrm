package wp;

import Y61.k;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DigitalRegistrationAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwp/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49663b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f441796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441797c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f441798d;

    public C49663b(int i12, int i13, String str, String str2, String str3) {
        this.f441796b = i12;
        this.f441797c = i13;
        this.f441798d = C35755b0.c(P0.g(new Q("from_page", str), new Q("from_source", str), new Q("phone", str2), new Q("trx_vas_task_uuid", str3)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF395375b() {
        return this.f441796b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441798d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF395376c() {
        return this.f441797c;
    }
}
