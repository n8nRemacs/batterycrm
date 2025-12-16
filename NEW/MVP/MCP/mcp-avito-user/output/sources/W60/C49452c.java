package w60;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PaymentWebViewCloseClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw60/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w60.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49452c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f441283b = new com.avito.android.analytics.provider.clickstream.b(6644, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f441284c;

    public C49452c(@l String str, @k String str2, int i12) {
        this.f441284c = P0.j(new Q("uid", str), new Q("orderid_string", str2), new Q("loading_progress", Integer.valueOf(i12)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f441283b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441284c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f441283b.f90263c;
    }
}
