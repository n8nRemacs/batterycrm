package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yrh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final Set c;
    public final pv0 d;

    public yrh(ew7 ew7Var, k18 k18Var) {
        this.a = ew7Var;
        this.b = k18Var;
        zg5 zg5Var = orh.Z;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(((orh) f2Var.next()).a);
        }
        this.c = ue3.h0(arrayList);
        this.d = gzi.a(0, 0, 7);
    }

    public static aw7 e(Throwable th) {
        zqh zqhVar = th instanceof zqh ? (zqh) th : null;
        return zqhVar == null ? zv7.d : new yv7(new bw7(zqhVar.a, zqhVar.b));
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object next;
        Iterator it = orh.Z.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((orh) next).a.equals(str)) {
                break;
            }
        }
        orh orhVar = (orh) next;
        qqg qqgVar = qqg.a;
        if (orhVar == null) {
            wqi.e(yrh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return qqgVar;
        }
        int iOrdinal = orhVar.ordinal();
        g84 g84Var = g84.a;
        if (iOrdinal == 0) {
            Object objG = g(str2, (q44) continuation);
            if (objG == g84Var) {
                return objG;
            }
        } else if (iOrdinal == 1) {
            Object objH = h(str2, (q44) continuation);
            if (objH == g84Var) {
                return objH;
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object objI = i(str2, (q44) continuation);
            if (objI == g84Var) {
                return objI;
            }
        }
        return qqgVar;
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.d;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.c;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
    }

    public final xh3 f() {
        return (xh3) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[PHI: r0 r1 r14 r15
  0x00e3: PHI (r0v16 orh) = (r0v15 orh), (r0v19 orh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r1v5 yrh) = (r1v4 yrh), (r1v7 yrh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r14v14 sqh) = (r14v13 sqh), (r14v18 sqh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v1 java.lang.Object) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrh.g(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[PHI: r0 r1 r14 r15
  0x00e3: PHI (r0v16 orh) = (r0v15 orh), (r0v19 orh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r1v5 yrh) = (r1v4 yrh), (r1v7 yrh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r14v14 tqh) = (r14v13 tqh), (r14v18 tqh) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v1 java.lang.Object) binds: [B:39:0x00e0, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrh.h(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[PHI: r0 r1 r14 r15
  0x00e7: PHI (r0v16 orh) = (r0v15 orh), (r0v19 orh) binds: [B:39:0x00e4, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r1v5 yrh) = (r1v4 yrh), (r1v7 yrh) binds: [B:39:0x00e4, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r14v14 uqh) = (r14v13 uqh), (r14v18 uqh) binds: [B:39:0x00e4, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v1 java.lang.Object) binds: [B:39:0x00e4, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrh.i(java.lang.String, q44):java.lang.Object");
    }
}
