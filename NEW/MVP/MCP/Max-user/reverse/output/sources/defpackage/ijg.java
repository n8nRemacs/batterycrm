package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ijg implements fp5 {
    public final int a;
    public final List b;
    public final qyg c;
    public final SparseIntArray d;
    public final br4 e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final bqc i;
    public q16 j;
    public jp5 k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public njg p;
    public int q;
    public int r;

    public ijg(int i, y9g y9gVar, br4 br4Var) {
        this.e = br4Var;
        this.a = i;
        if (i == 1 || i == 2) {
            this.b = Collections.singletonList(y9gVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(y9gVar);
        }
        this.c = new qyg(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new bqc(1);
        this.k = jp5.t;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (njg) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new p8e(new vhb(this)));
        this.p = null;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        q16 q16Var;
        long j3;
        SparseArray sparseArray = this.f;
        List list = this.b;
        fsi.d(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y9g y9gVar = (y9g) list.get(i);
            synchronized (y9gVar) {
                j3 = y9gVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jC = y9gVar.c();
                z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
            }
            if (z) {
                y9gVar.d(j2);
            }
        }
        if (j2 != 0 && (q16Var = this.j) != null) {
            q16Var.e(j2);
        }
        this.c.B(0);
        this.d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((njg) sparseArray.valueAt(i2)).a();
        }
        this.q = 0;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.k = jp5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.hp5 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            qyg r0 = r6.c
            byte[] r0 = r0.a
            mm4 r7 = (defpackage.mm4) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.n(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.z(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijg.h(hp5):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws ParserException, EOFException, InterruptedIOException {
        hp5 hp5Var2;
        int i;
        int i2;
        ?? r3;
        int i3;
        boolean z;
        long j;
        long j2 = ((mm4) hp5Var).c;
        boolean z2 = this.m;
        int i4 = this.a;
        if (z2) {
            long j3 = -9223372036854775807L;
            bqc bqcVar = this.i;
            if (j2 != -1 && i4 != 2 && !bqcVar.d) {
                int i5 = this.r;
                y9g y9gVar = bqcVar.b;
                qyg qygVar = bqcVar.c;
                if (i5 <= 0) {
                    bqcVar.a(hp5Var);
                    return 0;
                }
                if (!bqcVar.f) {
                    mm4 mm4Var = (mm4) hp5Var;
                    long j4 = mm4Var.c;
                    int iMin = (int) Math.min(112800, j4);
                    long j5 = j4 - iMin;
                    if (mm4Var.d != j5) {
                        n7Var.a = j5;
                        return 1;
                    }
                    qygVar.B(iMin);
                    mm4Var.X = 0;
                    mm4Var.n(qygVar.a, 0, iMin, false);
                    int i6 = qygVar.b;
                    int i7 = qygVar.c;
                    int i8 = i7 - 188;
                    while (true) {
                        if (i8 < i6) {
                            break;
                        }
                        byte[] bArr = qygVar.a;
                        int i9 = -4;
                        int i10 = 0;
                        while (true) {
                            if (i9 > 4) {
                                break;
                            }
                            int i11 = (i9 * 188) + i8;
                            if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                                i10 = 0;
                            } else {
                                i10++;
                                if (i10 == 5) {
                                    long jB = bhi.b(qygVar, i8, i5);
                                    if (jB != -9223372036854775807L) {
                                        j3 = jB;
                                        break;
                                    }
                                }
                            }
                            i9++;
                        }
                        i8--;
                    }
                    bqcVar.h = j3;
                    bqcVar.f = true;
                    return 0;
                }
                if (bqcVar.h == -9223372036854775807L) {
                    bqcVar.a(hp5Var);
                    return 0;
                }
                if (bqcVar.e) {
                    long j6 = bqcVar.g;
                    if (j6 == -9223372036854775807L) {
                        bqcVar.a(hp5Var);
                        return 0;
                    }
                    long jB2 = y9gVar.b(bqcVar.h) - y9gVar.b(j6);
                    bqcVar.i = jB2;
                    if (jB2 < 0) {
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("Invalid duration: ");
                        sb.append(jB2);
                        sb.append(". Using TIME_UNSET instead.");
                        Log.w("TsDurationReader", sb.toString());
                        bqcVar.i = -9223372036854775807L;
                    }
                    bqcVar.a(hp5Var);
                    return 0;
                }
                mm4 mm4Var2 = (mm4) hp5Var;
                int iMin2 = (int) Math.min(112800, mm4Var2.c);
                long j7 = 0;
                if (mm4Var2.d != j7) {
                    n7Var.a = j7;
                    return 1;
                }
                qygVar.B(iMin2);
                mm4Var2.X = 0;
                mm4Var2.n(qygVar.a, 0, iMin2, false);
                int i12 = qygVar.b;
                int i13 = qygVar.c;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    if (qygVar.a[i12] == 71) {
                        long jB3 = bhi.b(qygVar, i12, i5);
                        if (jB3 != -9223372036854775807L) {
                            j3 = jB3;
                            break;
                        }
                    }
                    i12++;
                }
                bqcVar.g = j3;
                bqcVar.e = true;
                return 0;
            }
            if (this.n) {
                i = i4;
                z = false;
                j2 = j2;
                j = 0;
                i2 = 1;
            } else {
                this.n = true;
                long j8 = bqcVar.i;
                if (j8 != -9223372036854775807L) {
                    j2 = j2;
                    j = 0;
                    i = i4;
                    i2 = 1;
                    z = false;
                    q16 q16Var = new q16(new qha(14), new lk6(this.r, bqcVar.b), j8, 1 + j8, 0L, j2, 188L, 940);
                    this.j = q16Var;
                    this.k.N((in0) q16Var.c);
                } else {
                    i = i4;
                    j2 = j2;
                    j = 0;
                    i2 = 1;
                    z = false;
                    this.k.N(new w16(j8));
                }
            }
            if (this.o) {
                this.o = z;
                d(j, j);
                if (((mm4) hp5Var).d != j) {
                    n7Var.a = j;
                    return i2;
                }
            }
            q16 q16Var2 = this.j;
            if (q16Var2 != null && ((kn0) q16Var2.e) != null) {
                return q16Var2.a(hp5Var, n7Var);
            }
            hp5Var2 = hp5Var;
            r3 = z;
        } else {
            hp5Var2 = hp5Var;
            i = i4;
            i2 = 1;
            r3 = 0;
        }
        qyg qygVar2 = this.c;
        byte[] bArr2 = qygVar2.a;
        if (9400 - qygVar2.b < 188) {
            int iC = qygVar2.c();
            if (iC > 0) {
                System.arraycopy(bArr2, qygVar2.b, bArr2, r3, iC);
            }
            qygVar2.C(iC, bArr2);
        }
        while (qygVar2.c() < 188) {
            int i14 = qygVar2.c;
            int i15 = ((mm4) hp5Var2).read(bArr2, i14, 9400 - i14);
            if (i15 == -1) {
                return -1;
            }
            qygVar2.D(i14 + i15);
        }
        int i16 = qygVar2.b;
        int i17 = qygVar2.c;
        byte[] bArr3 = qygVar2.a;
        int i18 = i16;
        while (i18 < i17 && bArr3[i18] != 71) {
            i18++;
        }
        qygVar2.E(i18);
        int i19 = i18 + 188;
        if (i19 > i17) {
            int i20 = (i18 - i16) + this.q;
            this.q = i20;
            i3 = i;
            if (i3 == 2 && i20 > 376) {
                throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i3 = i;
            this.q = r3;
        }
        int i21 = qygVar2.c;
        if (i19 > i21) {
            return r3;
        }
        int iF = qygVar2.f();
        if ((8388608 & iF) != 0) {
            qygVar2.E(i19);
            return r3;
        }
        int i22 = (4194304 & iF) != 0 ? i2 : r3;
        int i23 = (2096896 & iF) >> 8;
        int i24 = (iF & 32) != 0 ? i2 : r3;
        njg njgVar = (iF & 16) != 0 ? (njg) this.f.get(i23) : null;
        if (njgVar == null) {
            qygVar2.E(i19);
            return r3;
        }
        if (i3 != 2) {
            int i25 = iF & 15;
            SparseIntArray sparseIntArray = this.d;
            int i26 = sparseIntArray.get(i23, i25 - 1);
            sparseIntArray.put(i23, i25);
            if (i26 == i25) {
                qygVar2.E(i19);
                return r3;
            }
            if (i25 != ((i26 + 1) & 15)) {
                njgVar.a();
            }
        }
        if (i24 != 0) {
            int iS = qygVar2.s();
            i22 |= (qygVar2.s() & 64) != 0 ? 2 : r3;
            qygVar2.F(iS - 1);
        }
        boolean z3 = this.m;
        if (i3 == 2 || z3 || !this.h.get(i23, r3)) {
            qygVar2.D(i19);
            njgVar.c(i22, qygVar2);
            qygVar2.D(i21);
        }
        if (i3 != 2 && !z3 && this.m && j2 != -1) {
            this.o = i2;
        }
        qygVar2.E(i19);
        return r3;
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
