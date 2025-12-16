package defpackage;

/* loaded from: classes.dex */
public final class agg {
    public static final agg d = new agg(new saa());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = zxg.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public agg(saa saaVar) {
        this.a = saaVar.a;
        this.b = saaVar.b;
        this.c = saaVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agg.class == obj.getClass()) {
            agg aggVar = (agg) obj;
            if (this.a == aggVar.a && this.b == aggVar.b && this.c == aggVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
