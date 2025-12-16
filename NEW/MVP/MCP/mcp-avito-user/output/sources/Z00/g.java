package z00;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManagerUspState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz00/g;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443698a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f443699b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f443700c;

    public g(@k String str, @k String str2, @k String str3) {
        this.f443698a = str;
        this.f443699b = str2;
        this.f443700c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f443698a, gVar.f443698a) && L.f(this.f443699b, gVar.f443699b) && L.f(this.f443700c, gVar.f443700c);
    }

    public final int hashCode() {
        return this.f443700c.hashCode() + H.d(this.f443698a.hashCode() * 31, 31, this.f443699b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Usp(title=");
        sb2.append(this.f443698a);
        sb2.append(", description=");
        sb2.append(this.f443699b);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.f443700c, ')');
    }
}
