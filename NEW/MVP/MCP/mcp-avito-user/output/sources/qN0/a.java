package QN0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputValue.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQN0/a;", "", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13702a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13703b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f13704c;

    public a() {
        this(null, false, null, 7, null);
    }

    public static a a(a aVar, String str, PrintableText printableText, int i12) {
        if ((i12 & 1) != 0) {
            str = aVar.f13702a;
        }
        boolean z12 = (i12 & 2) != 0 ? aVar.f13703b : false;
        if ((i12 & 4) != 0) {
            printableText = aVar.f13704c;
        }
        aVar.getClass();
        return new a(printableText, str, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f13702a, aVar.f13702a) && this.f13703b == aVar.f13703b && L.f(this.f13704c, aVar.f13704c);
    }

    public final int hashCode() {
        int i12 = r.i(this.f13702a.hashCode() * 31, 31, this.f13703b);
        PrintableText printableText = this.f13704c;
        return i12 + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputValue(value=");
        sb2.append(this.f13702a);
        sb2.append(", isError=");
        sb2.append(this.f13703b);
        sb2.append(", error=");
        return c.m(sb2, this.f13704c, ')');
    }

    public a(@l PrintableText printableText, @k String str, boolean z12) {
        this.f13702a = str;
        this.f13703b = z12;
        this.f13704c = printableText;
    }

    public /* synthetic */ a(String str, boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : printableText, (i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? false : z12);
    }
}
