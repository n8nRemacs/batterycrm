package sz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendReportState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/a;", "", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48436a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f438936a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f438937b;

    public C48436a(@k PrintableText printableText, boolean z12) {
        this.f438936a = printableText;
        this.f438937b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48436a)) {
            return false;
        }
        C48436a c48436a = (C48436a) obj;
        return L.f(this.f438936a, c48436a.f438936a) && this.f438937b == c48436a.f438937b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f438937b) + (this.f438936a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Action(text=");
        sb2.append(this.f438936a);
        sb2.append(", enabled=");
        return r.x(sb2, this.f438937b, ')');
    }
}
