package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class yg9 implements o29, m29 {
    public m29 X;
    public mfg Y;
    public o29[] Z;
    public final o29[] a;
    public final IdentityHashMap b;
    public final lcj c;
    public final ArrayList d = new ArrayList();
    public final HashMap o = new HashMap();
    public kce s0;

    public yg9(lcj lcjVar, long[] jArr, o29... o29VarArr) {
        this.c = lcjVar;
        this.a = o29VarArr;
        lcjVar.getClass();
        this.s0 = new kce(12, new iee[0]);
        this.b = new IdentityHashMap();
        this.Z = new o29[0];
        for (int i = 0; i < o29VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new wg9(o29VarArr[i], j);
            }
        }
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.X = m29Var;
        ArrayList arrayList = this.d;
        o29[] o29VarArr = this.a;
        Collections.addAll(arrayList, o29VarArr);
        for (o29 o29Var : o29VarArr) {
            o29Var.C(this, j);
        }
    }

    @Override // defpackage.o29
    public final long E(an5[] an5VarArr, boolean[] zArr, ixd[] ixdVarArr, boolean[] zArr2, long j) {
        HashMap map;
        IdentityHashMap identityHashMap;
        o29[] o29VarArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[an5VarArr.length];
        int[] iArr4 = new int[an5VarArr.length];
        int i = 0;
        while (true) {
            int length = an5VarArr.length;
            map = this.o;
            identityHashMap = this.b;
            o29VarArr = this.a;
            if (i >= length) {
                break;
            }
            ixd ixdVar = ixdVarArr[i];
            Integer num = ixdVar == null ? null : (Integer) identityHashMap.get(ixdVar);
            iArr3[i] = num == null ? -1 : num.intValue();
            iArr4[i] = -1;
            an5 an5Var = an5VarArr[i];
            if (an5Var != null) {
                kfg kfgVar = (kfg) map.get(an5Var.a());
                kfgVar.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= o29VarArr.length) {
                        break;
                    }
                    if (o29VarArr[i2].l().b(kfgVar) != -1) {
                        iArr4[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = an5VarArr.length;
        ixd[] ixdVarArr2 = new ixd[length2];
        ixd[] ixdVarArr3 = new ixd[an5VarArr.length];
        an5[] an5VarArr2 = new an5[an5VarArr.length];
        ArrayList arrayList = new ArrayList(o29VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < o29VarArr.length) {
            int i4 = 0;
            while (i4 < an5VarArr.length) {
                ixdVarArr3[i4] = iArr3[i4] == i3 ? ixdVarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    an5 an5Var2 = an5VarArr[i4];
                    an5Var2.getClass();
                    iArr = iArr3;
                    kfg kfgVar2 = (kfg) map.get(an5Var2.a());
                    kfgVar2.getClass();
                    iArr2 = iArr4;
                    an5VarArr2[i4] = new ug9(an5Var2, kfgVar2);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    an5VarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            ArrayList arrayList2 = arrayList;
            ixd[] ixdVarArr4 = ixdVarArr3;
            int i5 = i3;
            long jE = o29VarArr[i3].E(an5VarArr2, zArr, ixdVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = jE;
            } else if (jE != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < an5VarArr.length; i6++) {
                if (iArr6[i6] == i5) {
                    ixd ixdVar2 = ixdVarArr4[i6];
                    ixdVar2.getClass();
                    ixdVarArr2[i6] = ixdVarArr4[i6];
                    identityHashMap.put(ixdVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr5[i6] == i5) {
                    fsi.d(ixdVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(o29VarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            ixdVarArr3 = ixdVarArr4;
            iArr3 = iArr5;
            iArr4 = iArr6;
        }
        System.arraycopy(ixdVarArr2, 0, ixdVarArr, 0, length2);
        o29[] o29VarArr2 = (o29[]) arrayList.toArray(new o29[0]);
        this.Z = o29VarArr2;
        this.c.getClass();
        this.s0 = new kce(12, o29VarArr2);
        return j2;
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        m29 m29Var = this.X;
        m29Var.getClass();
        m29Var.b(this);
    }

    @Override // defpackage.m29
    public final void c(o29 o29Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(o29Var);
        if (arrayList.isEmpty()) {
            o29[] o29VarArr = this.a;
            int i = 0;
            for (o29 o29Var2 : o29VarArr) {
                i += o29Var2.l().a;
            }
            kfg[] kfgVarArr = new kfg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < o29VarArr.length; i3++) {
                mfg mfgVarL = o29VarArr[i3].l();
                int i4 = mfgVarL.a;
                int i5 = 0;
                while (i5 < i4) {
                    kfg kfgVarA = mfgVarL.a(i5);
                    String str = kfgVarA.b;
                    StringBuilder sb = new StringBuilder(u45.f(12, str));
                    sb.append(i3);
                    sb.append(":");
                    sb.append(str);
                    kfg kfgVar = new kfg(sb.toString(), kfgVarA.c);
                    this.o.put(kfgVar, kfgVarA);
                    kfgVarArr[i2] = kfgVar;
                    i5++;
                    i2++;
                }
            }
            this.Y = new mfg(kfgVarArr);
            m29 m29Var = this.X;
            m29Var.getClass();
            m29Var.c(this);
        }
    }

    @Override // defpackage.iee
    public final long d() {
        return this.s0.d();
    }

    @Override // defpackage.o29
    public final void f() {
        for (o29 o29Var : this.a) {
            o29Var.f();
        }
    }

    @Override // defpackage.o29
    public final long h(long j) {
        long jH = this.Z[0].h(j);
        int i = 1;
        while (true) {
            o29[] o29VarArr = this.Z;
            if (i >= o29VarArr.length) {
                return jH;
            }
            if (o29VarArr[i].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.s0.j();
    }

    @Override // defpackage.o29
    public final long k() {
        long j = -9223372036854775807L;
        for (o29 o29Var : this.Z) {
            long jK = o29Var.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && o29Var.h(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (o29 o29Var2 : this.Z) {
                    if (o29Var2 == o29Var) {
                        break;
                    }
                    if (o29Var2.h(jK) != jK) {
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

    @Override // defpackage.o29
    public final mfg l() {
        mfg mfgVar = this.Y;
        mfgVar.getClass();
        return mfgVar;
    }

    @Override // defpackage.iee
    public final long o() {
        return this.s0.o();
    }

    @Override // defpackage.iee
    public final void p(long j) {
        this.s0.p(j);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        o29[] o29VarArr = this.Z;
        return (o29VarArr.length > 0 ? o29VarArr[0] : this.a[0]).v(j, j9eVar);
    }

    @Override // defpackage.o29
    public final void y(long j) {
        for (o29 o29Var : this.Z) {
            o29Var.y(j);
        }
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.s0.z(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o29) arrayList.get(i)).z(j);
        }
        return false;
    }
}
