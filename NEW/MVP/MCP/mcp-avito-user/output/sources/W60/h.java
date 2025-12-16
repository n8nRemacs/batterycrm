package w60;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PaymentWebViewSuccessEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw60/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f441291b = new com.avito.android.analytics.provider.clickstream.b(7625, 7);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f441292c;

    public h(int i12, int i13, @k String str, @k String str2, @k String str3) {
        this.f441292c = P0.j(new Q("uid", str), new Q("orderid_string", str2), new Q("pay_domain", str3), new Q("screen_height", Integer.valueOf(i12)), new Q("screen_width", Integer.valueOf(i13)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f441291b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441292c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f441291b.f90263c;
    }
}
