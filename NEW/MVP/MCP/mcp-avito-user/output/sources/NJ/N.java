package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: ShowCallMethodsVideoCallEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/N;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class N implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415024b;

    public N(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
        this.f415024b = new ParametrizedClickStreamEvent(13238, 0, C47304a.a(P0.g(new kotlin.Q("iid", str2), new kotlin.Q("appcall_scenario", str), new kotlin.Q("mic_access", bool), new kotlin.Q("camera_permission", bool2), new kotlin.Q("x", C35800g5.b(new C35792f5(str3))))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415024b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415024b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415024b.f90248c;
    }
}
