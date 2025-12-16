package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class oje {
    public final yi5 a;
    public final di8 b;
    public final String c;
    public final k18 d;
    public final k18 e;
    public final CopyOnWriteArraySet f;
    public final nm0 g;
    public final CopyOnWriteArraySet h;
    public final String[] i;
    public final String[] j;
    public volatile int k;
    public volatile int l;

    public oje(k18 k18Var, k18 k18Var2, yi5 yi5Var, di8 di8Var) {
        this.a = yi5Var;
        this.b = di8Var;
        String name = oje.class.getName();
        this.c = name;
        this.d = k18Var2;
        this.e = k18Var;
        this.f = new CopyOnWriteArraySet();
        this.g = new nm0(null);
        this.h = new CopyOnWriteArraySet();
        this.i = new String[]{"no_net", "disconnected", "connected", "logged_in"};
        this.j = new String[]{"disconnected", "connected", "logged_in"};
        ((ur3) k18Var.getValue()).c(new nje(this));
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, "ctor, " + this, null);
        }
    }

    public final void a(mje mjeVar) {
        this.f.add(mjeVar);
        mjeVar.d(this.k);
    }

    public final void b() {
        int i;
        if (((ur3) this.e.getValue()).f()) {
            int i2 = this.l;
            if (i2 == 0) {
                i = 1;
            } else if (i2 == 1) {
                i = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(("Unknown connection status=" + this.l).toString());
                }
                i = 3;
            }
        } else {
            i = 0;
        }
        this.k = i;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "updateState, " + this, null);
            }
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((mje) it.next()).d(this.k);
        }
        this.g.f(Integer.valueOf(this.k));
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.j[this.l] + ") -> " + this.i[this.k];
    }
}
