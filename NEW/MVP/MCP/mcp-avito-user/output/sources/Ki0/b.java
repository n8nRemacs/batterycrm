package KI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SoaStatInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKI0/b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9388a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9389b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f9388a, bVar.f9388a) && L.f(this.f9389b, bVar.f9389b);
    }

    public final int hashCode() {
        return this.f9389b.hashCode() + (this.f9388a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SoaStatInfo(value=");
        sb2.append(this.f9388a);
        sb2.append(", currency=");
        return C22026a.c(sb2, this.f9389b, ')');
    }

    public b(@k String str, @k String str2) {
        this.f9388a = str;
        this.f9389b = str2;
    }

    public /* synthetic */ b(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2);
    }
}
