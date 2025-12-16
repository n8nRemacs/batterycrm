package defpackage;

import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public abstract class ew7 {
    public static final dw7 d = new dw7(new lw7(3, "    ", "type", false, false, true, true), bhi.a);
    public final lw7 a;
    public final kc3 b;
    public final ao6 c = new ao6(14, (byte) 0);

    public ew7(lw7 lw7Var, kc3 kc3Var) {
        this.a = lw7Var;
        this.b = kc3Var;
    }

    public final Object a(zy7 zy7Var, String str) {
        ggg gggVar = new ggg(str);
        Object objD = new a(this, p6i.c, gggVar, zy7Var.d()).d(zy7Var);
        if (gggVar.v() == 10) {
            return objD;
        }
        ggg.G(gggVar, "Expected EOF after parsing, but had " + str.charAt(gggVar.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(zy7 zy7Var, Object obj) {
        char[] cArr;
        bj bjVar = new bj(9, false);
        va2 va2Var = va2.c;
        synchronized (va2Var) {
            js jsVar = (js) va2Var.b;
            cArr = null;
            char[] cArr2 = (char[]) (jsVar.isEmpty() ? null : jsVar.removeLast());
            if (cArr2 != null) {
                va2Var.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        bjVar.c = cArr;
        try {
            new b(new os0(bjVar), this, p6i.c, new b[p6i.Z.getSize()]).p(zy7Var, obj);
            return bjVar.toString();
        } finally {
            bjVar.o();
        }
    }
}
