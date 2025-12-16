package Jo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14226c extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f9148b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9149c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14226c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14226c)) {
            return false;
        }
        C14226c c14226c = (C14226c) obj;
        return L.f(this.f9148b, c14226c.f9148b) && this.f9149c == c14226c.f9149c;
    }

    public final int hashCode() {
        PrintableText printableText = this.f9148b;
        return Boolean.hashCode(this.f9149c) + ((printableText == null ? 0 : printableText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeConfirmState(codeValidationError=");
        sb2.append(this.f9148b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f9149c, ')');
    }

    public /* synthetic */ C14226c(PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? false : z12);
    }

    public C14226c(@l PrintableText printableText, boolean z12) {
        this.f9148b = printableText;
        this.f9149c = z12;
    }
}
