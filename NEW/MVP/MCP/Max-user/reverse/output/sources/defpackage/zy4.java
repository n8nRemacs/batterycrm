package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zy4 extends c2 {
    public final Iterator c;
    public final d73 d;
    public final HashSet o = new HashSet();

    public zy4(Iterator it, d73 d73Var) {
        this.c = it;
        this.d = d73Var;
    }

    @Override // defpackage.c2
    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.o.add(this.d.invoke(next)));
        this.b = next;
        this.a = 1;
    }
}
