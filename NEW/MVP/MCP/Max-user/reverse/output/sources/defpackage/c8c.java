package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c8c implements Serializable {
    public static final c8c c = new c8c(j8c.c, 0);
    public final j8c a;
    public final int b;

    public c8c(j8c j8cVar, int i) {
        this.a = j8cVar;
        this.b = i;
    }

    public static c8c a(tm9 tm9Var) throws IOException {
        j8c j8cVar;
        Object next;
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        int i = 0;
        j8c j8cVar2 = null;
        int iS0 = 0;
        while (true) {
            j8cVar = j8c.a;
            if (i >= iM) {
                break;
            }
            String strW0 = tm9Var.w0();
            strW0.getClass();
            if (strW0.equals("on")) {
                String strW02 = tm9Var.w0();
                Iterator it = j8c.o.iterator();
                while (true) {
                    f2 f2Var = (f2) it;
                    if (!f2Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = f2Var.next();
                    if (fni.a(((j8c) next).name(), strW02)) {
                        break;
                    }
                }
                j8c j8cVar3 = (j8c) next;
                j8cVar2 = j8cVar3 == null ? j8cVar : j8cVar3;
            } else if (strW0.equals("seen")) {
                iS0 = tm9Var.s0();
            } else {
                tm9Var.v();
            }
            i++;
        }
        if (j8cVar2 == null) {
            j8cVar2 = j8cVar;
        }
        return new c8c(j8cVar2, iS0);
    }

    public final String toString() {
        return "{on=" + this.a + ", seen=" + this.b + "}";
    }
}
