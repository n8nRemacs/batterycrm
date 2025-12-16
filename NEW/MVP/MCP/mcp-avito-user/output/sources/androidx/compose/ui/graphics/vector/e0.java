package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.vector.T;
import androidx.compose.ui.graphics.vector.g0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VectorPainter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k T t12, @Y61.l Map map, @Y61.l androidx.compose.runtime.A a12, int i12) {
        T.a aVar;
        androidx.compose.runtime.B bE2 = a12.E(-446179233);
        int i13 = (bE2.B(t12) ? 4 : 2) | i12 | (bE2.u(map) ? 32 : 16);
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            t12.getClass();
            T.a aVar2 = new T.a(t12);
            while (aVar2.f39810b.hasNext()) {
                V v12 = (V) aVar2.next();
                if (v12 instanceof f0) {
                    bE2.C(-23302778);
                    f0 f0Var = (f0) v12;
                    if (((S) map.get(f0Var.f39886b)) == null) {
                        new Z();
                    }
                    int i14 = g0.c.f39922a;
                    List<AbstractC22297h> list = f0Var.f39887c;
                    int i15 = g0.a.f39920a;
                    int i16 = g0.b.f39921a;
                    float fFloatValue = Float.valueOf(f0Var.f39890f).floatValue();
                    int i17 = g0.i.f39928a;
                    int i18 = g0.j.f39929a;
                    float fFloatValue2 = Float.valueOf(f0Var.f39892h).floatValue();
                    int i19 = g0.k.f39930a;
                    float fFloatValue3 = Float.valueOf(f0Var.f39893i).floatValue();
                    int i22 = g0.p.f39935a;
                    float fFloatValue4 = Float.valueOf(f0Var.f39897m).floatValue();
                    int i23 = g0.n.f39933a;
                    float fFloatValue5 = Float.valueOf(f0Var.f39898n).floatValue();
                    int i24 = g0.o.f39934a;
                    aVar = aVar2;
                    Q.b(list, f0Var.f39888d, f0Var.f39886b, f0Var.f39889e, fFloatValue, f0Var.f39891g, fFloatValue2, fFloatValue3, f0Var.f39894j, f0Var.f39895k, f0Var.f39896l, fFloatValue4, fFloatValue5, Float.valueOf(f0Var.f39899o).floatValue(), bE2, 0);
                    bE2.X(false);
                } else {
                    aVar = aVar2;
                    if (v12 instanceof T) {
                        bE2.C(-21889209);
                        T t13 = (T) v12;
                        if (((S) map.get(t13.f39800b)) == null) {
                            new a0();
                        }
                        int i25 = g0.f.f39925a;
                        float fFloatValue6 = Float.valueOf(t13.f39801c).floatValue();
                        int i26 = g0.g.f39926a;
                        float fFloatValue7 = Float.valueOf(t13.f39804f).floatValue();
                        int i27 = g0.h.f39927a;
                        float fFloatValue8 = Float.valueOf(t13.f39805g).floatValue();
                        int i28 = g0.l.f39931a;
                        float fFloatValue9 = Float.valueOf(t13.f39806h).floatValue();
                        int i29 = g0.m.f39932a;
                        float fFloatValue10 = Float.valueOf(t13.f39807i).floatValue();
                        int i32 = g0.d.f39923a;
                        float fFloatValue11 = Float.valueOf(t13.f39802d).floatValue();
                        int i33 = g0.e.f39924a;
                        float fFloatValue12 = Float.valueOf(t13.f39803e).floatValue();
                        int i34 = g0.c.f39922a;
                        Q.a(t13.f39800b, fFloatValue6, fFloatValue11, fFloatValue12, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, t13.f39808j, androidx.compose.runtime.internal.r.c(1450046638, new X((T) v12, map), bE2), bE2, 805306368);
                        bE2.X(false);
                    } else {
                        bE2.C(-20884003);
                        bE2.X(false);
                    }
                }
                aVar2 = aVar;
            }
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Y(t12, map, i12);
        }
    }

    @Y61.k
    public static final void b(@Y61.k C22292c c22292c, @Y61.k T t12) {
        int size = t12.f39809k.size();
        for (int i12 = 0; i12 < size; i12++) {
            V v12 = t12.f39809k.get(i12);
            if (v12 instanceof f0) {
                C22296g c22296g = new C22296g();
                f0 f0Var = (f0) v12;
                c22296g.f39902d = f0Var.f39887c;
                c22296g.f39912n = true;
                c22296g.c();
                c22296g.f39917s.l(f0Var.f39888d);
                c22296g.c();
                c22296g.c();
                c22296g.f39900b = f0Var.f39889e;
                c22296g.c();
                c22296g.f39901c = f0Var.f39890f;
                c22296g.c();
                c22296g.f39905g = f0Var.f39891g;
                c22296g.c();
                c22296g.f39903e = f0Var.f39892h;
                c22296g.c();
                c22296g.f39904f = f0Var.f39893i;
                c22296g.f39913o = true;
                c22296g.c();
                c22296g.f39906h = f0Var.f39894j;
                c22296g.f39913o = true;
                c22296g.c();
                c22296g.f39907i = f0Var.f39895k;
                c22296g.f39913o = true;
                c22296g.c();
                c22296g.f39908j = f0Var.f39896l;
                c22296g.f39913o = true;
                c22296g.c();
                c22296g.f39909k = f0Var.f39897m;
                c22296g.f39914p = true;
                c22296g.c();
                c22296g.f39910l = f0Var.f39898n;
                c22296g.f39914p = true;
                c22296g.c();
                c22296g.f39911m = f0Var.f39899o;
                c22296g.f39914p = true;
                c22296g.c();
                c22292c.e(i12, c22296g);
            } else if (v12 instanceof T) {
                C22292c c22292c2 = new C22292c();
                T t13 = (T) v12;
                c22292c2.f39841k = t13.f39800b;
                c22292c2.c();
                c22292c2.f39842l = t13.f39801c;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39845o = t13.f39804f;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39846p = t13.f39805g;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39847q = t13.f39806h;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39848r = t13.f39807i;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39843m = t13.f39802d;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39844n = t13.f39803e;
                c22292c2.f39849s = true;
                c22292c2.c();
                c22292c2.f39836f = t13.f39808j;
                c22292c2.f39837g = true;
                c22292c2.c();
                b(c22292c2, t13);
                c22292c.e(i12, c22292c2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.W c(@Y61.k androidx.compose.ui.graphics.vector.C22293d r12, @Y61.l androidx.compose.runtime.A r13) {
        /*
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.Q0.f41199h
            java.lang.Object r0 = r13.o(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.ui.unit.d) r0
            int r1 = r12.f39863j
            float r1 = (float) r1
            float r2 = r0.getF40389c()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            r5 = 32
            long r3 = r3 << r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r6
            long r1 = r1 | r3
            boolean r1 = r13.n(r1)
            java.lang.Object r2 = r13.t()
            if (r1 != 0) goto L36
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto Ld8
        L36:
            androidx.compose.ui.graphics.vector.c r1 = new androidx.compose.ui.graphics.vector.c
            r1.<init>()
            androidx.compose.ui.graphics.vector.T r2 = r12.f39859f
            b(r1, r2)
            kotlin.G0 r2 = kotlin.G0.f406611a
            float r2 = r12.f39855b
            float r2 = r0.M0(r2)
            float r3 = r12.f39856c
            float r0 = r0.M0(r3)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r0
            long r2 = r2 << r5
            long r8 = r8 & r6
            long r2 = r2 | r8
            l0.n$a r0 = l0.n.f413402b
            float r0 = r12.f39857d
            boolean r4 = java.lang.Float.isNaN(r0)
            if (r4 == 0) goto L6c
            long r8 = r2 >> r5
            int r0 = (int) r8
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L6c:
            float r4 = r12.f39858e
            boolean r8 = java.lang.Float.isNaN(r4)
            if (r8 == 0) goto L7b
            long r8 = r2 & r6
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
        L7b:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r0
            long r4 = r8 << r5
            long r6 = r6 & r10
            long r4 = r4 | r6
            androidx.compose.ui.graphics.vector.W r0 = new androidx.compose.ui.graphics.vector.W
            r0.<init>(r1)
            r6 = 16
            long r8 = r12.f39860g
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = 0
            if (r1 == 0) goto La4
            androidx.compose.ui.graphics.U$a r1 = androidx.compose.ui.graphics.U.f39332b
            r1.getClass()
            androidx.compose.ui.graphics.F r1 = new androidx.compose.ui.graphics.F
            int r7 = r12.f39861h
            r1.<init>(r8, r7, r6)
            r6 = r1
        La4:
            androidx.compose.runtime.y1 r1 = r0.f39812g
            l0.n r2 = l0.n.a(r2)
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            r1.setValue(r2)
            androidx.compose.runtime.y1 r1 = r0.f39813h
            boolean r2 = r12.f39862i
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            r1.setValue(r2)
            androidx.compose.ui.graphics.vector.n r1 = r0.f39814i
            androidx.compose.runtime.y1 r2 = r1.f40004g
            androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
            r2.setValue(r6)
            androidx.compose.runtime.y1 r2 = r1.f40006i
            l0.n r3 = l0.n.a(r4)
            androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
            r2.setValue(r3)
            java.lang.String r12 = r12.f39854a
            r1.f40000c = r12
            r13.H(r0)
            r2 = r0
        Ld8:
            androidx.compose.ui.graphics.vector.W r2 = (androidx.compose.ui.graphics.vector.W) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.e0.c(androidx.compose.ui.graphics.vector.d, androidx.compose.runtime.A):androidx.compose.ui.graphics.vector.W");
    }
}
