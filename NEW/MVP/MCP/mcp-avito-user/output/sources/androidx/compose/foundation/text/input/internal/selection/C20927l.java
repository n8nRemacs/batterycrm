package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.N1;
import androidx.compose.foundation.text.O1;
import androidx.compose.foundation.text.input.internal.F0;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.t1;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: TextPreparedSelection.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/l;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.selection.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20927l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t1 f31393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final o0 f31394b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31395c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31396d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C20928m f31397e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.text.input.l f31398f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final F0 f31399g;

    /* renamed from: h, reason: collision with root package name */
    public long f31400h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public WedgeAffinity f31401i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f31402j;

    /* compiled from: TextPreparedSelection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/l$a;", "", "<init>", "()V", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.l$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C20927l(@Y61.k t1 t1Var, @Y61.l o0 o0Var, boolean z12, float f12, @Y61.k C20928m c20928m) {
        this.f31393a = t1Var;
        this.f31394b = o0Var;
        this.f31395c = z12;
        this.f31396d = f12;
        this.f31397e = c20928m;
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, G0> lVarE = abstractC22167lA != null ? abstractC22167lA.e() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            androidx.compose.foundation.text.input.l lVarD = t1Var.d();
            this.f31398f = lVarD;
            this.f31399g = t1Var.c();
            G0 g02 = G0.f406611a;
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
            this.f31400h = lVarD.f31512d;
            this.f31402j = lVarD.f31511c.toString();
        } catch (Throwable th2) {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
            throw th2;
        }
    }

    @Y61.k
    public final void a() {
        if (this.f31402j.length() > 0) {
            androidx.compose.foundation.text.input.l lVar = this.f31398f;
            boolean zD2 = v0.d(lVar.f31512d);
            t1 t1Var = this.f31393a;
            if (zD2) {
                t1.j(this.f31393a, "", w0.a((int) (lVar.f31512d >> 32), (int) (this.f31400h & 4294967295L)), !this.f31395c, 4);
            } else {
                androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31478c;
                androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
                pVar.f31519b.a().b();
                androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
                iVar.d(v0.g(iVar.f30759f), v0.f(iVar.f30759f), "", 0, 0);
                int iG2 = v0.g(iVar.f30759f);
                androidx.compose.foundation.text.input.k.b(iVar, iG2, iG2);
                t1Var.m(iVar);
                androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
            }
            this.f31400h = t1Var.d().f31512d;
            this.f31401i = WedgeAffinity.f31012b;
        }
    }

    public final boolean b() {
        o0 o0Var = this.f31394b;
        if (o0Var == null) {
            return true;
        }
        long j12 = this.f31400h;
        v0.a aVar = v0.f42734b;
        return o0Var.j((int) (j12 & 4294967295L)) == ResolvedTextDirection.f42625b;
    }

    public final int c(o0 o0Var, int i12) {
        long j12 = this.f31400h;
        v0.a aVar = v0.f42734b;
        int i13 = (int) (j12 & 4294967295L);
        C20928m c20928m = this.f31397e;
        if (Float.isNaN(c20928m.f31403a)) {
            c20928m.f31403a = o0Var.c(i13).f413390a;
        }
        int iD2 = o0Var.f42527b.d(i13) + i12;
        if (iD2 < 0) {
            return 0;
        }
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        if (iD2 >= g12.f41921f) {
            return this.f31402j.length();
        }
        float fB2 = g12.b(iD2) - 1;
        float f12 = c20928m.f31403a;
        if ((b() && f12 >= o0Var.h(iD2)) || (!b() && f12 <= o0Var.g(iD2))) {
            return g12.c(iD2, true);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (4294967295L & Float.floatToRawIntBits(fB2));
        g.a aVar2 = l0.g.f413384b;
        return g12.g(jFloatToRawIntBits);
    }

    public final int d(int i12) {
        long j12 = this.f31398f.f31512d;
        v0.a aVar = v0.f42734b;
        int i13 = (int) (j12 & 4294967295L);
        o0 o0Var = this.f31394b;
        if (o0Var != null) {
            float f12 = this.f31396d;
            if (!Float.isNaN(f12)) {
                l0.j jVarM = o0Var.c(i13).m(0.0f, f12 * i12);
                androidx.compose.ui.text.G g12 = o0Var.f42527b;
                float f13 = jVarM.f413391b;
                float fB2 = g12.b(g12.e(f13));
                return Math.abs(f13 - fB2) > Math.abs(jVarM.f413393d - fB2) ? g12.g(jVarM.i()) : g12.g(jVarM.d());
            }
        }
        return i13;
    }

    @Y61.k
    public final void e() {
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            o0 o0Var = this.f31394b;
            long jA2 = Y.a(o0Var != null ? c(o0Var, 1) : str.length(), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void f() {
        if (this.f31402j.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(d(1), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void g() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(O1.a(i12, str), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void h() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            int i12 = (int) (4294967295L & j12);
            int iA2 = N1.a(v0.f(j12), str);
            if (iA2 == v0.f(this.f31400h) && iA2 != str.length()) {
                iA2 = N1.a(iA2 + 1, str);
            }
            long jA2 = Y.a(iA2, i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void i() {
        int length;
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            o0 o0Var = this.f31394b;
            if (o0Var != null) {
                int i13 = i12;
                while (true) {
                    androidx.compose.foundation.text.input.l lVar = this.f31398f;
                    if (i13 < lVar.f31511c.length()) {
                        int length2 = str.length() - 1;
                        if (i13 <= length2) {
                            length2 = i13;
                        }
                        long jL2 = o0Var.l(length2);
                        v0.a aVar2 = v0.f42734b;
                        int i14 = (int) (jL2 & 4294967295L);
                        if (i14 > i13) {
                            length = i14;
                            break;
                        }
                        i13++;
                    } else {
                        length = lVar.f31511c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jA2 = Y.a(length, i12, this.f31393a);
            int i15 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i15 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i15, i15);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void j() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(O1.b(i12, str), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void k() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            int i12 = (int) (4294967295L & j12);
            int iB2 = N1.b(v0.g(j12), str);
            if (iB2 == v0.g(this.f31400h) && iB2 != 0) {
                iB2 = N1.b(iB2 - 1, str);
            }
            long jA2 = Y.a(iB2, i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void l() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            int i13 = 0;
            o0 o0Var = this.f31394b;
            if (o0Var != null) {
                int i14 = i12;
                while (true) {
                    if (i14 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i14 <= length) {
                        length = i14;
                    }
                    long jL2 = o0Var.l(length);
                    v0.a aVar2 = v0.f42734b;
                    int i15 = (int) (jL2 >> 32);
                    if (i15 < i14) {
                        i13 = i15;
                        break;
                    }
                    i14--;
                }
            }
            long jA2 = Y.a(i13, i12, this.f31393a);
            int i16 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i16 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i16, i16);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void m() {
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(str.length(), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void n() {
        this.f31397e.f31403a = Float.NaN;
        if (this.f31402j.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(0, i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void o() {
        int length;
        this.f31397e.f31403a = Float.NaN;
        String str = this.f31402j;
        if (str.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (4294967295L & j12);
            o0 o0Var = this.f31394b;
            if (o0Var != null) {
                int iF2 = v0.f(j12);
                androidx.compose.ui.text.G g12 = o0Var.f42527b;
                length = g12.c(g12.d(iF2), true);
            } else {
                length = str.length();
            }
            long jA2 = Y.a(length, i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void p() {
        int i12;
        this.f31397e.f31403a = Float.NaN;
        if (this.f31402j.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i13 = (int) (4294967295L & j12);
            o0 o0Var = this.f31394b;
            if (o0Var != null) {
                i12 = o0Var.i(o0Var.f42527b.d(v0.g(j12)));
            } else {
                i12 = 0;
            }
            long jA2 = Y.a(i12, i13, this.f31393a);
            int i14 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i14 != i13 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i14, i14);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void q() {
        if (this.f31402j.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            o0 o0Var = this.f31394b;
            long jA2 = Y.a(o0Var != null ? c(o0Var, -1) : 0, i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void r() {
        if (this.f31402j.length() > 0) {
            long j12 = this.f31400h;
            v0.a aVar = v0.f42734b;
            int i12 = (int) (j12 & 4294967295L);
            long jA2 = Y.a(d(-1), i12, this.f31393a);
            int i13 = (int) (jA2 >> 32);
            WedgeAffinity wedgeAffinityA = C20918c.a(jA2);
            if (i13 != i12 || !v0.d(this.f31400h)) {
                this.f31400h = w0.a(i13, i13);
            }
            if (wedgeAffinityA != null) {
                this.f31401i = wedgeAffinityA;
            }
        }
    }

    @Y61.k
    public final void s() {
        if (this.f31402j.length() > 0) {
            long j12 = this.f31398f.f31512d;
            v0.a aVar = v0.f42734b;
            this.f31400h = w0.a((int) (j12 >> 32), (int) (this.f31400h & 4294967295L));
        }
    }
}
