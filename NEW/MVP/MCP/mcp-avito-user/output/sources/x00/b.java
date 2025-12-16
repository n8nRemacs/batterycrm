package X00;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalResultViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX00/b;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<T00.a> f18114a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f18115b;

    public b(@l PrintableText printableText, @k List list) {
        this.f18114a = list;
        this.f18115b = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f18114a, bVar.f18114a) && L.f(this.f18115b, bVar.f18115b);
    }

    public final int hashCode() {
        int iHashCode = this.f18114a.hashCode() * 31;
        PrintableText printableText = this.f18115b;
        return iHashCode + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalResultViewState(items=");
        sb2.append(this.f18114a);
        sb2.append(", navigationTitle=");
        return c.m(sb2, this.f18115b, ')');
    }
}
