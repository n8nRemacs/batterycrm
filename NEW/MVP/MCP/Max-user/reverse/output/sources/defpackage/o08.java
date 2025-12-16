package defpackage;

/* loaded from: classes.dex */
public final class o08 implements Comparable {
    public static final o08 b = new o08();
    public final int a = 131072;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((o08) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o08 o08Var = obj instanceof o08 ? (o08) obj : null;
        return o08Var != null && this.a == o08Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.0.0";
    }
}
