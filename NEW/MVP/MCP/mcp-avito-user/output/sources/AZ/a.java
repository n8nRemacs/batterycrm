package AZ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.model.network.OwnerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoOwner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAZ/a;", "", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OwnerType f441c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<String> f442d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<a> f443e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f444f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<c> f445g;

    public a() {
        throw null;
    }

    public a(String str, String str2, OwnerType ownerType, List list, List list2, String str3, List list3, int i12, C42822w c42822w) {
        list2 = (i12 & 16) != 0 ? new ArrayList() : list2;
        str3 = (i12 & 32) != 0 ? null : str3;
        list3 = (i12 & 64) != 0 ? C42784z0.f406748b : list3;
        this.f439a = str;
        this.f440b = str2;
        this.f441c = ownerType;
        this.f442d = list;
        this.f443e = list2;
        this.f444f = str3;
        this.f445g = list3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f439a, aVar.f439a) && L.f(this.f440b, aVar.f440b) && this.f441c == aVar.f441c && L.f(this.f442d, aVar.f442d) && L.f(this.f443e, aVar.f443e) && L.f(this.f444f, aVar.f444f) && L.f(this.f445g, aVar.f445g);
    }

    public final int hashCode() {
        int iE2 = H.e(H.e((this.f441c.hashCode() + H.d(this.f439a.hashCode() * 31, 31, this.f440b)) * 31, 31, this.f442d), 31, this.f443e);
        String str = this.f444f;
        return this.f445g.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoOwner(id=");
        sb2.append(this.f439a);
        sb2.append(", name=");
        sb2.append(this.f440b);
        sb2.append(", type=");
        sb2.append(this.f441c);
        sb2.append(", channels=");
        sb2.append(this.f442d);
        sb2.append(", children=");
        sb2.append(this.f443e);
        sb2.append(", parentId=");
        sb2.append(this.f444f);
        sb2.append(", people=");
        return H.p(sb2, this.f445g, ')');
    }
}
