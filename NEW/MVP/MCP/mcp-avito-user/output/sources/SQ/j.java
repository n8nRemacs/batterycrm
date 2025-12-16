package Sq;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonItems.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSq/j;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15163a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f15164b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TV0.a> f15165c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@k String str, @k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
        this.f15163a = str;
        this.f15164b = list;
        this.f15165c = list2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f15163a, jVar.f15163a) && L.f(this.f15164b, jVar.f15164b) && L.f(this.f15165c, jVar.f15165c);
    }

    public final int hashCode() {
        return this.f15165c.hashCode() + H.e(this.f15163a.hashCode() * 31, 31, this.f15164b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonItems(toolbarTitle=");
        sb2.append(this.f15163a);
        sb2.append(", headerItems=");
        sb2.append(this.f15164b);
        sb2.append(", bodyItems=");
        return H.p(sb2, this.f15165c, ')');
    }
}
