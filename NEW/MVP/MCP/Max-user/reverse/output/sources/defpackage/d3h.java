package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d3h {
    public final int a;
    public final int b;
    public final int c;

    public d3h(u70 u70Var) {
        this.a = u70Var.b;
        this.b = u70Var.c;
        this.c = u70Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3h.class != obj.getClass()) {
            return false;
        }
        d3h d3hVar = (d3h) obj;
        return this.a == d3hVar.a && this.b == d3hVar.b && this.c == d3hVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), az1.a(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTAIN" : "COVER");
        sb.append('}');
        return sb.toString();
    }
}
