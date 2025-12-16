package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l02 extends k02 {
    public final ArrayList a = new ArrayList();

    public l02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k02 k02Var = (k02) it.next();
            if (!(k02Var instanceof m02)) {
                this.a.add(k02Var);
            }
        }
    }

    @Override // defpackage.k02
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k02) it.next()).a(i);
        }
    }

    @Override // defpackage.k02
    public final void b(int i, r02 r02Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k02) it.next()).b(i, r02Var);
        }
    }

    @Override // defpackage.k02
    public final void c(int i, jbe jbeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k02) it.next()).c(i, jbeVar);
        }
    }

    @Override // defpackage.k02
    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k02) it.next()).d(i);
        }
    }
}
