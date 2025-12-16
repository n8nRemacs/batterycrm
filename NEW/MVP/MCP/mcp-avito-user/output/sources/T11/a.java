package T11;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT11/a;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15306a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15307b;

    public a(@k String str, @k String str2) {
        this.f15306a = str;
        this.f15307b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f15306a, aVar.f15306a) && L.f(this.f15307b, aVar.f15307b);
    }

    public final int hashCode() {
        return this.f15307b.hashCode() + (this.f15306a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppInfo(packageName=");
        sb2.append(this.f15306a);
        sb2.append(", pubKey=");
        return C22026a.c(sb2, this.f15307b, ')');
    }
}
