package m90;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesSellerSubscriptionButtonShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm90/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m90.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C43932b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414352b;

    public C43932b(@k String str, @l String str2) {
        this.f414352b = new ParametrizedClickStreamEvent(12184, 3, C35755b0.c(P0.g(new Q("from_page", str), new Q("target_page", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414352b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414352b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414352b.f90248c;
    }

    public /* synthetic */ C43932b(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "Профиль" : str, str2);
    }
}
