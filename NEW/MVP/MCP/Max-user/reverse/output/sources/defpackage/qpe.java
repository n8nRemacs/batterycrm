package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class qpe extends id0 {
    public static final qpe d;
    public static final qpe e;
    public static final qpe f;
    public static final qpe g;
    public static final qpe h;
    public final n5g b;
    public final List c;

    static {
        n5g n5gVar = new n5g(ibb.o);
        int i = ibb.a;
        ppe ppeVar = new ppe(gbb.q, new n5g(i));
        int i2 = ibb.g;
        ppe ppeVar2 = new ppe(gbb.s, new n5g(i2));
        int i3 = ibb.c;
        d = new qpe(n5gVar, ve3.j(ppeVar, ppeVar2, new ppe(gbb.r, new n5g(i3))));
        e = new qpe(new n5g(ibb.l), ve3.j(new ppe(gbb.d, new n5g(i)), new ppe(gbb.f, new n5g(i2)), new ppe(gbb.e, new n5g(i3))));
        f = new qpe(new n5g(ibb.w), ve3.j(new ppe(gbb.C, new n5g(i)), new ppe(gbb.E, new n5g(i2)), new ppe(gbb.D, new n5g(i3))));
        g = new qpe(new n5g(ibb.z), ve3.j(new ppe(gbb.a, new n5g(i)), new ppe(gbb.c, new n5g(i2)), new ppe(gbb.b, new n5g(ibb.b))));
        h = new qpe(new n5g(ibb.y), ve3.j(new ppe(gbb.t, new n5g(ibb.d)), new ppe(gbb.v, new n5g(ibb.f)), new ppe(gbb.u, new n5g(ibb.e))));
    }

    public qpe(n5g n5gVar, List list) {
        super(18);
        this.b = n5gVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpe)) {
            return false;
        }
        qpe qpeVar = (qpe) obj;
        return this.b.equals(qpeVar.b) && this.c.equals(qpeVar.c);
    }

    public final int hashCode() {
        return xrf.l(this.c, Integer.hashCode(this.b.c) * 31, 31);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", payload=null)";
    }
}
