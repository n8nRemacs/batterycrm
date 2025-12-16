package z3;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: LogoutDebugEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz3/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50361a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f443819b;

    public C50361a(@k String str, boolean z12) {
        this.f443819b = new ParametrizedClickStreamEvent(4402, 1, P0.g(new Q("s", str), new Q("is_user_action", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f443819b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f443819b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f443819b.f90248c;
    }
}
