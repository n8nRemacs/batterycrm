package Zn0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CheckoutPaymentErrorShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZn0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19579a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f20490b = new b(6682, 2);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f20491c;

    public C19579a(int i12, int i13, @l String str, @k String str2) {
        this.f20491c = P0.j(new Q("uid", str == null ? "" : str), new Q("orderid_string", str2), new Q("screen_height", Integer.valueOf(i12)), new Q("screen_width", Integer.valueOf(i13)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f20490b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f20491c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f20490b.f90263c;
    }
}
