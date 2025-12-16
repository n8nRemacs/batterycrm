package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class a37 implements z27 {
    public final k18 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public x27 d;

    public a37(k18 k18Var) {
        this.a = k18Var;
    }

    public final void a(x27 x27Var) {
        this.d = x27Var;
        Iterator it = this.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            boolean zO = ((bi9) ((y27) it.next())).O(x27Var, new rw(2, this, a37.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 24));
            if (!z2) {
                z2 = zO;
            }
        }
        if (x27Var != null && !z2) {
            z = true;
        }
        this.c = z;
    }
}
