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

/* compiled from: ServicesReviewVolunteersButtonShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le9/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f394995b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f394996c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f394997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f394998e;

    public b(@l String str, @k String str2, boolean z12) {
        this.f394995b = str;
        this.f394996c = str2;
        this.f394997d = z12;
        this.f394998e = new ParametrizedClickStreamEvent(9499, 4, C35755b0.c(P0.j(new Q("uid", str), new Q("iid", str2), new Q("any_reviews_on_item", Boolean.valueOf(z12)))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f394995b, bVar.f394995b) && L.f(this.f394996c, bVar.f394996c) && this.f394997d == bVar.f394997d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f394998e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f394998e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f394998e.f90248c;
    }

    public final int hashCode() {
        String str = this.f394995b;
        return Boolean.hashCode(this.f394997d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f394996c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesReviewVolunteersButtonShownEvent(uid=");
        sb2.append(this.f394995b);
        sb2.append(", iid=");
        sb2.append(this.f394996c);
        sb2.append(", anyReviewsOnItem=");
        return r.x(sb2, this.f394997d, ')');
    }
}
