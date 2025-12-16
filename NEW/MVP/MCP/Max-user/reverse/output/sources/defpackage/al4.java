package defpackage;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class al4 implements uc4 {
    public final jc8 a;
    public final k5i b;
    public final int[] c;
    public final int d;
    public final se4 e;
    public final long f;
    public final int g;
    public final i4c h;
    public final wk4[] i;
    public bn5 j;
    public ad4 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public al4(wm4 wm4Var, jc8 jc8Var, ad4 ad4Var, k5i k5iVar, int i, int[] iArr, bn5 bn5Var, int i2, se4 se4Var, long j, int i3, boolean z, ArrayList arrayList, i4c i4cVar) {
        this.a = jc8Var;
        this.k = ad4Var;
        this.b = k5iVar;
        this.c = iArr;
        this.j = bn5Var;
        int i4 = i2;
        this.d = i4;
        this.e = se4Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        i4c i4cVar2 = i4cVar;
        this.h = i4cVar2;
        long jD = ad4Var.d(i);
        ArrayList arrayListA = a();
        this.i = new wk4[bn5Var.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            ymd ymdVar = (ymd) arrayListA.get(bn5Var.f(i5));
            kl0 kl0VarN = k5iVar.n(ymdVar.b);
            long j2 = jD;
            this.i[i5] = new wk4(j2, ymdVar, kl0VarN == null ? (kl0) ymdVar.b.get(0) : kl0VarN, wm4Var.b(i4, ymdVar.a, z, arrayList, i4cVar2), 0L, ymdVar.c(), 0);
            i5++;
            i4cVar2 = i4cVar;
            jD = j2;
            i4 = i2;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((x8) list.get(i)).c);
        }
        return arrayList;
    }

    @Override // defpackage.uc4
    public final void b() throws BehindLiveWindowException {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // defpackage.uc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(long r20, defpackage.k9e r22) {
        /*
            r19 = this;
            r1 = r20
            r7 = r19
            wk4[] r0 = r7.i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L64
            r5 = r0[r4]
            java.lang.Object r6 = r5.e
            ud4 r6 = (defpackage.ud4) r6
            long r8 = r5.g
            java.lang.Object r10 = r5.e
            ud4 r10 = (defpackage.ud4) r10
            if (r6 == 0) goto L5f
            long r11 = r5.f()
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L23
            goto L5f
        L23:
            defpackage.hsi.h(r10)
            long r3 = r5.f
            long r3 = r10.u(r1, r3)
            long r3 = r3 + r8
            r13 = r3
            long r3 = r5.i(r13)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            r15 = -1
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            r15 = 1
            if (r0 == 0) goto L4f
            defpackage.hsi.h(r10)
            long r17 = r10.C()
            long r17 = r17 + r8
            long r17 = r17 + r11
            long r17 = r17 - r15
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L58
        L4f:
            long r8 = r13 + r15
            long r5 = r5.i(r8)
        L55:
            r0 = r22
            goto L5a
        L58:
            r5 = r3
            goto L55
        L5a:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5f:
            int r4 = r4 + 1
            r1 = r20
            goto L8
        L64:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al4.c(long, k9e):long");
    }

    @Override // defpackage.uc4
    public final void d(oc8 oc8Var, long j, List list, os0 os0Var) {
        wk4[] wk4VarArr;
        long j2;
        long j3;
        long jMax;
        long j4;
        boolean z;
        long j5;
        long j6;
        Object v24Var;
        long j7;
        long j8;
        if (this.m != null) {
            return;
        }
        long j9 = oc8Var.a;
        long j10 = j - j9;
        long jU = zxg.U(this.k.b(this.l).b) + zxg.U(this.k.a) + j;
        i4c i4cVar = this.h;
        if (i4cVar == null || !i4cVar.e(jU)) {
            long jU2 = zxg.U(zxg.E(this.f));
            ad4 ad4Var = this.k;
            long j11 = ad4Var.a;
            long jU3 = j11 == -9223372036854775807L ? -9223372036854775807L : jU2 - zxg.U(j11 + ad4Var.b(this.l).b);
            aw8 aw8Var = list.isEmpty() ? null : (aw8) list.get(list.size() - 1);
            int length = this.j.length();
            cw8[] cw8VarArr = new cw8[length];
            int i = 0;
            while (true) {
                wk4VarArr = this.i;
                if (i >= length) {
                    break;
                }
                wk4 wk4Var = wk4VarArr[i];
                int i2 = length;
                ud4 ud4Var = (ud4) wk4Var.e;
                lcj lcjVar = cw8.N;
                if (ud4Var == null) {
                    cw8VarArr[i] = lcjVar;
                    j7 = j9;
                } else {
                    long jD = wk4Var.d(jU2);
                    long jE = wk4Var.e(jU2);
                    if (aw8Var != null) {
                        j8 = aw8Var.a();
                        j7 = j9;
                    } else {
                        ud4 ud4Var2 = (ud4) wk4Var.e;
                        hsi.h(ud4Var2);
                        j7 = j9;
                        j8 = zxg.j(ud4Var2.u(j, wk4Var.f) + wk4Var.g, jD, jE);
                    }
                    long j12 = j8;
                    if (j12 < jD) {
                        cw8VarArr[i] = lcjVar;
                    } else {
                        cw8VarArr[i] = new yk4(0, j12, jE, k(i));
                    }
                }
                i++;
                length = i2;
                j9 = j7;
            }
            long j13 = j9;
            if (!this.k.d || wk4VarArr[0].f() == 0) {
                j2 = j10;
                j3 = 0;
                jMax = -9223372036854775807L;
            } else {
                long jG = wk4VarArr[0].g(wk4VarArr[0].e(jU2));
                ad4 ad4Var2 = this.k;
                j2 = j10;
                long j14 = ad4Var2.a;
                long jMin = Math.min(j14 == -9223372036854775807L ? -9223372036854775807L : jU2 - zxg.U(j14 + ad4Var2.b(this.l).b), jG) - j13;
                j3 = 0;
                jMax = Math.max(0L, jMin);
            }
            long j15 = j3;
            long j16 = jU3;
            this.j.r(j13, j2, jMax, list, cw8VarArr);
            int iB = this.j.b();
            SystemClock.elapsedRealtime();
            wk4 wk4VarK = k(iB);
            long j17 = wk4VarK.f;
            long j18 = wk4VarK.g;
            ud4 ud4Var3 = (ud4) wk4VarK.e;
            kl0 kl0Var = (kl0) wk4VarK.d;
            f93 f93Var = (f93) wk4VarK.b;
            ymd ymdVar = (ymd) wk4VarK.c;
            if (f93Var != null) {
                z = true;
                r7d r7dVar = ((qw0) f93Var).s0 == null ? ymdVar.o : null;
                j4 = j18;
                r7d r7dVarD = ud4Var3 == null ? ymdVar.d() : null;
                if (r7dVar != null || r7dVarD != null) {
                    hf6 hf6VarJ = this.j.j();
                    int iK = this.j.k();
                    Object objM = this.j.m();
                    if (r7dVar != null) {
                        r7d r7dVarA = r7dVar.a(r7dVarD, kl0Var.a);
                        if (r7dVarA != null) {
                            r7dVar = r7dVarA;
                        }
                    } else {
                        r7dVarD.getClass();
                        r7dVar = r7dVarD;
                    }
                    os0Var.b = new rl7(this.e, x7j.a(ymdVar, kl0Var.a, r7dVar, 0), hf6VarJ, iK, objM, (f93) wk4VarK.b);
                    return;
                }
            } else {
                j4 = j18;
                z = true;
            }
            ad4 ad4Var3 = this.k;
            boolean z2 = (ad4Var3.d && this.l == ad4Var3.m.size() + (-1)) ? z : false;
            boolean z3 = (z2 && j17 == -9223372036854775807L) ? false : z;
            if (wk4VarK.f() == j15) {
                os0Var.a = z3;
                return;
            }
            long jD2 = wk4VarK.d(jU2);
            long jE2 = wk4VarK.e(jU2);
            if (z2) {
                long jG2 = wk4VarK.g(jE2);
                z3 &= (jG2 - wk4VarK.i(jE2)) + jG2 >= j17 ? z : false;
            }
            if (aw8Var != null) {
                j6 = aw8Var.a();
                j5 = jE2;
            } else {
                hsi.h(ud4Var3);
                j5 = jE2;
                j6 = zxg.j(ud4Var3.u(j, j17) + j4, jD2, j5);
            }
            long j19 = j6;
            if (j19 < jD2) {
                this.m = new BehindLiveWindowException();
                return;
            }
            if (j19 > j5 || (this.n && j19 >= j5)) {
                os0Var.a = z3;
                return;
            }
            if (z3 && wk4VarK.i(j19) >= j17) {
                os0Var.a = z;
                return;
            }
            int iMin = (int) Math.min(this.g, (j5 - j19) + 1);
            int i3 = 1;
            if (j17 != -9223372036854775807L) {
                while (iMin > 1 && wk4VarK.i((iMin + j19) - 1) >= j17) {
                    iMin--;
                }
            }
            long j20 = list.isEmpty() ? j : -9223372036854775807L;
            hf6 hf6VarJ2 = this.j.j();
            int iK2 = this.j.k();
            Object objM2 = this.j.m();
            long jI = wk4VarK.i(j19);
            hsi.h(ud4Var3);
            r7d r7dVarMo164k = ud4Var3.mo164k(j19 - j4);
            se4 se4Var = this.e;
            if (f93Var == null) {
                v24Var = new c3f(se4Var, x7j.a(ymdVar, kl0Var.a, r7dVarMo164k, wk4VarK.j(j19, j16) ? 0 : 8), hf6VarJ2, iK2, objM2, jI, wk4VarK.g(j19), j19, this.d, hf6VarJ2);
            } else {
                int i4 = 1;
                while (i4 < iMin) {
                    int i5 = iMin;
                    hsi.h(ud4Var3);
                    r7d r7dVarA2 = r7dVarMo164k.a(ud4Var3.mo164k((j19 + i4) - j4), kl0Var.a);
                    if (r7dVarA2 == null) {
                        break;
                    }
                    i3++;
                    i4++;
                    r7dVarMo164k = r7dVarA2;
                    iMin = i5;
                }
                long j21 = (j19 + i3) - 1;
                long jG3 = wk4VarK.g(j21);
                long j22 = (j17 == -9223372036854775807L || j17 > jG3) ? -9223372036854775807L : j17;
                ze4 ze4VarA = x7j.a(ymdVar, kl0Var.a, r7dVarMo164k, wk4VarK.j(j21, j16) ? 0 : 8);
                long j23 = -ymdVar.c;
                if (xz9.k(hf6VarJ2.n)) {
                    j23 += jI;
                }
                v24Var = new v24(se4Var, ze4VarA, hf6VarJ2, iK2, objM2, jI, jG3, j20, j22, j19, i3, j23, (f93) wk4VarK.b);
            }
            os0Var.b = v24Var;
        }
    }

    @Override // defpackage.uc4
    public final void e(e93 e93Var) {
        if (e93Var instanceof rl7) {
            int iS = this.j.s(((rl7) e93Var).d);
            wk4[] wk4VarArr = this.i;
            wk4 wk4Var = wk4VarArr[iS];
            if (((ud4) wk4Var.e) == null) {
                f93 f93Var = (f93) wk4Var.b;
                hsi.h(f93Var);
                h93 h93VarA = ((qw0) f93Var).a();
                if (h93VarA != null) {
                    ymd ymdVar = (ymd) wk4Var.c;
                    wk4VarArr[iS] = new wk4(wk4Var.f, ymdVar, (kl0) wk4Var.d, (f93) wk4Var.b, wk4Var.g, new v32(h93VarA, ymdVar.c, 4), 0);
                }
            }
        }
        i4c i4cVar = this.h;
        if (i4cVar != null) {
            long j = i4cVar.d;
            if (j == -9223372036854775807L || e93Var.Z > j) {
                i4cVar.d = e93Var.Z;
            }
            i4cVar.e.d = true;
        }
    }

    @Override // defpackage.uc4
    public final boolean f(long j, e93 e93Var, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.t(j, e93Var, list);
    }

    @Override // defpackage.uc4
    public final boolean g(e93 e93Var, boolean z, sb8 sb8Var, tha thaVar) {
        y21 y21VarP;
        long jMax;
        if (z) {
            i4c i4cVar = this.h;
            if (i4cVar == null || !i4cVar.f(e93Var)) {
                boolean z2 = this.k.d;
                wk4[] wk4VarArr = this.i;
                if (!z2 && (e93Var instanceof aw8)) {
                    IOException iOException = sb8Var.a;
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).d == 404) {
                        wk4 wk4Var = wk4VarArr[this.j.s(e93Var.d)];
                        long jF = wk4Var.f();
                        if (jF != -1 && jF != 0) {
                            ud4 ud4Var = (ud4) wk4Var.e;
                            hsi.h(ud4Var);
                            if (((aw8) e93Var).a() > ((ud4Var.C() + wk4Var.g) + jF) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                wk4 wk4Var2 = wk4VarArr[this.j.s(e93Var.d)];
                ymd ymdVar = (ymd) wk4Var2.c;
                kl0 kl0Var = (kl0) wk4Var2.d;
                wg7 wg7Var = ymdVar.b;
                k5i k5iVar = this.b;
                kl0 kl0VarN = k5iVar.n(wg7Var);
                if (kl0VarN == null || kl0Var.equals(kl0VarN)) {
                    bn5 bn5Var = this.j;
                    wg7 wg7Var2 = ((ymd) wk4Var2.c).b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int length = bn5Var.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (bn5Var.q(i2, jElapsedRealtime)) {
                            i++;
                        }
                    }
                    int iE = k5i.e(wg7Var2);
                    nc5 nc5Var = new nc5(iE, iE - k5iVar.h(wg7Var2), length, i, 3);
                    if ((nc5Var.a(2) || nc5Var.a(1)) && (y21VarP = thaVar.p(nc5Var, sb8Var)) != null) {
                        long j = y21VarP.c;
                        int i3 = y21VarP.b;
                        if (nc5Var.a(i3)) {
                            if (i3 == 2) {
                                bn5 bn5Var2 = this.j;
                                return bn5Var2.u(bn5Var2.s(e93Var.d), j);
                            }
                            if (i3 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                String str = kl0Var.b;
                                HashMap map = (HashMap) k5iVar.b;
                                if (map.containsKey(str)) {
                                    Long l = (Long) map.get(str);
                                    String str2 = zxg.a;
                                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i4 = kl0Var.c;
                                if (i4 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i4);
                                    HashMap map2 = (HashMap) k5iVar.c;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l2 = (Long) map2.get(numValueOf);
                                        String str3 = zxg.a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.uc4
    public final void h(ad4 ad4Var, int i) {
        wk4[] wk4VarArr = this.i;
        try {
            this.k = ad4Var;
            this.l = i;
            long jD = ad4Var.d(i);
            ArrayList arrayListA = a();
            for (int i2 = 0; i2 < wk4VarArr.length; i2++) {
                wk4VarArr[i2] = wk4VarArr[i2].b(jD, (ymd) arrayListA.get(this.j.f(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // defpackage.uc4
    public final void i(bn5 bn5Var) {
        this.j = bn5Var;
    }

    @Override // defpackage.uc4
    public final int j(long j, List list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.g(j, list);
    }

    public final wk4 k(int i) {
        wk4[] wk4VarArr = this.i;
        wk4 wk4Var = wk4VarArr[i];
        kl0 kl0VarN = this.b.n(((ymd) wk4Var.c).b);
        if (kl0VarN == null || kl0VarN.equals((kl0) wk4Var.d)) {
            return wk4Var;
        }
        wk4 wk4Var2 = new wk4(wk4Var.f, (ymd) wk4Var.c, kl0VarN, (f93) wk4Var.b, wk4Var.g, (ud4) wk4Var.e, 0);
        wk4VarArr[i] = wk4Var2;
        return wk4Var2;
    }

    @Override // defpackage.uc4
    public final void release() {
        for (wk4 wk4Var : this.i) {
            f93 f93Var = (f93) wk4Var.b;
            if (f93Var != null) {
                ((qw0) f93Var).a.release();
            }
        }
    }
}
