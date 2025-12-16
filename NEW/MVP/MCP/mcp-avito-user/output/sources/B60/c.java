package b60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f56915b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f56916c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f56917d;

    /* renamed from: e, reason: collision with root package name */
    public final long f56918e;

    public c() {
        this(null, null, false, 7, null);
    }

    public static c a(c cVar, String str, PrintableText printableText, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f56915b;
        }
        if ((i12 & 2) != 0) {
            printableText = cVar.f56916c;
        }
        if ((i12 & 4) != 0) {
            z12 = cVar.f56917d;
        }
        cVar.getClass();
        return new c(printableText, str, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f56915b, cVar.f56915b) && L.f(this.f56916c, cVar.f56916c) && this.f56917d == cVar.f56917d;
    }

    public final int hashCode() {
        int iHashCode = this.f56915b.hashCode() * 31;
        PrintableText printableText = this.f56916c;
        return Boolean.hashCode(this.f56917d) + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeConfirmState(phone=");
        sb2.append(this.f56915b);
        sb2.append(", codeValidationError=");
        sb2.append(this.f56916c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f56917d, ')');
    }

    public /* synthetic */ c(String str, PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : printableText, (i12 & 1) != 0 ? "" : str, (i12 & 4) != 0 ? false : z12);
    }

    public c(@l PrintableText printableText, @k String str, boolean z12) {
        this.f56915b = str;
        this.f56916c = printableText;
        this.f56917d = z12;
        this.f56918e = System.currentTimeMillis();
    }
}
