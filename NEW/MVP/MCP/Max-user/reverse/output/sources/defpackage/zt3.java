package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zt3 extends yt3 {
    public int A0;
    public k72[] B0;
    public k72[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final zl0 L0;
    public ArrayList q0 = new ArrayList();
    public final sa9 r0;
    public final yt4 s0;
    public int t0;
    public poc u0;
    public boolean v0;
    public final d58 w0;
    public int x0;
    public int y0;
    public int z0;

    public zt3() {
        sa9 sa9Var = new sa9();
        sa9Var.a = new ArrayList();
        sa9Var.b = new zl0();
        sa9Var.c = this;
        this.r0 = sa9Var;
        yt4 yt4Var = new yt4();
        yt4Var.b = true;
        yt4Var.c = true;
        yt4Var.e = new ArrayList();
        new ArrayList();
        yt4Var.f = null;
        yt4Var.g = new zl0();
        yt4Var.h = new ArrayList();
        yt4Var.a = this;
        yt4Var.d = this;
        this.s0 = yt4Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new d58();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new k72[4];
        this.C0 = new k72[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new zl0();
    }

    public static void V(yt3 yt3Var, poc pocVar, zl0 zl0Var) {
        int i;
        int i2;
        if (pocVar == null) {
            return;
        }
        int i3 = yt3Var.g0;
        int[] iArr = yt3Var.t;
        if (i3 == 8 || (yt3Var instanceof hz6) || (yt3Var instanceof qi0)) {
            zl0Var.e = 0;
            zl0Var.f = 0;
            return;
        }
        int[] iArr2 = yt3Var.p0;
        zl0Var.a = iArr2[0];
        zl0Var.b = iArr2[1];
        zl0Var.c = yt3Var.q();
        zl0Var.d = yt3Var.k();
        zl0Var.i = false;
        zl0Var.j = 0;
        boolean z = zl0Var.a == 3;
        boolean z2 = zl0Var.b == 3;
        boolean z3 = z && yt3Var.W > 0.0f;
        boolean z4 = z2 && yt3Var.W > 0.0f;
        if (z && yt3Var.t(0) && yt3Var.r == 0 && !z3) {
            zl0Var.a = 2;
            if (z2 && yt3Var.s == 0) {
                zl0Var.a = 1;
            }
            z = false;
        }
        if (z2 && yt3Var.t(1) && yt3Var.s == 0 && !z4) {
            zl0Var.b = 2;
            if (z && yt3Var.r == 0) {
                zl0Var.b = 1;
            }
            z2 = false;
        }
        if (yt3Var.A()) {
            zl0Var.a = 1;
            z = false;
        }
        if (yt3Var.B()) {
            zl0Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                zl0Var.a = 1;
            } else if (!z2) {
                if (zl0Var.b == 1) {
                    i2 = zl0Var.d;
                } else {
                    zl0Var.a = 2;
                    pocVar.c(yt3Var, zl0Var);
                    i2 = zl0Var.f;
                }
                zl0Var.a = 1;
                zl0Var.c = (int) (yt3Var.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                zl0Var.b = 1;
            } else if (!z) {
                if (zl0Var.a == 1) {
                    i = zl0Var.c;
                } else {
                    zl0Var.b = 2;
                    pocVar.c(yt3Var, zl0Var);
                    i = zl0Var.e;
                }
                zl0Var.b = 1;
                if (yt3Var.X == -1) {
                    zl0Var.d = (int) (i / yt3Var.W);
                } else {
                    zl0Var.d = (int) (yt3Var.W * i);
                }
            }
        }
        pocVar.c(yt3Var, zl0Var);
        yt3Var.O(zl0Var.e);
        yt3Var.L(zl0Var.f);
        yt3Var.E = zl0Var.h;
        yt3Var.I(zl0Var.g);
        zl0Var.j = 0;
    }

    @Override // defpackage.yt3
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.yt3
    public final void F(te8 te8Var) {
        super.F(te8Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((yt3) this.q0.get(i)).F(te8Var);
        }
    }

    @Override // defpackage.yt3
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((yt3) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(yt3 yt3Var, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            k72[] k72VarArr = this.C0;
            if (i2 >= k72VarArr.length) {
                this.C0 = (k72[]) Arrays.copyOf(k72VarArr, k72VarArr.length * 2);
            }
            k72[] k72VarArr2 = this.C0;
            int i3 = this.z0;
            k72VarArr2[i3] = new k72(yt3Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            k72[] k72VarArr3 = this.B0;
            if (i4 >= k72VarArr3.length) {
                this.B0 = (k72[]) Arrays.copyOf(k72VarArr3, k72VarArr3.length * 2);
            }
            k72[] k72VarArr4 = this.B0;
            int i5 = this.A0;
            k72VarArr4[i5] = new k72(yt3Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(d58 d58Var) {
        zt3 zt3Var;
        d58 d58Var2;
        boolean zW = W(64);
        b(d58Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            yt3 yt3Var = (yt3) this.q0.get(i);
            boolean[] zArr = yt3Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (yt3Var instanceof qi0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                yt3 yt3Var2 = (yt3) this.q0.get(i2);
                if (yt3Var2 instanceof qi0) {
                    qi0 qi0Var = (qi0) yt3Var2;
                    for (int i3 = 0; i3 < qi0Var.r0; i3++) {
                        yt3 yt3Var3 = qi0Var.q0[i3];
                        if (qi0Var.t0 || yt3Var3.c()) {
                            int i4 = qi0Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                yt3Var3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                yt3Var3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            yt3 yt3Var4 = (yt3) this.q0.get(i5);
            yt3Var4.getClass();
            boolean z2 = yt3Var4 instanceof y26;
            if (z2 || (yt3Var4 instanceof hz6)) {
                if (z2) {
                    hashSet.add(yt3Var4);
                } else {
                    yt3Var4.b(d58Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                y26 y26Var = (y26) ((yt3) it.next());
                for (int i6 = 0; i6 < y26Var.r0; i6++) {
                    if (hashSet.contains(y26Var.q0[i6])) {
                        y26Var.b(d58Var, zW);
                        hashSet.remove(y26Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((yt3) it2.next()).b(d58Var, zW);
                }
                hashSet.clear();
            }
        }
        if (d58.p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                yt3 yt3Var5 = (yt3) this.q0.get(i7);
                yt3Var5.getClass();
                if (!(yt3Var5 instanceof y26) && !(yt3Var5 instanceof hz6)) {
                    hashSet2.add(yt3Var5);
                }
            }
            zt3Var = this;
            d58Var2 = d58Var;
            zt3Var.a(this, d58Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                yt3 yt3Var6 = (yt3) it3.next();
                kfi.b(this, d58Var2, yt3Var6);
                yt3Var6.b(d58Var2, zW);
            }
        } else {
            zt3Var = this;
            d58Var2 = d58Var;
            for (int i8 = 0; i8 < size; i8++) {
                yt3 yt3Var7 = (yt3) zt3Var.q0.get(i8);
                if (yt3Var7 instanceof zt3) {
                    int[] iArr = yt3Var7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        yt3Var7.M(1);
                    }
                    if (i10 == 2) {
                        yt3Var7.N(1);
                    }
                    yt3Var7.b(d58Var2, zW);
                    if (i9 == 2) {
                        yt3Var7.M(i9);
                    }
                    if (i10 == 2) {
                        yt3Var7.N(i10);
                    }
                } else {
                    kfi.b(this, d58Var2, yt3Var7);
                    if (!(yt3Var7 instanceof y26) && !(yt3Var7 instanceof hz6)) {
                        yt3Var7.b(d58Var2, zW);
                    }
                }
            }
        }
        if (zt3Var.z0 > 0) {
            yyi.a(this, d58Var2, null, 0);
        }
        if (zt3Var.A0 > 0) {
            yyi.a(this, d58Var2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        boolean z3;
        yt4 yt4Var = this.s0;
        ArrayList arrayList = yt4Var.e;
        zt3 zt3Var = yt4Var.a;
        boolean z4 = false;
        int iJ = zt3Var.j(0);
        int[] iArr = zt3Var.p0;
        int iJ2 = zt3Var.j(1);
        int iR = zt3Var.r();
        int iS = zt3Var.s();
        if (z && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                z2i z2iVar = (z2i) it.next();
                if (z2iVar.f == i && !z2iVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iJ == 2) {
                    zt3Var.M(1);
                    zt3Var.O(yt4Var.d(zt3Var, 0));
                    zt3Var.d.e.d(zt3Var.q());
                }
            } else if (z3 && iJ2 == 2) {
                zt3Var.N(1);
                zt3Var.L(yt4Var.d(zt3Var, 1));
                zt3Var.e.e.d(zt3Var.k());
            }
        }
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iQ = zt3Var.q() + iR;
                zt3Var.d.i.d(iQ);
                zt3Var.d.e.d(iQ - iR);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = zt3Var.k() + iS;
                zt3Var.e.i.d(iK);
                zt3Var.e.e.d(iK - iS);
                z2 = true;
            }
            z2 = false;
        }
        yt4Var.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            z2i z2iVar2 = (z2i) it2.next();
            if (z2iVar2.f == i && (z2iVar2.b != zt3Var || z2iVar2.g)) {
                z2iVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            z2i z2iVar3 = (z2i) it3.next();
            if (z2iVar3.f == i && (z2 || z2iVar3.b != zt3Var)) {
                if (!z2iVar3.h.j || !z2iVar3.i.j || (!(z2iVar3 instanceof l72) && !z2iVar3.e.j)) {
                    break;
                }
            }
        }
        zt3Var.M(iJ);
        zt3Var.N(iJ2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x083e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x084b A[LOOP:14: B:501:0x0849->B:502:0x084b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt3.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.yt3
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((yt3) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
