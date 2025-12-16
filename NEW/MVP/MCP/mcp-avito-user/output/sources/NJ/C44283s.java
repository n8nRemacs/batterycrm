package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import qJ.C47304a;

/* compiled from: IacDevicesProSlotClickedEvent8174.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/s;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44283s implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415064b;

    public C44283s(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, boolean z12) {
        this.f415064b = new ParametrizedClickStreamEvent(8174, 3, C47304a.a(P0.g(new kotlin.Q("esid", str), new kotlin.Q("iid", str2), new kotlin.Q("is_iac_chosen", Boolean.valueOf(z12)), new kotlin.Q("from_page", str3), new kotlin.Q("cid", num))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f415064b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415064b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f415064b.f90248c;
    }
}
