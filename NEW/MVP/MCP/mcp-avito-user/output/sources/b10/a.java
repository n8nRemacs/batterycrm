package B10;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.F3;
import com.akita.compose.component.docking_badge.i;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgesBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB10/a;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f790a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f791b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<A, Integer, i> f792c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f793d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k m mVar, @k m mVar2, @k p<? super A, ? super Integer, i> pVar, @k PrintableText printableText) {
        this.f790a = mVar;
        this.f791b = mVar2;
        this.f792c = pVar;
        this.f793d = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f790a, aVar.f790a) && L.f(this.f791b, aVar.f791b) && L.f(this.f792c, aVar.f792c) && L.f(this.f793d, aVar.f793d);
    }

    public final int hashCode() {
        return this.f793d.hashCode() + ((this.f792c.hashCode() + ((this.f791b.hashCode() + (this.f790a.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Badge(leftCorner=");
        sb2.append(this.f790a);
        sb2.append(", rightCorner=");
        sb2.append(this.f791b);
        sb2.append(", style=");
        sb2.append(this.f792c);
        sb2.append(", text=");
        return AK.c.m(sb2, this.f793d, ')');
    }
}
