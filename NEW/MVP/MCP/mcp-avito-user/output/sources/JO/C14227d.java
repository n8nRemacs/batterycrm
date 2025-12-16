package Jo;

import Jo.InterfaceC14228e;
import Jo.InterfaceC14229f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jo.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14227d extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f9150b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9151c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14228e f9152d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14229f f9153e;

    public C14227d() {
        this(null, false, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14227d)) {
            return false;
        }
        C14227d c14227d = (C14227d) obj;
        return L.f(this.f9150b, c14227d.f9150b) && this.f9151c == c14227d.f9151c && L.f(this.f9152d, c14227d.f9152d) && L.f(this.f9153e, c14227d.f9153e);
    }

    public final int hashCode() {
        PrintableText printableText = this.f9150b;
        return this.f9153e.hashCode() + ((this.f9152d.hashCode() + r.i((printableText == null ? 0 : printableText.hashCode()) * 31, 31, this.f9151c)) * 31);
    }

    @k
    public final String toString() {
        return "CodeConfirmViewState(codeValidationError=" + this.f9150b + ", isInteractionsEnabled=" + this.f9151c + ", confirmButtonState=" + this.f9152d + ", requestButtonState=" + this.f9153e + ')';
    }

    public /* synthetic */ C14227d(PrintableText printableText, boolean z12, InterfaceC14228e interfaceC14228e, InterfaceC14229f interfaceC14229f, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? InterfaceC14228e.a.f9154a : interfaceC14228e, (i12 & 8) != 0 ? InterfaceC14229f.a.f9156a : interfaceC14229f);
    }

    public C14227d(@l PrintableText printableText, boolean z12, @k InterfaceC14228e interfaceC14228e, @k InterfaceC14229f interfaceC14229f) {
        this.f9150b = printableText;
        this.f9151c = z12;
        this.f9152d = interfaceC14228e;
        this.f9153e = interfaceC14229f;
    }
}
