package M50;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileSetupNameEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM50/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10404b;

    public i(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str, @Y61.l String str2, @Y61.k AnalyticScreen analyticScreen, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.l String str3) {
        String string = num != null ? num.toString() : null;
        Q q12 = new Q("tariff_vertical_id", string == null ? "" : string);
        String string2 = num2 != null ? num2.toString() : null;
        this.f10404b = new ParametrizedClickStreamEvent(6934, 4, "ext_profile_setup_name", P0.g(q12, new Q("tariff_vertical_specificity_id", string2 == null ? "" : string2), new Q("dname", str == null ? "" : str), new Q("pageFrom", analyticScreen.f211220b), new Q("user_key", str2 == null ? "" : str2), new Q("s", str3 == null ? e.a(profileCreateExtendedFlow) : str3)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f10404b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10404b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f10404b.f90248c;
    }
}
