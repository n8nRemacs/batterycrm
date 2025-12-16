package HY;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessagePreview.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/q;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f7272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f7273b;

    public q(PrintableText printableText, Integer num, int i12, C42822w c42822w) {
        num = (i12 & 2) != 0 ? null : num;
        this.f7272a = printableText;
        this.f7273b = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f7272a, qVar.f7272a) && L.f(this.f7273b, qVar.f7273b);
    }

    public final int hashCode() {
        int iHashCode = this.f7272a.hashCode() * 31;
        Integer num = this.f7273b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessagePreview(text=");
        sb2.append(this.f7272a);
        sb2.append(", icon=");
        return s.j(sb2, this.f7273b, ')');
    }
}
