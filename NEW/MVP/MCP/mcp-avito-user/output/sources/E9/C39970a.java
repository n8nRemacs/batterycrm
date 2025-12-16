package e9;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ServicesReviewVolunteersButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le9/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C39970a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f394991b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f394992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f394993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f394994e;

    public C39970a(@l String str, @k String str2, boolean z12) {
        this.f394991b = str;
        this.f394992c = str2;
        this.f394993d = z12;
        this.f394994e = new ParametrizedClickStreamEvent(9501, 2, C35755b0.c(P0.j(new Q("uid", str), new Q("iid", str2), new Q("any_reviews_on_item", Boolean.valueOf(z12)))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39970a)) {
            return false;
        }
        C39970a c39970a = (C39970a) obj;
        return L.f(this.f394991b, c39970a.f394991b) && L.f(this.f394992c, c39970a.f394992c) && this.f394993d == c39970a.f394993d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f394994e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f394994e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f394994e.f90248c;
    }

    public final int hashCode() {
        String str = this.f394991b;
        return Boolean.hashCode(this.f394993d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f394992c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesReviewVolunteersButtonClickedEvent(uid=");
        sb2.append(this.f394991b);
        sb2.append(", iid=");
        sb2.append(this.f394992c);
        sb2.append(", anyReviewsOnItem=");
        return r.x(sb2, this.f394993d, ')');
    }
}
