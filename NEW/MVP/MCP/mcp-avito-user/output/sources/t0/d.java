package T0;

import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FidoDataTypes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT0/d;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f15268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f15269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f15271d;

    public d(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        z12 = (i12 & 4) != 0 ? false : z12;
        str3 = (i12 & 8) != 0 ? "preferred" : str3;
        this.f15268a = str;
        this.f15269b = str2;
        this.f15270c = z12;
        this.f15271d = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f15268a, dVar.f15268a) && L.f(this.f15269b, dVar.f15269b) && this.f15270c == dVar.f15270c && L.f(this.f15271d, dVar.f15271d);
    }

    public final int hashCode() {
        return this.f15271d.hashCode() + r.i(H.d(this.f15268a.hashCode() * 31, 31, this.f15269b), 31, this.f15270c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthenticatorSelectionCriteria(authenticatorAttachment=");
        sb2.append(this.f15268a);
        sb2.append(", residentKey=");
        sb2.append(this.f15269b);
        sb2.append(", requireResidentKey=");
        sb2.append(this.f15270c);
        sb2.append(", userVerification=");
        return C22026a.c(sb2, this.f15271d, ')');
    }
}
