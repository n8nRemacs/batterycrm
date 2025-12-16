package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uoh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final Set d;
    public final pv0 e;
    public clh f;

    public uoh(ew7 ew7Var, k18 k18Var, k18 k18Var2) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        zg5 zg5Var = qoh.c;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            ((qoh) f2Var.next()).getClass();
            arrayList.add("WebAppChangeScreenBrightness");
        }
        this.d = ue3.h0(arrayList);
        this.e = gzi.a(0, 0, 7);
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object next;
        Iterator it = qoh.c.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            ((qoh) next).getClass();
            if ("WebAppChangeScreenBrightness".equals(str)) {
                break;
            }
        }
        qoh qohVar = (qoh) next;
        qqg qqgVar = qqg.a;
        if (qohVar != null) {
            if (roh.$EnumSwitchMapping$0[qohVar.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Object objE = e(str2, (q44) continuation);
            return objE == g84.a ? objE : qqgVar;
        }
        wqi.e(uoh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoh.e(java.lang.String, q44):java.lang.Object");
    }
}
