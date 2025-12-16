package P00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalInputData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP00/b;", "LP00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f12762a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<LabelValueParameter> f12763b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final O00.a f12764c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Double f12765d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f12766e;

    public b(@l Integer num, @l List<LabelValueParameter> list, @l O00.a aVar, @l Double d12, @l PrintableText printableText) {
        this.f12762a = num;
        this.f12763b = list;
        this.f12764c = aVar;
        this.f12765d = d12;
        this.f12766e = printableText;
    }

    public static b b(b bVar, Integer num, O00.a aVar, Double d12, PrintableText printableText, int i12) {
        if ((i12 & 1) != 0) {
            num = bVar.f12762a;
        }
        Integer num2 = num;
        List<LabelValueParameter> list = bVar.f12763b;
        if ((i12 & 4) != 0) {
            aVar = bVar.f12764c;
        }
        O00.a aVar2 = aVar;
        if ((i12 & 8) != 0) {
            d12 = bVar.f12765d;
        }
        Double d13 = d12;
        if ((i12 & 16) != 0) {
            printableText = bVar.f12766e;
        }
        bVar.getClass();
        return new b(num2, list, aVar2, d13, printableText);
    }

    @Override // P00.a
    @k
    /* renamed from: a */
    public final String getF12770a() {
        return String.valueOf(this.f12762a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f12762a, bVar.f12762a) && L.f(this.f12763b, bVar.f12763b) && L.f(this.f12764c, bVar.f12764c) && L.f(this.f12765d, bVar.f12765d) && L.f(this.f12766e, bVar.f12766e);
    }

    @Override // P00.a
    @l
    /* renamed from: getError, reason: from getter */
    public final PrintableText getF12771b() {
        return this.f12766e;
    }

    public final int hashCode() {
        Integer num = this.f12762a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<LabelValueParameter> list = this.f12763b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        O00.a aVar = this.f12764c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Double d12 = this.f12765d;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        PrintableText printableText = this.f12766e;
        return iHashCode4 + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalInputData(value=");
        sb2.append(this.f12762a);
        sb2.append(", predefinedValues=");
        sb2.append(this.f12763b);
        sb2.append(", slider=");
        sb2.append(this.f12764c);
        sb2.append(", inputPercent=");
        sb2.append(this.f12765d);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f12766e, ')');
    }

    public /* synthetic */ b(Integer num, List list, O00.a aVar, Double d12, PrintableText printableText, int i12, C42822w c42822w) {
        this(num, list, aVar, (i12 & 8) != 0 ? null : d12, (i12 & 16) != 0 ? null : printableText);
    }
}
