package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class jve extends n4 implements e9a, o42, pn6 {
    public final int X;
    public final int Y;
    public Object[] Z;
    public final int o;
    public long s0;
    public long t0;
    public int u0;
    public int v0;

    public jve(int i, int i2, int i3) {
        this.o = i;
        this.X = i2;
        this.Y = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        throw r1.getCancellationException();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(defpackage.jve r8, defpackage.z26 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jve.o(jve, z26, kotlin.coroutines.Continuation):void");
    }

    @Override // defpackage.e9a, defpackage.z26
    public final Object a(Object obj, Continuation continuation) throws Throwable {
        Throwable th;
        Continuation[] continuationArrR;
        gve gveVar;
        if (h(obj)) {
            return qqg.a;
        }
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        Continuation[] continuationArrR2 = j40.b;
        synchronized (this) {
            try {
                if (u(obj)) {
                    try {
                        l42Var.resumeWith(qqg.a);
                        continuationArrR = r(continuationArrR2);
                        gveVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        gve gveVar2 = new gve(this, s() + this.u0 + this.v0, obj, l42Var);
                        q(gveVar2);
                        this.v0++;
                        if (this.X == 0) {
                            continuationArrR2 = r(continuationArrR2);
                        }
                        continuationArrR = continuationArrR2;
                        gveVar = gveVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (gveVar != null) {
                    nyi.b(l42Var, new y32(2, gveVar));
                }
                for (Continuation continuation2 : continuationArrR) {
                    if (continuation2 != null) {
                        continuation2.resumeWith(qqg.a);
                    }
                }
                Object objN = l42Var.n();
                g84 g84Var = g84.a;
                if (objN != g84Var) {
                    objN = qqg.a;
                }
                return objN == g84Var ? objN : qqg.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.fve
    public final List b() {
        synchronized (this) {
            int iS = (int) ((s() + this.u0) - this.s0);
            if (iS == 0) {
                return hd5.a;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.Z;
            for (int i = 0; i < iS; i++) {
                arrayList.add(kve.c(objArr, this.s0 + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        o(this, z26Var, continuation);
        return g84.a;
    }

    @Override // defpackage.pn6
    public final x26 e(x74 x74Var, int i, int i2) {
        return kve.e(this, x74Var, i, i2);
    }

    @Override // defpackage.e9a
    public final void g() throws Throwable {
        synchronized (this) {
            try {
                try {
                    x(s() + this.u0, this.t0, s() + this.u0, s() + this.u0 + this.v0);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.e9a
    public final boolean h(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArrR = j40.b;
        synchronized (this) {
            if (u(obj)) {
                continuationArrR = r(continuationArrR);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArrR) {
            if (continuation != null) {
                continuation.resumeWith(qqg.a);
            }
        }
        return z;
    }

    @Override // defpackage.n4
    public final o4 j() {
        lve lveVar = new lve();
        lveVar.a = -1L;
        return lveVar;
    }

    @Override // defpackage.n4
    public final o4[] k() {
        return new lve[2];
    }

    public final Object m(lve lveVar, ive iveVar) {
        l42 l42Var = new l42(1, hni.f(iveVar));
        l42Var.o();
        synchronized (this) {
            try {
                if (v(lveVar) < 0) {
                    lveVar.b = l42Var;
                } else {
                    l42Var.resumeWith(qqg.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqg.a;
    }

    public final void n() {
        if (this.X != 0 || this.v0 > 1) {
            Object[] objArr = this.Z;
            while (this.v0 > 0 && kve.c(objArr, (s() + (this.u0 + this.v0)) - 1) == kve.a) {
                this.v0--;
                kve.d(objArr, s() + this.u0 + this.v0, null);
            }
        }
    }

    public final void p() {
        o4[] o4VarArr;
        kve.d(this.Z, s(), null);
        this.u0--;
        long jS = s() + 1;
        if (this.s0 < jS) {
            this.s0 = jS;
        }
        if (this.t0 < jS) {
            if (this.b != 0 && (o4VarArr = this.a) != null) {
                for (o4 o4Var : o4VarArr) {
                    if (o4Var != null) {
                        lve lveVar = (lve) o4Var;
                        long j = lveVar.a;
                        if (j >= 0 && j < jS) {
                            lveVar.a = jS;
                        }
                    }
                }
            }
            this.t0 = jS;
        }
    }

    public final void q(Object obj) {
        int i = this.u0 + this.v0;
        Object[] objArrT = this.Z;
        if (objArrT == null) {
            objArrT = t(0, 2, null);
        } else if (i >= objArrT.length) {
            objArrT = t(i, objArrT.length * 2, objArrT);
        }
        kve.d(objArrT, s() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] r(Continuation[] continuationArr) {
        o4[] o4VarArr;
        lve lveVar;
        l42 l42Var;
        int length = continuationArr.length;
        if (this.b != 0 && (o4VarArr = this.a) != null) {
            int length2 = o4VarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                o4 o4Var = o4VarArr[i];
                if (o4Var != null && (l42Var = (lveVar = (lve) o4Var).b) != null && v(lveVar) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = l42Var;
                    lveVar.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long s() {
        return Math.min(this.t0, this.s0);
    }

    public final Object[] t(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.Z = objArr2;
        if (objArr != null) {
            long jS = s();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jS;
                kve.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.b
            int r2 = r12.o
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L84
        Lb:
            r12.q(r13)
            int r1 = r12.u0
            int r1 = r1 + r9
            r12.u0 = r1
            if (r1 <= r2) goto L18
            r12.p()
        L18:
            long r1 = r12.s()
            int r3 = r12.u0
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.t0 = r1
            return r9
        L23:
            int r1 = r12.u0
            int r3 = r12.X
            if (r1 < r3) goto L4c
            long r4 = r12.t0
            long r6 = r12.s0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4c
            int[] r1 = defpackage.hve.$EnumSwitchMapping$0
            int r4 = r12.Y
            int r4 = defpackage.az1.v(r4)
            r1 = r1[r4]
            if (r1 == r9) goto L4a
            r4 = 2
            if (r1 == r4) goto L84
            r4 = 3
            if (r1 != r4) goto L44
            goto L4c
        L44:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L4a:
            r1 = 0
            return r1
        L4c:
            r12.q(r13)
            int r1 = r12.u0
            int r1 = r1 + r9
            r12.u0 = r1
            if (r1 <= r3) goto L59
            r12.p()
        L59:
            long r3 = r12.s()
            int r1 = r12.u0
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.s0
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L84
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.t0
            long r5 = r12.s()
            int r7 = r12.u0
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.s()
            int r10 = r12.u0
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.v0
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.x(r1, r3, r5, r7)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jve.u(java.lang.Object):boolean");
    }

    public final long v(lve lveVar) {
        long j = lveVar.a;
        if (j < s() + this.u0) {
            return j;
        }
        if (this.X <= 0 && j <= s() && this.v0 != 0) {
            return j;
        }
        return -1L;
    }

    public final Object w(lve lveVar) {
        Object obj;
        Continuation[] continuationArrY = j40.b;
        synchronized (this) {
            try {
                long jV = v(lveVar);
                if (jV < 0) {
                    obj = kve.a;
                } else {
                    long j = lveVar.a;
                    Object objC = kve.c(this.Z, jV);
                    if (objC instanceof gve) {
                        objC = ((gve) objC).c;
                    }
                    lveVar.a = jV + 1;
                    Object obj2 = objC;
                    continuationArrY = y(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrY) {
            if (continuation != null) {
                continuation.resumeWith(qqg.a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jS = s(); jS < jMin; jS++) {
            kve.d(this.Z, jS, null);
        }
        this.s0 = j;
        this.t0 = j2;
        this.u0 = (int) (j3 - jMin);
        this.v0 = (int) (j4 - j3);
    }

    public final Continuation[] y(long j) {
        int i;
        long j2;
        long j3;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        o4[] o4VarArr;
        long j4 = this.t0;
        Continuation[] continuationArr3 = j40.b;
        if (j <= j4) {
            long jS = s();
            long j5 = this.u0 + jS;
            int i2 = this.X;
            if (i2 == 0 && this.v0 > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.b != 0 && (o4VarArr = this.a) != null) {
                for (o4 o4Var : o4VarArr) {
                    if (o4Var != null) {
                        long j6 = ((lve) o4Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.t0) {
                long jS2 = s() + this.u0;
                int iMin = this.b > 0 ? Math.min(this.v0, i2 - ((int) (jS2 - j5))) : this.v0;
                long j7 = this.v0 + jS2;
                if (iMin > 0) {
                    Continuation[] continuationArr4 = new Continuation[iMin];
                    Object[] objArr = this.Z;
                    j3 = 1;
                    long j8 = jS2;
                    while (true) {
                        if (jS2 >= j7) {
                            i = i2;
                            continuationArr2 = continuationArr4;
                            j2 = jS;
                            jS2 = j8;
                            break;
                        }
                        i = i2;
                        Object objC = kve.c(objArr, jS2);
                        continuationArr2 = continuationArr4;
                        Symbol symbol = kve.a;
                        if (objC != symbol) {
                            gve gveVar = (gve) objC;
                            j2 = jS;
                            int i4 = i3 + 1;
                            continuationArr2[i3] = gveVar.d;
                            kve.d(objArr, jS2, symbol);
                            kve.d(objArr, j8, gveVar.c);
                            long j9 = j8 + 1;
                            if (i4 >= iMin) {
                                jS2 = j9;
                                break;
                            }
                            j8 = j9;
                            i3 = i4;
                        } else {
                            j2 = jS;
                        }
                        jS2++;
                        i2 = i;
                        continuationArr4 = continuationArr2;
                        jS = j2;
                    }
                    continuationArr = continuationArr2;
                } else {
                    i = i2;
                    j2 = jS;
                    j3 = 1;
                    continuationArr = continuationArr3;
                }
                int i5 = (int) (jS2 - j2);
                long j10 = this.b == 0 ? jS2 : j5;
                long jMax = Math.max(this.s0, jS2 - Math.min(this.o, i5));
                if (i == 0 && jMax < j7 && fni.a(kve.c(this.Z, jMax), kve.a)) {
                    jS2 += j3;
                    jMax += j3;
                }
                x(jMax, j10, jS2, j7);
                n();
                return continuationArr.length == 0 ? continuationArr : r(continuationArr);
            }
        }
        return continuationArr3;
    }
}
