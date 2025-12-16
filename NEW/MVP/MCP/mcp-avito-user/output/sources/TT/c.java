package tt;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationPhoneInputState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltt/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f439624b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f439625c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f439626d;

    public c() {
        this(null, null, false, 7, null);
    }

    public static c a(c cVar, PrintableText printableText, boolean z12, int i12) {
        Boolean bool = Boolean.FALSE;
        if ((i12 & 1) != 0) {
            printableText = cVar.f439624b;
        }
        if ((i12 & 2) != 0) {
            bool = cVar.f439625c;
        }
        if ((i12 & 4) != 0) {
            z12 = cVar.f439626d;
        }
        cVar.getClass();
        return new c(printableText, bool, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f439624b, cVar.f439624b) && L.f(this.f439625c, cVar.f439625c) && this.f439626d == cVar.f439626d;
    }

    public final int hashCode() {
        PrintableText printableText = this.f439624b;
        int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
        Boolean bool = this.f439625c;
        return Boolean.hashCode(this.f439626d) + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneInputState(inputErrorText=");
        sb2.append(this.f439624b);
        sb2.append(", isKeyboardOpen=");
        sb2.append(this.f439625c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f439626d, ')');
    }

    public /* synthetic */ c(PrintableText printableText, Boolean bool, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? Boolean.TRUE : bool, (i12 & 4) != 0 ? false : z12);
    }

    public c(@l PrintableText printableText, @l Boolean bool, boolean z12) {
        this.f439624b = printableText;
        this.f439625c = bool;
        this.f439626d = z12;
    }
}
