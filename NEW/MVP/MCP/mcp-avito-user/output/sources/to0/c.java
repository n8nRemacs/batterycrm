package TO0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RefundData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTO0/c;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15641a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15642b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15643c;

    public c(@k String str, @k String str2, boolean z12) {
        this.f15641a = str;
        this.f15642b = str2;
        this.f15643c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15641a, cVar.f15641a) && L.f(this.f15642b, cVar.f15642b) && this.f15643c == cVar.f15643c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15643c) + H.d(this.f15641a.hashCode() * 31, 31, this.f15642b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RefundData(amount=");
        sb2.append(this.f15641a);
        sb2.append(", subtitle=");
        sb2.append(this.f15642b);
        sb2.append(", refundAvailable=");
        return r.x(sb2, this.f15643c, ')');
    }
}
