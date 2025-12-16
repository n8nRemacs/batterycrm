package androidx.compose.ui.text;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.u;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: TextLayoutResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/o0;", "", "Landroidx/compose/ui/text/n0;", "layoutInput", "Landroidx/compose/ui/text/G;", "multiParagraph", "Landroidx/compose/ui/unit/u;", "size", "<init>", "(Landroidx/compose/ui/text/n0;Landroidx/compose/ui/text/G;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n0 f42526a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f42527b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42528c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42529d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42530e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f42531f;

    public o0(n0 n0Var, G g12, long j12, C42822w c42822w) {
        this.f42526a = n0Var;
        this.f42527b = g12;
        this.f42528c = j12;
        ArrayList arrayList = g12.f41923h;
        float fH2 = 0.0f;
        this.f42529d = arrayList.isEmpty() ? 0.0f : ((M) arrayList.get(0)).f41932a.e();
        ArrayList arrayList2 = g12.f41923h;
        if (!arrayList2.isEmpty()) {
            M m12 = (M) C42745f0.Q(arrayList2);
            fH2 = m12.f41932a.h() + m12.f41937f;
        }
        this.f42530e = fH2;
        this.f42531f = g12.f41922g;
    }

    public static int f(o0 o0Var, int i12) {
        return o0Var.f42527b.c(i12, false);
    }

    @Y61.k
    public final ResolvedTextDirection a(int i12) {
        G g12 = this.f42527b;
        g12.n(i12);
        int length = g12.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(i12 == length ? C42745f0.J(arrayList) : J.a(i12, arrayList));
        return m12.f41932a.x(m12.d(i12));
    }

    @Y61.k
    public final l0.j b(int i12) {
        G g12 = this.f42527b;
        g12.m(i12);
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(J.a(i12, arrayList));
        return m12.a(m12.f41932a.j(m12.d(i12)));
    }

    @Y61.k
    public final l0.j c(int i12) {
        G g12 = this.f42527b;
        g12.n(i12);
        int length = g12.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(i12 == length ? C42745f0.J(arrayList) : J.a(i12, arrayList));
        return m12.a(m12.f41932a.g(m12.d(i12)));
    }

    public final boolean d() {
        G g12 = this.f42527b;
        return g12.f41918c || ((float) ((int) (this.f42528c & 4294967295L))) < g12.f41920e;
    }

    public final boolean e() {
        return ((float) ((int) (this.f42528c >> 32))) < this.f42527b.f41919d || d();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.L.f(this.f42526a, o0Var.f42526a) && kotlin.jvm.internal.L.f(this.f42527b, o0Var.f42527b) && androidx.compose.ui.unit.u.c(this.f42528c, o0Var.f42528c) && this.f42529d == o0Var.f42529d && this.f42530e == o0Var.f42530e && kotlin.jvm.internal.L.f(this.f42531f, o0Var.f42531f);
    }

    public final float g(int i12) {
        G g12 = this.f42527b;
        g12.o(i12);
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.a(i12 - m12.f41935d);
    }

    public final float h(int i12) {
        G g12 = this.f42527b;
        g12.o(i12);
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.b(i12 - m12.f41935d);
    }

    public final int hashCode() {
        int iHashCode = (this.f42527b.hashCode() + (this.f42526a.hashCode() * 31)) * 31;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return this.f42531f.hashCode() + androidx.appcompat.app.r.d(this.f42530e, androidx.appcompat.app.r.d(this.f42529d, androidx.appcompat.app.r.g(iHashCode, 31, this.f42528c), 31), 31);
    }

    public final int i(int i12) {
        G g12 = this.f42527b;
        g12.o(i12);
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.f(i12 - m12.f41935d) + m12.f41933b;
    }

    @Y61.k
    public final ResolvedTextDirection j(int i12) {
        G g12 = this.f42527b;
        g12.n(i12);
        int length = g12.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(i12 == length ? C42745f0.J(arrayList) : J.a(i12, arrayList));
        return m12.f41932a.c(m12.d(i12));
    }

    @Y61.k
    public final C22277p k(int i12, int i13) {
        G g12 = this.f42527b;
        H h12 = g12.f41916a;
        if (i12 < 0 || i12 > i13 || i13 > h12.f41924a.f42127c.length()) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "Start(", ") or End(", ") is out of range [0..");
            sbY.append(h12.f41924a.f42127c.length());
            sbY.append("), or start > end!");
            C50028a.a(sbY.toString());
        }
        if (i12 == i13) {
            return C22315w.a();
        }
        C22277p c22277pA = C22315w.a();
        J.d(g12.f41923h, w0.a(i12, i13), new F(c22277pA, i12, i13));
        return c22277pA;
    }

    public final long l(int i12) {
        G g12 = this.f42527b;
        g12.n(i12);
        int length = g12.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = g12.f41923h;
        M m12 = (M) arrayList.get(i12 == length ? C42745f0.J(arrayList) : J.a(i12, arrayList));
        return m12.b(m12.f41932a.k(m12.d(i12)), false);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutResult(layoutInput=");
        sb2.append(this.f42526a);
        sb2.append(", multiParagraph=");
        sb2.append(this.f42527b);
        sb2.append(", size=");
        sb2.append((Object) androidx.compose.ui.unit.u.d(this.f42528c));
        sb2.append(", firstBaseline=");
        sb2.append(this.f42529d);
        sb2.append(", lastBaseline=");
        sb2.append(this.f42530e);
        sb2.append(", placeholderRects=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f42531f, ')');
    }
}
