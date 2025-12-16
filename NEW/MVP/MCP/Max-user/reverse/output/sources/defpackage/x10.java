package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class x10 {
    public List a;
    public yl7 b;
    public imd c;

    public final void a(w10 w10Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(w10Var);
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final jdc c() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return new jdc(this);
    }

    public final w10 d(int i) {
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        return (w10) this.a.get(i);
    }

    public final void e(int i, w10 w10Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        this.a.set(i, w10Var);
    }
}
