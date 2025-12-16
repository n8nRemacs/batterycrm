package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class zg9 implements p29, n29 {
    public n29 Y;
    public nfg Z;
    public final p29[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final kc3 d;
    public p29[] s0;
    public lm3 t0;
    public final ArrayList o = new ArrayList();
    public final HashMap X = new HashMap();

    public zg9(kc3 kc3Var, long[] jArr, p29... p29VarArr) {
        this.d = kc3Var;
        this.a = p29VarArr;
        kc3Var.getClass();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        this.t0 = new lm3(zjdVar, zjdVar);
        this.c = new IdentityHashMap();
        this.s0 = new p29[0];
        this.b = new boolean[p29VarArr.length];
        for (int i = 0; i < p29VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new x8g(p29VarArr[i], j);
            }
        }
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        p29[] p29VarArr = this.s0;
        return (p29VarArr.length > 0 ? p29VarArr[0] : this.a[0]).c(j, k9eVar);
    }

    @Override // defpackage.jee
    public final long d() {
        return this.t0.d();
    }

    @Override // defpackage.p29
    public final void f() {
        for (p29 p29Var : this.a) {
            p29Var.f();
        }
    }

    @Override // defpackage.p29
    public final long h(long j) {
        long jH = this.s0[0].h(j);
        int i = 1;
        while (true) {
            p29[] p29VarArr = this.s0;
            if (i >= p29VarArr.length) {
                return jH;
            }
            if (p29VarArr[i].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.n29
    public final void i(p29 p29Var) {
        ArrayList arrayList = this.o;
        arrayList.remove(p29Var);
        if (arrayList.isEmpty()) {
            p29[] p29VarArr = this.a;
            int i = 0;
            for (p29 p29Var2 : p29VarArr) {
                i += p29Var2.l().a;
            }
            lfg[] lfgVarArr = new lfg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < p29VarArr.length; i3++) {
                nfg nfgVarL = p29VarArr[i3].l();
                int i4 = nfgVarL.a;
                int i5 = 0;
                while (i5 < i4) {
                    lfg lfgVarA = nfgVarL.a(i5);
                    int i6 = lfgVarA.a;
                    hf6[] hf6VarArr = new hf6[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        hf6 hf6Var = lfgVarA.d[i7];
                        ff6 ff6VarA = hf6Var.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = hf6Var.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        ff6VarA.a = sb.toString();
                        hf6VarArr[i7] = new hf6(ff6VarA);
                    }
                    lfg lfgVar = new lfg(i3 + ":" + lfgVarA.b, hf6VarArr);
                    this.X.put(lfgVar, lfgVarA);
                    lfgVarArr[i2] = lfgVar;
                    i5++;
                    i2++;
                }
            }
            this.Z = new nfg(lfgVarArr);
            n29 n29Var = this.Y;
            n29Var.getClass();
            n29Var.i(this);
        }
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.t0.j();
    }

    @Override // defpackage.p29
    public final long k() {
        long j = -9223372036854775807L;
        for (p29 p29Var : this.s0) {
            long jK = p29Var.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && p29Var.h(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (p29 p29Var2 : this.s0) {
                    if (p29Var2 == p29Var) {
                        break;
                    }
                    if (p29Var2.h(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jK;
            } else if (jK != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.p29
    public final nfg l() {
        nfg nfgVar = this.Z;
        nfgVar.getClass();
        return nfgVar;
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[bn5VarArr.length];
        int[] iArr3 = new int[bn5VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = bn5VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            jxd jxdVar = jxdVarArr[i2];
            Integer num = jxdVar == null ? null : (Integer) identityHashMap.get(jxdVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            bn5 bn5Var = bn5VarArr[i2];
            if (bn5Var != null) {
                String str = bn5Var.a().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = bn5VarArr.length;
        jxd[] jxdVarArr2 = new jxd[length2];
        jxd[] jxdVarArr3 = new jxd[bn5VarArr.length];
        bn5[] bn5VarArr2 = new bn5[bn5VarArr.length];
        p29[] p29VarArr = this.a;
        ArrayList arrayList = new ArrayList(p29VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < p29VarArr.length) {
            int i4 = i;
            while (i4 < bn5VarArr.length) {
                jxdVarArr3[i4] = iArr2[i4] == i3 ? jxdVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    bn5 bn5Var2 = bn5VarArr[i4];
                    bn5Var2.getClass();
                    iArr = iArr2;
                    lfg lfgVar = (lfg) this.X.get(bn5Var2.a());
                    lfgVar.getClass();
                    bn5VarArr2[i4] = new vg9(bn5Var2, lfgVar);
                } else {
                    iArr = iArr2;
                    bn5VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            p29[] p29VarArr2 = p29VarArr;
            int i5 = i3;
            long jM = p29VarArr2[i3].m(bn5VarArr2, zArr, jxdVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jM;
            } else if (jM != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < bn5VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    jxd jxdVar2 = jxdVarArr3[i6];
                    jxdVar2.getClass();
                    jxdVarArr2[i6] = jxdVarArr3[i6];
                    identityHashMap.put(jxdVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    hsi.g(jxdVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(p29VarArr2[i5]);
            }
            i3 = i5 + 1;
            p29VarArr = p29VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(jxdVarArr2, i7, jxdVarArr, i7, length2);
        this.s0 = (p29[]) arrayList.toArray(new p29[i7]);
        AbstractList abstractListD = lqi.d(new p89(5), arrayList);
        this.d.getClass();
        this.t0 = new lm3(arrayList, abstractListD);
        return j2;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.Y = n29Var;
        ArrayList arrayList = this.o;
        p29[] p29VarArr = this.a;
        Collections.addAll(arrayList, p29VarArr);
        for (p29 p29Var : p29VarArr) {
            p29Var.n(this, j);
        }
    }

    @Override // defpackage.jee
    public final long o() {
        return this.t0.o();
    }

    @Override // defpackage.jee
    public final void p(long j) {
        this.t0.p(j);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.t0.r(oc8Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p29) arrayList.get(i)).r(oc8Var);
        }
        return false;
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        n29 n29Var = this.Y;
        n29Var.getClass();
        n29Var.s(this);
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        for (p29 p29Var : this.s0) {
            p29Var.t(j, z);
        }
    }
}
