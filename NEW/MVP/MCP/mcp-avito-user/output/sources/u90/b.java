package u90;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ProfileProContentEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu90/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439829b;

    public b(@Y61.k ProfileTabUserType profileTabUserType, @Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k List<String> list3) {
        String str;
        int iOrdinal = profileTabUserType.ordinal();
        if (iOrdinal == 0) {
            str = "mobile_private";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "mobile_pro";
        }
        this.f439829b = new ParametrizedClickStreamEvent(5013, 6, P0.g(new Q("lk_type", str), new Q("menu_widgets", list), new Q("menu_level_one", list2), new Q("menu_level_two", list3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f439829b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f439829b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f439829b.f90248c;
    }
}
