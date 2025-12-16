package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jph implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final Set c;
    public final pv0 d;

    public jph(ew7 ew7Var, k18 k18Var) {
        this.a = ew7Var;
        this.b = k18Var;
        zg5 zg5Var = eph.c;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            ((eph) f2Var.next()).getClass();
            arrayList.add("WebAppOpenCodeReader");
        }
        this.c = ue3.h0(arrayList);
        this.d = gzi.a(0, 0, 7);
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object next;
        Iterator it = eph.c.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            ((eph) next).getClass();
            if ("WebAppOpenCodeReader".equals(str)) {
                break;
            }
        }
        eph ephVar = (eph) next;
        qqg qqgVar = qqg.a;
        if (ephVar != null) {
            if (fph.$EnumSwitchMapping$0[ephVar.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Object objE = e(str2, (q44) continuation);
            return objE == g84.a ? objE : qqgVar;
        }
        wqi.e(jph.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, defpackage.q44 r19) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jph.e(java.lang.String, q44):java.lang.Object");
    }
}
