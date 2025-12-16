package uI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionsBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuI/e;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48904e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f439890a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C48901b> f439891b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48900a f439892c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f439893d;

    public C48904e(@k PrintableText printableText, @k List<C48901b> list, @l C48900a c48900a, boolean z12) {
        this.f439890a = printableText;
        this.f439891b = list;
        this.f439892c = c48900a;
        this.f439893d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48904e)) {
            return false;
        }
        C48904e c48904e = (C48904e) obj;
        return L.f(this.f439890a, c48904e.f439890a) && L.f(this.f439891b, c48904e.f439891b) && L.f(this.f439892c, c48904e.f439892c) && this.f439893d == c48904e.f439893d;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f439890a.hashCode() * 31, 31, this.f439891b);
        C48900a c48900a = this.f439892c;
        return Boolean.hashCode(this.f439893d) + ((iE2 + (c48900a == null ? 0 : c48900a.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionsBlock(title=");
        sb2.append(this.f439890a);
        sb2.append(", suggestions=");
        sb2.append(this.f439891b);
        sb2.append(", expandButton=");
        sb2.append(this.f439892c);
        sb2.append(", isOldDesign=");
        return r.x(sb2, this.f439893d, ')');
    }

    public /* synthetic */ C48904e(PrintableText printableText, List list, C48900a c48900a, boolean z12, int i12, C42822w c42822w) {
        this(printableText, list, (i12 & 4) != 0 ? null : c48900a, (i12 & 8) != 0 ? true : z12);
    }
}
