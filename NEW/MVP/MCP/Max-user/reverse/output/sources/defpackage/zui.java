package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class zui {
    public static o98 a(qk qkVar) {
        pb2 pb2Var = (pb2) qkVar.b;
        o98 o98VarD = ve3.d();
        Iterator it = new wp8(1, ll0.a).iterator();
        while (true) {
            ListIterator listIterator = ((eqd) it).b;
            if (!listIterator.hasPrevious()) {
                return ve3.a(o98VarD);
            }
            il0 il0Var = (il0) listIterator.previous();
            if (il0Var.compareTo(il0.a) >= 0 && il0Var.compareTo(il0.o) <= 0) {
                String strI = pb2Var.i(il0Var, hl0.b);
                if (strI != null) {
                    o98VarD.add(strI);
                }
                String strI2 = pb2Var.i(il0Var, hl0.a);
                if (strI2 != null) {
                    o98VarD.add(strI2);
                }
            }
        }
    }

    public static int b(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
