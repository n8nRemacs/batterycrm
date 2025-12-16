package androidx.compose.ui.text;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.style.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y0 {

    /* compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Y61.k
    public static final x0 a(@Y61.k x0 x0Var, @Y61.k x0 x0Var2, float f12) {
        float f13;
        W w12;
        e0 e0Var = x0Var.f42739a;
        e0 e0Var2 = x0Var2.f42739a;
        androidx.compose.ui.text.style.m mVar = g0.f42336d;
        androidx.compose.ui.text.style.m mVarA = androidx.compose.ui.text.style.l.a(e0Var.f42142a, e0Var2.f42142a, f12);
        androidx.compose.ui.text.font.E e12 = (androidx.compose.ui.text.font.E) g0.b(f12, e0Var.fontFamily, e0Var2.fontFamily);
        long jC2 = g0.c(e0Var.fontSize, e0Var2.fontSize, f12);
        androidx.compose.ui.text.font.e0 e0Var3 = e0Var.fontWeight;
        if (e0Var3 == null) {
            androidx.compose.ui.text.font.e0.f42240c.getClass();
            e0Var3 = androidx.compose.ui.text.font.e0.f42247j;
        }
        androidx.compose.ui.text.font.e0 e0Var4 = e0Var2.fontWeight;
        if (e0Var4 == null) {
            androidx.compose.ui.text.font.e0.f42240c.getClass();
            e0Var4 = androidx.compose.ui.text.font.e0.f42247j;
        }
        androidx.compose.ui.text.font.e0 e0Var5 = new androidx.compose.ui.text.font.e0(kotlin.ranges.s.g(E0.e.c(f12, e0Var3.f42253b, e0Var4.f42253b), 1, 1000));
        androidx.compose.ui.text.font.Z z12 = (androidx.compose.ui.text.font.Z) g0.b(f12, e0Var.fontStyle, e0Var2.fontStyle);
        C22605a0 c22605a0 = (C22605a0) g0.b(f12, e0Var.fontSynthesis, e0Var2.fontSynthesis);
        String str = (String) g0.b(f12, e0Var.fontFeatureSettings, e0Var2.fontFeatureSettings);
        long jC3 = g0.c(e0Var.letterSpacing, e0Var2.letterSpacing, f12);
        float f14 = 0.0f;
        androidx.compose.ui.text.style.a aVar = e0Var.baselineShift;
        if (aVar != null) {
            f13 = aVar.f42630a;
        } else {
            a.C1689a c1689a = androidx.compose.ui.text.style.a.f42629b;
            f13 = 0.0f;
        }
        androidx.compose.ui.text.style.a aVar2 = e0Var2.baselineShift;
        if (aVar2 != null) {
            f14 = aVar2.f42630a;
        } else {
            a.C1689a c1689a2 = androidx.compose.ui.text.style.a.f42629b;
        }
        float fB2 = E0.e.b(f13, f14, f12);
        a.C1689a c1689a3 = androidx.compose.ui.text.style.a.f42629b;
        androidx.compose.ui.text.style.n nVar = e0Var.textGeometricTransform;
        if (nVar == null) {
            androidx.compose.ui.text.style.n.f42702c.getClass();
            nVar = androidx.compose.ui.text.style.n.f42703d;
        }
        androidx.compose.ui.text.style.n nVar2 = e0Var2.textGeometricTransform;
        if (nVar2 == null) {
            androidx.compose.ui.text.style.n.f42702c.getClass();
            nVar2 = androidx.compose.ui.text.style.n.f42703d;
        }
        androidx.compose.ui.text.style.n nVar3 = new androidx.compose.ui.text.style.n(E0.e.b(nVar.f42704a, nVar2.f42704a, f12), E0.e.b(nVar.f42705b, nVar2.f42705b, f12));
        z0.f fVar = (z0.f) g0.b(f12, e0Var.localeList, e0Var2.localeList);
        long jH2 = androidx.compose.ui.graphics.V.h(e0Var.f42153l, e0Var2.f42153l, f12);
        androidx.compose.ui.text.style.j jVar = (androidx.compose.ui.text.style.j) g0.b(f12, e0Var.background, e0Var2.background);
        f1 f1Var = e0Var.shadow;
        if (f1Var == null) {
            f1Var = new f1(0L, 0L, 0.0f, 7, null);
        }
        f1 f1Var2 = e0Var2.shadow;
        if (f1Var2 == null) {
            f1Var2 = new f1(0L, 0L, 0.0f, 7, null);
        }
        f1 f1Var3 = new f1(androidx.compose.ui.graphics.V.h(f1Var.f39510a, f1Var2.f39510a, f12), l0.h.b(f1Var.f39511b, f1Var2.f39511b, f12), E0.e.b(f1Var.f39512c, f1Var2.f39512c, f12), null);
        X x12 = e0Var.platformStyle;
        X x13 = e0Var2.platformStyle;
        if (x12 == null && x13 == null) {
            x12 = null;
        } else {
            if (x12 == null) {
                X.f41969a.getClass();
                x12 = X.f41970b;
            }
            if (x13 == null) {
                X.f41969a.getClass();
            }
        }
        e0 e0Var6 = new e0(mVarA, jC2, e0Var5, z12, c22605a0, e12, str, jC3, androidx.compose.ui.text.style.a.a(fB2), nVar3, fVar, jH2, jVar, f1Var3, x12, (androidx.compose.ui.graphics.drawscope.j) g0.b(f12, e0Var.drawStyle, e0Var2.drawStyle), (C42822w) null);
        int i12 = T.f41952b;
        S s5 = x0Var.f42740b;
        androidx.compose.ui.text.style.i iVarA = androidx.compose.ui.text.style.i.a(s5.f41942a);
        S s12 = x0Var2.f42740b;
        int i13 = ((androidx.compose.ui.text.style.i) g0.b(f12, iVarA, androidx.compose.ui.text.style.i.a(s12.f41942a))).f42683a;
        int i14 = ((androidx.compose.ui.text.style.k) g0.b(f12, androidx.compose.ui.text.style.k.a(s5.f41943b), androidx.compose.ui.text.style.k.a(s12.f41943b))).f42696a;
        long jC4 = g0.c(s5.f41944c, s12.f41944c, f12);
        androidx.compose.ui.text.style.p pVar = s5.f41945d;
        if (pVar == null) {
            androidx.compose.ui.text.style.p.f42706c.getClass();
            pVar = androidx.compose.ui.text.style.p.f42707d;
        }
        androidx.compose.ui.text.style.p pVar2 = s12.f41945d;
        if (pVar2 == null) {
            androidx.compose.ui.text.style.p.f42706c.getClass();
            pVar2 = androidx.compose.ui.text.style.p.f42707d;
        }
        androidx.compose.ui.text.style.p pVar3 = new androidx.compose.ui.text.style.p(g0.c(pVar.f42708a, pVar2.f42708a, f12), g0.c(pVar.f42709b, pVar2.f42709b, f12), null);
        W w13 = s5.f41946e;
        W w14 = s12.f41946e;
        if (w13 == null && w14 == null) {
            w12 = null;
        } else {
            if (w13 == null) {
                W.f41965c.getClass();
                w13 = W.f41966d;
            }
            if (w14 == null) {
                W.f41965c.getClass();
                w14 = W.f41966d;
            }
            w12 = w13.f41967a == w14.f41967a ? w13 : new W(((C22674v) g0.b(f12, C22674v.a(w13.f41968b), C22674v.a(w14.f41968b))).f42733a, ((Boolean) g0.b(f12, Boolean.valueOf(w13.f41967a), Boolean.valueOf(w14.f41967a))).booleanValue(), (C42822w) null);
        }
        return new x0(e0Var6, new S(i13, i14, jC4, pVar3, w12, (androidx.compose.ui.text.style.h) g0.b(f12, s5.f41947f, s12.f41947f), ((androidx.compose.ui.text.style.f) g0.b(f12, androidx.compose.ui.text.style.f.a(s5.f41948g), androidx.compose.ui.text.style.f.a(s12.f41948g))).f42641a, ((androidx.compose.ui.text.style.e) g0.b(f12, androidx.compose.ui.text.style.e.a(s5.f41949h), androidx.compose.ui.text.style.e.a(s12.f41949h))).f42638a, (androidx.compose.ui.text.style.r) g0.b(f12, s5.f41950i, s12.f41950i), (C42822w) null));
    }

    @Y61.k
    public static final x0 b(@Y61.k x0 x0Var, @Y61.k LayoutDirection layoutDirection) {
        int i12;
        int i13;
        float f12;
        int i14;
        e0 e0Var = x0Var.f42739a;
        androidx.compose.ui.text.style.m mVar = g0.f42336d;
        androidx.compose.ui.text.style.m mVarD = e0Var.f42142a.d(f0.f42158l);
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        long j12 = e0Var.fontSize;
        if ((j12 & 1095216660480L) == 0) {
            j12 = g0.f42333a;
        }
        long j13 = j12;
        androidx.compose.ui.text.font.e0 e0Var2 = e0Var.fontWeight;
        if (e0Var2 == null) {
            androidx.compose.ui.text.font.e0.f42240c.getClass();
            e0Var2 = androidx.compose.ui.text.font.e0.f42247j;
        }
        androidx.compose.ui.text.font.e0 e0Var3 = e0Var2;
        androidx.compose.ui.text.font.Z z12 = e0Var.fontStyle;
        if (z12 != null) {
            i12 = z12.f42219a;
        } else {
            androidx.compose.ui.text.font.Z.f42217b.getClass();
            i12 = 0;
        }
        androidx.compose.ui.text.font.Z zA2 = androidx.compose.ui.text.font.Z.a(i12);
        C22605a0 c22605a0 = e0Var.fontSynthesis;
        if (c22605a0 != null) {
            i13 = c22605a0.f42227a;
        } else {
            C22605a0.f42223b.getClass();
            i13 = C22605a0.f42226e;
        }
        C22605a0 c22605a0A = C22605a0.a(i13);
        androidx.compose.ui.text.font.E e12 = e0Var.fontFamily;
        if (e12 == null) {
            androidx.compose.ui.text.font.E.f42170b.getClass();
            e12 = androidx.compose.ui.text.font.E.f42171c;
        }
        androidx.compose.ui.text.font.E e13 = e12;
        String str = e0Var.fontFeatureSettings;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j14 = e0Var.letterSpacing;
        if ((j14 & 1095216660480L) == 0) {
            j14 = g0.f42334b;
        }
        long j15 = j14;
        androidx.compose.ui.text.style.a aVar2 = e0Var.baselineShift;
        if (aVar2 != null) {
            f12 = aVar2.f42630a;
        } else {
            androidx.compose.ui.text.style.a.f42629b.getClass();
            f12 = 0.0f;
        }
        androidx.compose.ui.text.style.a aVarA = androidx.compose.ui.text.style.a.a(f12);
        androidx.compose.ui.text.style.n nVar = e0Var.textGeometricTransform;
        if (nVar == null) {
            androidx.compose.ui.text.style.n.f42702c.getClass();
            nVar = androidx.compose.ui.text.style.n.f42703d;
        }
        androidx.compose.ui.text.style.n nVar2 = nVar;
        z0.f fVarA = e0Var.localeList;
        if (fVarA == null) {
            z0.f.f443676d.getClass();
            fVarA = z0.h.f443680a.a();
        }
        z0.f fVar = fVarA;
        long j16 = e0Var.f42153l;
        if (j16 == 16) {
            j16 = g0.f42335c;
        }
        long j17 = j16;
        androidx.compose.ui.text.style.j jVar = e0Var.background;
        if (jVar == null) {
            androidx.compose.ui.text.style.j.f42684b.getClass();
            jVar = androidx.compose.ui.text.style.j.f42685c;
        }
        androidx.compose.ui.text.style.j jVar2 = jVar;
        f1 f1Var = e0Var.shadow;
        if (f1Var == null) {
            f1.f39508d.getClass();
            f1Var = f1.f39509e;
        }
        f1 f1Var2 = f1Var;
        androidx.compose.ui.graphics.drawscope.j jVar3 = e0Var.drawStyle;
        if (jVar3 == null) {
            jVar3 = androidx.compose.ui.graphics.drawscope.n.f39497a;
        }
        e0 e0Var4 = new e0(mVarD, j13, e0Var3, zA2, c22605a0A, e13, str2, j15, aVarA, nVar2, fVar, j17, jVar2, f1Var2, e0Var.platformStyle, jVar3, (C42822w) null);
        int i15 = T.f41952b;
        S s5 = x0Var.f42740b;
        int i16 = s5.f41942a;
        androidx.compose.ui.text.style.i.f42675b.getClass();
        int i17 = androidx.compose.ui.text.style.i.b(i16, androidx.compose.ui.text.style.i.f42682i) ? androidx.compose.ui.text.style.i.f42680g : s5.f41942a;
        androidx.compose.ui.text.style.k.f42689b.getClass();
        int i18 = androidx.compose.ui.text.style.k.f42692e;
        int i19 = s5.f41943b;
        if (androidx.compose.ui.text.style.k.b(i19, i18)) {
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                i14 = androidx.compose.ui.text.style.k.f42693f;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = androidx.compose.ui.text.style.k.f42694g;
            }
        } else if (androidx.compose.ui.text.style.k.b(i19, androidx.compose.ui.text.style.k.f42695h)) {
            int iOrdinal2 = layoutDirection.ordinal();
            if (iOrdinal2 == 0) {
                i14 = androidx.compose.ui.text.style.k.f42690c;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = androidx.compose.ui.text.style.k.f42691d;
            }
        } else {
            i14 = i19;
        }
        long j18 = s5.f41944c;
        if ((j18 & 1095216660480L) == 0) {
            j18 = T.f41951a;
        }
        androidx.compose.ui.text.style.p pVar = s5.f41945d;
        if (pVar == null) {
            androidx.compose.ui.text.style.p.f42706c.getClass();
            pVar = androidx.compose.ui.text.style.p.f42707d;
        }
        androidx.compose.ui.text.style.f.f42639b.getClass();
        int i22 = s5.f41948g;
        if (i22 == 0) {
            i22 = androidx.compose.ui.text.style.f.f42640c;
        }
        int i23 = i22;
        androidx.compose.ui.text.style.e.f42634b.getClass();
        int i24 = androidx.compose.ui.text.style.e.f42637e;
        int i25 = s5.f41949h;
        int i26 = androidx.compose.ui.text.style.e.b(i25, i24) ? androidx.compose.ui.text.style.e.f42635c : i25;
        androidx.compose.ui.text.style.r rVar = s5.f41950i;
        if (rVar == null) {
            androidx.compose.ui.text.style.r.f42710c.getClass();
            rVar = androidx.compose.ui.text.style.r.f42711d;
        }
        return new x0(e0Var4, new S(i17, i14, j18, pVar, s5.f41946e, s5.f41947f, i23, i26, rVar, (C42822w) null), x0Var.platformStyle);
    }
}
