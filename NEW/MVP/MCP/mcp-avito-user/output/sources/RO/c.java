package Ro;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneRequestState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14631b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f14632c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14633d;

    public c() {
        this(false, null, 0L, 7, null);
    }

    public static c a(c cVar, boolean z12, PrintableText printableText, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f14631b;
        }
        if ((i12 & 2) != 0) {
            printableText = cVar.f14632c;
        }
        long j12 = cVar.f14633d;
        cVar.getClass();
        return new c(z12, printableText, j12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14631b == cVar.f14631b && L.f(this.f14632c, cVar.f14632c) && this.f14633d == cVar.f14633d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14631b) * 31;
        PrintableText printableText = this.f14632c;
        return Long.hashCode(this.f14633d) + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneRequestState(isLoading=");
        sb2.append(this.f14631b);
        sb2.append(", phoneValidationError=");
        sb2.append(this.f14632c);
        sb2.append(", timeoutEndTimestamp=");
        return r.u(sb2, this.f14633d, ')');
    }

    public /* synthetic */ c(boolean z12, PrintableText printableText, long j12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : printableText, (i12 & 4) != 0 ? 0L : j12);
    }

    public c(boolean z12, @l PrintableText printableText, long j12) {
        this.f14631b = z12;
        this.f14632c = printableText;
        this.f14633d = j12;
    }
}
