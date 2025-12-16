package w60;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentWebViewErrorEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw60/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w60.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49453d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f441285b;

    public C49453d(int i12, @l String str, @k String str2, @l String str3, @k String str4, @l String str5, int i13, int i14) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("err", Integer.valueOf(i12));
        if (str != null) {
            dVar.put("errors_detailed", str);
        }
        dVar.put("ua", str2);
        if (str3 != null) {
            dVar.put(ContextActionHandler.Link.URL, str3);
        }
        dVar.put("orderid_string", str4);
        dVar.put("pay_domain", str5);
        dVar.put("screen_height", Integer.valueOf(i13));
        dVar.put("screen_width", Integer.valueOf(i14));
        G0 g02 = G0.f406611a;
        this.f441285b = new ParametrizedClickStreamEvent(2628, 5, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f441285b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441285b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f441285b.f90248c;
    }
}
