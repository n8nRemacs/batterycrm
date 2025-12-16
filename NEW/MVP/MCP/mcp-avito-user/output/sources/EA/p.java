package eA;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileTabChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395028b;

    /* compiled from: ExtendedProfileTabChangeEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExtendedProfileSearchTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedProfileSearchTabType extendedProfileSearchTabType = ExtendedProfileSearchTabType.f154620c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public p(@Y61.k String str, @Y61.k String str2, @Y61.k ExtendedProfileSearchTabType extendedProfileSearchTabType) {
        int i12;
        Q q12 = new Q("uid", str);
        Q q13 = new Q("user_key", str2);
        Q q14 = new Q("profile_type", "extended_profile");
        int iOrdinal = extendedProfileSearchTabType.ordinal();
        if (iOrdinal == 0) {
            i12 = 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 2;
        }
        this.f395028b = new ParametrizedClickStreamEvent(2852, 1, "user_profile_tab_change", P0.g(q12, q13, q14, new Q("shortcut", Integer.valueOf(i12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f395028b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f395028b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f395028b.f90248c;
    }
}
