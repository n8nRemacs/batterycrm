package WU;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContentPlaceholderState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f17925a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f17926b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f17927c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f17928d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final View.OnClickListener f17929e;

    public a(@InterfaceC42165v @l Integer num, @l PrintableText printableText, @l PrintableText printableText2, @l PrintableText printableText3, @l View.OnClickListener onClickListener) {
        this.f17925a = num;
        this.f17926b = printableText;
        this.f17927c = printableText2;
        this.f17928d = printableText3;
        this.f17929e = onClickListener;
    }

    public static a a(a aVar, PrintableText printableText, PrintableText printableText2, int i12) {
        Integer num = aVar.f17925a;
        if ((i12 & 2) != 0) {
            printableText = aVar.f17926b;
        }
        PrintableText printableText3 = printableText;
        if ((i12 & 4) != 0) {
            printableText2 = aVar.f17927c;
        }
        PrintableText printableText4 = aVar.f17928d;
        View.OnClickListener onClickListener = aVar.f17929e;
        aVar.getClass();
        return new a(num, printableText3, printableText2, printableText4, onClickListener);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f17925a, aVar.f17925a) && L.f(this.f17926b, aVar.f17926b) && L.f(this.f17927c, aVar.f17927c) && L.f(this.f17928d, aVar.f17928d) && L.f(this.f17929e, aVar.f17929e);
    }

    public final int hashCode() {
        Integer num = this.f17925a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PrintableText printableText = this.f17926b;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f17927c;
        int iHashCode3 = (iHashCode2 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        PrintableText printableText3 = this.f17928d;
        int iHashCode4 = (iHashCode3 + (printableText3 == null ? 0 : printableText3.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f17929e;
        return iHashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ContentPlaceholderState(imgRes=" + this.f17925a + ", title=" + this.f17926b + ", subtitle=" + this.f17927c + ", buttonTitle=" + this.f17928d + ", onClickListener=" + this.f17929e + ')';
    }

    public /* synthetic */ a(Integer num, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, View.OnClickListener onClickListener, int i12, C42822w c42822w) {
        this(num, printableText, printableText2, printableText3, (i12 & 16) != 0 ? null : onClickListener);
    }
}
