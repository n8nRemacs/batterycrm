package ao;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: TreeItemClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ao.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C23642a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f56216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56217c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f56218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f56219e;

    public C23642a(@k String str, int i12, @k String str2) {
        this.f56216b = str;
        this.f56217c = i12;
        this.f56218d = str2;
        this.f56219e = new ParametrizedClickStreamEvent(15079, 2, P0.g(new Q("categoryid", str2), new Q("promocampaign_type", str), new Q("level_name", Integer.valueOf(i12))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23642a)) {
            return false;
        }
        C23642a c23642a = (C23642a) obj;
        return L.f(this.f56216b, c23642a.f56216b) && this.f56217c == c23642a.f56217c && L.f(this.f56218d, c23642a.f56218d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f56219e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f56219e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f56219e.f90248c;
    }

    public final int hashCode() {
        return this.f56218d.hashCode() + r.e(this.f56217c, this.f56216b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeItemClickEvent(promoType=");
        sb2.append(this.f56216b);
        sb2.append(", level=");
        sb2.append(this.f56217c);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f56218d, ')');
    }
}
