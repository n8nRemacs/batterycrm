package P00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalStringData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP00/d;", "LP00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12770a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f12771b;

    public d(@k String str, @l PrintableText printableText) {
        this.f12770a = str;
        this.f12771b = printableText;
    }

    @Override // P00.a
    @k
    /* renamed from: a, reason: from getter */
    public final String getF12770a() {
        return this.f12770a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f12770a, dVar.f12770a) && L.f(this.f12771b, dVar.f12771b);
    }

    @Override // P00.a
    @l
    /* renamed from: getError, reason: from getter */
    public final PrintableText getF12771b() {
        return this.f12771b;
    }

    public final int hashCode() {
        int iHashCode = this.f12770a.hashCode() * 31;
        PrintableText printableText = this.f12771b;
        return iHashCode + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalStringData(value=");
        sb2.append(this.f12770a);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f12771b, ')');
    }

    public /* synthetic */ d(String str, PrintableText printableText, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : printableText);
    }
}
