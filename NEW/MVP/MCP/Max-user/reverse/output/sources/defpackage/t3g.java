package defpackage;

import com.facebook.animated.gif.GifImage;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class t3g implements cp0 {
    public static final char[] w0 = new char[0];
    public int X;
    public int Y;
    public final Object Z;
    public final /* synthetic */ int a = 0;
    public boolean b;
    public String c;
    public int d;
    public int o;
    public Object s0;
    public Object t0;
    public Object u0;
    public Object v0;

    public t3g(String str, a3b a3bVar, we weVar, zj6 zj6Var, boolean z) {
        this.Z = a3bVar;
        this.s0 = weVar;
        this.t0 = zj6Var;
        this.b = z;
        this.c = str == null ? String.valueOf(hashCode()) : str;
        this.d = ((GifImage) ((fs3) a3bVar.b).e).k();
        this.o = ((GifImage) ((fs3) a3bVar.b).e).h();
        long millis = TimeUnit.SECONDS.toMillis(1L) / (((fs3) a3bVar.b).a / a3bVar.p());
        int i = (int) (millis >= 1 ? millis : 1L);
        this.X = i;
        this.Y = i;
        this.v0 = new ak6(this);
    }

    public char[] a(int i) {
        ev0 ev0Var = (ev0) this.Z;
        return ev0Var != null ? ev0Var.a(2, i) : new char[Math.max(i, 500)];
    }

    public kt b(int i, int i2) {
        int i3 = this.o;
        int i4 = this.d;
        if (!this.b) {
            return new kt(i4, i3, 2);
        }
        if (i < i4 || i2 < i3) {
            double d = i4 / i3;
            if (i2 > i) {
                if (i2 > i3) {
                    i2 = i3;
                }
                i4 = (int) (i2 * d);
                i3 = i2;
            } else {
                if (i > i4) {
                    i = i4;
                }
                i3 = (int) (i / d);
                i4 = i;
            }
        }
        return new kt(i4, i3, 2);
    }

    public void c() {
        this.b = false;
        ((ArrayList) this.v0).clear();
        this.X = 0;
        this.Y = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u0
            char[] r0 = (char[]) r0
            if (r0 != 0) goto L67
            java.lang.String r0 = r7.c
            if (r0 == 0) goto Lf
            char[] r0 = r0.toCharArray()
            goto L65
        Lf:
            int r0 = r7.d
            char[] r1 = defpackage.t3g.w0
            r2 = 1
            if (r0 < 0) goto L31
            int r3 = r7.o
            if (r3 >= r2) goto L1c
        L1a:
            r0 = r1
            goto L65
        L1c:
            if (r0 != 0) goto L27
            java.lang.Object r0 = r7.s0
            char[] r0 = (char[]) r0
            char[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L65
        L27:
            java.lang.Object r1 = r7.s0
            char[] r1 = (char[]) r1
            int r3 = r3 + r0
            char[] r0 = java.util.Arrays.copyOfRange(r1, r0, r3)
            goto L65
        L31:
            int r0 = r7.t()
            if (r0 >= r2) goto L38
            goto L1a
        L38:
            char[] r0 = new char[r0]
            java.lang.Object r1 = r7.v0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = 0
            if (r1 == 0) goto L5b
            int r1 = r1.size()
            r3 = r2
            r4 = r3
        L47:
            if (r3 >= r1) goto L5c
            java.lang.Object r5 = r7.v0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r3)
            char[] r5 = (char[]) r5
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r4, r6)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L47
        L5b:
            r4 = r2
        L5c:
            java.lang.Object r1 = r7.t0
            char[] r1 = (char[]) r1
            int r3 = r7.Y
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
        L65:
            r7.u0 = r0
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3g.d():char[]");
    }

    @Override // defpackage.cp0
    public void e() {
        q();
        g();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cp0
    public vc3 f(int i, int i2, int i3) {
        dk6 dk6VarC;
        kt ktVarB = b(i2, i3);
        xu0 xu0VarQ = q();
        if (xu0VarQ != null) {
            int i4 = ktVarB.b;
            int i5 = ktVarB.c;
            Integer num = (Integer) xu0VarQ.k.get(Integer.valueOf(i));
            if (num != null) {
                int iIntValue = num.intValue();
                xu0VarQ.j = iIntValue;
                wu0 wu0Var = (wu0) xu0VarQ.f.get(num);
                if (wu0Var == null || wu0Var.b || !wu0Var.a.h0()) {
                    wu0Var = null;
                }
                if (wu0Var != null) {
                    l16 l16Var = xu0VarQ.i;
                    int i6 = xu0VarQ.g;
                    int iD = l16Var.d(xu0VarQ.e + i6);
                    if (i6 >= iD ? !((i6 > iIntValue || iIntValue > l16Var.b) && (iIntValue < 0 || iIntValue > iD)) : !(i6 > iIntValue || iIntValue > iD)) {
                        xu0VarQ.e(i4, i5);
                    }
                    dk6VarC = new dk6(1, wu0Var.a.clone());
                } else {
                    xu0VarQ.e(i4, i5);
                    dk6VarC = xu0VarQ.c(iIntValue);
                }
            } else {
                dk6VarC = xu0VarQ.c(i);
            }
        } else {
            dk6VarC = null;
        }
        if (dk6VarC != null) {
            AtomicInteger atomicInteger = cg.a;
            ak6 ak6Var = (ak6) this.v0;
            ConcurrentHashMap concurrentHashMap = cg.d;
            if (!concurrentHashMap.contains(ak6Var)) {
                concurrentHashMap.put(ak6Var, Integer.valueOf((int) (ak6Var.a * 0.2f)));
            }
            int iV = az1.v(dk6VarC.a);
            if (iV == 0) {
                cg.a.incrementAndGet();
            } else if (iV == 1) {
                cg.b.incrementAndGet();
            } else {
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cg.c.incrementAndGet();
            }
        }
        if (dk6VarC != null) {
            return dk6VarC.b;
        }
        return null;
    }

    @Override // defpackage.cp0
    public void g() {
        xu0 xu0VarQ = q();
        if (xu0VarQ != null) {
            ConcurrentHashMap concurrentHashMap = zj6.d;
            zj6.d.put(this.c, new vsg(xu0VarQ, new Date()));
        }
        this.u0 = null;
    }

    @Override // defpackage.cp0
    public void h(hk4 hk4Var, bp0 bp0Var, uo0 uo0Var, int i) {
    }

    @Override // defpackage.cp0
    public void i(int i, int i2) {
        if (i <= 0 || i2 <= 0 || this.d <= 0 || this.o <= 0) {
            return;
        }
        kt ktVarB = b(i, i2);
        xu0 xu0VarQ = q();
        if (xu0VarQ != null) {
            int i3 = ktVarB.b;
            xu0VarQ.e(i3, i3);
        }
    }

    public BigDecimal j() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = (char[]) this.u0;
        if (cArr3 != null) {
            return dqa.a(cArr3, 0, cArr3.length);
        }
        int i = this.d;
        if (i >= 0 && (cArr2 = (char[]) this.s0) != null) {
            return dqa.a(cArr2, i, this.o);
        }
        if (this.X == 0 && (cArr = (char[]) this.t0) != null) {
            return dqa.a(cArr, 0, this.Y);
        }
        char[] cArrD = d();
        String str = dqa.a;
        return dqa.a(cArrD, 0, cArrD.length);
    }

    public int k(boolean z) {
        char[] cArr;
        int i = this.d;
        return (i < 0 || (cArr = (char[]) this.s0) == null) ? z ? -dqa.b((char[]) this.t0, 1, this.Y - 1) : dqa.b((char[]) this.t0, 0, this.Y) : z ? -dqa.b(cArr, i + 1, this.o - 1) : dqa.b(cArr, i, this.o);
    }

    public String l() {
        if (this.c == null) {
            char[] cArr = (char[]) this.u0;
            if (cArr != null) {
                this.c = new String(cArr);
            } else {
                int i = this.d;
                if (i >= 0) {
                    int i2 = this.o;
                    if (i2 < 1) {
                        this.c = "";
                        return "";
                    }
                    this.c = new String((char[]) this.s0, i, i2);
                } else {
                    int i3 = this.X;
                    int i4 = this.Y;
                    if (i3 == 0) {
                        this.c = i4 != 0 ? new String((char[]) this.t0, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = (ArrayList) this.v0;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) ((ArrayList) this.v0).get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append((char[]) this.t0, 0, this.Y);
                        this.c = sb.toString();
                    }
                }
            }
        }
        return this.c;
    }

    public char[] m() {
        this.d = -1;
        this.Y = 0;
        this.o = 0;
        this.s0 = null;
        this.c = null;
        this.u0 = null;
        if (this.b) {
            c();
        }
        char[] cArr = (char[]) this.t0;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrA = a(0);
        this.t0 = cArrA;
        return cArrA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[PHI: r1
  0x002c: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:6:0x002a, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.v0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.v0 = r0
        Ld:
            java.lang.Object r0 = r3.t0
            char[] r0 = (char[]) r0
            r1 = 1
            r3.b = r1
            java.lang.Object r1 = r3.v0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            int r1 = r3.X
            int r2 = r0.length
            int r1 = r1 + r2
            r3.X = r1
            r1 = 0
            r3.Y = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L2e
        L2c:
            r0 = r1
            goto L33
        L2e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L33
            goto L2c
        L33:
            char[] r0 = new char[r0]
            r3.t0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3g.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[PHI: r1
  0x002f: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x002d, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] o() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.v0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.v0 = r0
        Ld:
            r0 = 1
            r2.b = r0
            java.lang.Object r0 = r2.v0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r2.t0
            char[] r1 = (char[]) r1
            r0.add(r1)
            java.lang.Object r0 = r2.t0
            char[] r0 = (char[]) r0
            int r0 = r0.length
            int r1 = r2.X
            int r1 = r1 + r0
            r2.X = r1
            r1 = 0
            r2.Y = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L31
        L2f:
            r0 = r1
            goto L36
        L31:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L36
            goto L2f
        L36:
            char[] r0 = new char[r0]
            r2.t0 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3g.o():char[]");
    }

    public char[] p() {
        if (this.d >= 0) {
            u(1);
        } else {
            char[] cArr = (char[]) this.t0;
            if (cArr == null) {
                this.t0 = a(0);
            } else if (this.Y >= cArr.length) {
                n();
            }
        }
        return (char[]) this.t0;
    }

    public xu0 q() {
        xu0 xu0Var;
        if (((xu0) this.u0) == null) {
            zj6 zj6Var = (zj6) this.t0;
            String str = this.c;
            we weVar = (we) this.s0;
            a3b a3bVar = (a3b) this.Z;
            ConcurrentHashMap concurrentHashMap = zj6.d;
            synchronized (concurrentHashMap) {
                vsg vsgVar = (vsg) concurrentHashMap.get(str);
                if (vsgVar != null) {
                    concurrentHashMap.remove(str);
                    xu0Var = vsgVar.a;
                } else {
                    xu0Var = new xu0(zj6Var.a, weVar, new l16(zj6Var.b, 7), a3bVar, zj6Var.c);
                }
            }
            this.u0 = xu0Var;
        }
        return (xu0) this.u0;
    }

    public char[] r() {
        if (this.d >= 0) {
            return (char[]) this.s0;
        }
        char[] cArr = (char[]) this.u0;
        if (cArr != null) {
            return cArr;
        }
        String str = this.c;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.u0 = charArray;
            return charArray;
        }
        if (this.b) {
            return d();
        }
        char[] cArr2 = (char[]) this.t0;
        return cArr2 == null ? w0 : cArr2;
    }

    public void s(char[] cArr, int i, int i2) {
        this.c = null;
        this.u0 = null;
        this.s0 = cArr;
        this.d = i;
        this.o = i2;
        if (this.b) {
            c();
        }
    }

    public int t() {
        if (this.d >= 0) {
            return this.o;
        }
        char[] cArr = (char[]) this.u0;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.c;
        return str != null ? str.length() : this.X + this.Y;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return l();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int i2 = this.o;
        this.o = 0;
        char[] cArr = (char[]) this.s0;
        this.s0 = null;
        int i3 = this.d;
        this.d = -1;
        int i4 = i + i2;
        char[] cArr2 = (char[]) this.t0;
        if (cArr2 == null || i4 > cArr2.length) {
            this.t0 = a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, (char[]) this.t0, 0, i2);
        }
        this.X = 0;
        this.Y = i2;
    }

    public t3g(ev0 ev0Var) {
        this.Z = ev0Var;
    }
}
