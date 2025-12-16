package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pxh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final Set c;
    public final pv0 d;

    public pxh(ew7 ew7Var, k18 k18Var) {
        this.a = ew7Var;
        this.b = k18Var;
        zg5 zg5Var = ixh.Y;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(((ixh) f2Var.next()).a);
        }
        this.c = ue3.h0(arrayList);
        this.d = gzi.a(0, 0, 7);
    }

    public static aw7 e(Throwable th) {
        gxh gxhVar = th instanceof gxh ? (gxh) th : null;
        if (fni.a(gxhVar, dxh.a)) {
            return new yv7(new bw7("invalid_request", 3));
        }
        if (fni.a(gxhVar, exh.a)) {
            return new yv7(new bw7("too_large_link", 2));
        }
        if (fni.a(gxhVar, fxh.a)) {
            return new yv7(new bw7("too_large_text", 1));
        }
        if (gxhVar == null) {
            return zv7.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static aw7 i(String str, String str2) {
        Throwable th = ((str == null || vmf.F(str)) && (str2 == null || vmf.F(str2))) ? dxh.a : (str == null || str.length() <= 200) ? (str2 == null || str2.length() <= 200) ? null : fxh.a : exh.a;
        if (th != null) {
            return e(th);
        }
        return null;
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object next;
        Iterator it = ixh.Y.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((ixh) next).a.equals(str)) {
                break;
            }
        }
        ixh ixhVar = (ixh) next;
        qqg qqgVar = qqg.a;
        if (ixhVar == null) {
            wqi.e(pxh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return qqgVar;
        }
        int iOrdinal = ixhVar.ordinal();
        g84 g84Var = g84.a;
        if (iOrdinal == 0) {
            Object objH = h(str2, (q44) continuation);
            if (objH == g84Var) {
                return objH;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Object objG = g(str2, (q44) continuation);
            if (objG == g84Var) {
                return objG;
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r18, defpackage.q44 r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxh.g(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r18, defpackage.q44 r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxh.h(java.lang.String, q44):java.lang.Object");
    }
}
