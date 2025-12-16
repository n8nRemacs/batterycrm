package o8;

import androidx.compose.foundation.H;
import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactSellerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/f;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f419416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f419417c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Double f419418d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f419419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f419420f;

    public f(@Y61.l String str, @Y61.k String str2, @Y61.l Double d12, @Y61.l Map<String, String> map) {
        this.f419416b = str;
        this.f419417c = str2;
        this.f419418d = d12;
        this.f419419e = map;
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = g.f419421a;
        Qc.g gVarA = com.avito.android.analytics_adjust.t.a(adjustTokenWithFirebaseName);
        gVarA.j(map);
        gVarA.i(d12);
        InterfaceC28535c interfaceC28535cB = C28537e.b(adjustTokenWithFirebaseName);
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        interfaceC28535cB.c();
        interfaceC28535cB.f(str2);
        interfaceC28535cB.a(d12);
        interfaceC28535cB.d(map);
        this.f419420f = C28461l.a(gVarA, interfaceC28535cB);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f419416b, fVar.f419416b) && L.f(this.f419417c, fVar.f419417c) && L.f(this.f419418d, fVar.f419418d) && L.f(this.f419419e, fVar.f419419e);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419420f.getEvents();
    }

    public final int hashCode() {
        String str = this.f419416b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f419417c);
        Double d12 = this.f419418d;
        int iHashCode = (iD2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Map<String, String> map = this.f419419e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactSellerEvent(email=");
        sb2.append(this.f419416b);
        sb2.append(", advertId=");
        sb2.append(this.f419417c);
        sb2.append(", customerValue=");
        sb2.append(this.f419418d);
        sb2.append(", params=");
        return androidx.appcompat.app.r.w(sb2, this.f419419e, ')');
    }
}
