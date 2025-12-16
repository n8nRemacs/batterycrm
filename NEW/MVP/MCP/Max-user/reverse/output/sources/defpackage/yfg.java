package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class yfg implements lw0 {
    public static final o9g c = new o9g(6);
    public final kfg a;
    public final wg7 b;

    public yfg(kfg kfgVar) {
        this.a = kfgVar;
        u4j.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < kfgVar.a) {
            Integer numValueOf = Integer.valueOf(i);
            int i3 = i2 + 1;
            int iH = mg7.h(objArrCopyOf.length, i3);
            if (iH > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
            }
            objArrCopyOf[i2] = numValueOf;
            i++;
            i2 = i3;
        }
        this.b = wg7.h(i2, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yfg.class == obj.getClass()) {
            yfg yfgVar = (yfg) obj;
            if (this.a.equals(yfgVar.a) && this.b.equals(yfgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public yfg(kfg kfgVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= kfgVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = kfgVar;
        this.b = wg7.j(list);
    }
}
