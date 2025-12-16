package iI0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.user_advert.event.SalesContractFromPage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SalesContractClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/A;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI0.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41291A implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398468b;

    public C41291A(@Y61.k String str, @Y61.k String str2) {
        SalesContractFromPage salesContractFromPage = SalesContractFromPage.f311817b;
        this.f398468b = new ParametrizedClickStreamEvent(5149, 1, P0.g(new Q("uid", str), new Q("iid", str2), new Q("from_page", "sellers_card")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f398468b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f398468b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f398468b.f90248c;
    }
}
