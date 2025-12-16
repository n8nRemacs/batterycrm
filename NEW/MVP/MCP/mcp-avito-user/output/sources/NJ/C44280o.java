package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.CallDeliveryType;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import oJ.C44656c;
import qJ.C47304a;

/* compiled from: IacCallDeliveredEvent5445.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/o;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44280o implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415056b;

    public C44280o(@Y61.k String str, @Y61.k CallDeliveryType callDeliveryType, boolean z12, @Y61.l String str2) {
        String str3;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        C44656c.f419703a.getClass();
        int i12 = C44656c.a.f419704a[callDeliveryType.ordinal()];
        if (i12 == -1) {
            str3 = null;
        } else if (i12 == 1) {
            str3 = "push";
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "socket";
        }
        this.f415056b = new ParametrizedClickStreamEvent(5445, 2, C47304a.a(P0.g(q12, new kotlin.Q("avcalls_delivery_type", str3), new kotlin.Q("mic_access", Boolean.valueOf(z12)), new kotlin.Q("iac_tech_info", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f415056b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415056b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f415056b.f90248c;
    }
}
