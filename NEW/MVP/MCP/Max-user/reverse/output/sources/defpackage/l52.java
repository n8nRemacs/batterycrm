package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l52 extends k02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l52(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k02
    public void b(int i, r02 r02Var) {
        switch (this.a) {
            case 1:
                wy9 wy9Var = (wy9) this.b;
                synchronized (wy9Var.a) {
                    try {
                        if (wy9Var.o) {
                            return;
                        }
                        wy9Var.s0.put(r02Var.getTimestamp(), new s02(r02Var));
                        wy9Var.h();
                        return;
                    } finally {
                    }
                }
            case 2:
                Iterator it = ((lih) this.b).a.iterator();
                while (it.hasNext()) {
                    hie hieVar = ((uwg) it.next()).n;
                    Iterator it2 = hieVar.g.e.iterator();
                    while (it2.hasNext()) {
                        ((k02) it2.next()).b(i, new ey2(r02Var, hieVar.g.g, -1L));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.k02
    public void d(int i) {
        switch (this.a) {
            case 0:
                ayi.d().execute(new vy1(10, this));
                break;
        }
    }
}
