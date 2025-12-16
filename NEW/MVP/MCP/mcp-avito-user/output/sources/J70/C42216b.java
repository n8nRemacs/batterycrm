package j70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PersonalSelectionsItemShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj70/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j70.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C42216b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f405446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f405447c;

    public C42216b(long j12) {
        this.f405446b = j12;
        this.f405447c = new ParametrizedClickStreamEvent(16134, 0, P0.g(new Q("from_page", "my_items"), new Q("items_num", Long.valueOf(j12))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42216b)) {
            return false;
        }
        C42216b c42216b = (C42216b) obj;
        c42216b.getClass();
        return this.f405446b == c42216b.f405446b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f405447c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f405447c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f405447c.f90248c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f405446b) - 1782544845;
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("PersonalSelectionsItemShowEvent(fromPage=my_items, availableItemsCount="), this.f405446b, ')');
    }
}
