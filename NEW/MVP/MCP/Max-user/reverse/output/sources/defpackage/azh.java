package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class azh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final Set d;
    public final pv0 e;
    public clh f;

    public azh(ew7 ew7Var, k18 k18Var, k18 k18Var2) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        zg5 zg5Var = qyh.u0;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(((qyh) f2Var.next()).a);
        }
        this.d = ue3.h0(arrayList);
        this.e = gzi.a(0, 0, 7);
    }

    public static final void e(azh azhVar, String str) {
        clh clhVar = azhVar.f;
        if (clhVar != null) {
            noh.a((noh) azhVar.b.getValue(), str, clhVar.a, clhVar.b, true, 0, null, null, 240);
        }
    }

    public static aw7 f(Throwable th) {
        jyh jyhVar = th instanceof jyh ? (jyh) th : null;
        if (jyhVar instanceof iyh) {
            return new yv7(new bw7("too_many_keys", ((iyh) jyhVar).a ? 3 : 1));
        }
        if (jyhVar instanceof fyh) {
            return new yv7(new bw7("not_found", ((fyh) jyhVar).a ? 6 : 4));
        }
        if (jyhVar instanceof eyh) {
            return new yv7(new bw7("not_found", 1));
        }
        if (jyhVar == null) {
            return zv7.d;
        }
        if (jyhVar instanceof gyh) {
            return new yv7(new bw7("too_large_key", ((gyh) jyhVar).a ? 5 : 3));
        }
        if (jyhVar instanceof hyh) {
            return new yv7(new bw7("too_large_value", ((hyh) jyhVar).a ? 4 : 2));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object objH;
        boolean zContains = this.d.contains(str);
        qqg qqgVar = qqg.a;
        if (!zContains) {
            wqi.e(azh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return qqgVar;
        }
        boolean zEquals = str.equals("WebAppSecureStorageSaveKey");
        g84 g84Var = g84.a;
        if (zEquals) {
            Object objJ = j(str2, true, (q44) continuation);
            if (objJ == g84Var) {
                return objJ;
            }
        } else if (str.equals("WebAppSecureStorageGetKey")) {
            Object objI = i(str2, true, (q44) continuation);
            if (objI == g84Var) {
                return objI;
            }
        } else if (str.equals("WebAppSecureStorageClear")) {
            Object objH2 = h(str2, true, (q44) continuation);
            if (objH2 == g84Var) {
                return objH2;
            }
        } else if (str.equals("WebAppDeviceStorageSaveKey")) {
            Object objJ2 = j(str2, false, (q44) continuation);
            if (objJ2 == g84Var) {
                return objJ2;
            }
        } else if (str.equals("WebAppDeviceStorageGetKey")) {
            Object objI2 = i(str2, false, (q44) continuation);
            if (objI2 == g84Var) {
                return objI2;
            }
        } else if (str.equals("WebAppDeviceStorageClear") && (objH = h(str2, false, (q44) continuation)) == g84Var) {
            return objH;
        }
        return qqgVar;
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.e;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.d;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
        this.f = clhVar;
    }

    public final xh3 g() {
        return (xh3) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r18, boolean r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azh.h(java.lang.String, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r18, boolean r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azh.i(java.lang.String, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r18, boolean r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azh.j(java.lang.String, boolean, q44):java.lang.Object");
    }
}
