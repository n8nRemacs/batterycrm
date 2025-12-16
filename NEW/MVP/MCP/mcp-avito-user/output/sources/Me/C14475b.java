package Me;

import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CompositeBrokerAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Me.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C14475b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f10927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f10928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Object f10929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10930e;

    public C14475b(@Y61.k String str, @Y61.l String str2, @Y61.l Map<String, String> map) {
        this.f10927b = str;
        this.f10928c = str2;
        this.f10929d = map;
        this.f10930e = new ParametrizedClickStreamEvent(9822, 2, C35755b0.c(P0.g(new Q("item_id", str), new Q("from_page", str2), new Q("data", map))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14475b)) {
            return false;
        }
        C14475b c14475b = (C14475b) obj;
        return L.f(this.f10927b, c14475b.f10927b) && L.f(this.f10928c, c14475b.f10928c) && this.f10929d.equals(c14475b.f10929d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f10930e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10930e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f10930e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f10927b.hashCode() * 31;
        String str = this.f10928c;
        return this.f10929d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoLoansCalculatorButtonClickedEvent(advertId=");
        sb2.append(this.f10927b);
        sb2.append(", fromPage=");
        sb2.append(this.f10928c);
        sb2.append(", data=");
        return H.n(sb2, this.f10929d, ')');
    }
}
