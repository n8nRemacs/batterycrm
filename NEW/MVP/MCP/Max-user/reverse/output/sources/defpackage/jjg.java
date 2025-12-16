package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class jjg implements gp5 {
    public boolean A0;
    public ojg B0;
    public int C0;
    public int D0;
    public final br4 X;
    public final rof Y;
    public final SparseArray Z;
    public final int a;
    public final int b;
    public final List c;
    public final umb d;
    public final SparseIntArray o;
    public final SparseBooleanArray s0;
    public final SparseBooleanArray t0;
    public final cqc u0;
    public r16 v0;
    public kp5 w0;
    public int x0;
    public boolean y0;
    public boolean z0;

    public jjg(int i, int i2, rof rofVar, z9g z9gVar, br4 br4Var) {
        this.X = br4Var;
        this.a = i;
        this.b = i2;
        this.Y = rofVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(z9gVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(z9gVar);
        }
        this.d = new umb(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.s0 = sparseBooleanArray;
        this.t0 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.Z = sparseArray;
        this.o = new SparseIntArray();
        this.u0 = new cqc(1);
        this.w0 = kp5.u;
        this.D0 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (ojg) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new q8e(new wib(this)));
        this.B0 = null;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        r16 r16Var;
        long j3;
        SparseArray sparseArray = this.Z;
        List list = this.c;
        hsi.g(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z9g z9gVar = (z9g) list.get(i);
            synchronized (z9gVar) {
                j3 = z9gVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = z9gVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                z9gVar.f(j2);
            }
        }
        if (j2 != 0 && (r16Var = this.v0) != null) {
            r16Var.e(j2);
        }
        this.d.G(0);
        this.o.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ojg) sparseArray.valueAt(i2)).a();
        }
        this.C0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.ip5 r7) {
        /*
            r6 = this;
            umb r0 = r6.d
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.i(r2, r0, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.z(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjg.i(ip5):boolean");
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        if ((this.b & 1) == 0) {
            kp5Var = new dl6(kp5Var, this.Y);
        }
        this.w0 = kp5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) throws ParserException {
        ip5 ip5Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long length = ip5Var.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.y0) {
            long j = -9223372036854775807L;
            cqc cqcVar = this.u0;
            if (length != -1 && !z2 && !cqcVar.d) {
                int i6 = this.D0;
                z9g z9gVar = cqcVar.b;
                umb umbVar = cqcVar.c;
                if (i6 <= 0) {
                    cqcVar.a(ip5Var);
                    return 0;
                }
                if (cqcVar.f) {
                    if (cqcVar.h == -9223372036854775807L) {
                        cqcVar.a(ip5Var);
                        return 0;
                    }
                    if (cqcVar.e) {
                        long j2 = cqcVar.g;
                        if (j2 == -9223372036854775807L) {
                            cqcVar.a(ip5Var);
                            return 0;
                        }
                        cqcVar.i = z9gVar.c(cqcVar.h) - z9gVar.b(j2);
                        cqcVar.a(ip5Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, ip5Var.getLength());
                    long j3 = 0;
                    if (ip5Var.getPosition() != j3) {
                        n7Var.a = j3;
                        return 1;
                    }
                    umbVar.G(iMin);
                    ip5Var.y();
                    ip5Var.i(0, umbVar.a, iMin);
                    int i7 = umbVar.b;
                    int i8 = umbVar.c;
                    while (true) {
                        if (i7 >= i8) {
                            break;
                        }
                        if (umbVar.a[i7] == 71) {
                            long jB = nmi.b(umbVar, i7, i6);
                            if (jB != -9223372036854775807L) {
                                j = jB;
                                break;
                            }
                        }
                        i7++;
                    }
                    cqcVar.g = j;
                    cqcVar.e = true;
                    return 0;
                }
                long length2 = ip5Var.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j4 = length2 - iMin2;
                if (ip5Var.getPosition() != j4) {
                    n7Var.a = j4;
                    return 1;
                }
                umbVar.G(iMin2);
                ip5Var.y();
                ip5Var.i(0, umbVar.a, iMin2);
                int i9 = umbVar.b;
                int i10 = umbVar.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = umbVar.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long jB2 = nmi.b(umbVar, i11, i6);
                                if (jB2 != -9223372036854775807L) {
                                    j = jB2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                cqcVar.h = j;
                cqcVar.f = true;
                return 0;
            }
            if (this.z0) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.z0 = true;
                long j5 = cqcVar.i;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    r16 r16Var = new r16(new rha(14), new hjg(this.D0, cqcVar.b), j5, 1 + j5, 0L, length, 188L, 940);
                    this.v0 = r16Var;
                    this.w0.Q((jn0) r16Var.c);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.w0.Q(new ge0(j5));
                }
            }
            if (this.A0) {
                this.A0 = z;
                d(0L, 0L);
                if (ip5Var.getPosition() != 0) {
                    n7Var.a = 0L;
                    return i;
                }
            }
            r16 r16Var2 = this.v0;
            if (r16Var2 != null && ((kn0) r16Var2.e) != null) {
                return r16Var2.b(ip5Var, n7Var);
            }
            ip5Var2 = ip5Var;
            r1 = z;
        } else {
            ip5Var2 = ip5Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        umb umbVar2 = this.d;
        byte[] bArr2 = umbVar2.a;
        if (9400 - umbVar2.b < 188) {
            int iA = umbVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, umbVar2.b, bArr2, r1, iA);
            }
            umbVar2.H(iA, bArr2);
        }
        while (true) {
            int iA2 = umbVar2.a();
            SparseArray sparseArray = this.Z;
            if (iA2 >= 188) {
                int i15 = umbVar2.b;
                int i16 = umbVar2.c;
                byte[] bArr3 = umbVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                umbVar2.J(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.C0;
                    this.C0 = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.C0 = r1;
                }
                int i20 = umbVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iJ = umbVar2.j();
                if ((8388608 & iJ) != 0) {
                    umbVar2.J(i18);
                    return r1;
                }
                int i21 = (4194304 & iJ) != 0 ? 1 : r1;
                int i22 = (2096896 & iJ) >> 8;
                boolean z3 = (iJ & 32) != 0 ? true : r1;
                ojg ojgVar = (iJ & 16) != 0 ? (ojg) sparseArray.get(i22) : null;
                if (ojgVar == null) {
                    umbVar2.J(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = iJ & 15;
                    SparseIntArray sparseIntArray = this.o;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        umbVar2.J(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        ojgVar.a();
                    }
                }
                if (z3) {
                    int iX = umbVar2.x();
                    i21 |= (umbVar2.x() & 64) != 0 ? i4 : r1;
                    umbVar2.K(iX - 1);
                }
                boolean z4 = this.y0;
                if (i3 == i4 || z4 || !this.t0.get(i22, r1)) {
                    umbVar2.I(i18);
                    ojgVar.b(i21, umbVar2);
                    umbVar2.I(i20);
                }
                if (i3 != i4 && !z4 && this.y0 && length != -1) {
                    this.A0 = true;
                }
                umbVar2.J(i18);
                return r1;
            }
            int i25 = umbVar2.c;
            int i26 = ip5Var2.read(bArr2, i25, 9400 - i25);
            if (i26 == -1) {
                int i27 = r1;
                while (i27 < sparseArray.size()) {
                    ojg ojgVar2 = (ojg) sparseArray.valueAt(i27);
                    if (ojgVar2 instanceof ntb) {
                        ntb ntbVar = (ntb) ojgVar2;
                        int i28 = (!z2 || ntbVar.d()) ? i : r1;
                        if (ntbVar.c == 3 && ntbVar.j == -1 && ((!z2 || !(ntbVar.a instanceof mz6)) && i28 != 0)) {
                            ntbVar.b(i, new umb());
                        }
                    }
                    i27++;
                    i = 1;
                }
                return -1;
            }
            umbVar2.I(i25 + i26);
            i = 1;
        }
    }
}
