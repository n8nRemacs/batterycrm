package NW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: QualityServiceEffectClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNW/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11535b;

    public a(@k String str, @l String str2, @l String str3, @l String str4, boolean z12, @l String str5, @l String str6, @l String str7) {
        this.f11535b = new ParametrizedClickStreamEvent(7258, 7, "service_quality_effect_click", P0.g(new Q("uid", str), new Q("s", str4 == null ? "" : str4), new Q("business_platform", 3), new Q("is_turn_on", Boolean.valueOf(z12)), new Q("service_quality_effect", str5), new Q("service_quality_level", str2 == null ? "" : str2), new Q("loyalty_program_vertical", str3 == null ? "" : str3), new Q("reputation_id", str6 == null ? "" : str6), new Q("reputation_state_id", str7 != null ? str7 : "")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f11535b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11535b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f11535b.f90248c;
    }
}
