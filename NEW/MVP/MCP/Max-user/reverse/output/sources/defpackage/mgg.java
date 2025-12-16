package defpackage;

/* loaded from: classes.dex */
public final class mgg implements lw0 {
    public static final mgg b;
    public final wg7 a;

    static {
        t76 t76Var = wg7.b;
        b = new mgg(zjd.o);
    }

    public mgg(zjd zjdVar) {
        this.a = wg7.j(zjdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mgg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mgg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
