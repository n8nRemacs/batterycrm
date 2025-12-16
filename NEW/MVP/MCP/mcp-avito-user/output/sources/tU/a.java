package TU;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f15674a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f15675b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15676c;

    public a() {
        this(null, null, 0, 7, null);
    }

    public static a a(a aVar, String str, int i12, int i13) {
        if ((i13 & 1) != 0) {
            str = aVar.f15674a;
        }
        Y41.a<G0> aVar2 = aVar.f15675b;
        if ((i13 & 4) != 0) {
            i12 = aVar.f15676c;
        }
        aVar.getClass();
        return new a(i12, aVar2, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f15674a, aVar.f15674a) && L.f(this.f15675b, aVar.f15675b) && this.f15676c == aVar.f15676c;
    }

    public final int hashCode() {
        String str = this.f15674a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Y41.a<G0> aVar = this.f15675b;
        return Integer.hashCode(this.f15676c) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerState(title=");
        sb2.append(this.f15674a);
        sb2.append(", onCloseClick=");
        sb2.append(this.f15675b);
        sb2.append(", contentLayoutRes=");
        return r.t(sb2, this.f15676c, ')');
    }

    public a(@I int i12, @l Y41.a aVar, @l String str) {
        this.f15674a = str;
        this.f15675b = aVar;
        this.f15676c = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(String str, Y41.a aVar, int i12, int i13, C42822w c42822w) {
        str = (i13 & 1) != 0 ? null : str;
        this((i13 & 4) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : aVar, str);
    }
}
