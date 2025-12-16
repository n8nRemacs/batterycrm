package LW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ShowScreenEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLW/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9970b;

    public a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.f9970b = new ParametrizedClickStreamEvent(7256, 7, "service_quality_show", P0.g(new Q("uid", str), new Q("s", str5 == null ? "" : str5), new Q("from_page", str2), new Q("business_platform", 3), new Q("service_quality_level", str3), new Q("loyalty_program_vertical", str4), new Q("reputation_id", str6), new Q("reputation_state_id", str7)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f9970b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9970b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f9970b.f90248c;
    }
}
