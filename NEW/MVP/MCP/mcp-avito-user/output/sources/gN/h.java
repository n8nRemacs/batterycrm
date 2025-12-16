package gn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/h;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f396835a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<i> f396836b;

    public h() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f396835a, hVar.f396835a) && L.f(this.f396836b, hVar.f396836b);
    }

    public final int hashCode() {
        return this.f396836b.hashCode() + (this.f396835a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Recommendations(feedTitle=");
        sb2.append(this.f396835a);
        sb2.append(", items=");
        return H.p(sb2, this.f396836b, ')');
    }

    public h(@k PrintableText printableText, @k List<i> list) {
        this.f396835a = printableText;
        this.f396836b = list;
    }

    public h(PrintableText printableText, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? com.avito.android.printable_text.b.a() : printableText, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
