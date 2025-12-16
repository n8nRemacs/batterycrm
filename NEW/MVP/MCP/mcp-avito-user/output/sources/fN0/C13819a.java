package Fn0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ClickFbsButtonEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFn0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13819a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f5974b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f5975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f5976d;

    public C13819a(int i12, @k String str) {
        this.f5974b = i12;
        this.f5975c = str;
        this.f5976d = new ParametrizedClickStreamEvent(16160, 2, P0.j(new Q("order_cancel_cause", Integer.valueOf(i12)), new Q("orderid_string", str)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13819a)) {
            return false;
        }
        C13819a c13819a = (C13819a) obj;
        return this.f5974b == c13819a.f5974b && L.f(this.f5975c, c13819a.f5975c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f5976d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f5976d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f5976d.f90248c;
    }

    public final int hashCode() {
        return this.f5975c.hashCode() + (Integer.hashCode(this.f5974b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickFbsButtonEvent(cancelReason=");
        sb2.append(this.f5974b);
        sb2.append(", orderId=");
        return C22026a.c(sb2, this.f5975c, ')');
    }
}
