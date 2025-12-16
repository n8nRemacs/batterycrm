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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/b;", "", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48437b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f438938a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f438939b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f438940c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438942e;

    public C48437b(@k String str, @l PrintableText printableText, boolean z12, boolean z13, int i12) {
        this.f438938a = str;
        this.f438939b = printableText;
        this.f438940c = z12;
        this.f438941d = z13;
        this.f438942e = i12;
    }

    public static C48437b a(C48437b c48437b, String str, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = c48437b.f438938a;
        }
        String str2 = str;
        PrintableText printableText = c48437b.f438939b;
        if ((i12 & 4) != 0) {
            z12 = c48437b.f438940c;
        }
        boolean z13 = c48437b.f438941d;
        int i13 = c48437b.f438942e;
        c48437b.getClass();
        return new C48437b(str2, printableText, z12, z13, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48437b)) {
            return false;
        }
        C48437b c48437b = (C48437b) obj;
        return L.f(this.f438938a, c48437b.f438938a) && this.f438939b.equals(c48437b.f438939b) && this.f438940c == c48437b.f438940c && this.f438941d == c48437b.f438941d && this.f438942e == c48437b.f438942e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f438942e) + r.i(r.i(com.avito.android.actions_sheet.a.f(this.f438939b, this.f438938a.hashCode() * 31, 31), 31, this.f438940c), 31, this.f438941d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputState(value=");
        sb2.append(this.f438938a);
        sb2.append(", placeholderText=");
        sb2.append(this.f438939b);
        sb2.append(", inErrorState=");
        sb2.append(this.f438940c);
        sb2.append(", multiline=");
        sb2.append(this.f438941d);
        sb2.append(", lines=");
        return r.t(sb2, this.f438942e, ')');
    }
}
