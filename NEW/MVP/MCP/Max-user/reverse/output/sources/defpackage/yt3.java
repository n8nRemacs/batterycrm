package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class yt3 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final ft3 I;
    public final ft3 J;
    public final ft3 K;
    public final ft3 L;
    public final ft3 M;
    public final ft3 N;
    public final ft3 O;
    public final ft3 P;
    public final ft3[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public yt3 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public l72 b;
    public int b0;
    public l72 c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final yt3[] l0;
    public boolean m;
    public final yt3[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public u67 d = null;
    public i0h e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public yt3() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        ft3 ft3Var = new ft3(this, 2);
        this.I = ft3Var;
        ft3 ft3Var2 = new ft3(this, 3);
        this.J = ft3Var2;
        ft3 ft3Var3 = new ft3(this, 4);
        this.K = ft3Var3;
        ft3 ft3Var4 = new ft3(this, 5);
        this.L = ft3Var4;
        ft3 ft3Var5 = new ft3(this, 6);
        this.M = ft3Var5;
        ft3 ft3Var6 = new ft3(this, 8);
        this.N = ft3Var6;
        ft3 ft3Var7 = new ft3(this, 9);
        this.O = ft3Var7;
        ft3 ft3Var8 = new ft3(this, 7);
        this.P = ft3Var8;
        this.Q = new ft3[]{ft3Var, ft3Var3, ft3Var2, ft3Var4, ft3Var5, ft3Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new yt3[]{null, null};
        this.m0 = new yt3[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(ft3Var);
        arrayList.add(ft3Var2);
        arrayList.add(ft3Var3);
        arrayList.add(ft3Var4);
        arrayList.add(ft3Var6);
        arrayList.add(ft3Var7);
        arrayList.add(ft3Var8);
        arrayList.add(ft3Var5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, ft3 ft3Var) {
        if (ft3Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(ft3Var.f);
        sb.append("'");
        if (ft3Var.h != Integer.MIN_VALUE || ft3Var.g != 0) {
            sb.append(",");
            sb.append(ft3Var.g);
            if (ft3Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ft3Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        yt3 yt3Var = this.T;
        if (yt3Var != null && (yt3Var instanceof zt3)) {
            ((zt3) yt3Var).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ft3) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ft3 ft3Var = (ft3) arrayList.get(i);
            ft3Var.c = false;
            ft3Var.b = 0;
        }
    }

    public void F(te8 te8Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        u67 u67Var = this.d;
        boolean z3 = z & u67Var.g;
        i0h i0hVar = this.e;
        boolean z4 = z2 & i0hVar.g;
        int i3 = u67Var.h.g;
        int i4 = i0hVar.h.g;
        int i5 = u67Var.i.g;
        int i6 = i0hVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(d58 d58Var, boolean z) {
        int i;
        int i2;
        i0h i0hVar;
        u67 u67Var;
        d58Var.getClass();
        int iN = d58.n(this.I);
        int iN2 = d58.n(this.J);
        int iN3 = d58.n(this.K);
        int iN4 = d58.n(this.L);
        if (z && (u67Var = this.d) != null) {
            zt4 zt4Var = u67Var.h;
            if (zt4Var.j) {
                zt4 zt4Var2 = u67Var.i;
                if (zt4Var2.j) {
                    iN = zt4Var.g;
                    iN3 = zt4Var2.g;
                }
            }
        }
        if (z && (i0hVar = this.e) != null) {
            zt4 zt4Var3 = i0hVar.h;
            if (zt4Var3.j) {
                zt4 zt4Var4 = i0hVar.i;
                if (zt4Var4.j) {
                    iN2 = zt4Var3.g;
                    iN4 = zt4Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(zt3 zt3Var, d58 d58Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            kfi.b(zt3Var, d58Var, this);
            hashSet.remove(this);
            b(d58Var, zt3Var.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ft3) it.next()).d.a(zt3Var, d58Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ft3) it2.next()).d.a(zt3Var, d58Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ft3) it3.next()).d.a(zt3Var, d58Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ft3) it4.next()).d.a(zt3Var, d58Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ft3) it5.next()).d.a(zt3Var, d58Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [yt3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.d58 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt3.b(d58, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0493 A[PHI: r3
  0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.d58 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.m6f r35, defpackage.m6f r36, int r37, boolean r38, defpackage.ft3 r39, defpackage.ft3 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt3.d(d58, boolean, boolean, boolean, boolean, m6f, m6f, int, boolean, ft3, ft3, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, yt3 yt3Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, yt3Var, i2, 0);
                    e(4, yt3Var, i2, 0);
                    i(7).a(yt3Var.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, yt3Var, i2, 0);
                        e(5, yt3Var, i2, 0);
                        i(7).a(yt3Var.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            ft3 ft3VarI = i(2);
            ft3 ft3VarI2 = i(4);
            ft3 ft3VarI3 = i(3);
            ft3 ft3VarI4 = i(5);
            boolean z2 = true;
            if ((ft3VarI == null || !ft3VarI.h()) && (ft3VarI2 == null || !ft3VarI2.h())) {
                e(2, yt3Var, 2, 0);
                e(4, yt3Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((ft3VarI3 == null || !ft3VarI3.h()) && (ft3VarI4 == null || !ft3VarI4.h())) {
                e(3, yt3Var, 3, 0);
                e(5, yt3Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(yt3Var.i(7), 0);
                return;
            } else if (z) {
                i(8).a(yt3Var.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(yt3Var.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            ft3 ft3VarI5 = i(2);
            ft3 ft3VarI6 = yt3Var.i(i2);
            ft3 ft3VarI7 = i(4);
            ft3VarI5.a(ft3VarI6, 0);
            ft3VarI7.a(ft3VarI6, 0);
            i(8).a(ft3VarI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            ft3 ft3VarI8 = yt3Var.i(i2);
            i(3).a(ft3VarI8, 0);
            i(5).a(ft3VarI8, 0);
            i(9).a(ft3VarI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(yt3Var.i(2), 0);
            i(4).a(yt3Var.i(4), 0);
            i(8).a(yt3Var.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(yt3Var.i(3), 0);
            i(5).a(yt3Var.i(5), 0);
            i(9).a(yt3Var.i(i2), 0);
            return;
        }
        ft3 ft3VarI9 = i(i);
        ft3 ft3VarI10 = yt3Var.i(i2);
        if (ft3VarI9.i(ft3VarI10)) {
            if (i == 6) {
                ft3 ft3VarI11 = i(3);
                ft3 ft3VarI12 = i(5);
                if (ft3VarI11 != null) {
                    ft3VarI11.j();
                }
                if (ft3VarI12 != null) {
                    ft3VarI12.j();
                }
            } else if (i == 3 || i == 5) {
                ft3 ft3VarI13 = i(6);
                if (ft3VarI13 != null) {
                    ft3VarI13.j();
                }
                ft3 ft3VarI14 = i(7);
                if (ft3VarI14.f != ft3VarI10) {
                    ft3VarI14.j();
                }
                ft3 ft3VarF = i(i).f();
                ft3 ft3VarI15 = i(9);
                if (ft3VarI15.h()) {
                    ft3VarF.j();
                    ft3VarI15.j();
                }
            } else if (i == 2 || i == 4) {
                ft3 ft3VarI16 = i(7);
                if (ft3VarI16.f != ft3VarI10) {
                    ft3VarI16.j();
                }
                ft3 ft3VarF2 = i(i).f();
                ft3 ft3VarI17 = i(8);
                if (ft3VarI17.h()) {
                    ft3VarF2.j();
                    ft3VarI17.j();
                }
            }
            ft3VarI9.a(ft3VarI10, i3);
        }
    }

    public final void f(ft3 ft3Var, ft3 ft3Var2, int i) {
        if (ft3Var.d == this) {
            e(ft3Var.e, ft3Var2.d, ft3Var2.e, i);
        }
    }

    public final void g(d58 d58Var) {
        d58Var.k(this.I);
        d58Var.k(this.J);
        d58Var.k(this.K);
        d58Var.k(this.L);
        if (this.a0 > 0) {
            d58Var.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            u67 u67Var = new u67(this);
            u67Var.h.e = 4;
            u67Var.i.e = 5;
            u67Var.f = 0;
            this.d = u67Var;
        }
        if (this.e == null) {
            i0h i0hVar = new i0h(this);
            zt4 zt4Var = new zt4(i0hVar);
            i0hVar.k = zt4Var;
            i0hVar.l = null;
            i0hVar.h.e = 6;
            i0hVar.i.e = 7;
            zt4Var.e = 8;
            i0hVar.f = 1;
            this.e = i0hVar;
        }
    }

    public ft3 i(int i) {
        switch (az1.v(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(hf3.i(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final yt3 l(int i) {
        ft3 ft3Var;
        ft3 ft3Var2;
        if (i != 0) {
            if (i == 1 && (ft3Var2 = (ft3Var = this.L).f) != null && ft3Var2.f == ft3Var) {
                return ft3Var2.d;
            }
            return null;
        }
        ft3 ft3Var3 = this.K;
        ft3 ft3Var4 = ft3Var3.f;
        if (ft3Var4 == null || ft3Var4.f != ft3Var3) {
            return null;
        }
        return ft3Var4.d;
    }

    public final yt3 m(int i) {
        ft3 ft3Var;
        ft3 ft3Var2;
        if (i != 0) {
            if (i == 1 && (ft3Var2 = (ft3Var = this.J).f) != null && ft3Var2.f == ft3Var) {
                return ft3Var2.d;
            }
            return null;
        }
        ft3 ft3Var3 = this.I;
        ft3 ft3Var4 = ft3Var3.f;
        if (ft3Var4 == null || ft3Var4.f != ft3Var3) {
            return null;
        }
        return ft3Var4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.V;
        int i7 = this.c0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.W;
        int i11 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        yt3 yt3Var = this.T;
        return (yt3Var == null || !(yt3Var instanceof zt3)) ? this.Y : ((zt3) yt3Var).x0 + this.Y;
    }

    public final int s() {
        yt3 yt3Var = this.T;
        return (yt3Var == null || !(yt3Var instanceof zt3)) ? this.Z : ((zt3) yt3Var).y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            ft3 r5 = r4.I
            ft3 r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            ft3 r3 = r4.K
            ft3 r3 = r3.f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            ft3 r5 = r4.J
            ft3 r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            ft3 r3 = r4.L
            ft3 r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            ft3 r3 = r4.M
            ft3 r3 = r3.f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt3.t(int):boolean");
    }

    public String toString() {
        StringBuilder sbM = az1.m("");
        sbM.append(this.h0 != null ? ho7.l(new StringBuilder("id: "), this.h0, " ") : "");
        sbM.append("(");
        sbM.append(this.Y);
        sbM.append(", ");
        sbM.append(this.Z);
        sbM.append(") - (");
        sbM.append(this.U);
        sbM.append(" x ");
        return ho7.j(sbM, this.V, ")");
    }

    public final boolean u(int i, int i2) {
        ft3 ft3Var;
        ft3 ft3Var2;
        ft3 ft3Var3;
        ft3 ft3Var4;
        if (i == 0) {
            ft3 ft3Var5 = this.I;
            ft3 ft3Var6 = ft3Var5.f;
            if (ft3Var6 == null || !ft3Var6.c || (ft3Var4 = (ft3Var3 = this.K).f) == null || !ft3Var4.c) {
                return false;
            }
            return (ft3Var4.d() - ft3Var3.e()) - (ft3Var5.e() + ft3Var5.f.d()) >= i2;
        }
        ft3 ft3Var7 = this.J;
        ft3 ft3Var8 = ft3Var7.f;
        if (ft3Var8 == null || !ft3Var8.c || (ft3Var2 = (ft3Var = this.L).f) == null || !ft3Var2.c) {
            return false;
        }
        return (ft3Var2.d() - ft3Var.e()) - (ft3Var7.e() + ft3Var7.f.d()) >= i2;
    }

    public final void v(int i, int i2, int i3, int i4, yt3 yt3Var) {
        i(i).b(yt3Var.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        ft3 ft3Var;
        ft3 ft3Var2;
        int i2 = i * 2;
        ft3[] ft3VarArr = this.Q;
        ft3 ft3Var3 = ft3VarArr[i2];
        ft3 ft3Var4 = ft3Var3.f;
        return (ft3Var4 == null || ft3Var4.f == ft3Var3 || (ft3Var2 = (ft3Var = ft3VarArr[i2 + 1]).f) == null || ft3Var2.f != ft3Var) ? false : true;
    }

    public final boolean x() {
        ft3 ft3Var = this.I;
        ft3 ft3Var2 = ft3Var.f;
        if (ft3Var2 != null && ft3Var2.f == ft3Var) {
            return true;
        }
        ft3 ft3Var3 = this.K;
        ft3 ft3Var4 = ft3Var3.f;
        return ft3Var4 != null && ft3Var4.f == ft3Var3;
    }

    public final boolean y() {
        ft3 ft3Var = this.J;
        ft3 ft3Var2 = ft3Var.f;
        if (ft3Var2 != null && ft3Var2.f == ft3Var) {
            return true;
        }
        ft3 ft3Var3 = this.L;
        ft3 ft3Var4 = ft3Var3.f;
        return ft3Var4 != null && ft3Var4.f == ft3Var3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
