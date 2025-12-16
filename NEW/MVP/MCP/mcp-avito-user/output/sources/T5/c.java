package T5;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LeasingTermView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT5/c;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f15356a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f15357b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<G0> f15358c;

    public c(@l Y41.a aVar, @l String str, @l String str2) {
        this.f15356a = str;
        this.f15357b = str2;
        this.f15358c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15356a, cVar.f15356a) && L.f(this.f15357b, cVar.f15357b) && L.f(this.f15358c, cVar.f15358c);
    }

    public final int hashCode() {
        String str = this.f15356a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15357b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Y41.a<G0> aVar = this.f15358c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeasingTermParams(title=");
        sb2.append(this.f15356a);
        sb2.append(", value=");
        sb2.append(this.f15357b);
        sb2.append(", tooltipListener=");
        return r.v(sb2, this.f15358c, ')');
    }
}
