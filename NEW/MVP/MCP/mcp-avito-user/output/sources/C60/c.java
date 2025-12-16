package c60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeRequestState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57657b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57658c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57659d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f57660e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PrintableText f57661f;

    /* renamed from: g, reason: collision with root package name */
    public final long f57662g;

    /* renamed from: h, reason: collision with root package name */
    public final long f57663h;

    public c() {
        this(false, false, false, null, null, 0L, 63, null);
    }

    public static c a(c cVar, boolean z12, boolean z13, boolean z14, AttributedText attributedText, PrintableText printableText, long j12, int i12) {
        boolean z15 = (i12 & 1) != 0 ? cVar.f57657b : z12;
        boolean z16 = (i12 & 2) != 0 ? cVar.f57658c : z13;
        boolean z17 = (i12 & 4) != 0 ? cVar.f57659d : z14;
        AttributedText attributedText2 = (i12 & 8) != 0 ? cVar.f57660e : attributedText;
        PrintableText printableText2 = (i12 & 16) != 0 ? cVar.f57661f : printableText;
        long j13 = (i12 & 32) != 0 ? cVar.f57662g : j12;
        cVar.getClass();
        return new c(z15, z16, z17, attributedText2, printableText2, j13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f57657b == cVar.f57657b && this.f57658c == cVar.f57658c && this.f57659d == cVar.f57659d && L.f(this.f57660e, cVar.f57660e) && L.f(this.f57661f, cVar.f57661f) && this.f57662g == cVar.f57662g;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(Boolean.hashCode(this.f57657b) * 31, 31, this.f57658c), 31, this.f57659d);
        AttributedText attributedText = this.f57660e;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        PrintableText printableText = this.f57661f;
        return Long.hashCode(this.f57662g) + ((iHashCode + (printableText != null ? printableText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeRequestState(contentError=");
        sb2.append(this.f57657b);
        sb2.append(", isLoadingScreen=");
        sb2.append(this.f57658c);
        sb2.append(", isLoadingButton=");
        sb2.append(this.f57659d);
        sb2.append(", content=");
        sb2.append(this.f57660e);
        sb2.append(", phoneValidationError=");
        sb2.append(this.f57661f);
        sb2.append(", timeoutEndTimestampSeconds=");
        return r.u(sb2, this.f57662g, ')');
    }

    public /* synthetic */ c(boolean z12, boolean z13, boolean z14, AttributedText attributedText, PrintableText printableText, long j12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) == 0 ? z14 : false, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : printableText, (i12 & 32) != 0 ? 0L : j12);
    }

    public c(boolean z12, boolean z13, boolean z14, @l AttributedText attributedText, @l PrintableText printableText, long j12) {
        this.f57657b = z12;
        this.f57658c = z13;
        this.f57659d = z14;
        this.f57660e = attributedText;
        this.f57661f = printableText;
        this.f57662g = j12;
        this.f57663h = System.currentTimeMillis();
    }
}
