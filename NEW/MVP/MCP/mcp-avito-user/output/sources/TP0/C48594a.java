package tP0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletWebViewSuccessLoadingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtP0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48594a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439242b;

    /* JADX WARN: Multi-variable type inference failed */
    public C48594a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f439242b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f439242b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f439242b.f90248c;
    }

    public C48594a(@l String str, @l String str2) {
        this.f439242b = new ParametrizedClickStreamEvent(8405, 3, P0.g(new Q("page_from", str == null ? "" : str), new Q("wallet_flow_type", str2 == null ? "" : str2)), null, 8, null);
    }

    public /* synthetic */ C48594a(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
