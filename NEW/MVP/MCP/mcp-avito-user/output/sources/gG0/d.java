package gg0;

import Y61.k;
import Y61.l;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PushTokenSuccessfullySentToServerEvent8217.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lgg0/d;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396700b;

    public d(@k String str, @k String str2, boolean z12, @l String str3) {
        this.f396700b = new ParametrizedClickStreamEvent(8217, 2, C35755b0.c(P0.g(new Q("app_push_token_provider", str), new Q("push_token", str2), new Q("is_voip", Boolean.valueOf(z12)), new Q("errors_detailed", str3))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f396700b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f396700b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f396700b.f90248c;
    }

    public /* synthetic */ d(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : str3);
    }
}
