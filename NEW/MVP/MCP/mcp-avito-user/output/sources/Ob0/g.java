package ob0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: PhoneClickedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lob0/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f419947b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f419948c;

    /* renamed from: d, reason: collision with root package name */
    public final int f419949d;

    /* renamed from: e, reason: collision with root package name */
    public final int f419950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419951f;

    public g(int i12, int i13, @k String str, boolean z12) {
        this.f419947b = str;
        this.f419948c = z12;
        this.f419949d = i12;
        this.f419950e = i13;
        this.f419951f = new ParametrizedClickStreamEvent(2831, 1, P0.g(new Q("phone", str), new Q("is_verified", Boolean.valueOf(z12)), new Q("item_number", Integer.valueOf(i12)), new Q("other_phones_number", Integer.valueOf(i13))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f419947b, gVar.f419947b) && this.f419948c == gVar.f419948c && this.f419949d == gVar.f419949d && this.f419950e == gVar.f419950e;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF5939c() {
        return this.f419951f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419951f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF5940d() {
        return this.f419951f.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419950e) + r.e(this.f419949d, r.i(this.f419947b.hashCode() * 31, 31, this.f419948c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneClickedEvent(phone=");
        sb2.append(this.f419947b);
        sb2.append(", isVerified=");
        sb2.append(this.f419948c);
        sb2.append(", itemsCount=");
        sb2.append(this.f419949d);
        sb2.append(", otherPhonesCount=");
        return r.t(sb2, this.f419950e, ')');
    }
}
