package j10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ReselectAppealClickedEvent.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lj10/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42175a implements com.avito.android.analytics.provider.clickstream.a, e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f405420b;

    public C42175a(@k String str, @k String str2, @l String str3, @l String str4) {
        this.f405420b = new ParametrizedClickStreamEvent(9446, 7, C35755b0.c(P0.g(new Q("mortgage_request_id", str), new Q("applicant_type", str3), new Q("attr_title", "choose_another_bank"), new Q("mortgage_bank", str2), new Q("current_mortgage_stage", str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f405420b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f405420b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f405420b.f90248c;
    }
}
