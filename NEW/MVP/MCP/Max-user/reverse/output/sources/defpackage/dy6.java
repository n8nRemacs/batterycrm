package defpackage;

/* loaded from: classes.dex */
public final class dy6 {
    public final int a;
    public final int b;

    public dy6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dy6.class != obj.getClass()) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return this.b == dy6Var.b && this.a == dy6Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return ho7.j(sb, this.b, "]");
    }
}
