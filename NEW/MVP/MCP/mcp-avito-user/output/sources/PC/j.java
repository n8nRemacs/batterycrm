package pc;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ScreenVerticalizationEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428692b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f428693c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f428694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428695e;

    public j(@k String str, @k String str2, @k String str3) {
        this.f428692b = str;
        this.f428693c = str2;
        this.f428694d = str3;
        this.f428695e = new ParametrizedClickStreamEvent(8843, 2, P0.j(new Q("screen_random_id", str), new Q("cid", str2), new Q("mcid", str3)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f428692b, jVar.f428692b) && L.f(this.f428693c, jVar.f428693c) && L.f(this.f428694d, jVar.f428694d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f428695e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428695e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f428695e.f90248c;
    }

    public final int hashCode() {
        return this.f428694d.hashCode() + H.d(this.f428692b.hashCode() * 31, 31, this.f428693c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenVerticalizationEvent(screenRandomId=");
        sb2.append(this.f428692b);
        sb2.append(", categoryId=");
        sb2.append(this.f428693c);
        sb2.append(", microCategoryId=");
        return C22026a.c(sb2, this.f428694d, ')');
    }
}
