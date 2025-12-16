package G40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG40/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f6279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6280c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Map<String, String> f6281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f6282e;

    public a(int i12, int i13, @l Map<String, String> map) {
        this.f6279b = i12;
        this.f6280c = i13;
        this.f6281d = map;
        this.f6282e = new ParametrizedClickStreamEvent(i12, i13, map != null ? C35755b0.c(map) : P0.c(), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6279b == aVar.f6279b && this.f6280c == aVar.f6280c && L.f(this.f6281d, aVar.f6281d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF224266b() {
        return this.f6279b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f6282e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF224267c() {
        return this.f6280c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f6280c, Integer.hashCode(this.f6279b) * 31, 31);
        Map<String, String> map = this.f6281d;
        return iE2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingStepButtonClickEvent(eventId=");
        sb2.append(this.f6279b);
        sb2.append(", version=");
        sb2.append(this.f6280c);
        sb2.append(", eventParams=");
        return r.w(sb2, this.f6281d, ')');
    }
}
