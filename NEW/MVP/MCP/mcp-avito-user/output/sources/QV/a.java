package QV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: GroupingModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13741a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13742b;

    public a(int i12, boolean z12) {
        this.f13741a = i12;
        this.f13742b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13741a == aVar.f13741a && this.f13742b == aVar.f13742b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13742b) + (Integer.hashCode(this.f13741a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupingModel(originalPosition=");
        sb2.append(this.f13741a);
        sb2.append(", needToGroup=");
        return r.x(sb2, this.f13742b, ')');
    }
}
