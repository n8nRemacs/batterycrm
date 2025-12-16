package op0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessStateData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/h;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<? extends com.avito.conveyor_item.a> f420219a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C23424o.e f420220b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f420221c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f420222d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f420223e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final MnzFloatingFooter f420224f;

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static h a(h hVar, List list, C23424o.e eVar, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, MnzFloatingFooter mnzFloatingFooter, int i12) {
        if ((i12 & 1) != 0) {
            list = hVar.f420219a;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            eVar = hVar.f420220b;
        }
        C23424o.e eVar2 = eVar;
        if ((i12 & 4) != 0) {
            printableText = hVar.f420221c;
        }
        PrintableText printableText4 = printableText;
        if ((i12 & 8) != 0) {
            printableText2 = hVar.f420222d;
        }
        PrintableText printableText5 = printableText2;
        if ((i12 & 16) != 0) {
            printableText3 = hVar.f420223e;
        }
        PrintableText printableText6 = printableText3;
        if ((i12 & 32) != 0) {
            mnzFloatingFooter = hVar.f420224f;
        }
        hVar.getClass();
        return new h(list2, eVar2, printableText4, printableText5, printableText6, mnzFloatingFooter);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f420219a, hVar.f420219a) && L.f(this.f420220b, hVar.f420220b) && L.f(this.f420221c, hVar.f420221c) && L.f(this.f420222d, hVar.f420222d) && L.f(this.f420223e, hVar.f420223e) && L.f(this.f420224f, hVar.f420224f);
    }

    public final int hashCode() {
        int iHashCode = this.f420219a.hashCode() * 31;
        C23424o.e eVar = this.f420220b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        PrintableText printableText = this.f420221c;
        int iHashCode3 = (iHashCode2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f420222d;
        int iHashCode4 = (iHashCode3 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        PrintableText printableText3 = this.f420223e;
        int iHashCode5 = (iHashCode4 + (printableText3 == null ? 0 : printableText3.hashCode())) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f420224f;
        return iHashCode5 + (mnzFloatingFooter != null ? mnzFloatingFooter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SuccessStateData(items=" + this.f420219a + ", diff=" + this.f420220b + ", helpButtonTitle=" + this.f420221c + ", nextButtonTitle=" + this.f420222d + ", skipButtonTitle=" + this.f420223e + ", floatingFooter=" + this.f420224f + ')';
    }

    public h(@k List<? extends com.avito.conveyor_item.a> list, @l C23424o.e eVar, @l PrintableText printableText, @l PrintableText printableText2, @l PrintableText printableText3, @l MnzFloatingFooter mnzFloatingFooter) {
        this.f420219a = list;
        this.f420220b = eVar;
        this.f420221c = printableText;
        this.f420222d = printableText2;
        this.f420223e = printableText3;
        this.f420224f = mnzFloatingFooter;
    }

    public h(List list, C23424o.e eVar, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, MnzFloatingFooter mnzFloatingFooter, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : eVar, (i12 & 4) != 0 ? null : printableText, (i12 & 8) != 0 ? null : printableText2, (i12 & 16) != 0 ? null : printableText3, (i12 & 32) == 0 ? mnzFloatingFooter : null);
    }
}
