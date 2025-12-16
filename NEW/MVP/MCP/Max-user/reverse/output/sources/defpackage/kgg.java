package defpackage;

/* loaded from: classes.dex */
public final class kgg {
    public static final kgg b;
    public static final String c;
    public final wg7 a;

    static {
        t76 t76Var = wg7.b;
        b = new kgg(zjd.o);
        String str = zxg.a;
        c = Integer.toString(0, 36);
    }

    public kgg(zjd zjdVar) {
        this.a = wg7.j(zjdVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            wg7 wg7Var = this.a;
            if (i2 >= wg7Var.size()) {
                return false;
            }
            jgg jggVar = (jgg) wg7Var.get(i2);
            if (jggVar.a() && jggVar.b.c == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kgg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((kgg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
