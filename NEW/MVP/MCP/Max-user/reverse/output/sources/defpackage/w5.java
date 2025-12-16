package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class w5 {
    public final a1e a;

    public w5(a1e a1eVar) {
        this.a = a1eVar;
    }

    public ArrayList a(int i) {
        return this.a.b(i);
    }

    public bwf b(int i) {
        return new bwf(new y0e(i, this.a));
    }

    public Object c(int i) {
        return this.a.c(i, true);
    }

    public bwf d(int i) {
        return new bwf(new z0e(this.a, i, true));
    }

    public eq4 e() {
        return new eq4(5, this.a, true);
    }

    public Object f() {
        return this.a.c(457, false);
    }
}
