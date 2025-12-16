package DN0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VdrCategory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDN0/b;", "", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Category f3167a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3168b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3169c;

    public b(@k Category category, @k String str, @k String str2) {
        this.f3167a = category;
        this.f3168b = str;
        this.f3169c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3167a == bVar.f3167a && L.f(this.f3168b, bVar.f3168b) && L.f(this.f3169c, bVar.f3169c);
    }

    public final int hashCode() {
        return this.f3169c.hashCode() + H.d(this.f3167a.hashCode() * 31, 31, this.f3168b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VdrCategory(category=");
        sb2.append(this.f3167a);
        sb2.append(", processId=");
        sb2.append(this.f3168b);
        sb2.append(", label=");
        return C22026a.c(sb2, this.f3169c, ')');
    }
}
