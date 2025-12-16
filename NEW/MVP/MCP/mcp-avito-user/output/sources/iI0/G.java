package iI0;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertClickActionMenuEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/G;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class G implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f398473b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f398474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f398475d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f398476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398477f;

    public G(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k String str3) {
        this.f398473b = str;
        this.f398474c = str2;
        this.f398475d = i12;
        this.f398476e = str3;
        this.f398477f = new ParametrizedClickStreamEvent(16115, 1, P0.g(new Q("iid", str), new Q("action", str2), new Q("option_number", Integer.valueOf(i12)), new Q("profile_tab", str3)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g12 = (G) obj;
        return L.f(this.f398473b, g12.f398473b) && L.f(this.f398474c, g12.f398474c) && this.f398475d == g12.f398475d && L.f(this.f398476e, g12.f398476e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f398477f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f398477f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f398477f.f90248c;
    }

    public final int hashCode() {
        return this.f398476e.hashCode() + androidx.appcompat.app.r.e(this.f398475d, androidx.compose.foundation.H.d(this.f398473b.hashCode() * 31, 31, this.f398474c), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertClickActionMenuEvent(itemId=");
        sb2.append(this.f398473b);
        sb2.append(", action=");
        sb2.append(this.f398474c);
        sb2.append(", actionIndex=");
        sb2.append(this.f398475d);
        sb2.append(", profileTab=");
        return C22026a.c(sb2, this.f398476e, ')');
    }
}
