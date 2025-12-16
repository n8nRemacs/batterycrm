package androidx.compose.ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.d1;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.text.font.C22629x;
import androidx.compose.ui.text.font.D;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import l0.g;
import l0.n;
import y0.C50028a;

/* compiled from: MultiParagraph.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB[\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u001bB[\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/G;", "", "Landroidx/compose/ui/text/H;", "intrinsics", "Landroidx/compose/ui/unit/b;", "constraints", "", "maxLines", "Landroidx/compose/ui/text/style/s;", "overflow", "<init>", "(Landroidx/compose/ui/text/H;JIILkotlin/jvm/internal/w;)V", "", "ellipsis", "(Landroidx/compose/ui/text/H;JIZLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/text/e;", "annotatedString", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;JLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/E$b;Ljava/util/List;IZLkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;JLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/E$b;Ljava/util/List;IILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f41916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41917b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41918c;

    /* renamed from: d, reason: collision with root package name */
    public final float f41919d;

    /* renamed from: e, reason: collision with root package name */
    public final float f41920e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41921f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41922g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41923h;

    @InterfaceC42830m
    public G() {
        throw null;
    }

    public G(H h12, long j12, int i12, int i13, C42822w c42822w) {
        boolean z12;
        int i14;
        this.f41916a = h12;
        this.f41917b = i12;
        if (C22712b.l(j12) != 0 || C22712b.k(j12) != 0) {
            C50028a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = h12.f41928e;
        int size = arrayList2.size();
        float f12 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            N n12 = (N) arrayList2.get(i15);
            androidx.compose.ui.text.platform.g gVar = n12.f41939a;
            int iJ2 = C22712b.j(j12);
            if (C22712b.e(j12)) {
                i14 = C22712b.i(j12) - Q.b(f12);
                if (i14 < 0) {
                    i14 = 0;
                }
            } else {
                i14 = C22712b.i(j12);
            }
            C22578b c22578b = new C22578b(gVar, this.f41917b - i16, i13, C22713c.b(iJ2, i14, 5), null);
            float height = c22578b.getHeight() + f12;
            androidx.compose.ui.text.android.M m12 = c22578b.f42042d;
            int i17 = i16 + m12.f41990h;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new M(c22578b, n12.f41940b, n12.f41941c, i16, i17, f12, height));
            if (m12.f41987e || (i17 == this.f41917b && i15 != C42745f0.J(this.f41916a.f41928e))) {
                z12 = true;
                i16 = i17;
                f12 = height;
                break;
            } else {
                i15++;
                i16 = i17;
                f12 = height;
                arrayList2 = arrayList3;
            }
        }
        z12 = false;
        this.f41920e = f12;
        this.f41921f = i16;
        this.f41918c = z12;
        this.f41923h = arrayList;
        this.f41919d = C22712b.j(j12);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            M m13 = (M) arrayList.get(i18);
            List<l0.j> listY = m13.f41932a.y();
            ArrayList arrayList5 = new ArrayList(listY.size());
            int size3 = listY.size();
            for (int i19 = 0; i19 < size3; i19++) {
                l0.j jVar = listY.get(i19);
                arrayList5.add(jVar != null ? m13.a(jVar) : null);
            }
            C42745f0.h(arrayList5, arrayList4);
        }
        if (arrayList4.size() < this.f41916a.f41925b.size()) {
            int size4 = this.f41916a.f41925b.size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i22 = 0; i22 < size4; i22++) {
                arrayList6.add(null);
            }
            arrayList4 = C42745f0.h0(arrayList6, arrayList4);
        }
        this.f41922g = arrayList4;
    }

    public static void j(G g12, androidx.compose.ui.graphics.M m12, long j12, f1 f1Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.graphics.drawscope.j jVar2) {
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        g12.i(m12, j12, f1Var, jVar, jVar2, g.a.f39492b);
    }

    public static void l(G g12, androidx.compose.ui.graphics.M m12, androidx.compose.ui.graphics.J j12, float f12, f1 f1Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.graphics.drawscope.j jVar2) {
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        g12.k(m12, j12, f12, f1Var, jVar, jVar2, g.a.f39492b);
    }

    @Y61.k
    public final void a(long j12, @Y61.k float[] fArr) {
        m(v0.g(j12));
        n(v0.f(j12));
        l0.f fVar = new l0.f();
        fVar.f406840b = 0;
        J.d(this.f41923h, j12, new E(j12, fArr, fVar, new l0.e()));
    }

    public final float b(int i12) {
        o(i12);
        ArrayList arrayList = this.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.r(i12 - m12.f41935d) + m12.f41937f;
    }

    public final int c(int i12, boolean z12) {
        o(i12);
        ArrayList arrayList = this.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.m(i12 - m12.f41935d, z12) + m12.f41933b;
    }

    public final int d(int i12) {
        int length = this.f41916a.f41924a.f42127c.length();
        ArrayList arrayList = this.f41923h;
        M m12 = (M) arrayList.get(i12 >= length ? C42745f0.J(arrayList) : i12 < 0 ? 0 : J.a(i12, arrayList));
        return m12.f41932a.i(m12.d(i12)) + m12.f41935d;
    }

    public final int e(float f12) {
        ArrayList arrayList = this.f41923h;
        M m12 = (M) arrayList.get(J.c(arrayList, f12));
        int i12 = m12.f41934c - m12.f41933b;
        int i13 = m12.f41935d;
        if (i12 == 0) {
            return i13;
        }
        return i13 + m12.f41932a.p(f12 - m12.f41937f);
    }

    public final float f(int i12) {
        o(i12);
        ArrayList arrayList = this.f41923h;
        M m12 = (M) arrayList.get(J.b(i12, arrayList));
        return m12.f41932a.d(i12 - m12.f41935d) + m12.f41937f;
    }

    public final int g(long j12) {
        ArrayList arrayList = this.f41923h;
        int i12 = (int) (j12 & 4294967295L);
        M m12 = (M) arrayList.get(J.c(arrayList, Float.intBitsToFloat(i12)));
        int i13 = m12.f41934c;
        int i14 = m12.f41933b;
        if (i13 - i14 == 0) {
            return i14;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12) - m12.f41937f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        g.a aVar = l0.g.f413384b;
        return i14 + m12.f41932a.l(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    public final long h(@Y61.k l0.j jVar, int i12, @Y61.k l0 l0Var) {
        long jB2;
        long j12;
        ArrayList arrayList = this.f41923h;
        int iC2 = J.c(arrayList, jVar.f413391b);
        float f12 = ((M) arrayList.get(iC2)).f41938g;
        float f13 = jVar.f413393d;
        if (f12 >= f13 || iC2 == C42745f0.J(arrayList)) {
            M m12 = (M) arrayList.get(iC2);
            return m12.b(m12.f41932a.o(m12.c(jVar), i12, l0Var), true);
        }
        int iC3 = J.c(arrayList, f13);
        v0.f42734b.getClass();
        long jB3 = v0.f42735c;
        while (true) {
            v0.f42734b.getClass();
            jB2 = v0.f42735c;
            if (!v0.c(jB3, jB2) || iC2 > iC3) {
                break;
            }
            M m13 = (M) arrayList.get(iC2);
            jB3 = m13.b(m13.f41932a.o(m13.c(jVar), i12, l0Var), true);
            iC2++;
        }
        if (v0.c(jB3, jB2)) {
            return jB2;
        }
        while (true) {
            v0.f42734b.getClass();
            j12 = v0.f42735c;
            if (!v0.c(jB2, j12) || iC2 > iC3) {
                break;
            }
            M m14 = (M) arrayList.get(iC3);
            jB2 = m14.b(m14.f41932a.o(m14.c(jVar), i12, l0Var), true);
            iC3--;
        }
        return v0.c(jB2, j12) ? jB3 : w0.a((int) (jB3 >> 32), (int) (4294967295L & jB2));
    }

    public final void i(@Y61.k androidx.compose.ui.graphics.M m12, long j12, @Y61.l f1 f1Var, @Y61.l androidx.compose.ui.text.style.j jVar, @Y61.l androidx.compose.ui.graphics.drawscope.j jVar2, int i12) {
        m12.k();
        ArrayList arrayList = this.f41923h;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            M m13 = (M) arrayList.get(i13);
            m13.f41932a.s(m12, j12, f1Var, jVar, jVar2, i12);
            m12.m(0.0f, m13.f41932a.getHeight());
        }
        m12.i();
    }

    public final void k(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.k androidx.compose.ui.graphics.J j12, float f12, @Y61.l f1 f1Var, @Y61.l androidx.compose.ui.text.style.j jVar, @Y61.l androidx.compose.ui.graphics.drawscope.j jVar2, int i12) {
        m12.k();
        ArrayList arrayList = this.f41923h;
        if (arrayList.size() <= 1 || (j12 instanceof k1)) {
            androidx.compose.ui.text.platform.e.a(this, m12, j12, f12, f1Var, jVar, jVar2, i12);
        } else if (j12 instanceof d1) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i13 = 0; i13 < size; i13++) {
                M m13 = (M) arrayList.get(i13);
                height += m13.f41932a.getHeight();
                fMax = Math.max(fMax, m13.f41932a.getWidth());
            }
            n.a aVar = l0.n.f413402b;
            Shader shaderB = ((d1) j12).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                M m14 = (M) arrayList.get(i14);
                m14.f41932a.w(m12, new androidx.compose.ui.graphics.K(shaderB), f12, f1Var, jVar, jVar2, i12);
                L l12 = m14.f41932a;
                m12.m(0.0f, l12.getHeight());
                matrix.setTranslate(0.0f, -l12.getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        m12.i();
    }

    public final void m(int i12) {
        boolean z12 = false;
        H h12 = this.f41916a;
        if (i12 >= 0 && i12 < h12.f41924a.f42127c.length()) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "offset(", ") is out of bounds [0, ");
        sbJ.append(h12.f41924a.f42127c.length());
        sbJ.append(')');
        C50028a.a(sbJ.toString());
    }

    public final void n(int i12) {
        boolean z12 = false;
        H h12 = this.f41916a;
        if (i12 >= 0 && i12 <= h12.f41924a.f42127c.length()) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "offset(", ") is out of bounds [0, ");
        sbJ.append(h12.f41924a.f42127c.length());
        sbJ.append(']');
        C50028a.a(sbJ.toString());
    }

    public final void o(int i12) {
        boolean z12 = false;
        int i13 = this.f41921f;
        if (i12 >= 0 && i12 < i13) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        C50028a.a("lineIndex(" + i12 + ") is out of bounds [0, " + i13 + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public G(H h12, long j12, int i12, int i13, int i14, C42822w c42822w) {
        int i15 = (i14 & 4) != 0 ? Integer.MAX_VALUE : i12;
        if ((i14 & 8) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i13 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, j12, i15, i13, (C42822w) null);
    }

    public G(C22602e c22602e, x0 x0Var, float f12, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i12, boolean z12, int i13, C42822w c42822w) {
        int i14;
        List list2 = (i13 & 32) != 0 ? C42784z0.f406748b : list;
        int i15 = (i13 & 64) != 0 ? Integer.MAX_VALUE : i12;
        boolean z13 = (i13 & 128) != 0 ? false : z12;
        H h12 = new H(c22602e, x0Var, list2, dVar, bVar);
        if (z13) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i14 = androidx.compose.ui.text.style.s.f42722d;
        } else {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i14 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, C22713c.b(Q.b(f12), 0, 13), i15, i14, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public G(C22602e c22602e, x0 x0Var, long j12, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i12, int i13, int i14, C42822w c42822w) {
        int i15;
        List list2 = (i14 & 32) != 0 ? C42784z0.f406748b : list;
        int i16 = (i14 & 64) != 0 ? Integer.MAX_VALUE : i12;
        if ((i14 & 128) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i15 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i15 = i13;
        }
        this(c22602e, x0Var, j12, dVar, bVar, list2, i16, i15, (C42822w) null);
    }

    public G(C22602e c22602e, x0 x0Var, long j12, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i12, boolean z12, int i13, C42822w c42822w) {
        this(c22602e, x0Var, j12, dVar, bVar, (i13 & 32) != 0 ? C42784z0.f406748b : list, (i13 & 64) != 0 ? Integer.MAX_VALUE : i12, (i13 & 128) != 0 ? false : z12, (C42822w) null);
    }

    public G(C22602e c22602e, x0 x0Var, List list, int i12, boolean z12, float f12, androidx.compose.ui.unit.d dVar, D.b bVar, int i13, C42822w c42822w) {
        int i14;
        List list2 = (i13 & 4) != 0 ? C42784z0.f406748b : list;
        int i15 = (i13 & 8) != 0 ? Integer.MAX_VALUE : i12;
        boolean z13 = (i13 & 16) != 0 ? false : z12;
        H h12 = new H(c22602e, x0Var, list2, dVar, new androidx.compose.ui.text.font.M(new C22629x(bVar), null, null, null, null, 30, null));
        androidx.compose.ui.text.style.s.f42720b.getClass();
        if (z13) {
            i14 = androidx.compose.ui.text.style.s.f42722d;
        } else {
            i14 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, C22713c.b(Q.b(f12), 0, 13), i15, i14, (C42822w) null);
    }

    public /* synthetic */ G(H h12, long j12, int i12, boolean z12, int i13, C42822w c42822w) {
        this(h12, j12, (i13 & 4) != 0 ? Integer.MAX_VALUE : i12, (i13 & 8) != 0 ? false : z12, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC42830m
    public G(H h12, long j12, int i12, boolean z12, C42822w c42822w) {
        int i13;
        if (z12) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i13 = androidx.compose.ui.text.style.s.f42722d;
        } else {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i13 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, j12, i12, i13, (C42822w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public G(H h12, int i12, boolean z12, float f12, int i13, C42822w c42822w) {
        int i14;
        int i15 = (i13 & 2) != 0 ? Integer.MAX_VALUE : i12;
        z12 = (i13 & 4) != 0 ? false : z12;
        long jB2 = C22713c.b(Q.b(f12), 0, 13);
        androidx.compose.ui.text.style.s.f42720b.getClass();
        if (z12) {
            i14 = androidx.compose.ui.text.style.s.f42722d;
        } else {
            i14 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, jB2, i15, i14, (C42822w) null);
    }

    @InterfaceC42830m
    public G(C22602e c22602e, x0 x0Var, long j12, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i12, boolean z12, C42822w c42822w) {
        int i13;
        H h12 = new H(c22602e, x0Var, list, dVar, bVar);
        androidx.compose.ui.text.style.s.f42720b.getClass();
        if (z12) {
            i13 = androidx.compose.ui.text.style.s.f42722d;
        } else {
            i13 = androidx.compose.ui.text.style.s.f42721c;
        }
        this(h12, j12, i12, i13, (C42822w) null);
    }

    public G(C22602e c22602e, x0 x0Var, long j12, androidx.compose.ui.unit.d dVar, E.b bVar, List list, int i12, int i13, C42822w c42822w) {
        this(new H(c22602e, x0Var, list, dVar, bVar), j12, i12, i13, (C42822w) null);
    }
}
