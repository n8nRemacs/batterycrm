package QV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.util.groupable_item.immutable.Edges;
import j.InterfaceC42161q;
import kotlin.Metadata;

/* compiled from: GroupingResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQV/b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f13743a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Edges f13744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13745c;

    public b(int i12, @k Edges edges, @InterfaceC42161q int i13) {
        this.f13743a = i12;
        this.f13744b = edges;
        this.f13745c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13743a == bVar.f13743a && this.f13744b == bVar.f13744b && this.f13745c == bVar.f13745c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13745c) + ((this.f13744b.hashCode() + (Integer.hashCode(this.f13743a) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupingResult(originalPosition=");
        sb2.append(this.f13743a);
        sb2.append(", edges=");
        sb2.append(this.f13744b);
        sb2.append(", bottomSpacingRes=");
        return r.t(sb2, this.f13745c, ')');
    }
}
