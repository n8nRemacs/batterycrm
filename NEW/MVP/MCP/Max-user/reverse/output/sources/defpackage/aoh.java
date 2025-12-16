package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aoh implements cw7 {
    public static final List i = Collections.singletonList("unknown");
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf e = new bwf(new kvf(22, this));
    public final Set f;
    public final pv0 g;
    public clh h;

    public aoh(ew7 ew7Var, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        zg5 zg5Var = jnh.t0;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(((jnh) f2Var.next()).a);
        }
        this.f = ue3.h0(arrayList);
        this.g = gzi.a(0, 0, 7);
    }

    public static final void e(aoh aohVar, String str) {
        clh clhVar = aohVar.h;
        if (clhVar != null) {
            noh.a((noh) aohVar.b.getValue(), str, clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aw7 f(java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.f(java.lang.Throwable):aw7");
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object objJ;
        boolean zContains = this.f.contains(str);
        qqg qqgVar = qqg.a;
        if (!zContains) {
            wqi.e(aoh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return qqgVar;
        }
        boolean zEquals = str.equals("WebAppBiometryGetInfo");
        g84 g84Var = g84.a;
        if (zEquals) {
            Object objI = i(str2, (q44) continuation);
            if (objI == g84Var) {
                return objI;
            }
        } else if (str.equals("WebAppBiometryRequestAccess")) {
            Object objK = k(str2, (q44) continuation);
            if (objK == g84Var) {
                return objK;
            }
        } else if (str.equals("WebAppBiometryUpdateToken")) {
            Object objL = l(str2, (q44) continuation);
            if (objL == g84Var) {
                return objL;
            }
        } else if (str.equals("WebAppBiometryRequestAuth")) {
            Object objH = h(str2, (q44) continuation);
            if (objH == g84Var) {
                return objH;
            }
        } else if (str.equals("WebAppBiometryOpenSettings") && (objJ = j(str2, (q44) continuation)) == g84Var) {
            return objJ;
        }
        return qqgVar;
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.g;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.f;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
        this.h = clhVar;
    }

    public final xh3 g() {
        return (xh3) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.h(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.i(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.j(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.k(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r23, defpackage.q44 r24) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoh.l(java.lang.String, q44):java.lang.Object");
    }
}
