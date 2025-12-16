package R00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalFormViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR00/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f14062a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<T00.a> f14063b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14064c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f14065d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f14066e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k PrintableText printableText, @k List<? extends T00.a> list, boolean z12, @k PrintableText printableText2, @k a aVar) {
        this.f14062a = printableText;
        this.f14063b = list;
        this.f14064c = z12;
        this.f14065d = printableText2;
        this.f14066e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14062a, cVar.f14062a) && L.f(this.f14063b, cVar.f14063b) && this.f14064c == cVar.f14064c && L.f(this.f14065d, cVar.f14065d) && L.f(this.f14066e, cVar.f14066e);
    }

    public final int hashCode() {
        return this.f14066e.hashCode() + com.avito.android.actions_sheet.a.f(this.f14065d, r.i(H.e(this.f14062a.hashCode() * 31, 31, this.f14063b), 31, this.f14064c), 31);
    }

    @k
    public final String toString() {
        return "PreApprovalFormViewState(screenTitle=" + this.f14062a + ", items=" + this.f14063b + ", canGoBack=" + this.f14064c + ", nextButtonTitle=" + this.f14065d + ", loadingState=" + this.f14066e + ')';
    }
}
