package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class xfg {
    public static final String c;
    public static final String d;
    public final lfg a;
    public final wg7 b;

    static {
        String str = zxg.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public xfg(lfg lfgVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= lfgVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = lfgVar;
        this.b = wg7.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xfg.class == obj.getClass()) {
            xfg xfgVar = (xfg) obj;
            if (this.a.equals(xfgVar.a) && this.b.equals(xfgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
