package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ith implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final Set d;
    public final pv0 e;
    public clh f;

    public ith(ew7 ew7Var, k18 k18Var, k18 k18Var2) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        zg5 zg5Var = eth.c;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            ((eth) f2Var.next()).getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = ue3.h0(arrayList);
        this.e = gzi.a(0, 0, 7);
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object objE;
        boolean zContains = this.d.contains(str);
        qqg qqgVar = qqg.a;
        if (zContains) {
            return (str.equals("WebAppRequestPhone") && (objE = e(str2, (q44) continuation)) == g84.a) ? objE : qqgVar;
        }
        wqi.e(ith.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
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
        ((xh3) this.c.getValue()).c = clhVar;
        this.f = clhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ith.e(java.lang.String, q44):java.lang.Object");
    }
}
