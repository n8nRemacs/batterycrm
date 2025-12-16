package rf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentSuccessfulPurchaseEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrf/a;", "Lcom/avito/android/analytics/j;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47650a implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f430140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f430141d;

    public C47650a(@k String str, long j12) {
        this.f430139b = str;
        this.f430140c = j12;
        InterfaceC28535c interfaceC28535cB = C28537e.b(AdjustTokenWithFirebaseName.f91173o0);
        interfaceC28535cB.d(Collections.singletonMap("reportCount", String.valueOf(j12)));
        interfaceC28535cB.g(str.concat(";RUB"));
        this.f430141d = C28461l.a(interfaceC28535cB);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47650a)) {
            return false;
        }
        C47650a c47650a = (C47650a) obj;
        return L.f(this.f430139b, c47650a.f430139b) && this.f430140c == c47650a.f430140c;
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f430141d.getEvents();
    }

    public final int hashCode() {
        return Long.hashCode(this.f430140c) + (this.f430139b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaPaymentSuccessfulPurchaseEvent(totalPrice=");
        sb2.append(this.f430139b);
        sb2.append(", reportCount=");
        return r.u(sb2, this.f430140c, ')');
    }
}
