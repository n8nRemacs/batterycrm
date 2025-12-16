package lY;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FinanceMarketplaceCloseClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlY/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43702b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413874b;

    public C43702b() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f413874b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413874b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f413874b.f90248c;
    }

    public C43702b(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f413874b = new ParametrizedClickStreamEvent(14044, 2, P0.g(new Q("ext_user_id_sravni", str == null ? "" : str), new Q("fmp_resource", str2 == null ? "" : str2), new Q("from_page", str3 == null ? "" : str3), new Q(ContextActionHandler.Link.URL, str4 == null ? "" : str4)), null, 8, null);
    }

    public /* synthetic */ C43702b(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }
}
