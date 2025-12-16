package B10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgesBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB10/b;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f794a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<a> f795b;

    public b(@k String str, @k List<a> list) {
        this.f794a = str;
        this.f795b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f794a, bVar.f794a) && L.f(this.f795b, bVar.f795b);
    }

    public final int hashCode() {
        return this.f795b.hashCode() + (this.f794a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgesBlock(title=");
        sb2.append(this.f794a);
        sb2.append(", badges=");
        return H.p(sb2, this.f795b, ')');
    }
}
