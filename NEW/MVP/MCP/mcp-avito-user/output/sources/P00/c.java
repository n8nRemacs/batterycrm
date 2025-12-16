package P00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.dictionary.Parameter;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalOptionsData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP00/c;", "LP00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Parameter> f12767a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f12768b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f12769c;

    public c(@l PrintableText printableText, @l String str, @k List list) {
        this.f12767a = list;
        this.f12768b = str;
        this.f12769c = printableText;
    }

    public static c b(c cVar, List list, String str, PrintableText printableText, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f12767a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f12768b;
        }
        if ((i12 & 4) != 0) {
            printableText = cVar.f12769c;
        }
        cVar.getClass();
        return new c(printableText, str, list);
    }

    @Override // P00.a
    @l
    /* renamed from: a, reason: from getter */
    public final String getF12770a() {
        return this.f12768b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f12767a, cVar.f12767a) && L.f(this.f12768b, cVar.f12768b) && L.f(this.f12769c, cVar.f12769c);
    }

    @Override // P00.a
    @l
    /* renamed from: getError, reason: from getter */
    public final PrintableText getF12771b() {
        return this.f12769c;
    }

    public final int hashCode() {
        int iHashCode = this.f12767a.hashCode() * 31;
        String str = this.f12768b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PrintableText printableText = this.f12769c;
        return iHashCode2 + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalOptionsData(options=");
        sb2.append(this.f12767a);
        sb2.append(", value=");
        sb2.append(this.f12768b);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f12769c, ')');
    }

    public /* synthetic */ c(List list, String str, PrintableText printableText, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : printableText, str, list);
    }
}
